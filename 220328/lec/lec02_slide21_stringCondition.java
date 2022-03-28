package lecture0328;

import java.util.Scanner;

//string 비교는 equals()로 비교한다. int는 equal로 단순비교 가능
//문자열 포함여부는 contains 로 확인
//silde21
public class lec02_slide21_stringCondition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		if (line.equals("hello")) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		if (line.contains("hello")) {
			System.out.println("hello included");
		} else {
			System.out.println("hello not included");
		}
	}
}
