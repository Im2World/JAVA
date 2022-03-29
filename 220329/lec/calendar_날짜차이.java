package lecture0329;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class calendar_날짜차이 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===날짜입력예시:20200203===");
		System.out.println("시작년월일 입력 : ");
		String date1 = sc.nextLine();
		System.out.println("비교년월일 입력 : ");
		String date2 = sc.nextLine();

		Date format1 = new SimpleDateFormat("yyyyMMdd").parse(date1);	//Date 날짜형변환
		Date format2 = new SimpleDateFormat("yyyyMMdd").parse(date2);

		long diffSec = (format2.getTime() - format1.getTime()) / 1000; // 초 차이
		long diffMin = (format2.getTime() - format1.getTime()) / 60000; // 분 차이
		long diffHor = (format2.getTime() - format1.getTime()) / 3600000; // 시 차이
		long diffDays = diffSec / (24 * 60 * 60); // 일자수 차이(시*분*초)
		
		System.out.println("");
		System.out.println("---비교결과---");
		System.out.println(diffSec + "초 차이");
		System.out.println(diffMin + "분 차이");
		System.out.println(diffHor + "시 차이");
		System.out.println(diffDays + "일 차이");
	}
}