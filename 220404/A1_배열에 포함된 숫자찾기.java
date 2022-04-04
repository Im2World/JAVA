package a_0404;

import java.util.Scanner;
/int를String배열에 담기
public class A1_배열에 포함된 숫자찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제에 주어진 코드
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		System.out.println("Enter the number you want to find : ");
		String target = sc.next(); // 찾으려는 숫자
		cal(numbers, target);
	} // main

	public static void cal(int[] numbers, String target) {
		// 1. int[] numbers 를 String 형으로 변환 : String 배열에 담는다. => contains함수 사용위함.
		String[] numArr = new String[numbers.length]; // int[] numbers 담을 배열
		for (int i = 0; i < numbers.length; i++) {
			numArr[i] = Integer.toString(numbers[i]);
			// int[] numbers 원소를 모두 String으로 바꿔 String배열에 저장한다.
		}

		// 2. target의 포함여부 확인
		System.out.print("Result : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numArr[i].contains(target) == true) { // numArr[i]에 target숫자가 있으면(true)면, 출력
				System.out.print(numbers[i] + " "); // 숫자 숫자 숫자 형태로 출력
			}
		} // for
	} // cal
} // class


/*
Enter the number you want to find : 
2
Result : 123 32 2 29 
*/