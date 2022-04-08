package lecture0408;

import java.util.Scanner;

public class t01_플로우차트연습 {
//문제: bigger에 num1을 넣고, 더 큰수를 bigger에 출력하라
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int bigger = num1;
		if (num1 < num2) {
			bigger = num2;
		}
		System.out.println("Bigger : " + bigger);
	}
}
/*
Enter two numbers : 
10
8
Bigger : 10
*/