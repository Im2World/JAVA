package 실습_0404;

import java.util.Scanner;

public class P6_알파벳개수세기_특정단어개수세기 {
    static Scanner scanner = new Scanner(System.in);
//문장에서 알파벳 단어 개수 세기
	public static void main(String[] args) {
		//문자열 입력
		String str = "";
		System.out.println("Please enter the stral text : ");
		str = scanner.nextLine();
		
		//찾을 단어 입력
		String target = "";
		System.out.println("Enter the target you want to find : ");
		target = scanner.next();

		//띄어쓰기로 단어 나누기
		String[] sarr = str.split(" ");

		//찾으려는 단어의 빈도수 계산
		int len = sarr.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (target.equals(sarr[i])) {
				count++;
			}
		}
		System.out.println("count is : " + count);
	}
}

/*
Please enter the stral text : 
kor abxnkfaaf kor asnlnwafa
Enter the target you want to find : 
kor
count is : 2
*/