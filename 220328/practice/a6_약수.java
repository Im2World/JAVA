package a_0328;

import java.util.Scanner;
//int a,b �� a�� b�� ������ �� ������ 0�̸� b�� a�� ���
public class a6_��� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 1; i < num; i++) { 
			if(num % i == 0) {		//������ 0�̸� num�� ���
				System.out.println(i);
			}
		}
	}
}
