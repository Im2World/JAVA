package a_0328;

import java.util.Scanner;

public class a3_오른쪽삼각형 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) { // N line generation, row
			for (int j = 1; j <= i; j++) { // columns
				System.out.print("*");
			}
			System.out.println(); // change line
		}
	}
}
