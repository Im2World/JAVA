package Method;

import java.util.Scanner;

//Multiplication Table
public class A3_������_����Լ� {
	// ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the multiplication table number : ");
			int input = sc.nextInt();
			System.out.println();
			multiplicationT(input, 1);
		}
	}// main

	public static void multiplicationT(int num, int num2) {
		if (num2 > 9) { // ����Լ��� �������Ǹ��� ���
			return; // ���ڸ� ���� 9�ʰ��� ����
		} else {
			System.out.println(num + " x " + num2 + " = " + num * num2);
			multiplicationT(num, num2 + 1);
		}
	}
}
