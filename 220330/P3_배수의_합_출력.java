package lecture0330;

import java.util.Scanner;
//�ڿ��� N�� �ԷµǸ� 1���� N������ �� �� M�� ������� ���
public class P3_�����_��_��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		
		int num = sc.nextInt();
		int multiple = sc.nextInt();
		
		System.out.println("===multiple of "+multiple+" from One to "+num+"===");
		for(i = 1; i <= num; i++) {
			if(i % multiple == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("");
		System.out.println("=======sum=======");
		System.out.println(sum);
	}
}
