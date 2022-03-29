package lecture0329;

import java.util.Scanner;

//소문자와 대문자 아스키코드 차이는 32
//대문자를 소문자로 만들려면 -32
//대문자 65~90, 소문자 97~122
public class 대소문자_반대로바꾸기_ASCII이용 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		text = sc.nextLine();
		char[] c = null;
		c = text.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 65 && c[i] <= 90) {	//대문자면
				c[i] += 32;	//소문자로
			} else if (c[i] >= 97 && c[i] <= 122) {	//소문자면
				c[i] -= 32;	//대문자로
			}
		}
		System.out.println(c);
	}
}
