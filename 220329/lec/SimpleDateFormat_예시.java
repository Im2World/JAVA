package lecture0329;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_���� {
	public static void main(String[] args) {
		Date nowDate = new Date();
		System.out.println("���� ���� �� : " + nowDate);
    
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��"); 
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd"); 
        	//���ϴ� ������ ���� ����
		String strNowDate = simpleDateFormat.format(nowDate); 
        	//������ �������� ��ȯ 
		System.out.println("���� ���� �� : " + strNowDate);		
	}
}
