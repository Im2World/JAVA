package a_0328;

import java.util.Scanner;

//소수 : 약수가 1과 자기 자신뿐인 수
//1제외 자기보다 작은 수로 나눴을때,하나라도 나눠지면 소수X
//user가 입력한 수 이하에서 소수 전부 출력.
public class a9_소수1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();

		for (int i = 2; i <= num; i++) {	// 소수는 1제외
			int count = 0; 	//시도횟수, for문 돌고나면 0초기화필수
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++; 	// j가 i의 약수일 때마다(=소수아님) count 1씩 증가.					
				}
			}
			if (count == 2) { // 소수 출력
				System.out.println(i);
			}
		}
	}
}




//if (count == 2) {  자기자신까지 나누어 떨어지는 경우가 2개인 경우는 소수이므로 출력