package a_0328;

import java.util.Scanner;

public class a4_�Ƕ�̵� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 0; i < num; i++) { // N line generation, row
			for (int j = 0; j < (num - 1) - i; j++) { // create blank.
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) { // create stars in odd number line.
				System.out.print("*"); // change line
			}
			System.out.println("");
		}
	}
}






/*
������ �ٿ� ����� �Է� �� * 2 -1��

https://jujudywithsw.tistory.com/104

*/