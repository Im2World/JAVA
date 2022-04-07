package lecture0407;

import java.text.SimpleDateFormat;
import java.util.Date;

public class S3_thread_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		
		System.out.println(dateAndTime);
		System.out.println("start");
		
		try {
			Thread.sleep(3000);	//3초마다 실행
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("end");
	}
}
