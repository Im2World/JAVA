package javaPro_lec03_0414_ppt;

public class p01사칙연산 {
//1. 연산 후 대입, 사칙연산의 순서대로
	public static void main(String[] args) {
		int k38_i;	//정수형변수 선언
		k38_i = 1 + 2;
		System.out.printf("#1-1 : %d\n", k38_i);	//정수형이라 %d 사용

		// 사칙연산 순서대로 곱하기 부터 연산
		k38_i = 1 + 2 * 3;	//1+2*3 연산 후 k38_i에 대입
		System.out.printf("#1-2 : %d\n", k38_i);
	}
}
