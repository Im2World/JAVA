package lecture0328;

import java.util.Scanner;

//string �񱳴� equals()�� ���Ѵ�. int�� equal�� �ܼ��� ����
//���ڿ� ���Կ��δ� contains �� Ȯ��
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
