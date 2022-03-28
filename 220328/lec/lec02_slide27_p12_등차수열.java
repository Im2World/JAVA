package lecture0328;

import java.util.Scanner;

//Arithmetic Progression ; 등차수열
//silde27_P12
//입력한 숫자까지 1씩 증가는 등차수열의 합
public class lec02_slide27_p12_등차수열 {
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
