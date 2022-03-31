package Method;

import java.util.Scanner;

public class A4_피보나치_재귀함수2_while무한 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input = sc.nextInt();
			System.out.println("피보나치 수열의 " + input + " 번째 원소 : " + fibonacci(input));
			System.out.println(input + " 이전의 피보나치 수열의 원소들 :");
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
		} else { // 재귀함수
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}
