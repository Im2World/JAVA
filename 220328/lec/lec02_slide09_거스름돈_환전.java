package lecture0328;

import java.util.Scanner;

//p3_�Ž����� ȯ�����α׷�
public class lec02_slide09_�Ž�����_ȯ�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int recieved, price;
		recieved = scanner.nextInt();
		price = scanner.nextInt();
		int change = recieved - price;
		int[] coinUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		// �Ž����� ȭ�����_ū ������ �Ž����ش�.

		System.out.println("���� �� : " + recieved);
		for (int i = 0; i < coinUnit.length; i++) {
			//System.out.println(coinUnit[i] + "��: " + recieved / coinUnit[i]);
			recieved = recieved % coinUnit[i];
			System.out.println(coinUnit[i] + "��: " + recieved / coinUnit[i]);
		}
	}
}

