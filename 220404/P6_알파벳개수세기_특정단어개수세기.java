package �ǽ�_0404;

import java.util.Scanner;

public class P6_���ĺ���������_Ư���ܾ������ {
    static Scanner scanner = new Scanner(System.in);
//���忡�� ���ĺ� �ܾ� ���� ����
	public static void main(String[] args) {
		//���ڿ� �Է�
		String str = "";
		System.out.println("Please enter the stral text : ");
		str = scanner.nextLine();
		
		//ã�� �ܾ� �Է�
		String target = "";
		System.out.println("Enter the target you want to find : ");
		target = scanner.next();

		//����� �ܾ� ������
		String[] sarr = str.split(" ");

		//ã������ �ܾ��� �󵵼� ���
		int len = sarr.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (target.equals(sarr[i])) {
				count++;
			}
		}
		System.out.println("count is : " + count);
	}
}

/*
Please enter the stral text : 
kor abxnkfaaf kor asnlnwafa
Enter the target you want to find : 
kor
count is : 2
*/