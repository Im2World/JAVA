package a_0328;

import java.util.Scanner;

//�Ҽ� : ����� 1�� �ڱ� �ڽŻ��� ��
//1���� �ڱ⺸�� ���� ���� ��������,�ϳ��� �������� �Ҽ�X
//Q.user�� �Է��� �� ���Ͽ��� �Ҽ� ���� ���.
public class a9_�Ҽ�2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 2; i <= num; i++) { // �Ҽ��� 1����
			for (int j = 2; j <= i; j++) {
				if (i != j && i % j == 0) {
					break;
				}
				if (i == j) {
					System.out.println(i);
				}
			}
		}
	}
}
