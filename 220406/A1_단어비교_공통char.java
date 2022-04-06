package a_0406_9��;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class A1_�ܾ��_����char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first word : ");
		String first = sc.next(); // school
		System.out.print("Enter the second word  : ");
		String second = sc.next(); // scholar

		// 1. ��̸���Ʈ�� ���� �߰�
		List<String> list = new ArrayList<>();
		list.add(first);
		list.add(second); // list ��� : [school, scholar]

		// 2. �Է¹����ܾ� �ɰ��� �迭�� ����
		String[] firstArr = first.split("");
		String[] secondArr = second.split("");

		// 3. ArrayList�� ù�ܾ�, �ι�°�ܾ� ���ĺ������� ���� ����
		List<String> firstArrList = new ArrayList<>();
		for (int i = 0; i < firstArr.length; i++) {
			firstArrList.add(i, firstArr[i]);
		} // [s, c, h, o, o, l]

		List<String> secondArrList = new ArrayList<>();
		for (int i = 0; i < secondArr.length; i++) {
			secondArrList.add(i, secondArr[i]);
		} // [s, c, h, o, l, a, r]
			// System.out.println(firstArrList.size()); //6

		// 4. �������� ������ ArrayList
		List<String> sameArrList = new ArrayList<>();
		sameArrList.clear();

		// 5. retainAll �� �������ڸ� ����� ����_ �� �� �ܾ�� ª�� �ܾ��� �������ڸ� ã�ƾ��Ѵ�.
		if (firstArrList.size() > secondArrList.size()) {
			firstArrList.retainAll(secondArrList);
			sameArrList.addAll(firstArrList);
		} else if (firstArrList.size() < secondArrList.size()) {
			secondArrList.retainAll(firstArrList);
			sameArrList.addAll(secondArrList); // [s, c, h, o, l]
		} else { // ������ �����ϸ� �׳� �ƹ��ų� ��������.
			firstArrList.retainAll(secondArrList);
			sameArrList.addAll(firstArrList);
		}		
		
		// 6. ��º�
		System.out.println("The size of first word : " + list.get(0).length());
		// System.out.println(list.get(0).length()); //String first�� ����
		System.out.println("The size of second word : " + list.get(1).length());
		// System.out.println(list.get(1).length()); //String second�� ����
		System.out.println("Count of the same alphabet is : " + sameArrList.size());
		// System.out.println(sameArrList.size());
	}
}


/*
Enter the first word : Korea
Enter the second word  : Kor
The size of first word : 5
The size of second word : 3
Count of the same alphabet is : 3
*/