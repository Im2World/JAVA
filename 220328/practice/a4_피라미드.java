package a_0328;

import java.util.Scanner;

public class a4_피라미드 {
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
마지막 줄에 사용자 입력 수 * 2 -1개

https://jujudywithsw.tistory.com/104

*/