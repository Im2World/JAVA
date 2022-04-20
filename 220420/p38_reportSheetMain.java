package javaPro_lec06_self_ppt;
//슬38
//ReportSheet, 클래스 만들기
//class p38_inputData 의 메소드들 사용
public class p38_reportSheetMain {
	public static void main(String[] args) {
		int k38_iPerson = 10;	//인원수 정수형으로 입력 10명
		
		//1. [클래스명 객체명] 으로 객체생성 후  인스턴스 생성해 객체연결 => p38_inputData클래스의 메소드들 사용가능!
		p38_inputData k38_inData = new p38_inputData(k38_iPerson);
		
		//2. 정보생성
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			//문자열 이름 : 김연 + 숫자2자리 => 숫자2자리에는 k38_i이 들어가서 넘버링 00, 01, 02 ..
			String k38_name = String.format("김연%02d", k38_i);
			
			//(int) Math.random() * (최댓값-최소값+1) + 최소값
			//0점~100점 사이 점수 무작위 생성 위해 Math.random()함수 사용.
			//Math.random은 double형 숫자 반환 => 정수형인 int로 형변환
			int k38_kor = (int)(Math.random() * 100);	// 국어점수, int형으로 형변환
			int k38_eng = (int)(Math.random() * 100);	// 영어점수, int형으로 형변환 
			int k38_mat = (int)(Math.random() * 100);	// 수학점수, int형으로 형변환 
			
			// 위에서 생성한 값들 받는 다른 클래스인 p12_inputData의 k38_SetData메소드로 값들 보냄
			k38_inData.k38_SetData(k38_i,k38_name,k38_kor,k38_eng,k38_mat);	
		}
		
		//3. 값이 잘 입력됐나 확인위해 입력 받은 인원수만큼 for문 실행
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			// 학생별로 번호, 이름, 각 과목 성적, 총점, 평균을 양식 맞춰 출력 후 줄바꿈.
			// 평균은 실수형이라 %f로 받음.
			// 평균점수를 소수점이하 2자리까지만 표기하려면 %5.2f 사용
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",
					k38_i, k38_inData.k38_name[k38_i], k38_inData.k38_kor[k38_i], k38_inData.k38_eng[k38_i],
					k38_inData.k38_mat[k38_i], k38_inData.k38_sum[k38_i], k38_inData.k38_ave[k38_i]);
		}
	}
}