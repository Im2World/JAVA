package a_0401;

import java.util.Scanner;
//�޼ҵ�� �Ķ���͸� ����ؼ� ���ڸ� �Ųٷ� ����϶�
public class A1_Reverse a String.java {
	public static void main(String[] args) {
		A1_A3 rev = new A1_A3();
		rev.reverse();
	}

	public void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text : ");
		String input = sc.nextLine();

		int len = input.length();
		char[] change = new char[len];

		for (int i = 0; i < len; i++) {
			change[i] = input.charAt(i);
		}

		for (int i = len - 1; i >= 0; i--) {
			System.out.print(change[i]); // �迭 ���������� �Ųٷ� ���
		}
	}
}
