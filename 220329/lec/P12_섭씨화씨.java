package lecture0329;

import java.util.Scanner;

public class P12_¼·¾¾È­¾¾ {
	public static void main(String[] args) {
		System.out.println("#Temperature Converter");
		System.out.println("1. Celsius ¡æ Fahrenheit");
		System.out.println("2. Fahrenheit ¡æ Celsius");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option number : ");
		int choice = sc.nextInt();

		float inputTemp = sc.nextFloat();
		float convertTemp = 0;
		
		switch(choice) {
		case 1 :
			convertTemp = (float) (inputTemp * 1.8 + 32);
			break;
		case 2 :
			convertTemp = (float) ((inputTemp-32) / 1.8);
			break;					
		}
		String result = String.format("%.2f", convertTemp);
		System.out.println("The converted temperature is : " + result);
	}
}