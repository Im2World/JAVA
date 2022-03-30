package lecture0330;

import java.util.Arrays;
import java.util.Scanner;

public class P5_��������ȿ��üũ_���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chkArr = new int[5]; // ���� ����ŭ �迭ũ������
		int count = 0;
		// chkArr 1=PASS, 2=Fail

		System.out.println("#Conditions");
		System.out.println("1. String length is more than 5 characters.");
		System.out.println("2. String contains one or more numbers.");
		System.out.println("3. String contains alphabet \"i\".");
		System.out.println("4. String contains alphabet \"go\"");
		System.out.println("5. String contains !.");
		System.out.println("");

		String text = sc.nextLine();

		// ���
		if (text.length() >= 5) {
			chkArr[0] = 1;
		} else {
			chkArr[0] = 2;
		}

		if (text.matches(".*[0-9].*")) {
			chkArr[1] = 1;
		} else {
			chkArr[1] = 2;
		}

		if (text.contains("i")) {
			chkArr[2] = 1;
		} else {
			chkArr[2] = 2;
		}

		if (text.contains("go")) {
			chkArr[3] = 1;
		} else {
			chkArr[3] = 2;
		}

		if (text.contains("!")) {
			chkArr[4] = 1;
		} else {
			chkArr[4] = 2;
		}

		// ��� ���
		for (int i = 0; i < chkArr.length; i++) {
			if (chkArr[i] == 1) {
				count++;
			}
		}

		if (count == 5) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}// main
}

//�� ���� üũ ����� �迭�� �ϳ��� 1,2�� �����ϰ�, �������� �� �迭�� Fail�� ���� 2 �� 1���� ������ ���������� Fail���