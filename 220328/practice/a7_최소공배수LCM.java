package a_0328;

import java.util.Scanner;

//최소공배수
//A=ad, B= bd 에서 a 와 b 는 서로소이고, d 는 최대공약수
//두 수를 소인수분해 한 결과 공통부분이 최대공약수 d
//소인수분해 → 최대공약수 → 최소공배수
public class a7_최소공배수LCM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, lcm = 0, gcd = 0, i = 2;
		num1 = input.nextInt();
		num2 = input.nextInt();
		for (; i <= num1 && i <= num2;) {
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
			i++;
		}
		if (num2 != 0) {
			lcm = num1 * num2 / gcd;
		}
		System.out.println(lcm);
	}
}