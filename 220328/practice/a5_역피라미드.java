package a_0328;

import java.util.Scanner;

public class a5_���Ƕ�̵� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= 2 * num - i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}



/*
for (int i = 1; i <= number; i++) {
    // ���� ���� j for ��
    for (int j = 1; j < i; j++) {
        System.out.print(" ");
    }
    
    // �� j for��
    for (int j = i; j <= 2 * number - i; j++) {
        System.out.print("*");
    }

    // ������ ���� j for��
    for (int j = 1; j < i; j++) {
        System.out.print(" ");
    }
    
    System.out.println(""); 
 */