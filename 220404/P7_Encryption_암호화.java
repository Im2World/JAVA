package 실습_0404;

import java.util.Scanner;
//abcd->zyxw
public class P7_Encryption_암호화 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String text = sc.nextLine();
		showResult(text);
		
	}
	
	public static void showResult(String text) {
		
		char[] chars = text.toCharArray();	//String 문자열을 char형 배열로 변환
		char[] resultChar = new char[text.length()];	//변환결과 담을 char배열
		String[] resultStr = new String[resultChar.length]; //String문자열을 char배열에 담았다가 또 String배열에 담음
		
		for (int i = 0; i < chars.length; i++) {
			resultChar[i] = (char) (219 - chars[i]);	//219-소문자 = 반대편 값나옴.
				//219 - 97(a) = 122(z)
		}
		for (int i = 0; i < resultChar.length; i++) {
			System.out.print(resultChar[i]);
		}
	}
	
} //class



/*
'A' = 65 / 'a' = 97
'Z' = 90 / 'z' = 122

A 에서 Z : 65~90
a 에서 z : 97~122 => 소문자 범위 합 = 219
*/