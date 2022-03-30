package a_0330;

import java.util.Scanner;

public class a22_영단어자모카운트 {
//자음consonant and 모음vowel 나누기
//포인트1 : 훨씬 개수가 적은 모음으로 카운트
//포인트2 : 자음은 문장길이-모음개수-띄어쓰기
	public static void main(String[] args) {
		int consonant = 0;
		int count = 0;
		int blank = 0;

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // 문장입력

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				count++;
			} else if (input.charAt(i) == ' ') {
				blank++; // 띄어쓰기 카운트
			}
		}
		consonant = input.length() - count - blank;
		System.out.println("Number of consonants: " + consonant);
		System.out.println("Number of vowels: " + count);
	}
}