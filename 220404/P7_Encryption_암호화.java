package �ǽ�_0404;

import java.util.Scanner;
//abcd->zyxw
public class P7_Encryption_��ȣȭ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String text = sc.nextLine();
		showResult(text);
		
	}
	
	public static void showResult(String text) {
		
		char[] chars = text.toCharArray();	//String ���ڿ��� char�� �迭�� ��ȯ
		char[] resultChar = new char[text.length()];	//��ȯ��� ���� char�迭
		String[] resultStr = new String[resultChar.length]; //String���ڿ��� char�迭�� ��Ҵٰ� �� String�迭�� ����
		
		for (int i = 0; i < chars.length; i++) {
			resultChar[i] = (char) (219 - chars[i]);	//219-�ҹ��� = �ݴ��� ������.
				//219 - 97(a) = 122(z)
		}
		for (int i = 0; i < resultChar.length; i++) {
			System.out.print(resultChar[i]);
		}
	}
	
} //class



/*
'A' = 65 / 'a' = 97
'Z' = 90 / 'z' = 122

A ���� Z : 65~90
a ���� z : 97~122 => �ҹ��� ���� �� = 219
*/