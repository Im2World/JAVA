package lecture0406_9��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class S5_randomNumber_sort {

	public static void main(String[] args) {
		ArrayList<Integer> random = new ArrayList<Integer>();
		
		//1. 10�� ���� ���� ����
		Random ran = new Random();	//�������� Math�Լ�
		
		for (int i = 0; i < 10; i++) {	//0~9����=> 10�� �ݺ���
			int num = ran.nextInt(100);	//0~99���� �� �� ���� ����
			//System.out.println(num);
			random.add(i, num);
		}
		
		System.out.println("�������� : ");
		System.out.println(random);
		
		//2. ��������, �������� ����
		Collections.sort(random);	//��������
		System.out.println("�������� : ");
		System.out.println(random);
		
		Collections.reverse(random);	//��������
		System.out.println("�������� : ");
		System.out.println(random);
	}
}
