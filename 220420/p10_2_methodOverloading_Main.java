package javaPro_lec06_self_ppt;
//메서드 오버로딩 _ 자바심화06강 슬10
//동일 메서드명에 인자를 다르게 사용하는 것.
//클래스 p06_1_methodOverloading 의 메서드들 사용하는 main함수

public class p10_2_methodOverloading_Main {
	public static void main(String[] args) {
		//1. [클래스명 객체명] 으로 객체생성 후 인스턴스 생성해 객체연결(new p06_1_메서드오버로딩())
		p10_1_methodOverloading k38_cal = new p10_1_methodOverloading();
		
		//2. p06_1_메서드오버로딩 클래스 메서드 호출
		System.out.printf("2개 덧셈 호출 [%d]\n", k38_cal.k38_sum(1, 2));	//k38_sum(int k38_a, int k38_b) 호출
		System.out.printf("3개 덧셈 호출 [%d]\n", k38_cal.k38_sum(1, 2, 3));	//k38_sum(int k38_a, int k38_b, int k38_c) 호출
		System.out.printf("4개 덧셈 호출 [%d]\n", k38_cal.k38_sum(1, 2, 3, 4));	//k38_sum(int k38_a, int k38_b, int k38_c, int k38_d) 호출 
		System.out.printf("더블형 덧셈 호출 [%f]\n", k38_cal.k38_sum(1.3, 2.4));	//k38_sum(double k38_a, double k38_b) 호출
	}
}
