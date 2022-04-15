package javaPro_lec04_0415_ppt;

//기본for문과 복합for문
//구구단!
public class p03_1_for문_구구단 {
	public static void main(String[] args) {
		// 1.기본 for문
		// 0~9까지 합계 출력
		int k38_sum = 0;
		for (int k38_i = 0; k38_i < 10; k38_i++) {
			k38_sum = k38_sum + k38_i;		//k38_sum은 k38_sum에 k38_i값을 더한 것으로 변화
		}
		System.out.printf("k38_sum %d\n", k38_sum);	//정수형 숫자를 받을 것이라서 %d를 사용했다.

		// 2. 복합 for문 : 구구단
		// 구구단을 한 단씩 반복출력
		// 바깥 for문이 구구단 n단
		for (int k38_i = 1; k38_i < 10; k38_i++) {	//1~9까지 총 9회 반복 => 1단 ~ 9단
			System.out.printf("===================\n");
			System.out.printf("    구구단 %d 단\n", k38_i);	//구구단 n단에 k38_i값이 들어가서 계속 변화
			System.out.printf("===================\n");

			// 내부 for문이 구구단에 곱하는 수 : 1~9
			for (int k38_j = 1; k38_j < 10; k38_j++) {
				System.out.printf("%5d * %d = %3d \n", k38_i, k38_j, k38_i * k38_j);	//%5d * %d 는 출력형식, k38_i * k38_j가 실제 계산식
			}
		} // 바깥 for문
	}
}
