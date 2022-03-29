package lecture0329;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class �ѱ����������и� {
	// �ѱ��ڸ� �����ڵ尪
	// �ʼ� 19��
	public static char[] arrChoSung = { 0x3131, 0x3132, 0x3134, 0x3137, 0x3138, 0x3139, 0x3141, 0x3142, 0x3143, 0x3145,
			0x3146, 0x3147, 0x3148, 0x3149, 0x314a, 0x314b, 0x314c, 0x314d, 0x314e };
	// �߼� 21��
	public static char[] arrJungSung = { 0x314f, 0x3150, 0x3151, 0x3152, 0x3153, 0x3154, 0x3155, 0x3156, 0x3157, 0x3158,
			0x3159, 0x315a, 0x315b, 0x315c, 0x315d, 0x315e, 0x315f, 0x3160, 0x3161, 0x3162, 0x3163 };
	// ���� 28��
	public static char[] arrJongSung = { 0x0000, 0x3131, 0x3132, 0x3133, 0x3134, 0x3135, 0x3136, 0x3137, 0x3139, 0x313a,
			0x313b, 0x313c, 0x313d, 0x313e, 0x313f, 0x3140, 0x3141, 0x3142, 0x3144, 0x3145, 0x3146, 0x3147, 0x3148,
			0x314a, 0x314b, 0x314c, 0x314d, 0x314e };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word; // �ɰ��ܾ�
		String result = ""; // ��� ������ ����, ���ʻ��´� �ʱ�ȭ
		word = sc.nextLine();

		// word string���� �� ��ŭ list�� ���� , �迭 ũ��4��, �ε�����0123
		for (int i = 0; i < word.length(); i++) {
			// �ѱ��ھ� �о���̱�
			char chars = (char) (word.charAt(i) - 0xAC00);
			if (chars >= 0 && chars <= 11172) { // �������� ������ ������ ���
				// 1.�и�
				int cho = chars / (21 * 28);
				int jung = chars % (21 * 28) / 28;
				int jong = chars % (21 * 28) % 28;

				// 2.�и����� result ���
				result = result + arrChoSung[cho] + arrJungSung[jung];

				// 3.���� �Ӥ��ä� �и�
				if (jong != 0x0000) {
					result = result + arrJongSung[jong];
				}
			} else { // �ѱ۾ƴϰų� ������ �ִ� ���
				// 4. �����и�
				result = result + ((char) (chars + 0xAC00));
			}
		} // line36 for close

		System.out.println("===========result===========");
		System.out.println(word);
		System.out.println(result);
	}
}

/*
 * �����ڵ� �ѱ��� 0xAC00 ���κ��� �ʼ� 19��, �߻�21��, ����28���� �̷������ �̵��� ������ 11,172���� ���ڸ� ���´�.
 * �ѱ��ڵ��� �� = ((�ʼ� * 21) + �߼�) * 28 + ���� + 0xAC00 (0xAC00�� ����'�� �ڵ尪)
 */
