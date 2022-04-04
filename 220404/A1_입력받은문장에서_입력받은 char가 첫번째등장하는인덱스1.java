package a_0404;

import java.util.Scanner;

public class A1_입력받은문장에서_입력받은 char가 첫번째등장하는인덱스1 {
//소문자, 대문자 찾고 처음발견된 숫자표시 (인덱스 + 1)
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		cal();
	}	//main
		
	public static void cal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String input = sc.nextLine(); // 문장입력
			
		// 2. 사용자가 찾을 알파벳 입력, 배열 생성
		System.out.println("Enter the alphabet you are looking for : ");
		String findWord = sc.nextLine();
		char [] arr = findWord.toCharArray();	//String findWord를 char형 배열arr로 변환 => findWord를 한글자씩 잘라서 char배열에 담음
		
		// 3. 첫번째로 나오는 인덱스 반환
		System.out.println(input.indexOf(arr[0])+1);
	} //cal
} //class



/*
Enter the sentence : 
Live the life you love. Love the life you live.
Enter the alphabet you are looking for : 
y
15
*/