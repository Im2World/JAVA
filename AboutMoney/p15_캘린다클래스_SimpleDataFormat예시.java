package javaPro_lec03_0414_ppt;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p15_캘린다클래스_SimpleDataFormat예시 {

	public static void main(String[] args) {
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");
		System.out.printf("최종실행시간 : %s\n", sdt.format(calt.getTime()));
		System.out.printf("************************************************\n");
		
	}

}
