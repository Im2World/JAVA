package a_0404;

import java.util.Scanner;
/int��String�迭�� ���
public class A1_�迭�� ���Ե� ����ã�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ������ �־��� �ڵ�
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		System.out.println("Enter the number you want to find : ");
		String target = sc.next(); // ã������ ����
		cal(numbers, target);
	} // main

	public static void cal(int[] numbers, String target) {
		// 1. int[] numbers �� String ������ ��ȯ : String �迭�� ��´�. => contains�Լ� �������.
		String[] numArr = new String[numbers.length]; // int[] numbers ���� �迭
		for (int i = 0; i < numbers.length; i++) {
			numArr[i] = Integer.toString(numbers[i]);
			// int[] numbers ���Ҹ� ��� String���� �ٲ� String�迭�� �����Ѵ�.
		}

		// 2. target�� ���Կ��� Ȯ��
		System.out.print("Result : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numArr[i].contains(target) == true) { // numArr[i]�� target���ڰ� ������(true)��, ���
				System.out.print(numbers[i] + " "); // ���� ���� ���� ���·� ���
			}
		} // for
	} // cal
} // class


/*
Enter the number you want to find : 
2
Result : 123 32 2 29 
*/