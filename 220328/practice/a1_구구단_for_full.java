package a_0328;

import java.util.Scanner;

public class a1_±¸±¸´Ü_for_full {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		System.out.println("Do you want print out multiplication tables?");
		answer = scanner.nextLine();

		if (answer.equals("y") == true) {
			for (int i = 2; i <= 9; i++) {
				for (int j = 2; j <= 9; j++) {
					System.out.println(i + "X" + j + "=" + i * j);
				}
			}
		} else {
			System.out.println("Good Bye.");
		}
	}
}