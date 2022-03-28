package lecture0328;

import java.util.Scanner;
//while 문은 true쓰면 무한 루프, (조건)참이면 실행.
//silde29
public class lec02_slide29_2_while2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (true) { // while(true) 넣으면 무한으로 계속 i가 증가한다.
			System.out.println(i);
			i++;
			if (i>100) {	//i==100 으로 하면 99까지만 출력됨.
				break;
			}
		}
	}
}
