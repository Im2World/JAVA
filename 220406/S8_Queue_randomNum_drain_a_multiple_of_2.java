package lecture0406_9강;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class S8_Queue_randomNum_drain_a_multiple_of_2 {
//1~30까지 랜덤 숫자 10개 넣고, Queue에 2의 배수는 넣지않고 출력. 출력은 3의 배수만 출력
	public static void main(String[] args) {
		Queue<Integer> number = new LinkedList<Integer>();

		// 1. 랜덤숫자 10개 넣기
		Random ran = new Random(); // 난수생성 Math함수

		for (int i = 0; i < 20; i++) { // 0~19회차까지 시도. => 생성할 숫자개수 20개
			int num = ran.nextInt(31); // 0~31까지 수 중 랜덤 생성
				if (num % 2 == 0) {
					continue;
				} else if (num % 2 == 1) {
					number.add(num);
				}
				if (number.size() > 11) {	//제거해라
					for (int j = 0; j < number.size() - (number.size()-10); j++){
						number.poll();
					}
				}
				
		}

		/*
		 * for (int i = 0; i < 20; i++) { // 0~19까지 총 20개 숫자 생성 int num =
		 * ran.nextInt(31); // 0~31까지 수 중 랜덤 생성 if (num % 2 == 0) { continue; } else if
		 * (num % 2 == 1) { number.add(num); } } }
		 */
		System.out.println(number);

	}
}
