package a_0331;

import java.util.Scanner;

//조합Combination
public class A1_조합+재귀함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		System.out.println("Enter the number to draw : ");
		int pick = sc.nextInt();

		output(size, pick);
	}

	public static int cal(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * cal(num - 1); // num! 팩토리얼
		}
	}

	public static void output(int num1, int num2) {
		System.out.println();
		System.out.println(num1 + "C" + num2 + ": ");
		System.out.println("C("+num1+","+num2+") = "+num1+"! / ("+num1+" - "+num2+")! / "+num2+"!");
		System.out.println();
		System.out.print("Answer : ");
		System.out.println(cal(num1) / (cal(num2) * cal(num1 - num2)));	//nCr = n! / r!(n-r)!
	}
}// class
