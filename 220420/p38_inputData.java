package javaPro_lec06_self_ppt;
//슬38
//ReportSheet, 클래스 만들기 => 데이터 부분

public class p38_inputData {
	//1. p12_reportSheetMain 클래스에 사용할 필요한 변수와 배열 선언
	//생성자에서 각 배열 크기를 지정하기 때문에 배열명만 먼저 선언.
	int k38_Person;	//정수형 변수 : 인원 수
	int [] k38_i;	//정수형 변수 : 넘버링
	String [] k38_name;	//문자열 변수 : 이름
	int [] k38_kor;	//정수형 변수 : 국어점수
	int [] k38_eng;	//정수형 변수 : 영어점수
	int [] k38_mat;	//정수형 변수 : 수학점수
	int [] k38_sum;	//정수형 변수 : 총합
	double [] k38_ave;	//실수형 변수 => 평균
	
	//2. 생성자 : 입력된 인원수(int k38_iPerson = 10)와 같은 크기의 배열들 생성
	p38_inputData(int k38_iPerson) {
		//입력받은 숫자(학생 인원수)만큼 배열크기 생성
		k38_name = new String[k38_iPerson];	//배열크기 = k38_iPerson , 이름담는 배열이라 String 배열
		k38_kor = new int[k38_iPerson];	//배열크기 = k38_iPerson
		k38_eng = new int[k38_iPerson];	//배열크기 = k38_iPerson
		k38_mat = new int[k38_iPerson];	//배열크기 = k38_iPerson
		k38_sum = new int[k38_iPerson];	//배열크기 = k38_iPerson
		k38_ave = new double[k38_iPerson];	//배열크기 = k38_iPerson , 평균담는 배열이라 double형 배열
	}
	
	//3. p12_reportSheetMain 클래스에서 for반복문으로 넘버링 되고, 해당 번호(k38_j)에 해당 값(과목점수,이름 등)들 입력
	//리턴값 없고, 정수형 4개와 문자형 1개를 인자로 받는 메소드
	//변수명 구분을 위해서 k38_name2 처럼 기존 변수명 뒤에 숫자 2를 붙임.
	public void k38_SetData(int k38_j, String k38_name2, int k38_kor2, int k38_eng2, int k38_mat2) {
		k38_name[k38_j] = k38_name2;	//배열 k38_name의 k38_j 번째 요소를 k38_name2로 정의
		k38_kor[k38_j] = k38_kor2;	//배열 k38_kor의 k38_j 번째 요소를 k38_kor2로 정의
		k38_eng[k38_j] = k38_eng2;	//배열 k38_eng의 k38_j 번째 요소를 k38_eng2로 정의
		k38_mat[k38_j] = k38_mat2;	//배열 k38_mat의 k38_j 번째 요소를 k38_mat2로 정의
		k38_sum[k38_j] = k38_kor2 + k38_eng2 + k38_mat2;	//과목 총합
		k38_ave[k38_j] = k38_sum[k38_j] / 3.0;	//과목평균 => 3과목이니까 /3 => double형이니까 3.0
	}
} //class