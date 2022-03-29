package lecture0329;

import java.util.Calendar;
import java.util.Scanner;

public class calendar_연월일입력받아_달력출력_tab간격 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		System.out.println("월 입력 : ");
		int month = sc.nextInt();

		cal.set(Calendar.YEAR, year); // 입력받은 연도로 세팅
		cal.set(Calendar.MONTH, month); // 입력받은 월로 세팅

		System.out.println("====================[" + year + "년 " + month + "월]====================");
		System.out.println("일	월	화	수	목	금	토");

		cal.set(year, month - 1, 1); // 입력월의 1일로 세팅
		// cal에서 month는 0이 1월 이라 8월이 인덱스 7임. 그래서 -1해줌.

		int end = cal.getActualMaximum(Calendar.DATE); // 해당 월 마지막 날짜
		int fistDay = cal.get(Calendar.DAY_OF_WEEK); // 해당 날짜요일 _ 29:화요일

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < fistDay; j++) {
					System.out.print("\t");
				}
			}
			System.out.print(i + "\t");
			if (fistDay % 7 == 0) { // 한줄에 7일씩 출력
				System.out.println();	//7일 입력되면 줄바꿈된다.
			}
			fistDay++;
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
	}
}
