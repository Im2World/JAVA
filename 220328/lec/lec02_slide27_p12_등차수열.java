package lecture0328;

import java.util.Scanner;

//Arithmetic Progression ; ��������
//silde27_P12
//�Է��� ���ڱ��� 1�� ������ ���������� ��
public class lec02_slide27_p12_�������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
