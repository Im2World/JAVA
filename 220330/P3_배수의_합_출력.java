package lecture0330;

import java.util.Scanner;
//자연수 N이 입력되면 1부터 N까지의 수 중 M의 배수합을 출력
public class P3_배수의_합_출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		
		int num = sc.nextInt();
		int multiple = sc.nextInt();
		
		System.out.println("===multiple of "+multiple+" from One to "+num+"===");
		for(i = 1; i <= num; i++) {
			if(i % multiple == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("");
		System.out.println("=======sum=======");
		System.out.println(sum);
	}
}
