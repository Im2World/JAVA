package Method;

import java.util.Scanner;

//Multiplication Table
public class A3_구구단_재귀함수 {
	// 출력
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
		if (num2 > 9) { // 재귀함수는 종료조건먼저 명시
			return; // 뒷자리 곱이 9초과면 종료
		} else {
			System.out.println(num + " x " + num2 + " = " + num * num2);
			multiplicationT(num, num2 + 1);
		}
	}
}
