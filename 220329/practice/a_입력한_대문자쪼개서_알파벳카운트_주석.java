package a_0329;

import java.util.Scanner;

//a2_�Է¹��� ������ �ɰ��� �� ���ĺ����� ī��Ʈ
public class a_�Է���_�빮���ɰ���_���ĺ�ī��Ʈ_�ּ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		text = text.toUpperCase(); // �� �ҹ��ڷ� ����������.
		int alpha[] = new int[26];

		for (int i = 0; i < text.length(); i++) {
			char chars = text.charAt(i);

			if (chars >= 'A' && chars <= 'Z') {
				alpha[chars - 'A']++;
			}
		}
		for (int i = 0; i < alpha.length; i++) {
			char chars = (char) (i + 'A'); // ������ charŸ������ ĳ����.
			System.out.println(chars + ":" + alpha[i]);
		}
	}
}
