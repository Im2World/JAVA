package lecture0329;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class calendar_��¥���ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date date = null; // date�� �� ����.

		String inputDate = sc.nextLine();
		int plusDate = sc.nextInt();

		try {
			date = df.parse(inputDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cal.setTime(date); //���ó�¥����
		cal.add(Calendar.DATE, plusDate);	//���ڴ���.
		//���ڿ� -6�ص� 6���� ��¥�� ����� �ȴ�.
		System.out.println(df.format(cal.getTime()));
	}
}
