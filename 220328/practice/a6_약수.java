package a_0328;

import java.util.Scanner;
//int a,b 중 a를 b로 나눴을 때 나머지 0이면 b는 a의 약수
public class a6_약수 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 1; i < num; i++) { 
			if(num % i == 0) {		//나머지 0이면 num의 약수
				System.out.println(i);
			}
		}
	}
}
