package a_0401;

import java.util.Scanner;

//ǥ���������ϱ�
public class A2_ǥ���������ϱ�2_�ϼ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // ǥ������ ���� ���� �Է�
		int sum = 0;

		// 1.�� ���� ��
		for (int i = num; i > 0; i--) { // �Է¹��� �� ���� ��� 10,9,8,7,6,5,4,3,2,1
			sum += i;
			System.out.println(i);
		}

		// 2.��հ��
		double avg = (double) sum / num;
		System.out.println("��� : "+avg);

		// 3. ������ ���
		// (�� ������ ��� ���ְ� 2����)�� ���� ���Ѵ�.
		double diff = 0;
		double diffSq = 0;
		double diffSqSum = 0;
		for (int i = num; i > 0; i--) {
			diff = i - avg;
			diffSq = Math.pow(diff, 2);
			diffSqSum += diffSq;
		}

		// 4. �ڷ� ������ ������ => / num
		double var = diffSqSum / num;

		// 5. ������ ���
		double std = Math.sqrt(var);
		System.out.println("ǥ������ : ");
		System.out.println(std);

	}
} // class

/*
10
10
9
8
7
6
5
4
3
2
1
��� : 5.5
ǥ������ : 
2.8722813232690143
*/