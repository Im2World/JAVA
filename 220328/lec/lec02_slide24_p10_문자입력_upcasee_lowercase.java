package lecture0328;

import java.util.Scanner;

//regardless of upper case or lower case.
//silde24_P10
public class lec02_slide24_p10_문자입력_upcasee_lowercase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text;
		text = scanner.nextLine();

		// if (text.toLowerCase().contains("car".toLowerCase())==true) {
		if (text.toUpperCase().contains("car".toUpperCase()) == true) {
			System.out.println("car is included in the input string.");
		} else {
			System.out.println("car is not included in the input string");
		}

		System.out.println(text);
	}
}
