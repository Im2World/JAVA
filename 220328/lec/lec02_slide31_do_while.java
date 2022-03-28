package lecture0328;

import java.util.Scanner;
//do while은 현업에서 사용하는 경우를 거의 못봤다고 한다. do로 일단 한번은 실행
//메뉴 출력같은 것 할 때 많이 사용한다.
//silde31
public class lec02_slide31_do_while {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while ( i <= 0);
	}
}
