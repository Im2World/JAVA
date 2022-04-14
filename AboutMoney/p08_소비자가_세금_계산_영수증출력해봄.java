package javaPro_lec03_0414_ppt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//소비자가 세금계산 2
public class p08_소비자가_세금_계산_영수증출력해봄 {
	public static void main(String[] args) {
		//한글은 칸을 맞추려면 힘들다=> d2coding 폰트 적용
		String[] k38_item = {"고래밥 (행사)","사또밥","새우깡","초코송이","양파깡"};
		int[] k38_price = {1000,2000,30000,2500,1450}; //상품가격(단가)
		int[] k38_amount = {100,2,1,3,5}; //개수
		double k38_tax_rate = 0.1;	//부가세 10%
		int k38_total_sum = 0;
		
		//영수증 출력
		System.out.printf("=================================================================\n");
		System.out.printf("%33s","구매내역\n");
		System.out.printf("-----------------------------------------------------------------\n");	
		System.out.printf("%-5s\t%-14s\t%-8s\t%-5s\t%-5s\n", "", "항목","단가(원)","수량","합계(원)");

		//DecimalFormat 클래스 사용
		//DecimalFormat 클래스는 int, double 등의 숫자를 printf로 출력할 때 %s 로 입력받음.
		DecimalFormat k38_df = new DecimalFormat ("###,###,###,###,###");	//DecimalFormat 인스턴스화		
		
		//배열 값을 출력해주기
		for (int i = 0; i < k38_item.length; i++) {
			int k38_sum = k38_price[i] * k38_amount[i]; //1000*100, 2000*2, 3000*1, 2500*3, 1450*5 
			k38_total_sum = k38_total_sum + k38_sum;	//k38_total_sum은 k38_total_sum에 sum을 더한값으로 계속 갱신 => 배열 sum값을 다 더한 값이 된다.
				//k38_total_sum = 148750
			//한줄씩 출력하고 \n으로 개행
			System.out.printf("%-5s\t%-13s\t%-8s\t%-5s\t%-5s\n", i + 1, k38_item[i], k38_df.format(k38_price[i]), k38_df.format(k38_amount[i]), k38_df.format(k38_sum));
		}
		
		//영수증 출력2
		System.out.printf("-----------------------------------------------------------------\n");		
		System.out.printf("지불금액 : \t\t\t\t\t%15s\n",k38_df.format(k38_total_sum));
		
		//세전가 계산
		//소비자가 = 세전가 * (1+세율) => 즉, 부가세10%가 더해진 소비자가는 110%의 가격이다.
		//세전가 = 소비자가 / (1+세율)
		int k38_total_net_price = (int)(k38_total_sum / (1+k38_tax_rate));	//세전가 => 135227.2727 => 135227
		System.out.printf("과세금액 : \t\t\t\t\t%15s\n", k38_df.format(k38_total_net_price));	//과세금액 = 세전가 
		
		//세금 계산
		//int형은 소수점이하는 버림. 
		int k38_tax = k38_total_sum - k38_total_net_price;  // 148750 - 135227 = 13523
		System.out.printf("세    금 : \t\t\t\t\t%15s\n", k38_df.format(k38_tax));
		System.out.printf("=================================================================\n");
		
		//날짜 및 시간 출력 Calendar클래스, SimpleDateFormat클래스 활용
		Calendar k38_cal = Calendar.getInstance();		//Calendar 클래스 인스턴스화해서 사용가능하게 만듦.
		SimpleDateFormat k38_sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss");
		//System.out.printf("최종실행시간 : %s\n", sdt.format(cal.getTime()));	//getTime()은 현재 날짜,시간 출력
		System.out.printf("%37s%3s\n", "영수증출력시간 : ",	k38_sdt.format(k38_cal.getTime()));
		System.out.printf("=================================================================\n");
	}
}
