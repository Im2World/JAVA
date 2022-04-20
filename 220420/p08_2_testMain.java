package javaPro_lec06_self_ppt;
//자바심화 6강_슬8
//클래스, 객체, 인스턴스
///p04_1_elevator에서 생성한 메서드들을 실행하는 클래스
//다른 클래스가 가진 메서드를 사용하기 위해서는 객체생성 필수!

public class p08_2_testMain {
		private static int k38_inVal;	//전역변수 선언
		
		//메서드
		public static void k38_up() {
			k38_inVal++;	//값 1씩 증가 => 메인함수에서 k38_inVal는 0으로 초기화해놨다.
			System.out.printf("난 그냥 메소드![%d]\n", k38_inVal);	//값 출력
		}
		
		//메인메서드
		public static void main(String[] args) {
			//1.준비작업 : 객체생성
			k38_inVal = 0;	//값 초기화
			
			p07_1_elevator k38_elev;	//[클래스명 객체명] => 클래스 받아 객체생성
			k38_elev = new p07_1_elevator();	//인스턴스생성해 객체연결
			//*** p04_1_elevator k38_elev = new p04_1_elevator();   => 라고 위 두줄을 한 줄로 줄일 수 있다!!***
			
			k38_up();	//이 클래스 내의 라인 10의 up메서드 지칭 => 출력 : 난 그냥 메소드![1]
			
			//2. 다른클래스의 메서드 실행
			//반복문 10회 수행
			//첫 층이 2층이 된다. => 최상위층 10층 되면 안내멘트 출력.
			for (int k38_i = 0; k38_i < 10; k38_i++) {
				k38_elev.k38_up();	//p04_1_elevator 클래스의 메서드 실행
				System.out.printf("MSG [%s]\n", k38_elev.k38_help);	//String문자열 elev.help 출력
			}
			
			//반복문 10회 수행
			//elev.up메서드 시행으로 floor(현재층)이 10층 부터 시작
			//p04_1_elevator 클래스에서 k38_floor를 전역변수로 선언했음.
			for (int k38_i = 0; k38_i < 10; k38_i++) {
				k38_elev.k38_down();	//p04_1_elevator 클래스의 메서드 실행
				System.out.printf("MSG [%s]\n", k38_elev.k38_help);	//String문자열 elev.help 출력
			}
		}
}