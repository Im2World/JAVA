package lecture0328;

import java.util.Scanner;

//Multiplication Table2
//silde26_P11
public class lec02_slide26_p11_gugudan {
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
