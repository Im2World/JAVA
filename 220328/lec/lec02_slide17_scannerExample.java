package lecture0328;

import java.util.Scanner;

//silde17_P6
public class lec02_slide17_scannerExample { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oper, i, j, result = 0;
		oper = scanner.nextInt();
		i = scanner.nextInt();
		j = scanner.nextInt();

		System.out.println("--->");
		if (oper == 1) {
			result = i + j;
		} else if (oper == 2) {
			result = i - j;
		} else if (oper == 3) {
			result = i * j;
		} else if (oper == 4 && j != 0) {
			result = i / j;
		} else {
			System.out.println("Error");
		}
		if (oper != 5 && !(oper == 4 && j == 0)) {
			System.out.println(result);
		}
	}
}
