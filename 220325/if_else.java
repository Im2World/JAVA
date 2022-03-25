package basic;

import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num; // user input number
		num = scanner.nextInt();

		if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Except 1, 2, 3");
		}
	}
}
