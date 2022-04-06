package a_0406_9강;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1_피보나치_1 {
//피보나치 : 앞 두항 더한게 다음항
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First num is 0, second num is 1.");
		System.out.print("Please enter the length : ");
		int length = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		list.add(0); // 빈리스트에 0
		list.add(1); // 1추가

		for (int i = 2; i < length; i++) {
			list.add(i, (list.get(i - 2) + list.get(i - 1)));
		}
		System.out.print("Result : " + list);
	}
}