package lecture0406_9��;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class S8_Queue_randomNum_drain_a_multiple_of_2 {
//1~30���� ���� ���� 10�� �ְ�, Queue�� 2�� ����� �����ʰ� ���. ����� 3�� ����� ���
	public static void main(String[] args) {
		Queue<Integer> number = new LinkedList<Integer>();

		// 1. �������� 10�� �ֱ�
		Random ran = new Random(); // �������� Math�Լ�

		for (int i = 0; i < 20; i++) { // 0~19ȸ������ �õ�. => ������ ���ڰ��� 20��
			int num = ran.nextInt(31); // 0~31���� �� �� ���� ����
				if (num % 2 == 0) {
					continue;
				} else if (num % 2 == 1) {
					number.add(num);
				}
				if (number.size() > 11) {	//�����ض�
					for (int j = 0; j < number.size() - (number.size()-10); j++){
						number.poll();
					}
				}
				
		}

		/*
		 * for (int i = 0; i < 20; i++) { // 0~19���� �� 20�� ���� ���� int num =
		 * ran.nextInt(31); // 0~31���� �� �� ���� ���� if (num % 2 == 0) { continue; } else if
		 * (num % 2 == 1) { number.add(num); } } }
		 */
		System.out.println(number);

	}
}
