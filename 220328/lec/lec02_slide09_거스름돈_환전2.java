package lecture0328;

import java.util.Scanner;

//p3_거스름돈 환전프로그램
public class lec02_slide09_거스름돈_환전2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int recieved, price;
		recieved = scanner.nextInt();
		price = scanner.nextInt();
		int change = recieved - price;

		System.out.printf("change : %d won\n", change);
		System.out.printf("50,000 won : %d\n", change / 50000);
		change = change % 50000;
		System.out.printf("10,000 won : %d\n", change / 10000);
		change = change % 10000;
		System.out.printf("5,000 won : %d\n", change / 5000);
		change = change % 5000;
		System.out.printf("1,000 won : %d\n", change / 1000);
		change = change % 1000;
		System.out.printf("500 won : %d\n", change / 500);
		change = change % 500;
		System.out.printf("100 won : %d\n", change / 100);
		change = change % 100;
		System.out.printf("50 won : %d\n", change / 50);
		change = change % 50;
		System.out.printf("10 won : %d\n", change / 10);
		change = change % 10;
	}
}
