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
			ternary[position] = decimal % 3;	//3³ª´« ¸ò
			decimal = decimal / 3;	//3³ª´« ³ª¸ÓÁö
			
			position++;	//ÀÚ¸´¼ö º¯°æ ternary[1],[2]...,
		}
		
		//¹è¿­ ¿ª¼øÃâ·Â
		for(int i = position -1; i >= 0; i--) {
			System.out.print(ternary[i]);	//println (X)
		}		
	}
}
