package lecture0329;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_예시 {
	public static void main(String[] args) {
		Date nowDate = new Date();
		System.out.println("포맷 지정 전 : " + nowDate);
    
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일"); 
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd"); 
        	//원하는 데이터 포맷 지정
		String strNowDate = simpleDateFormat.format(nowDate); 
        	//지정한 포맷으로 변환 
		System.out.println("포맷 지정 후 : " + strNowDate);		
	}
}
