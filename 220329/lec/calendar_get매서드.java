package lecture0329;
import java.util.Calendar;

public class calendar_get�ż��� {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		//System.out.println(calendar.get(Calendar.DATE)-3); �� ����. ��, ������ ������ �����ִ�.		
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));		
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));		
	}
}
