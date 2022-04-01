package a_0401;

import java.util.Scanner;
//메소드와 파라미터를 사용해서 숫자를 거꾸로 출력하라
public class A1_Reverse a Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(reverse(num));
	}

	public static int reverse(int num) {
		int result = 0;
		while (num != 0) {
			result = result * 10 + num % 10;
			num /= 10;
		}
		return result;
	} // main
} // class
