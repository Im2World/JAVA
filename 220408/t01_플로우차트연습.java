package lecture0408;

import java.util.Scanner;

public class t01_�÷ο���Ʈ���� {
//����: bigger�� num1�� �ְ�, �� ū���� bigger�� ����϶�
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