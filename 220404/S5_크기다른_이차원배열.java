package �ǽ�_0404;

import java.util.Arrays;

public class S5_ũ��ٸ�_�������迭 {
//ũ�Ⱑ �ٸ� �������迭 �������� ����ϱ�!!!
//������ǥ���̴ϱ� �ϱ�
	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3 }, { 4, 5 }, {6, 7}, {8, 9, 10, 11 } }; // 4��_ 1���� 3ĭ, 2���� 2ĭ

		//System.out.println(numbers.length);  //2
		// System.out.println(Arrays.toString(numbers));// �ּҸ� ����ع�����.
		for (int i = 0; i < numbers.length; i++) { 	// �� ���� ����
			for (int j = 0; j < numbers[i].length; j++) {	//�� �������� ���� �� ������ �p����
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(""); //�ٹٲ�
			//System.out.println(numbersArr.length); // 3�� 2�� ���´�.
		}	
	}
}

/*
int[] numbersArr = numbers[i];

for (int j = 0; j < numbersArr.length; j++) { => 

*/