package lecture0328;

import java.util.Scanner;
//while ���� true���� ���� ����, (����)���̸� ����.
//silde29
public class lec02_slide29_2_while2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		while (true) { // while(true) ������ �������� ��� i�� �����Ѵ�.
			System.out.println(i);
			i++;
			if (i>100) {	//i==100 ���� �ϸ� 99������ ��µ�.
				break;
			}
		}
	}
}
