package lecture0330;

import java.util.Scanner;

public class P2_2_¿‘√‚±› {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int blance = 0;

		while (true) {
			System.out.println("#Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("Balance : " + blance);
			int choice = sc.nextInt();
			System.out.println("Money: ");
			int input = sc.nextInt();

			if (choice == 1) {
				blance += input;
			} else if (choice == 2) {
				blance -= input;
			} else {
				break;
			}

			if (blance < 0) {
				System.out.println("Negative loan impossible.");
				System.out.println("Back to the previous process.");
				blance += input;
				continue;
			}
		} // while
	} //
}