package a_0406_9��;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1_�Ǻ���ġ_1 {
//�Ǻ���ġ : �� ���� ���Ѱ� ������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First num is 0, second num is 1.");
		System.out.print("Please enter the length : ");
		int length = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		list.add(0); // �󸮽�Ʈ�� 0
		list.add(1); // 1�߰�

		for (int i = 2; i < length; i++) {
			list.add(i, (list.get(i - 2) + list.get(i - 1)));
		}
		System.out.print("Result : " + list);
	}
}