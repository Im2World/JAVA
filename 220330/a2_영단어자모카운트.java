package a_0330;

import java.util.Scanner;

public class a22_���ܾ��ڸ�ī��Ʈ {
//����consonant and ����vowel ������
//����Ʈ1 : �ξ� ������ ���� �������� ī��Ʈ
//����Ʈ2 : ������ �������-��������-����
	public static void main(String[] args) {
		int consonant = 0;
		int count = 0;
		int blank = 0;

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // �����Է�

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				count++;
			} else if (input.charAt(i) == ' ') {
				blank++; // ���� ī��Ʈ
			}
		}
		consonant = input.length() - count - blank;
		System.out.println("Number of consonants: " + consonant);
		System.out.println("Number of vowels: " + count);
	}
}