package javaPro_lec03_0414_ppt;

//단순환전 계산
//슬라이드18
public class p09_단순환전계산 {
	public static void main(String[] args) {
		int k38_MyWon = 1000000; // 은행에 100만원 주고 달러로 환전할 것.
		double k38_MoneyEx = 1238.21; // 달러환율
		double k38_commission = 0.003; // 환전 수수료 0.3%

		// 은행 환전은 달러 지폐만 가능

		// 최종 결과를 정수형으로 만들면 버림처리가능.=> int는 1의자리 이하 버림!
		// 전체금액을 환율로 나눔
		int k38_usd = (int) (k38_MyWon /k38_MoneyEx);
		int k38_remain = (int) (k38_MyWon - (k38_usd * k38_MoneyEx));	//가독성을 위해 ( ) 표시

		//출력
		System.out.printf("========================================================\n");
		System.out.printf("%29s","수수료 없이 계산\n");
		System.out.printf("--------------------------------------------------------\n");	
		System.out.printf("%-5s%-10d\n%-5s%-33d%-5s%-1d\n", "총 한화환전금액(원):",k38_MyWon, "=> 미화($): ", k38_usd, "잔돈 : ",k38_remain);		
		System.out.printf("========================================================\n");		
	}
}
