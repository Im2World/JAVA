package lecture0329;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

//�ܿ��ʿ� ���� ����.
public class TimeZoneClass_����ð� {
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


//random�� int�� ����ȯ!!!
//0�� �ȳ����� 45�� �������Ϸ��� int random = (int)(Math.random() * 45);�� +1