package a_0328;

import java.util.Scanner;

//소수 : 약수가 1과 자기 자신뿐인 수
//1제외 자기보다 작은 수로 나눴을때,하나라도 나눠지면 소수X
//Q.user가 입력학 수 이하에서 소수 전부 출력.
public class a9_소수2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 2; i <= num; i++) { // 소수는 1제외
			for (int j = 2; j <= i; j++) {
				if (i != j && i % j == 0) {
					break;
				}
				if (i == j) {
					System.out.println(i);
				}
			}
		}
	}
}
