package lecture0407;

import java.text.SimpleDateFormat;
import java.util.Date;

public class S4_thread extends Thread {

	public static void main(String[] args) throws InterruptedException {

		S4_thread thread = new S4_thread();	//인스턴스 생성
		thread.start();      //쓰레드는 실행시 무조건 start메소드 사용
		//.isAlive() 이 thread가 살아있냐는 의미. 할일 다 하고나면 thread알아서 소멸한다.
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		Thread.sleep(3000);		//이걸 안 넣으면 계속 true가 나온다. 여기가 포인트!! 쓰레드가 죽는데는 시간이 필요하다.
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());
	}
	
	public static String getCurrentTime() {
		//출력할 날짜 형식을 SimpleDateFormat으로 지정
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();	//Date 인스턴스화
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
	
	//
	//cnt가 0,1,2,3,4까지만 출력한다. 
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
