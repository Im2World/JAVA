package lecture0328;

import java.util.Scanner;

//silde18
public class lec02_slide18_gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num; // user input number

		System.out.println("What number do you want?");
		num = scanner.nextInt();
		// num >= 2 && num <= 9;

		if (num < 2 || num > 9) {
			System.out.println("Please enter a number from 2 to 9.");
		} else {
			for (int i = num; i <= num; i++) { // �Է��� ���ڴܸ� ���
				for (int j = 2; j <= 9; j++) { // ������ ���ڸ�
					System.out.println(i + "x" + j + "=" + i * j);
				}
			}
		}
	}
}
