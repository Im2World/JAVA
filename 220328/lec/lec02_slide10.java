package lecture0328;

import java.util.Scanner;

public class lec02_slide10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int decimal;
		int position = 0;
		int [] ternary = new int[30];
		
		System.out.println("Input de1ciamal number!");
		decimal = scanner.nextInt();
		
		while (decimal !=0)
		{
			ternary[position] = decimal % 3;	//3���� ��
			decimal = decimal / 3;	//3���� ������
			
			position++;	//�ڸ��� ���� ternary[1],[2]...,
		}
		
		//�迭 �������
		for(int i = position -1; i >= 0; i--) {
			System.out.print(ternary[i]);	//println (X)
		}		
	}
}
