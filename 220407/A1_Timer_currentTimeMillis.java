package a_0407;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class A1_Timer_currentTimeMillis {
	public static void main(String[] args) {
		calTime();
	}
	
	public static void calTime() {
		// 1. ó���� �ð� ȹ��
		long start = System.currentTimeMillis();
		System.out.print("Now : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(start));

		// 2. ó���� �۾�
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seconds you want to add : ");
		long inputNum = sc.nextInt();
		System.out.println("");

		// 3. ó���߾���� �ð� ȹ��  _�� �����ؼ� �����.
		long upToTime = start + (inputNum * 1000); //inputNum���� long������ ����ڴ� int������ �Է��ϱ⿡ *1000����� long�� �ȴ�.
		System.out.println("Must be entered by this time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(upToTime));

		// 4. ó���� �ð� ȹ��
		long end = System.currentTimeMillis();
		System.out.print("Now : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(end));

		// 5. �ð����� ���_�����Է±��� ������ �ɸ��ð�
		System.out.println("Time taken to enter a number : " + (end - start) / 1000.0 + " seconds\n");

		// 6. �ð����� ���
		if ((end - start) / 1000.0 > (upToTime - start) / 1000.0) {
			System.out.println("Time is over");
			System.out.println("current time : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(end));
		} else if ((end - start) / 1000.0 <= (upToTime - start) / 1000.0) { // �Է��ѽð����� �� ������ �Է�������=���� �����ð� ���̶��
			try {
				Thread.sleep(inputNum * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // �Է½ð���ŭ �����Ŀ� ���� ���
			System.out.println("Time is over");
			System.out.println("current time : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(upToTime));
			System.out.println("");
		}
	}
}