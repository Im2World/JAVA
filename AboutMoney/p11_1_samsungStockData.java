package javaPro_lec08_0421;

/*
 <슬라이드11>
StockDailyPrice.csv파일로 앞으로 많은 실습을 할 것이다.
실습1) 삼성전자 (단축코드 A005930) 만 추출하여 A005930.csv파일을 만드시오, 실습 별 하나(★)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class p11_1_samsungStockData {
	// throw declaration: IOException 해줘야함
	public static void main(String[] args) throws IOException {
		// 처리전 시간 획득
		long k38_start = System.currentTimeMillis();
		System.out.print("시작시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
				
		k38_FileHandling();		//메서드 호출
				
		// 처리후 시간 획득
		long k38_end = System.currentTimeMillis();
		System.out.print("종료 후 시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// 시간차이 출력_숫자입력까지 실제로 걸린시간
		System.out.println("소요시간 : " + (k38_end - k38_start) / 1000.0 + " seconds\n");		
	}
	
	
	//메서드
	public static void k38_FileHandling() throws IOException {
		//******파일 a에서 정보읽어서 파일 b에 저장할 것이므로 BufferedReader 1개, BufferedWriter 1개
		// 파일 객체 생성 후 해당 경로의 파일 불러오기
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\StockDailyPrice.csv");

		// k38_br 파일 BufferedReader 객체 생성해 읽기
		BufferedReader k38_br = new BufferedReader(new FileReader(k38_f));

		File k38_f1 = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\A005930.csv");// A005930.csv파일 생성할 것임.

		// BufferedWriter로 새로운 파일 생성하여 그 안에 내용 작성해주기
		BufferedWriter k38_bw1 = new BufferedWriter(new FileWriter(k38_f1));

	
		String k38_readtxt; // 문자열 k38_readtxt 정의 <= BufferedReader k38_br로 해당파일 한 줄씩 읽은 내용을 담을 문자열

		int k38_cnt = 0;	// 총 데이터 갯수 => 읽은 횟수
		int k38_wcnt = 0;	// 유효한 데이터 갯수 => 쓴 횟수

		StringBuffer k38_s = new StringBuffer();		//StringBuffer 객체생성
		// k38_readtxt 한 줄 읽었는데 null이 아니면 계속 반복 => 끝까지 읽음
		while ((k38_readtxt = k38_br.readLine()) != null) {	//k38_br을 한줄 씩 읽어 k38_readtxt에 저장 
//			StringBuffer k38_s = new StringBuffer();		//StringBuffer 객체생성
			String[] k38_field = k38_readtxt.split(",");//배열에 있는 내용을 읽고, 콤마를 구분자로 내용 쪼개 k38_field배열에 저장

			if (k38_field[2].contains("A005930")) {// 유가증권 단축 종목코드(k38_field[2])에 삼성전자 (단축코드: A005930)가 포함되어 있다면
				k38_s.append(k38_readtxt);// 그 내용을 k38_readtxt에 추가(append)

				//toString() 메소드 호출해서 String객체로 전환 => k38_s 이제 문자열! => k38_bw1.write 파일쓰기!
				k38_bw1.write(k38_s.toString());	
				k38_bw1.newLine();	//줄바꿈
				k38_wcnt++; // 유효한 데이터 계속 읽기
			}
			k38_cnt++;// 데이터 계속 읽기
//			System.out.println(".");	//반복문 동작확인
		}

		//다 썼으면 닫아주기!!
		k38_br.close();	// 버퍼리더 close
		k38_bw1.close();// 버퍼라이터 close

		
		// 프로그램 종료안내문구 출력
		System.out.printf("Programme End [%d][%d] records\n", k38_cnt, k38_wcnt);						
	}
}