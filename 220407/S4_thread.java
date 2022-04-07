package lecture0407;

import java.text.SimpleDateFormat;
import java.util.Date;

public class S4_thread extends Thread {

	public static void main(String[] args) throws InterruptedException {

		S4_thread thread = new S4_thread();	//�ν��Ͻ� ����
		thread.start();      //������� ����� ������ start�޼ҵ� ���
		//.isAlive() �� thread�� ����ֳĴ� �ǹ�. ���� �� �ϰ��� thread�˾Ƽ� �Ҹ��Ѵ�.
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		Thread.sleep(3000);		//�̰� �� ������ ��� true�� ���´�. ���Ⱑ ����Ʈ!! �����尡 �״µ��� �ð��� �ʿ��ϴ�.
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());
	}
	
	public static String getCurrentTime() {
		//����� ��¥ ������ SimpleDateFormat���� ����
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();	//Date �ν��Ͻ�ȭ
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
	
	//
	//cnt�� 0,1,2,3,4������ ����Ѵ�. 
	public void run() {
		int cnt = 0;
		while (true) {
			if (cnt == 5) {
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + cnt);
				Thread.sleep(100);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
Check 1 : 2022-05-29 01:31:48-true
2022-05-29 01:31:48-0
2022-05-29 01:31:48-1
2022-05-29 01:31:48-2
2022-05-29 01:31:48-3
2022-05-29 01:31:49-4
Check 2 : 2022-05-29 01:31:51-false
*/
