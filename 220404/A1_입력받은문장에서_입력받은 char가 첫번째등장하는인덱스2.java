package a_0404;

import java.util.Scanner;

public class A1_입력받은문장에서_입력받은 char가 첫번째등장하는인덱스2 {

	public static void main(String[] args) {

		while (true) {
			int index = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a sentence : ");
			String str = sc.nextLine();
			String[] strArr = str.split(""); // 입력문장을 한글자씩 자름

			System.out.println("Enter the alphabet to find : ");
			String alpah = sc.nextLine();

			for (int i = 0; i < str.length(); i++) {
				if (strArr[i].equals(alpah)) {
					index = i + 1;
					break;
				}
			} // for
			System.out.print("Result : " + index + "\n");
		} // while
	} // main
} // class


/*
Please enter a sentence : 
Live the life you love. Love the life you live.
Enter the alphabet to find : 
l
Result : 10
Please enter a sentence : 
*/