package lecture0328;

import java.util.Scanner;

//silde23_P9
public class lec02_slide23_p9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text;
		text = scanner.nextLine();

		if (text.contains("car") == true) {
			System.out.println("car is included in the input string.");
		} else {
			System.out.println("car is not included in the input string");
		}
		System.out.println(text);
	}
}
