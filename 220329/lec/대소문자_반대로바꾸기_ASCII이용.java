package lecture0329;

import java.util.Scanner;

//�ҹ��ڿ� �빮�� �ƽ�Ű�ڵ� ���̴� 32
//�빮�ڸ� �ҹ��ڷ� ������� -32
//�빮�� 65~90, �ҹ��� 97~122
public class ��ҹ���_�ݴ�ιٲٱ�_ASCII�̿� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		text = sc.nextLine();
		char[] c = null;
		c = text.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 65 && c[i] <= 90) {	//�빮�ڸ�
				c[i] += 32;	//�ҹ��ڷ�
			} else if (c[i] >= 97 && c[i] <= 122) {	//�ҹ��ڸ�
				c[i] -= 32;	//�빮�ڷ�
			}
		}
		System.out.println(c);
	}
}
