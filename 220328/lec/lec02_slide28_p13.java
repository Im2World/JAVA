package lecture0328;

import java.util.Scanner;

//Arithmetic Progression ; ��������
//silde27_P12
//1���� �Է��� ���ڱ��� num2�� ������ ���������� ��
public class lec02_slide28_p13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num1, num2;

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		for (int i = 1; i <= num1; i++) {
			sum += i + num2;
		}
		System.out.println(sum);
	}
}
