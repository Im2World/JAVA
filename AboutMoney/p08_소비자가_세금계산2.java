package javaPro_lec03_0414_ppt;

//소비자가 세금계산 2
public class p08_소비자가_세금계산2 {
	public static void main(String[] args) {
		//한글은 칸을 맞추려면 힘들다=> d2coding 폰트 적용
		String[] k38_item = {"고래밥 (행사)","사또밥","새우깡","초코송이","양파깡"};
		int[] k38_price = {1000,2000,30000,2500,1450}; //상품가격(단가)
		int[] k38_amount = {100,2,1,3,5}; //개수
		double k38_tax_rate = 0.1;	//부가세 10%
		int k38_total_sum = 0;
		
		//영수증 출력
		System.out.printf("===============================================\n");
		System.out.printf("%24s","구매내역\n");
		System.out.printf("-----------------------------------------------\n");	
		System.out.printf("%-5s\t%-7s\t%-5s\t%-5s\t%-5s\n", "", "항목","단가","수량","합계");
		
		//배열 값을 출력해주기
		for (int i = 0; i < k38_item.length; i++) {
			int k38_sum = k38_price[i] * k38_amount[i]; //1000*100, 2000*2, 3000*1, 2500*3, 1450*5 
			k38_total_sum = k38_total_sum + k38_sum;	//total_sum은 total_sum에 sum을 더한값으로 계속 갱신 => 배열 sum값을 다 더한 값이 된다.
				//total_sum = 148750
			//한줄씩 출력하고 \n으로 개행
			System.out.printf("%-5s\t%-7s\t%-5s\t%-5s\t%-5s\n", i + 1, k38_item[i], k38_price[i], k38_amount[i],k38_sum);
		}
		
		//영수증 출력2
		System.out.printf("-----------------------------------------------\n");	
		System.out.printf("지불금액 : \t\t\t\t%d\n", k38_total_sum);
		
		//세전가 계산
		//소비자가 = 세전가 * (1+세율) => 즉, 부가세10%가 더해진 소비자가는 110%의 가격이다.
		//세전가 = 소비자가 / (1+세율)
		int k38_total_net_price = (int)(k38_total_sum / (1+k38_tax_rate));	//세전가 => 135227.2727 => 135227
		System.out.printf("과세금액 : \t\t\t\t%d\n", k38_total_net_price);	//과세금액 = 세전가 
		
		//세금 계산
		//int형은 소수점이하는 버림. 
		int k38_tax = k38_total_sum - k38_total_net_price;  // 148750 - 135227 = 13523
		System.out.printf("세    금 : \t\t\t\t%d\n", k38_tax);
		System.out.printf("===============================================\n");
	}

}
