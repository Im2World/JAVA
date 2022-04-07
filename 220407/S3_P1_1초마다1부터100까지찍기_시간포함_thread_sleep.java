package lecture0407;

import java.text.SimpleDateFormat;
import java.util.Date;

public class S3_P1_1초마다1부터100까지찍기_시간포함_thread_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);

		System.out.println(dateAndTime);
		System.out.println("start");

		for (int i = 1; i < 101; i++) {
			try {
				Thread.sleep(1000); // 1초마다 실행
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			time = new Date();
			dateAndTime = format.format(time);
			System.out.println(dateAndTime);
			System.out.println(i);
		}
	}
}

/*
 <출력형태>
2022-04-07 14:33:48
start
2022-04-07 14:33:49
1
2022-04-07 14:33:50
2
2022-04-07 14:33:51
3
2022-04-07 14:33:52
4
2022-04-07 14:33:53
5
2022-04-07 14:33:54
6
2022-04-07 14:33:55
7
2022-04-07 14:33:56
8
2022-04-07 14:33:57
9
2022-04-07 14:33:58
10

 */