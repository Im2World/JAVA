package a_0404;

import java.util.Scanner;

public class A1_�Է¹������忡��_�Է¹��� char�� ù��°�����ϴ��ε���2 {

	public static void main(String[] args) {

		while (true) {
			int index = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a sentence : ");
			String str = sc.nextLine();
			String[] strArr = str.split(""); // �Է¹����� �ѱ��ھ� �ڸ�

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