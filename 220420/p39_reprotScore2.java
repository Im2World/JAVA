package javaPro_lec06_self_ppt;
//자바심화 6강 슬39
//성적집계표 출력
//문제조건 : 학생 수는 30명, 각 학생 점수는 랜덤 생성
//숫자는 우측정렬, 문자는 좌측정렬
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p39_reprotScore2 {
	
	///////////////////<사전준비>///////////////////
	// Calendar 클래스로 현재 시간 및 날짜 가져옴
	static Calendar k38_calendar = Calendar.getInstance();
	
	// SimpleDateFormat 클래스로 일자데이터 출력형식 지정
	// 시간 표시 => 년년년년.월월.일일 시시:분분:초초 => dd는 소문자!!!!
	static SimpleDateFormat k38_df = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
	
	//인원 수는 30명
	static int k38_iPerson = 30; // 해당 크기만큼 배열크기 지정, 조건에서 030번까지만 출력한다. => 0부터 29까지 반복 = 30개
	
	//[클래스명 객체명] 으로 객체생성 후 인스턴스 생성해 객체연결
	//*****앞에서 만들어 뒀던 이름, 각 점수 배열이 선언 된 p38_inputData 클래스 활용*****
	static p38_inputData k38_inData = new p38_inputData(k38_iPerson);
	
	//각 메서드에서 사용될 변수들은 static변수로 선언
	//각 과목 총점 변수 선언 및 0으로 초기화
	static int k38_korSum = 0; // 국어총점
	static int k38_engSum = 0; // 영어총점
	static int k38_mathSum = 0; // 수학총점

	// 각 과목점수 평균 변수 선언 및 0으로 초기화
	static int k38_korAvg = 0; // 국어점수 평균
	static int k38_engAvg = 0; // 영어점수 평균
	static int k38_mathAvg = 0; // 수학점수 평균

	// 과목 별 총 합계 및 과목별 총합계의 평균 변수 선언 및 0으로 초기화
	static int k38_totalSum = 0;	//총점의 합계
	static int k38_avgOf30Total = 0; // 30명 합계의 평균
	static int k38_totalAvg = 0;	//총점의 평균
	static int k38_avgOf30Avg = 0; // 30명의 평균들의 평균
	
	
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
		System.out.printf("%-31s%s\n", "", "출력일자 : " + k38_df.format(k38_calendar.getTime())); // SimpleDateFormat은 문자열로 받는다.
		System.out.println("============================================================="); 	//구분선 출력
		System.out.printf("%1s%-5s %-9s %-5s %-5s %-7s %-7s %s\n", "","번호", "이름", "국어", "영어", "수학", "총점", "평균"); // %s로 위치조정
		System.out.println("============================================================="); 	//구분선 출력
	}
	
	//성적계산 및 출력 메서드
	public static void bodyPrint() {
		// 각 과목점수 합계 변수 선언 및 0으로 초기화
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			// 문자열 이름 : 김연 + 숫자3자리 => 숫자3자리에는 k38_i이 들어가서 넘버링 001, 002, 003 ..
			String k38_name = String.format("김연%03d", k38_i + 1);	//이름 뒤 넘버링을 001부터 시작해서 (k38_i + 1) 해줘야 01부터 시작

			// 0점~100점 사이 점수 무작위 생성 위해 Math.random()함수 사용.
			// Math.random은 double형 숫자 반환 => 정수형인 int로 형변환
			int k38_kor = (int) (Math.random() * 100); // 국어점수
			int k38_eng = (int) (Math.random() * 100); // 영어점수
			int k38_math = (int) (Math.random() * 100); // 수학점수

			// 클래스 내 값 입력
			k38_inData.k38_SetData(k38_i, k38_name, k38_kor, k38_eng, k38_math);
		}	//BodyPrint()

		//번호, 이름, 국어, 영어, 수학, 총점, 평균 출력
		// 입력된 값이 잘 들어갔는지 반복문으로 꺼내서 확인
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			//문자열 데이터는 %s로, 정수형 데이터는 %d로 형식 맞춰 출력. 모두 우측정렬 사용
			//문제 조건에서 평균을 정수형으로 출력 => (int)k38_inData.k38_ave[k38_i] 로 double형을 정수형으로 형변환
			System.out.printf("%2s%03d %8s %8s %7s %7d %9d %9d\n", "", (k38_i + 1), k38_inData.k38_name[k38_i], k38_inData.k38_kor[k38_i], k38_inData.k38_eng[k38_i],
					k38_inData.k38_mat[k38_i], k38_inData.k38_sum[k38_i], (int) k38_inData.k38_ave[k38_i]);
			
			//각 배열에 입력된 값을 좌측 변수에 대입.
			k38_korSum += k38_inData.k38_kor[k38_i]; // 국어 총점 : k38_kor[i] 값을 계속 더해 k38_korSum 에 입력
			k38_engSum += k38_inData.k38_eng[k38_i]; // 수학 총점
			k38_mathSum += k38_inData.k38_mat[k38_i]; // 영어 총점
			k38_totalSum += k38_inData.k38_sum[k38_i]; // 총점의 합계 : p12_inputData 클래스에서 구한 k38_sum값을 계속 더해 k38_totalSum에 저장
			k38_totalAvg += k38_inData.k38_ave[k38_i]; // 총점의 평균

			//문제 조건에서 학생 수가 30명
			k38_korAvg = k38_korSum / k38_iPerson;	 // 30명의 국어점수 평균
			k38_engAvg = k38_engSum / k38_iPerson;	// 30명의 영어점수 평균
			k38_mathAvg = k38_mathSum / k38_iPerson;	// 30명의 수학점수 평균
			k38_avgOf30Total = k38_totalSum / k38_iPerson;	// 30명의 과목 점수 합계의 평균
			k38_avgOf30Avg = k38_totalAvg / k38_iPerson;		// 30명의 평균들의 평균
		}
	}
	
	//합계, 평균 출력 메서드
	public static void tailPrint() {
		//합계, 평균 출력
		System.out.println("=============================================================");	 //구분선 출력
		System.out.printf("합계 %20d %7d %7d %9d %9d\n", k38_korSum, k38_engSum, k38_mathSum, k38_totalSum, k38_totalAvg);	//정수형 데이터라서 %d로 위치조정
		System.out.printf("평균 %20d %7d %7d %9d %9d\n", k38_korAvg, k38_engAvg, k38_mathAvg, k38_avgOf30Total, k38_avgOf30Avg);	//정수형 데이터라서 %d로 위치조정
	}	//tailPrint()
}	//class