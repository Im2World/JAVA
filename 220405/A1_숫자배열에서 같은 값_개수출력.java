package a_0405;

import java.util.Scanner;

//String으로 숫자받기
public class A1_숫자배열에서 같은 값_개수출력 {
//String 숫자배열에서 같은 수 출력하기
	public static void main(String[] args) {
		cal();
	} // main

	public static void cal() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first set of numbers : ");
			String one = sc.nextLine();
			System.out.println("Enter the second set of numbers : ");
			String two = sc.nextLine();

			// String을 공백을 쪼개서 배열에 저장.
			String[] oneArr = one.split(" ");
			String[] twoArr = two.split(" ");

			System.out.println("Same number is : ");
			int count = 0;
			for (int i = 0; i < oneArr.length; i++) {
				for (int j = 0; j < twoArr.length; j++) {
					if (Double.parseDouble(oneArr[i]) == Double.parseDouble(twoArr[j])) { // double로 형변환했기 때문에 equals가 아니라 == 연산자사용가능.
						System.out.print(Double.parseDouble(oneArr[i]) + " ");
						count++;
					}
				}
			} // 겉 for문
			System.out.println("\nThe number of the same number is : " + count);
			System.out.println("");
		} // while
	} // cal
} // class

/*
Enter the first set of numbers : 
1.3 2 6.5 2.8 12.9 -9
Enter the second set of numbers : 
2.0 -9 1.8 99 13.9 2.8
Same number is : 
2.0 2.8 -9.0 
The number of the same number is : 3

Enter the first set of numbers : 
*/