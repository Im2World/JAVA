package a_0328;

import java.util.Scanner;

//�ּҰ����
//A=ad, B= bd ���� a �� b �� ���μ��̰�, d �� �ִ�����
//�� ���� ���μ����� �� ��� ����κ��� �ִ����� d
//���μ����� �� �ִ����� �� �ּҰ����
public class a8_�ִ�����GCD {
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
