package a_0328;

import java.util.Scanner;

public class a1_������2_for_������Է´� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		if (num >= 2 && num <= 9) {
			for (int i = num; i <= num; i++) {
				for (int j = 2; j <= 9; j++) {
					System.out.println(i + "X" + j + "=" + i * j);
				}
			}
		} else {
			System.out.println("Please enter a number from 2 to 9.");
		}
	}
}
