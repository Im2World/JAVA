package javaPro_lec03_0414_ppt;

public class p03_정수형연산_버림_나머지연산자 {
//#3. 정수형 변수 나눗셈은 정수범위에서 버림 처리
	public static void main(String[] args) {
		int k38_i = 1000 / 3; // 정수형이라 소수점표현 불가! 333.333나오지 않음.
		System.out.printf("#3-1 : %d\n", k38_i);

		int k38_i2 = 1000 % 3; // 나머지 연산자
		System.out.printf("#3-2 : %d\n",k38_i2);
		
		// 나머지 연산자
		for (int k38_i3 = 0; k38_i3 < 20; k38_i3++) {
			System.out.printf("#3-3 : %d ", k38_i3);

			//1을 더해서 1~20까지가 범위로 재설정
			// => 1~20까지 나머지가 0일 때 = 5의 배수일 때 개행
			// %연산자는 반복에 대한 규칙을 줄 때 유용하게 사용!
			if (((k38_i3 + 1) % 5) == 0) {
				System.out.printf("\n");
			}
		}
	}
}
