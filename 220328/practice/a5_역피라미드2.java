package a_0328;

import java.util.Scanner;

public class a5_���Ƕ�̵�2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = num; i >= 1; i--) {
			String star = "";

			for (int j = 1; j <= num - i; j++) {
				star += " ";
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				star += "*";
			}

			System.out.println(star);
		}
	}
}




/*
for (int i = number; i >= 1; i--) {
    String stars = "";

    // ���� j for��
    for (int j = 1; j <= number - i; j++) { 
        stars += " ";
    }

    // �� j for��
    for (int j = 1; j <= 2 * i - 1; j++) {
        stars += "*";
    }

    System.out.println(stars);
}

*/