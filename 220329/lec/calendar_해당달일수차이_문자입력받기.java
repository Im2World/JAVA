package lecture0329;
//SimpleDateFormat 은 날짜 형태를 자유자재로 변환
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class calendar_해당달일수차이_문자입력받기 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.println("시작년월일 입력 : ");
		System.out.println("예) 2020/02/03 ");
		String date1 = sc.nextLine();
		System.out.println("비교년월일 입력 : ");
		System.out.println("예) 2020/02/12 ");
		String date2 = sc.nextLine();

		Date format1 = new SimpleDateFormat("yyyy/MM/dd").parse(date1);
		Date format2 = new SimpleDateFormat("yyyy/MM/dd").parse(date2);

		long diffSec = (format1.getTime() - format2.getTime()) / 1000; // 초 차이
		long diffMin = (format1.getTime() - format2.getTime()) / 60000; // 분 차이
		long diffHor = (format1.getTime() - format2.getTime()) / 3600000; // 시 차이
		long diffDays = diffSec / (24 * 60 * 60); // 일자수 차이(시*분*초)

		System.out.println(diffSec + "초 차이");
		System.out.println(diffMin + "분 차이");
		System.out.println(diffHor + "시 차이");
		System.out.println(diffDays + "일 차이");
	}
}