package a_0328;

import java.util.Scanner;

//�Ҽ� : ����� 1�� �ڱ� �ڽŻ��� ��
//1���� �ڱ⺸�� ���� ���� ��������,�ϳ��� �������� �Ҽ�X
//user�� �Է��� �� ���Ͽ��� �Ҽ� ���� ���.
public class a9_�Ҽ�1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 2; i <= num; i++) {	// �Ҽ��� 1����
			int count = 0; 	//�õ�Ƚ��, for�� ������ 0�ʱ�ȭ�ʼ�
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++; 	// j�� i�� ����� ������(=�Ҽ��ƴ�) count 1�� ����.					
				}
			}
			if (count == 2) { // �Ҽ� ���
				System.out.println(i);
			}
		}
	}
}




//if (count == 2) {  �ڱ��ڽű��� ������ �������� ��찡 2���� ���� �Ҽ��̹Ƿ� ���