package lecture0329;

import java.util.Calendar;
import java.util.Scanner;

public class calendar_�������Է¹޾�_�޷����_tab���� {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("�⵵ �Է� : ");
		int year = sc.nextInt();
		System.out.println("�� �Է� : ");
		int month = sc.nextInt();

		cal.set(Calendar.YEAR, year); // �Է¹��� ������ ����
		cal.set(Calendar.MONTH, month); // �Է¹��� ���� ����

		System.out.println("====================[" + year + "�� " + month + "��]====================");
		System.out.println("��	��	ȭ	��	��	��	��");

		cal.set(year, month - 1, 1); // �Է¿��� 1�Ϸ� ����
		// cal���� month�� 0�� 1�� �̶� 8���� �ε��� 7��. �׷��� -1����.

		int end = cal.getActualMaximum(Calendar.DATE); // �ش� �� ������ ��¥
		int fistDay = cal.get(Calendar.DAY_OF_WEEK); // �ش� ��¥���� _ 29:ȭ����

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < fistDay; j++) {
					System.out.print("\t");
				}
			}
			System.out.print(i + "\t");
			if (fistDay % 7 == 0) { // ���ٿ� 7�Ͼ� ���
				System.out.println();	//7�� �ԷµǸ� �ٹٲ޵ȴ�.
			}
			fistDay++;
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
	}
}
