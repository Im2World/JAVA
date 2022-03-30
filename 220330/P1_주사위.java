package lecture0330;

import java.util.Arrays;
import java.util.Scanner;

public class P1_�ֻ��� {
	static int N;
	static int sumLast;
	static int[] result;
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ���� ���� �� �ʱ�ȭ
		System.out.println("Enter the number of dice. : ");
		N = sc.nextInt();	//�ֻ��� ����
		
		System.out.println("Enter the sum of dice. : ");
		sumLast = sc.nextInt();
		
		if (sumLast > N * 6 || sumLast < N) {
			System.out.println("error");
		}
		result = new int[N]; // ����� ������ �迭
		int diceNum = 0; // 0~(N-1)�� �ֻ����� �ǹ�_�迭ũ��� �ε����� 1����

		// 2. ����Լ� ȣ��
		roll(diceNum);
	}

	// ����
	private static void roll(int diceNum) {
		// 3. Ż��
		if (diceNum == N) { // N��° �ֻ����� �� ������
			for (int i = 0; i < N; i++) {
				sum += result[i];
			}
			if (sum == sumLast) {
				System.out.println(Arrays.toString(result));
				return; // print �� �޼��� ����
			} else {
				sum = 0;
			}
		} else {
			// 4. ��� Ž��
			for (int i = 1; i <= 6; i++) { // i�� 1~6���� �ش� �� �ο�(�ֻ��� ��)
				// 4.1 �� �ٲٱ�
				result[diceNum] = i; // n�� �ֻ����� i�� ���� �ο�
				diceNum = diceNum + 1; // n+1�� �ֻ����� �Ѿ
				// 4.2 ���ȣ��
				roll(diceNum); // n+1�� �ֻ����� ���Ͽ� ���ȣ��
				// 4.3 �� ����
				diceNum = diceNum - 1; // �ٽ� n�� �ֻ����� ����
				result[diceNum] = 0; // �� �˻��� ���� ���������� ����
			}
		}
	}
}