package javaPro_lec03_0414_ppt;

//수수료 포함 환전 계산
public class p10_수수료포함환전계산 {

	public static void main(String[] args) {
		int k38_MyWon = 1000000; // 은행에 100만원 주고 달러로 환전할 것.
		double k38_MoneyEx = 1238.21; // 달러환율
		double k38_commission = 0.003; // 환전 수수료 0.3%

		// 은행 환전은 달라 지폐만 가능

		// 최종 결과를 정수형으로 만들면 버림처리가능.
		// 전체금액을 환율로 나눔
		int k38_usd = (int) (k38_MyWon /k38_MoneyEx);
		int k38_remain = (int) (k38_MyWon - k38_usd * k38_MoneyEx);

		double k38_ComPerOne = k38_MoneyEx * k38_commission;	//1달러당 수수료
		double k38_totalcom = k38_usd * k38_ComPerOne;			
		
		System.out.printf("=======================================================\n");
		System.out.printf("%29s","수수료 계산\n");
		System.out.printf("-------------------------------------------------------\n");	
		System.out.printf("%-5s%-12f\n%-10s%-14d%-5s%-2f\n", "총 수수료(원):",k38_totalcom, "=> 미화($): ", k38_usd, "달러당 수수료(원) : ",k38_ComPerOne);		
		System.out.printf("=======================================================\n");	
	}
}
//달러당 수수료가 [달러당 수수료 : 3.714630]로 출력되는 문제발생
//은행에서는 실제로 0.714630을 받을 수 없다.