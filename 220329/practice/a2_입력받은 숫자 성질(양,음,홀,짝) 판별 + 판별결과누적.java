package a_0329;

import java.util.Scanner;

//a2_�Է¹��� ���� ����(��,��,Ȧ,¦) �Ǻ� + �Ǻ��������
public class a2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pNum = 0, nNum = 0, oNum = 0, eNum = 0;
		//positive, negative, even, odd Number
		System.out.println("Enter the number.");
		while (true) {// ���ѹݺ�
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("0�� �Ǻ��� �� �����ϴ�.");
				continue; // �ٽ��Է¹���.
			} else if (num > 0) {	//���
				pNum++;
				if (num % 2 == 0) {
					eNum++;	//¦ even Number
				} else {
					oNum++;	//Ȧ	odd Number
				}
			} else { // ����
				nNum++;
				if (num % 2 == 0) {
					eNum++;
				} else {
					oNum++;
				}
			}

			// ���
			System.out.println("P: " + pNum + " , N: " + nNum + " , O: " + oNum + " , E: " + eNum);
			System.out.println("");
		} // while(true) close
	}
}
