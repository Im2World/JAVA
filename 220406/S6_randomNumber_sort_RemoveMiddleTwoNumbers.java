package lecture0406_9강;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class S6_randomNumber_sort_RemoveMiddleTwoNumbers {
//랜덤숫자 10개를 for문으로 넣고 오름차순으로 정렬 후 가운데 있는 숫자 2개 제외한 나머지 8개 출력
	public static void main(String[] args) {
		ArrayList<Integer> random = new ArrayList<Integer>();

		// 1. 10개 숫자 랜덤 생성
		Random ran = new Random(); // 난수생성 Math함수

		for (int i = 0; i < 10; i++) { // 0~9까지=> 10번 반복함
			int num = ran.nextInt(100); // 0~99까지 수 중 랜덤 생성
			// System.out.println(num);
			random.add(i, num);
		}

		System.out.println("오리지널 : ");
		System.out.println(random);

		// 2. 오름차순, 내림차순 정렬
		Collections.sort(random); // 오름차순
		System.out.println("오름차순 : ");
		System.out.println(random);

		// 3. 가운데 숫자 2개 삭제
		random.remove(random.size() / 2);    //★
		random.remove(random.size() / 2);   //★
		System.out.println("숫자 2개 삭제한 배열 : ");
		System.out.println(random);
	}
}
