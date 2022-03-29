package a_0329;

import java.util.Scanner;

//소문자와 대문자 아스키코드 차이는 32
//대문자를 소문자로 만들려면 -32
//대문자 65~90, 소문자 97~122

//a2_입력한 영문자 쪼개서 각 알파벳개수 카운트
public class a_입력한_소문자쪼개_알파벳카운트 {
	public static void main(String[] args) {
		int alpha[] = new int[26];
		//각 알파벳 등장 횟수(int형)를 배열에 기록
		//알파벳은 26자니까 크기26, 인덱스 0~25
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			alpha[ch - 'a']++;
		}

		for(int i = 0; i < 26; i++) {
			System.out.println((char)(97+i) + ":"+ alpha[i]);
		}
	}
}


//