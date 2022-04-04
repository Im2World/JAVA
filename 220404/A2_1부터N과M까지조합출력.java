package a_0404;

import java.util.Scanner;

public class A2_1부터N과M까지조합출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number1 : ");
		int num1 = sc.nextInt();
		System.out.println("Please enter the number2 : ");
		int num2 = sc.nextInt();

		System.out.println("Result : ");
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.println("["+i + "," + j + "]");
			}
		}
	} // main
} // class


/*
Please enter the number1 : 
2
Please enter the number2 : 
3
Result : 
[1,1]
[1,2]
[1,3]
[2,1]
[2,2]
[2,3]
*/