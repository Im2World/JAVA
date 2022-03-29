package lecture0329;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

//외울필요 전혀 없음.
public class TimeZoneClass_세계시각 {
	public static void main(String[] args) {
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		time = TimeZone.getTimeZone("Asia/Seoul");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));

		time = TimeZone.getTimeZone("America/New_York");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));

		time = TimeZone.getTimeZone("Greenwhich");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
		
	}
}


//random을 int로 형변환!!!
//0이 안나오고 45가 나오게하려면 int random = (int)(Math.random() * 45);에 +1