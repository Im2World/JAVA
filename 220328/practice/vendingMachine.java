package a_0328;

import java.util.Scanner;

public class vendingMachine {
	public static void main(String[] args) {
		int money, choice, price = 0, change = 0;
		Scanner scanner = new Scanner(System.in);
		
		money = scanner.nextInt();	//Enter the amount
		choice = scanner.nextInt();	//Choose a number
		
		switch (choice) {
		case 1:
			price = 340;
			break;
		case 2:
			price = 500;
			break;
		case 3:
			price = 650;
			break;
		case 4:
			price = 290;
			break;
		case 5:
			price = 170;
			break;
		default:
			System.out.println("please, enter numbers 1 to 5.");
			break;
		}

		System.out.println("#Menu");
		System.out.println("1. Coke - 340");
		System.out.println("2. Orange Juice - 500");
		System.out.println("3. Milk - 650");
		System.out.println("4. Water - 290");
		System.out.println("5. Coffee - 170");

		change = money - price;
		System.out.println("-" + ">" + "your choice is " + choice);
		System.out.println("Here's your change : " + change);
		System.out.println("100 coins is " + (change / 100));
		change = change % 100;
		System.out.println("50 coins is " + (change / 50));
		change = change % 50;
		System.out.println("10 coins is " + (change / 10));
		System.out.println("Thank you for using it.");
	}
}
