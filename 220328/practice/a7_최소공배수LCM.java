package a_0328;

import java.util.Scanner;

//�ּҰ����
//A=ad, B= bd ���� a �� b �� ���μ��̰�, d �� �ִ�����
//�� ���� ���μ����� �� ��� ����κ��� �ִ����� d
//���μ����� �� �ִ����� �� �ּҰ����
public class a7_�ּҰ����LCM {
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