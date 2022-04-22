package javaPro_lec08_0421;
//StockDailyPrice.csv 를 생성하는 클래스!
/*
 <소스코드 그대로 작성>
<감 잡은 내용으로 파일정제>
StockDailyPrice.csv파일로 콤마분리자 파일을 만든다.
보이는 구분자(^%_%^)가 아닌듯하다 구분자를 (%_%)로 잡고 각 필드에서 (^)를 날리는 작업으로 처리하였고,
빈칸등 유효하지 않은 레코드가 있어서 단축코드는 A로 반드시 시작하기에 A를 잡아냈다.(여러분 짬밥에 지금 하기는 어려움)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p10_file_Handling {
	public static void main(String[] args) throws IOException {	
		//기존 파일 불러오기
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\THTSKS010H00.dat");
		BufferedReader k38_br = new BufferedReader (new FileReader(k38_f));						
		
		//새파일 StockDailyPrice.csv 의 경로지정 
		File k38_f1 = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\StockDailyPrice.csv");
		BufferedWriter k38_bw1 = new BufferedWriter(new FileWriter(k38_f1));					
		
		String k38_readtxt;		 // 문자열 k38_readtxt 정의 <= BufferedReader k38_br로 해당파일 한 줄씩 읽은 내용을 담을 문자열
		
		int k38_cnt = 0;	//총데이터 개수를 담을 정수형 변수 선언 및 값 초기화	=> 읽은 횟수 카운트
		int k38_wcnt = 0; 	//유효한 데이터 개수 담을 정수형 변수 선언 및 값 초기화 => 쓴횟수 카운트
		
		
		// k38_readtxt 한 줄 읽었는데 null이 아니면 계속 반복 => 끝까지 읽음
		while ((k38_readtxt = k38_br.readLine()) != null) {
			
			StringBuffer k38_s = new StringBuffer();	//스트링버퍼 객체생성
			
			//dat파일 구분자 : %_%
			//k38_readtxt를 %_%를 구분자로 분리해서 문자열 배열 k38_field에 대입
			String[] k38_field = k38_readtxt.split("%_%");	


			//append : 끝에 값 추가
			//replace 로 처음나오는 ^를 제거 
			//substring (a,b) : 인덱스 a부터 b-1까지 잘라 출력
			//trim : 문자열 앞 뒤 공백제거
			//field 배열의 길이가 2보다 크고 field배열의 [2]번째 요소의 ^를 없애고 앞뒤 공백을 없앤 다음 문자열 0번째(1번째) 문자가 A면 true
			//이 파일에서 A로 시작하는 것은 주식을 의미한다.
			if(k38_field.length > 2 && k38_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				
				//k38_field[0]의 ^를 없애주고, 문자열 앞 뒤 공백을 제거한 다음 k38_s에 값추가
				k38_s.append(k38_field[0].replace("^","").trim());
				
				//첫 줄은 콤마(,)를 안 넣어주기 때문에 먼저 따로 삽입. <= 현재 csv파일 생성하려고하니까!
				//k38_filed길이 전까지 반복
				for (int k38_j = 1; k38_j < k38_field.length; k38_j++) {
					//완전히 가공해서 StringBuffer s에 값 추가
					//콤마(,)추가 && field배열 [k38_j]번째의 ^를 없애고, 문자열 앞뒤 공백을 없앤 값을 추가 
					k38_s.append("," + k38_field[k38_j].replace("^","").trim());
				}
				
				//toString() 메소드 호출해서 String객체로 전환 => k38_s 이제 문자열! => k38_bw1.write 파일쓰기!
				k38_bw1.write(k38_s.toString());
				k38_bw1.newLine();		//행 바꿈
				k38_wcnt++;				//wcnt에 1 더해서 유효한 데이터 계속 읽기
			}
			k38_cnt++;		//cnt에 1을 더해 마지막라인까지 읽기
		} //while
		
		//다 썼으면 꼭 close!!!
		k38_br.close();		//BufferedReader 종료
		k38_bw1.close();	//BufferedWriter 종료
		
		//사용자 편의를 위한 안내문구 출력 => wcnt는 쓴 횟수, cnt는 읽은 횟수
		System.out.printf("Program End[%d][%d]records\n", k38_cnt, k38_wcnt);	//22519418 , 1146121
	}
}	
