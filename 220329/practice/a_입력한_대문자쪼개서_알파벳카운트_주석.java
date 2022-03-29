package a_0329;

import java.util.Scanner;

//a2_입력받은 영문자 쪼개서 각 알파벳개수 카운트
public class a_입력한_대문자쪼개서_알파벳카운트_주석 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		text = text.toUpperCase(); // 다 소문자로 만들어버린다.
		int alpha[] = new int[26];

		for (int i = 0; i < text.length(); i++) {
			char chars = text.charAt(i);

			if (chars >= 'A' && chars <= 'Z') {
				alpha[chars - 'A']++;
			}
		}
		for (int i = 0; i < alpha.length; i++) {
			char chars = (char) (i + 'A'); // 정수를 char타입으로 캐스팅.
			System.out.println(chars + ":" + alpha[i]);
		}
	}
}
