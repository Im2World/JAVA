package lecture0329;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_예시2_다양한_포맷 {
	public static void main(String[] args) {
		Date nowDate = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		System.out.println(simpleDateFormat.format(nowDate));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(nowDate));
		
		simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(simpleDateFormat.format(nowDate));
		
		simpleDateFormat = new SimpleDateFormat("오늘은 E요일 입니다.");
		System.out.println(simpleDateFormat.format(nowDate));
	}
}