package Method;

import java.util.Scanner;

public class A4_�Ǻ���ġ_����Լ�2_while���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input = sc.nextInt();
			System.out.println("�Ǻ���ġ ������ " + input + " ��° ���� : " + fibonacci(input));
			System.out.println(input + " ������ �Ǻ���ġ ������ ���ҵ� :");
			System.out.print("{ ");
			for (int i = 1; i < input; i++) {
				System.out.print(fibonacci(i) + " ");
			}
			System.out.println(" }");	
		}
	}//main
	
	public static int fibonacci(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else { // ����Լ�
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}
