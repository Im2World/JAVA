package lecture0329;

import java.util.Scanner;

public class P11_ȯ�� {
	public static void main(String[] args) {
		System.out.println("#Current Converter");
		System.out.println("1. South Korean Won �� USA Dollar");
		System.out.println("2. USA Dollar �� South Korean Won");
		System.out.println("3. South Korean Won �� European Union Euro");
		System.out.println("4. European Union Euro �� South Korean Won");		
		System.out.println("5. South Korean Won �� Japanese Yen");
		System.out.println("6. Japanese Yen �� South Korean Won");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option number : ");
		int choice = sc.nextInt();
		System.out.println("Enter the amount");
		float enterAmount = sc.nextFloat();
		float exchangeAmount = 0;
		
		switch(choice) {
		case 1 :
			exchangeAmount = (float) (enterAmount / 1219.0);
			break;
		case 2 :
			exchangeAmount = (float) (enterAmount * 1219.0);
			break;			
		case 3 :
			exchangeAmount = (float) (enterAmount / 1346.3);
			break;			
		case 4 :
			exchangeAmount = (float) (enterAmount * 1346.3);
			break;			
		case 5 :
			exchangeAmount = (float) (enterAmount / 986.6);
			break;			
		case 6 :
			exchangeAmount = (float) (enterAmount * 986.6);
			break;			
		}
		String result = String.format("%.2f", exchangeAmount);
		System.out.println("The exchange amount is : " + result);
	}
}