package javaPro_lec03_0414_ppt;
//자바심화1강_슬라이드21
//수수료포함 환전계산3 : **********올바른 환전수수료 계산법*********
//은행 수수료 고려해 달러로 환전
//(1달러당 원화금액 + 1달러당 수수료)를 실수형으로 계산
public class p12_수수료포함_환전계산3_실수형계산 {

	public static void main(String[] args) {
		int k38_MyWon = 1000000; // 은행에 100만원 주고 달러로 환전할 것.
		double k38_MoneyEx = 1238.21; // 달러환율
		double k38_commission = 0.003; // 환전 수수료 0.3%

		// 은행 환전은 달라 지폐만 가능
		double k38_ComPerOne = k38_MoneyEx * k38_commission;	//1달러당 수수료
		
		//*************환전수수료 핵심부 1 ***********
		// 최종 결과를 정수형으로 만들면 버림처리가능.
		// 전체금액을 (환율+1달러 당 수수료)로 나눔
		// 환전달러
		int k38_usd = (int) (k38_MyWon / (k38_MoneyEx + k38_ComPerOne));  //(k38_MoneyEx + k38_ComPerOne)을 추가했다!
		double k38_totalcom = k38_usd * k38_ComPerOne;		//총수수료
		
		//*************환전수수료 핵심부 2 ***********
		//수수료는 받아야할 돈이라 올림처리! => int 성질 활용
		//double k38_totalcom이 정수형 변한한 값과 다르면 if문에서 +1해서 올림 ex) 1238.3 != 1238 => 올림해서 1239
		//double k38_totalcom이 정수형 변한한 값과 같으면 else문 실행 ex) 1238.0 = 1238 =>그대로 1238
		//형변환 과정 때문에 int i_k38_totalcom 변수 선언
		int k38_i_totalcom;
		if (k38_totalcom != (double)((int)k38_totalcom)) {
			k38_i_totalcom = (int)k38_totalcom + 1;
		} else {
			k38_i_totalcom = (int)k38_totalcom;
		}

		//잔액 계산
		int k38_remain = (int) (k38_MyWon - (k38_usd * k38_MoneyEx) - k38_i_totalcom);		

		//출력
		System.out.printf("=======================================================\n");
		System.out.printf("%29s","수수료 적용환전\n");
		System.out.printf("-------------------------------------------------------\n");	
		System.out.printf("%-5s%-12d\n%-10s%-15d%-5s%-2f\n", "총 수수료(원):",k38_i_totalcom, "=> 미화($): ", k38_usd, "달러당 수수료(원): ",k38_ComPerOne);		
		System.out.printf("======================================================\n");			
		System.out.printf("%-5s%-12d\n%-10s%-7d\n%-5s%-2d\n%-5s%-2d\n", "총 한화환전금액(원): ",k38_MyWon, "=> 미화($): ", k38_usd, 
				"=> 수수료징구(원): ",k38_i_totalcom, "=> 잔돈(원): ", k38_remain);		
		System.out.printf("======================================================\n");	
	}
}
