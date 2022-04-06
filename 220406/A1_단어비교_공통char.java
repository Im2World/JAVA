package a_0406_9강;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class A1_단어비교_공통char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first word : ");
		String first = sc.next(); // school
		System.out.print("Enter the second word  : ");
		String second = sc.next(); // scholar

		// 1. 어레이리스트에 인자 추가
		List<String> list = new ArrayList<>();
		list.add(first);
		list.add(second); // list 출력 : [school, scholar]

		// 2. 입력받은단어 쪼개서 배열에 저장
		String[] firstArr = first.split("");
		String[] secondArr = second.split("");

		// 3. ArrayList에 첫단어, 두번째단어 알파벳나눠서 각각 저장
		List<String> firstArrList = new ArrayList<>();
		for (int i = 0; i < firstArr.length; i++) {
			firstArrList.add(i, firstArr[i]);
		} // [s, c, h, o, o, l]

		List<String> secondArrList = new ArrayList<>();
		for (int i = 0; i < secondArr.length; i++) {
			secondArrList.add(i, secondArr[i]);
		} // [s, c, h, o, l, a, r]
			// System.out.println(firstArrList.size()); //6

		// 4. 공통인자 추출한 ArrayList
		List<String> sameArrList = new ArrayList<>();
		sameArrList.clear();

		// 5. retainAll 로 공통인자만 남기고 삭제_ 더 긴 단어에서 짧은 단어의 공통인자를 찾아야한다.
		if (firstArrList.size() > secondArrList.size()) {
			firstArrList.retainAll(secondArrList);
			sameArrList.addAll(firstArrList);
		} else if (firstArrList.size() < secondArrList.size()) {
			secondArrList.retainAll(firstArrList);
			sameArrList.addAll(secondArrList); // [s, c, h, o, l]
		} else { // 사이즈 동일하면 그냥 아무거나 기준잡음.
			firstArrList.retainAll(secondArrList);
			sameArrList.addAll(firstArrList);
		}		
		
		// 6. 출력부
		System.out.println("The size of first word : " + list.get(0).length());
		// System.out.println(list.get(0).length()); //String first의 길이
		System.out.println("The size of second word : " + list.get(1).length());
		// System.out.println(list.get(1).length()); //String second의 길이
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