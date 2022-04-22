package javaPro_lec08_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
 <슬라이드11>
StockDailyPrice.csv파일로 앞으로 많은 실습을 할 것이다.
실습3) 삼성전자의 주가에 대하여 2015년 최대값과 최소값을 구하시오(종가기준), 

<A005930.csv 파일 데이터 순서>
표준 종목코드, 주식 영업 일자, 유가증권 단축 종목코드, 주식 종가, 주식 시가, 주식 최고가, 주식 최저가, 전일대비 부호 등
KR7000321000	20150112	A000325		14600		14600		14650		14300
 */


public class p11_3_samsungStockData {
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
		//금액 천단위 마다 콤마 삽입위해 DecimalFormat 객체생성
		DecimalFormat k38_df = new DecimalFormat("###,###,###,###");
		
		//******파일 a에서 정보읽어서 파일 b에 저장할 것이므로 BufferedReader 1개, BufferedWriter 1개
		// 파일 객체 생성 후 해당 경로의 파일 불러오기
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\A005930.csv");
		
		// k38_br 파일 BufferedReader 객체 생성해 읽기
		BufferedReader k38_br = new BufferedReader(new FileReader(k38_f)); 

		//I_LIKE_SAMSUNG2015.csv 로 파일 저장할 것.
		File k38_f1 = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\LOVE_SAMSUNG2015.csv");
		
		// BufferedWriter로 새로운 파일 생성하여 그 안에 내용 작성해주기
		BufferedWriter k38_bw1 = new BufferedWriter(new FileWriter(k38_f1)); 

		String k38_readtxt;	 // 문자열 k38_readtxt 정의 <= BufferedReader k38_br로 해당파일 한 줄씩 읽은 내용을 담을 문자열

		int k38_cnt = 0;	// 총 데이터 갯수 => 읽은 횟수
		int k38_wcnt = 0;	// 유효한 데이터 갯수 => 쓴 횟수

		double k38_max = Double.MIN_VALUE; // 종가기준 최대값 구하기위한 변수 => Min값으로 초기화
		double k38_min = Double.MAX_VALUE;// 종가기준 최소값을 구하기위한 변수 => MAX값으로 초기화
		String k38_maxDate = ""; // 최댓값 일자 저장할 변수
		String k38_minDate = "";//최솟값 일자 저장할 변수

		// k38_readtxt 한 줄 읽었는데 null이 아니면 계속 반복 => 끝까지 읽음
		while ((k38_readtxt = k38_br.readLine()) != null) { 	//k38_br을 한줄 씩 읽어 k38_readtxt에 저장
			StringBuffer k38_s = new StringBuffer();		//StringBuffer 객체생성
			String[] k38_field = k38_readtxt.split(","); 		//배열에 있는 내용을 읽고, 콤마를 구분자로 내용 쪼개 k38_field배열에 저장
			double k38_cPrice2015; // 종가 담을 변수 double형으로 선언 , closing Price => 혹시나 실수형 값이 저장되어있을 수도 있기때문

			//주식 영업 일자 (k38_field[1])에 문자 2015가 포함되어있고
			if (k38_field[1].contains("2015")) {
				if (k38_field[2].contains("A005930")) {	// 유가증권 단축 종목코드(k38_field[2])에 삼성전자 (단축코드: A005930)가 포함되어 있다면
					//=> 2015년 삼성전자 정보
					k38_cPrice2015 = Double.parseDouble(k38_field[3]); // k38_cPrice2015에 주식종가(k38_field[3]) 값을 double로 형변환 해 대입
					k38_s.append(k38_readtxt);// 그 내용을 k38_readtxt에 추가(append)	**********값 추가 잊지말기!!!**********
					
					//주식종가 최대, 최솟값 비교
					if (k38_cPrice2015 < k38_min) { // 종가가 k38_min보다 작으면
						k38_min = k38_cPrice2015; // k38_min에 k38_value2015값 대입 => 최솟값 변경됨
						k38_minDate = k38_field[1]; // 최소값 날짜
					} else if (k38_cPrice2015 > k38_max) { // 종가가 k38_max보다 크면
						k38_max = k38_cPrice2015;// k38_max에 k38_value2015값 대입 => 최댓값 변경됨
						k38_maxDate = k38_field[1];// 최대값 날짜
					}
					
					//toString() 메소드 호출해서 String객체로 전환 => k38_s 이제 문자열! => k38_bw1.write 파일쓰기!
					k38_bw1.write(k38_s.toString());
					k38_bw1.newLine();	//줄바꿈
					k38_wcnt++; // 유효한 데이터 계속 읽기					
				}
			} //if
			k38_cnt++;// 데이터 계속 읽기
		}
		
		//다 썼으면 닫아주기!!
		k38_br.close();	// 버퍼리더 close
		k38_bw1.close();// 버퍼라이터 close
		
		//사용자 편의 위한 정보 출력 => 파일닫아서 파일에는 저장안됨.
		System.out.printf("\n****2015년 삼성전자 주가 분석****\n");
		System.out.printf("※종가기준 계산\n");		
		System.out.printf("■ 최댓값: %s 원\n", k38_df.format(k38_max));
		System.out.printf("■ 최댓값 경신 일자: %s\n\n", k38_maxDate);
		System.out.printf("■ 최소값: %s 원\n", k38_df.format(k38_min));
		System.out.printf("■ 최소값 경신 일자: %s\n\n", k38_minDate);
		

		// 프로그램 종료안내문구 출력
		System.out.printf("Programme End [%d][%d] records\n", k38_cnt, k38_wcnt);				
	}
}