package a_0329;

import java.util.Scanner;

//�ҹ��ڿ� �빮�� �ƽ�Ű�ڵ� ���̴� 32
//�빮�ڸ� �ҹ��ڷ� ������� -32
//�빮�� 65~90, �ҹ��� 97~122

//a2_�Է��� ������ �ɰ��� �� ���ĺ����� ī��Ʈ
public class a_�Է���_�ҹ����ɰ�_���ĺ�ī��Ʈ {
	public static void main(String[] args) {
		int alpha[] = new int[26];
		//�� ���ĺ� ���� Ƚ��(int��)�� �迭�� ���
		//���ĺ��� 26�ڴϱ� ũ��26, �ε��� 0~25
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			alpha[ch - 'a']++;
		}

		for(int i = 0; i < 26; i++) {
			System.out.println((char)(97+i) + ":"+ alpha[i]);
		}
	}
}


//