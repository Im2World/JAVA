package javaPro_lec05_0418_ppt;
//슬라이드7 : 영수증 출력 1
//합계 금액 k38_iPrice 를 입력받아서 영수증 출력하기
//세전가 올림처리
//****소비자가 계산 방법*****
// 소비자가 = 세전가 + (세전가 * 세율) = 세전가 * (1 + 세율)
// 즉, 소비자가는 세전가의 110%가격

//*****부가세 계산 방법*****
//부가세 = 세전가 * 0.1   => 부가세는 10%
//부가세1 = 세전가 * (1 / 10)	=> 0.1을 분수형으로 표시
//부가세2 = 소비자가 - (소비자가 / 1.1)
//소비자가 = 세전가 + 부가세
//소비자가 = 세전가 + (세전가 * 0.1) => 세전가 (1 + 0.1)   => 세전가가 공통인자라 세전가를 앞으로 빼줌
//소비자가 = 세전가 (1.1) = 세전가 (11 / 10)  => 1.1을 분수형으로 표시

//*****세전가 계산 방법*****
//세전가 = 소비자가 - 부가세
//세전가 = 소비자가 / (1 + 부가세율) => 부가세율 10% 면 [소비자가 / 1.1]	=> 이번 계산에서는 이 방식 사용

//문제조건 : 세전가를 일의 자리에서 올림처리
//문제 영수증 너비 48칸, 실습실 영수증 너비는 41칸
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class p04_receipt1 {
	public static void main(String[] args) {
		//1. 형식관련 작업		
		//거래일자 출력부
		Calendar k38_calendar = Calendar.getInstance();		//Calendar.getInstance() 로 영수증 출력일자, 시분초 확보
		SimpleDateFormat k38_sdf = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss"); //Calendar로 받아온 일자 형태 포맷 설정, SimpleDateFormat은 무조건 %s로 받는다.

		//금액에 콤마 출력
		//DecimalFormat 는 숫자데이터의 형식지정
		DecimalFormat k38_df = new DecimalFormat ("###,###,###,###");   //3자리마다(천 단위로) 콤마 출력
		
		
		//2. 상품가격 직접 입력
		//상품가격은 정수형변수 int로 설정
		Scanner sc = new Scanner(System.in);
		int k38_iPrice= sc.nextInt(); //소비자가. 소비자가는 사용자가 입력한 값을 k38_iPrice변수에 대입.
		double k38_vatRate = 0.1; //부가가치세 10% => 0.1 
		
		//3. 세전가, 부가세 계산
		// 세전가 k38_preTaxPrice를 double형으로 정의
		//(int)(k38_iPrice / 1.1) 는 1원 미만 절삭
		//세전가 : 소비자가 / (1 + 부가세율)
		//****세전가 핵심부****
		double k38_preTaxPrice = k38_iPrice / (1 + k38_vatRate);
			//세전가가 10으로 나눠떨어지면
		if (k38_preTaxPrice % 10 == 0) {
			 k38_preTaxPrice = (int) k38_preTaxPrice;	//정수형으로 그대로 처리
		} else {	//나눠떨어지지않으면
			 k38_preTaxPrice = (int) k38_preTaxPrice + 1;	//일의 자리 올림처리
		}
		
		 // 부가세, double형으로 정의 ***부가세 : 소비자가 - 세전가
		double k38_vat = k38_iPrice - k38_preTaxPrice;		//출력형태 : 3000.0
		
		
		//4. 출력부		
		//영수증 내용출력부
		//문자나 숫자 중간에 ""(공백)을 넣어 위치 조정
		//-는 좌측정렬(문자,숫자 뒤에 칸 확보), -없으면 우측정렬(문자, 숫자 앞에 칸 확보)
		System.out.printf("신용승인\n");
		System.out.printf("%-8s%12s%s\n","단말기 : 2N68665898","", "전표번호 : 041218"); //문자열이니까 %s로 문자간 간격조절
		System.out.printf("가맹점 : 한양김치찌개\n");	//정보출력
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10 ,\n1층\n");	// 라인이 영수증 너비보다 작으면 프린트할 때 알아서 자동으로 줄바꿈됨.
		System.out.printf("대표자 : 유창신\n");	//정보출력
		System.out.printf("%-8s%13s%s\n","사업자 : 752-53-00558","","TEL : 7055695"); //문자열이니까 %s로 문자간 간격조절
		System.out.printf("------------------------------------------------\n");	//구분선 출력
		
		// 금액, 부가세, 합계를 차례로 출력
		//문자나 숫자 중간에 ""(공백)을 넣어 위치 조정
		//-는 좌측정렬(문자,숫자 뒤에 칸 확보), -없으면 우측정렬(문자, 숫자 앞에 칸 확보)
		//[금액, 부가세, 합계] 단어는 계산 정보보다 먼저 출력해야함.=> 각 금액 숫자 출력 후 "원"이라는 한글문자 출력
		//DecimalFormat 사용으로 가격들에 콤마가 찍혀 나온다.
		System.out.printf("금  액" + "%-30s%9s%s\n","",k38_df.format(k38_preTaxPrice)," 원");//세전가 출력
		System.out.printf("부가세" + "%-30s%9s%1s\n","",k38_df.format(k38_vat)," 원");//부가세 출력
		System.out.printf("합  계" + "%-30s%9s%1s\n","",k38_df.format(k38_iPrice)," 원");	//소비자가 출력
		System.out.printf("------------------------------------------------\n");	//구분선 출력
		System.out.printf("신한카드\n");	//정보출력
		System.out.printf("%-31s%11s","카드번호 : 5387-20**-****-4613(S)","일시불\n");	//정보출력
		System.out.printf("거래 일시: %s\n", k38_sdf.format(k38_calendar.getTime())); //Calendar.getInstance()로 영수증 출력시점의 일자, 시분초 출력
		System.out.printf("승인번호 : 70404427\n");	//정보출력
		System.out.printf("거래번호 : 357734873739\n");	//정보출력
		System.out.printf("%s%20s","매입 : 신한카드사", "가맹 : 721112345\n");	//정보출력
		System.out.printf("알림 : EDC매출표\n");	//정보출력
		System.out.printf("문의 : TEL)1577-1577\n");	//정보출력
		System.out.printf("------------------------------------------------\n");	//구분선 출력
		System.out.printf("%-18s%s\n","", "* 감사합니다 *"); //문자열이니까 %s로 문자간 간격조절, 좌측정렬로 ""공간 확보 후 문자열 출력
		System.out.printf("%-30s%s\n","", "표준V2.08_20200212"); //문자열이니까 %s로 문자간 간격조절, 좌측정렬로 ""공간 확보 후 문자열 출력
	}
}