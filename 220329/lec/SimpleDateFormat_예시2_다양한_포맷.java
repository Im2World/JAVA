package lecture0329;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_����2_�پ���_���� {
	public static void main(String[] args) {
		Date nowDate = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		System.out.println(simpleDateFormat.format(nowDate));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(nowDate));
		
		simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(simpleDateFormat.format(nowDate));
		
		simpleDateFormat = new SimpleDateFormat("������ E���� �Դϴ�.");
		System.out.println(simpleDateFormat.format(nowDate));
	}
}