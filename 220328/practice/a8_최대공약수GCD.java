package a_0328;

import java.util.Scanner;

//최소공배수
//A=ad, B= bd 에서 a 와 b 는 서로소이고, d 는 최대공약수
//두 수를 소인수분해 한 결과 공통부분이 최대공약수 d
//소인수분해 → 최대공약수 → 최소공배수
public class a8_최대공약수GCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, gcd = 0, i = 2;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		while (i <= num1 && i <= num2) {
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
			i++;
		}
		System.out.println(gcd);
	}
}
