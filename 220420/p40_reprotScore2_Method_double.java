package javaPro_lec06_self_ppt;
//슬40
//성적집계표 및 [누적 집계] 출력
//문제조건 : 학생 수는 200명, 각 학생 점수는 랜덤 생성
//숫자는 우측정렬, 문자는 좌측정렬
//200명을 12명으로 했을 때도 나와야한다.
//평균 관련 변수는 정확한 계산 위해 double로 선언.
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p40_reprotScore2_Method_double {

	///////////////////<사전준비>///////////////////
	// Calendar 클래스로 현재 시간 및 날짜 가져옴
	static Calendar k38_calendar = Calendar.getInstance();
	
	// SimpleDateFormat 클래스로 일자데이터 출력형식 지정
	// 시간 표시 => 년년년년.월월.일일 시시:분분:초초 => dd는 소문자!!!!
	static SimpleDateFormat k38_df = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
	
	//******동적 프로그래밍!!*******
	static int k38_iPerson = 13; // 해당 크기만큼 배열 크기지정, 조건에서 200번 까지만 출력하는 것으로 지정 => 0 ~ 199까지 반복 = 200개
	static int k38_page = 1;	//페이지수 표시 위한 변수선언 및 초기화
	static int k38_numPerPage = 11;	//페이지당 출력할 인원 수

	
	// 1. [클래스명 객체명] 으로 객체생성 후 인스턴스 생성해 객체연결
	//*****앞에서 만들어 뒀던 이름, 각 점수 배열이 선언 된 p38_inputData 클래스 활용*****
	static p38_inputData k38_inData = new p38_inputData(k38_iPerson);
	
	//각 메서드에서 사용될 변수들은 static변수로 선언
	//각 과목 총점 변수 선언 및 0으로 초기화
	static int k38_korSum = 0; // 국어총점
	static int k38_engSum = 0; // 영어총점
	static int k38_mathSum = 0; // 수학총점

	// 각 과목점수 평균 변수 선언 및 0으로 초기화
	// 정확한 계산위해 double형 사용
	static double k38_korAvg = 0; // 국어점수 평균
	static double k38_engAvg = 0; // 영어점수 평균
	static double k38_mathAvg = 0; // 수학점수 평균

	// 과목 별 총 합계 및 과목별 총합계의 평균 변수 선언 및 0으로 초기화
	// 평균은 정확한 계산위해 double형 사용
	static int k38_totalSum = 0;	//총점의 합계
	static double k38_totalAvg = 0.0;	//총점의 평균
	
	//***성적집계표 1페이지만 출력하는 것과 다른부분***
	//누적값 구해야하므로, 관련 변수들 선언.
	// 평균은 정확한 계산위해 double형 사용
	static int k38_korSumTotal; // 국어 누적 총점
	static int k38_engSumTotal; // 수학 누적 총점
	static int k38_mathSumTotal; // 영어 누적 총점
	static int k38_totalSumTotal; // 총점의 누적 총점
	static double k38_totalAvgTotal; // 총평균 누적 총점
	static int k38_cnt = 0; // 번호(연번)를 k38_cnt변수로 생성해서 초기화 => ***페이지 나누기의 핵심변수!***	
	
	///////////////메인함수////////////////
	public static void main(String[] args) {
		haderPrint();
		bodyPrint();
		tailPrint();
	} //main
	
	
	//헤더 출력 메서드
	public static void haderPrint() {
		// 문자 좌측정렬로 출력 후 줄바꿈2회
		System.out.printf("%-25s%s\n\n", "", "성적집계표");	//제목출력, 문자라 좌측정렬로 위치조정
		System.out.printf("%-7s%03d%-19s%7s%21s\n","Page :", k38_page, "","출력일자 : ", k38_df.format(k38_calendar.getTime()));    // SimpleDateFormat은 문자열로 받는다.
		System.out.println("============================================================="); 	//구분선 출력
		System.out.printf("%1s%-5s %-9s %-5s %-5s %-7s %-7s %s\n", "","번호", "이름", "국어", "영어", "수학", "총점", "평균"); // %s로 위치조정
		System.out.println("============================================================="); 	//구분선 출력
	}
		
	//성적계산 및 출력 메서드
	public static void bodyPrint() {
		// 점수 랜덤생성
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			// 문자열 이름 : 김연 + 숫자2자리 => 숫자2자리에는 k38_i이 들어가서 넘버링 01, 02, 03 ..
			String k38_name = String.format("김연%03d", k38_i + 1);	//이름 뒤 넘버링을 01부터 시작해서 (k38_i + 1) 해줘야 01부터 시작

			// 0점~100점 사이 점수 무작위 생성 위해 Math.random()함수 사용.
			// Math.random은 double형 숫자 반환 => 정수형인 int로 형변환
			int k38_kor = (int) (Math.random() * 100); // 국어점수
			int k38_eng = (int) (Math.random() * 100); // 영어점수
			int k38_math = (int) (Math.random() * 100); // 수학점수

			//p38_inputData 클래스의 k38_SetData 함수에 값 입력 => 배열이 계속 저장되고 있음
			k38_inData.k38_SetData(k38_i, k38_name, k38_kor, k38_eng, k38_math);
		}
		
		// 입력된 값이 잘 들어갔는지 반복문으로 꺼내서 확인
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			k38_cnt++; // k38_cnt값 1증가

			// 문자열 데이터는 %s로, 정수형 데이터는 %d로 형식 맞춰 출력. 모두 우측정렬 사용
			// 문제 조건에서 평균을 정수형으로 출력 => (int)k38_inData.k38_ave[k38_i] 로 double형을 정수형으로 형변환
			// 문제 조건에서 연번이 001번부터 시작 => (k38_i+1)
			// k38_sum 은 1인의 각 과목의 총점
			System.out.printf("%2s%03d %8s %8s %7s %7d %9d %9.2f\n", "", (k38_i + 1), k38_inData.k38_name[k38_i], k38_inData.k38_kor[k38_i], k38_inData.k38_eng[k38_i],
					k38_inData.k38_mat[k38_i], k38_inData.k38_sum[k38_i], k38_inData.k38_ave[k38_i]);

			// 각 배열에 입력된 값을 좌측 변수에 대입.
			k38_korSum += k38_inData.k38_kor[k38_i]; // 국어 총점 : k38_kor[i] 값을 계속 더해 k38_korSum 에 입력
			k38_engSum += k38_inData.k38_eng[k38_i]; // 수학 총점
			k38_mathSum += k38_inData.k38_mat[k38_i]; // 영어 총점
			k38_totalSum += k38_inData.k38_sum[k38_i]; // 각 과목 총점의 합계 : p12_inputData 클래스에서 구한 k38_sum값을 계속 더해 k38_totalSum에 저장
			k38_totalAvg += k38_inData.k38_ave[k38_i]; // 각 과목 평균의 합

			// 누적점수변수에 해당 페이지 각 총점 및 합계, 평균 입력 => 그래야 누적이 됨.
			k38_korSumTotal += k38_inData.k38_kor[k38_i]; // 국어 총점
			k38_engSumTotal += k38_inData.k38_eng[k38_i]; // 수학 총점
			k38_mathSumTotal += k38_inData.k38_mat[k38_i]; // 영어 총점
			k38_totalSumTotal += k38_inData.k38_sum[k38_i]; // 각 과목 총점의 합계의 합계
			k38_totalAvgTotal += k38_inData.k38_ave[k38_i];	// 각 과목 총점의 합계의 합계의 평균 => 각 과목 총점의 합계의 합계 / 해당페이지까지의 인원 수

			//*******핵심부 : 페이지바꾸기********
			//문제 조건에서 한 페이지당 30명씩만 출력 => k38_cnt % 30 == 0 이고 입력받은 크기보다 작으면 페이지 바꿈
			if (k38_cnt % k38_numPerPage == 0 && k38_cnt < k38_iPerson) {
				k38_page++;// 페이지 수 1씩 증가
				System.out.println("============================================================="); 	//구분선 출력
				
				// 현재페이지 합계
				System.out.println("현재페이지");
					// 현재페이지 인원의 점수 합계 : 모두 정수형 데이터라서 %d로 받는다.
				System.out.printf("합계 %20d %7d %7d %9d %9.2f\n", k38_korSum, k38_engSum, k38_mathSum, k38_totalSum, k38_totalAvg);
					// 각페이지는 인원 30명만 출력 => / 30 => 각 평균
				//****정확한 계산위해 평균은 double형으로 계산****
				System.out.printf("평균 %20.2f %7.2f %7.2f %9.2f %9.2f\n", (double)k38_korSum / k38_numPerPage, (double)k38_engSum / k38_numPerPage, (double)k38_mathSum / k38_numPerPage,
						(double)k38_totalSum / k38_numPerPage, (double)k38_totalAvg / k38_numPerPage);
				System.out.println("=============================================================");	//구분선 출력

				// 누적합계
				System.out.println("누적페이지");
					//각 과목의 누적 합계, 총점의 누적합계, 평균의 누적합계 출력
				System.out.printf("합계 %20d %7d %7d %9d %9.2f\n", k38_korSumTotal, k38_engSumTotal, k38_mathSumTotal, k38_totalSumTotal, k38_totalAvgTotal);

				// 누적점수 / 누적인원(k38_cnt) = 누적점수 평균
				//****정확한 계산위해 평균은 double형으로 계산****				
				System.out.printf("평균 %20.2f %7.2f %7.2f %9.2f %9.2f\n", (double)k38_korSumTotal / k38_cnt, (double)k38_engSumTotal / k38_cnt, (double)k38_mathSumTotal / k38_cnt, 
						(double)k38_totalSumTotal / k38_cnt, (double)k38_totalAvgTotal / k38_cnt);

				//*****핵심부 : 값 초기화*****
				// 값 초기화 => 해당 페이지에서는 해당 페이지 학생들의 점수를 계산해야하므로 0으로 초기화	
				k38_korSum = 0;		k38_engSum = 0;		k38_mathSum = 0;		k38_totalSum = 0;		k38_totalAvg = 0.0;

				//페이지 바뀌면 다시 헤더부분 새로 출력 => k38_page++ 로 페이지수가 1증가함.
				System.out.printf("\n%-25s%s\n\n", "", "성적집계표");	//제목출력, 문자라 좌측정렬로 위치조정
				System.out.printf("%-7s%03d%-19s%7s%21s\n","Page :", k38_page, "","출력일자 : ", k38_df.format(k38_calendar.getTime()));    // SimpleDateFormat은 문자열로 받는다.
				System.out.println("============================================================="); 	//구분선 출력
				System.out.printf("%1s%-5s %-9s %-5s %-5s %-7s %-7s %s\n", "","번호", "이름", "국어", "영어", "수학", "총점", "평균"); // %s로 위치조정
				System.out.println("============================================================="); 	//구분선 출력
			}
		} //for				
	}	//BodyPrint()
	
		
	//합계, 평균 출력 메서드
	public static void tailPrint() {
		//*******마지막페이지 인원 수 구하는게 핵심!********
		int k38_numLastPage = (k38_iPerson - (k38_numPerPage * (k38_page - 1))) ;	//마지막 페이지에 출력할 인원 수

		//마지막페이지의 현재페이지, 누적페이지 출력
		System.out.println("============================================================="); 	//구분선 출력
		// 현재페이지 합계
		System.out.println("현재페이지");
			//현재페이지의 인원합계
		System.out.printf("합계 %20d %7d %7d %9d %9.2f\n", k38_korSum, k38_engSum, k38_mathSum, k38_totalSum, k38_totalAvg);
			//총원 200명에 페이지당 30명씩 출력하면 마지막페이지는 20명만 출력됨.(200 = (30 * 6) + 20) => 인원이 20 => /20
		
		//****정확한 계산위해 평균은 double형으로 계산****		
		System.out.printf("평균 %20.2f %7.2f %7.2f %9.2f %9.2f\n", (double)k38_korSum / k38_numLastPage, (double)k38_engSum / k38_numLastPage, (double)k38_mathSum / k38_numLastPage, 
				(double)k38_totalSum / k38_numLastPage, (double)k38_totalAvg / k38_numLastPage);
		System.out.println("============================================================="); 	//구분선 출력
		
		// 누적합계
		System.out.println("누적페이지");
			//각 과목의 누적 합계, 총점의 누적합계, 평균의 누적합계 출력
		System.out.printf("합계 %20d %7d %7d %9d %9.2f\n", k38_korSumTotal, k38_engSumTotal, k38_mathSumTotal, k38_totalSumTotal, k38_totalAvgTotal);

		//누적점수 / 누적인원(k38_cnt) = 누적점수 평균
		//****정확한 계산위해 평균은 double형으로 계산****
		System.out.printf("평균 %20.2f %7.2f %7.2f %9.2f %9.2f\n\n", (double)k38_korSumTotal / k38_cnt, (double)k38_engSumTotal / k38_cnt, (double)k38_mathSumTotal / k38_cnt,
				(double)k38_totalSumTotal / k38_cnt, (double)k38_totalAvgTotal / k38_cnt);
	}	//tailPrint()	
}	//class