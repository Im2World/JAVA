package lecture0329;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class calendar_날짜더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date date = null; // date는 빈 상태.

		String inputDate = sc.nextLine();
		int plusDate = sc.nextInt();

		try {
			date = df.parse(inputDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cal.setTime(date); //오늘날짜지정
		cal.add(Calendar.DATE, plusDate);	//날자더함.
		//일자에 -6해도 6일전 날짜가 계산이 된다.
		System.out.println(df.format(cal.getTime()));
	}
}
