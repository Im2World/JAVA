package javaPro_lec05_0418_ppt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//슬9
//영수증출력3
//문제 조건 : 항목 31개 자율 생성 후 영수증 출력
//부가세 올림해서 출력!  ex) 22,855.5 => 22,856
public class p06_receipt_getbytes_taxFree {
	public static void main(String[] args) {
		//1. 형식관련 작업
		//거래일자 출력부
		Calendar k38_calendar = Calendar.getInstance();		//Calendar.getInstance() 로 영수증 출력일자, 시분초 확보
		SimpleDateFormat k38_sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm");  		//Calendar로 받아온 일자 형태 포맷 설정, SimpleDateFormat은 무조건 %s로 받는다.
		SimpleDateFormat k38_sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");   //Calendar로 받아온 일자 형태 포맷 설정, SimpleDateFormat은 무조건 %s로 받는다.
		SimpleDateFormat k38_barcode_sdf3 = new SimpleDateFormat("YYYYMMdd"); 	   //바코드용시간 표시, 년년년년월월일일로 출력
		
		//금액에 콤마 출력
		//DecimalFormat 은 숫자데이터의 형식지정
		DecimalFormat k38_df = new DecimalFormat("###,###,###,###,###");   //3자리마다(천 단위로) 콤마 출력
		
		
		//2. 변수 및 배열 선언, 값 정의
		//상품 항목 배열
		//상품명 배열은 String 으로 받는다. 
		//상품명 입력 편의를 위해 5개마다 줄바꿈해서 작성 => 총 31개 항목
		String[] k38_itemName = {"강원평창수 2L", "피코크어메이징부대찌개", "파티용6종샐러드", "유기농샤인머스켓(특)", "대만식샌드위치6개입", //문자열이라 String으로 받음.
				"오뚜기 갈릭고르곤졸라 치즈크러스트 피자460g", "풀무원 노엣지피자 베이컨파이브치즈 376g", "풀무원_치즈폭포_치즈스위트갈릭 피자_397g", "팔도비빔면 130g*4개", " [정관장]홍삼진본 40ml*20포",
				"[피코크] 진홍삼 캔디 460g", "피코크 차돌짬뽕탕 500g", "[피코크]원주 진미 양념치킨 750g", 	"피코크 에어팝 라이스칩 새우맛 120g", 	"피코크 정통 꿔바로우500g",
				"[피코크]순희네 녹두 빈대떡 400g", "피코크 초코에너지바", "고당도 제스프리 골드키위", "유기농쌀과자자색고구마칩", "상하목장 유기농 우유 500ml(125ml*4입)",
				"푸르밀 미숫가루우유", "자일로스갈색설탕500g", "[생물][국산] 손질 바지락 (1kg/봉)", "성주 REAL참외 1.8kg/봉", "파머스픽 당도선별사과 8~14입/봉 (3kg)",
				"크린종이호일 25cm x 20m", "크린장갑 100매(2+1)", "코디 소프트 3겹 데코 화장지 30m*30롤", "청우)쫀득초코칩240g", "[키친델리] 프리미엄 모둠초밥A 18입","갤럭시S22Ultra"}; 
	
		//단가 배열은 정수형 배열 => 상품명 배열 순서대로 가격 입력
		//입력 편의를 위해 5개마다 줄바꿈해서 작성
		int[] k38_price = {540, 9980, 7280, 43000, 5900,
				6980, 6980, 9480, 2680, 46000,
				4980, 7920, 8386, 1980, 7480,
				7980, 4990, 26900, 1980, 4440,
				5960, 1990, 7980, 10900, 12900,
				2808, 9160, 9900, 4980, 17583, 1299900};	//6개

		//상품 개수 배열은 정수형 배열 => 상품명 배열 순서대로 가격 입력
		int[] k38_amount = {6, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1};

		//면세상품 유무 확인위한 배열 => ***면세상품이면 true다.*** => 부가세가 붙지 않는다.
		//농산물, 흰우유는 면세상품!
		//총 31개 상품
		boolean[] k38_taxFree = {false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, 
				false, false, true, false, true, false, false, true, true, true, false, false, false, false, false, false};			
		
		//변수 선언 및 정의
		int k38_taxFreeSum = 0; 		//면세상품 가격합 (1개 가격 * 총개수)
		int k38_preTaxPriceSum = 0;		//과세상품(세전금액) 가격합 (1개 가격 * 총개수)
		int k38_allPriceSum = 0;		//면세, 과세상품 가격합
		int k38_vat = 0;				//부가세 변수 선언 및 값 정의

		
		//3. 영수증 출력부 => HEAD , BODY, TAIL로 구분함.
		//*********HEAD*********
		//실습에서 사용하는 영수증기기는 너비가 총 41칸
		System.out.printf("%-13s%2s","", "이마트 죽전점 (031)888-1234\n"); 	//정보출력 후 줄바꿈
		System.out.printf("emart %-7s%2s","", "206-85-50913 강희석\n"); 	//정보출력 후 줄바꿈
		System.out.printf("%-13s%2s","", "용인 수지구 포은대로 552\n"); 	//정보출력 후 줄바꿈
		System.out.printf("\n영수증 미지참시 교환/환불 불가\n"); 			//줄바꿈 후 정보출력 후 줄바꿈
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n"); 			//정보출력 후 줄바꿈
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n"); 		//정보출력 후 줄바꿈
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n"); 	//정보출력 후 줄바꿈 2번
		System.out.printf("%-20s%18s\n","[구 매]"+ k38_sdf1.format(k38_calendar.getTime()),"POS:0011-9861");	//Calendar.getInstance() 일자 등 시간정보 출력
		System.out.printf("-----------------------------------------\n");	//실습실 영수증 기계는 너비가 41칸이다=> 구분선길이 41칸

		
		//항목명 열맞춰 출력
		System.out.printf("%-1s %-14s %-2s%3s%9s\n","", "상 품 명", "단 가","수량","금 액");	//=> 칸수 합이 41 		
		System.out.printf("-----------------------------------------\n");	//실습실 영수증 기계는 너비가 41칸이다=> 구분선길이 41칸
		
		//*********BODY*********
		//면세물품가격합
		for (int k38_i = 0; k38_i < k38_itemName.length; k38_i++) {	//상품명 개수만큼 반복
			if (k38_taxFree[k38_i] == true) {	//면세물품일 경우
				k38_taxFreeSum += k38_price[k38_i] * k38_amount[k38_i];	//해당 가격 * 수량 한 값을 인덱스 따라 계속 더한다.
	            System.out.printf("%-2s", "*");		//면세상품 뒤에는 *모양 출력, 좌측정렬로 2칸 배정
			} else {	//면세물품아니면 => 과세상품이면
	            System.out.printf("%-2s", " ");		//과세상품 뒤에는 좌측정렬로 빈칸 2칸배정
			}
			k38_allPriceSum += k38_price[k38_i] * k38_amount[k38_i];	//모든상품 가격합 
		
	     //********핵심부********
		//상품명, 개당 가격, 수량, 총액 출력
		//모두 문자열이라서 %s로 받아준다. k38_df.format은 무조건 문자열로 받는다.
        System.out.printf("%s %s", k38_subStrByte(k38_itemName[k38_i], 15), "");	//상품명 출력
        System.out.printf("%9s %2s %10s\n", k38_df.format(k38_price[k38_i]), k38_amount[k38_i], k38_df.format(k38_price[k38_i] * k38_amount[k38_i]));	//개당가격, 수량, 총액
       
        //***핵심부***
        //5의 배수가 되면(상품5개씩 출력 후) 구분선 출력 후 줄바꿈 => 5, 10, 15, 20, 25, 30
        	if ((k38_i + 1) % 5 == 0) {
        		System.out.printf("-----------------------------------------\n");	//실습실 영수증 기계는 너비가 41칸이다=> 구분선길이 41칸
        	}
		}	//for
        
		//과세물품(세전금액) 금액 계산 : (전체금액 - 면세물품금액) / 11 * 10
		//실수형으로 계산한 뒤 형변환해서 소수점이하 버림 => 부가세 올림
		k38_preTaxPriceSum = (int)((k38_allPriceSum - k38_taxFreeSum) / 11.0 * 10.0);	//11.0, 10.0 으로 입력해야한다!
		
		//부가세 계산 : 전체금액 - 면세금액 - 과세금액
		k38_vat = k38_allPriceSum - k38_taxFreeSum - k38_preTaxPriceSum;
		
		//영수증 출력부
		//금액에 DecimalFormat 사용으로 천단위로 콤마가 찍힌다.
		System.out.printf("\n%-5s%17s%14s\n","", "총 품목 수량", k38_itemName.length); //총 품목수량= k38_itemName 배열 길이
		System.out.printf("%-5s%18s%14s\n","", "(*)면 세  물 품", k38_df.format(k38_taxFreeSum)); // 면세가격 합
		System.out.printf("%-5s%18s%14s\n","", "과 세  물 품", k38_df.format(k38_preTaxPriceSum));// 과세물품합(세전금액)
		System.out.printf("%-5s%19s%14s\n","", "부   가   세", k38_df.format(k38_vat));// 부가세합
		System.out.printf("%-5s%20s%14s\n","", "합        계", k38_df.format(k38_allPriceSum));// 면세가격합 + 과세물풀합 + 부가세 = 합계
		System.out.printf("결 제 대 상 금 액 %11s%12s\n","",k38_df.format(k38_allPriceSum));// 결제대상금액은 합계와 같음
		System.out.printf("-----------------------------------------\n");	//실습실 영수증 기계는 너비가 41칸이다=> 구분선길이 41칸
		System.out.printf("%-16s%3s\n","0012 신한 카드", "541707**0484/35860658");  //카드이름 등 출력

		//총액 금액 단위에 따라 총액 출력서식(자릿수) 변경
		//printf 서식에서 좌측정렬 후 + 를 사용한 게 포인트
		if(k38_df.format(k38_allPriceSum).length() == 9) {	//콤마 구분으로 백만원 단위 자릿수가 9가 된다.
			System.out.printf("%-19s%5s\n","카드결제(IC)", "일시불 / " + k38_df.format(k38_allPriceSum));	//백만원단위까지 출력 : %-19s
		} else if (k38_df.format(k38_allPriceSum).length() == 10) {	//콤마 구분으로 천만원 단위 자릿수가 10이된다.
			System.out.printf("%-18s%5s\n","카드결제(IC)", "일시불 / " + k38_df.format(k38_allPriceSum));	//천만원단위까지 출력 : %-20s		
		}
		System.out.printf("-----------------------------------------\n");	//실습실 영수증 기계는 너비가 41칸이다=> 구분선길이 41칸
		
		//*********TAIL*********
		System.out.printf("%-11s%s\n","",	"[신세계포인트 적립]");  //공백으로 좌측정렬 빈칸 만들고 문구출력  
		System.out.println("정*임 고객님의 포인트 현황입니다.");	//안내문구 출력
		System.out.printf("%-13s%7s%11s\n","금회발생포인트", "9350**9995", k38_df.format((int)(k38_allPriceSum / 1000))); // 결제금액의 0.001% 포인트적립
		System.out.printf("%-13s%6s%12s%1s\n","누계(가용)포인트", "999,860(", k38_df.format(999860-(int)(k38_allPriceSum / 1000)), ")"); //   가용포인트 = 누계포인트 - 금회발생포인트 
		System.out.println("*신세계포인트 유효기간은 2년입니다.");	//안내문구 출력
		System.out.printf("-----------------------------------------\n");	//실습실 영수증 기계는 너비가 41칸이다=> 구분선길이 41칸
		System.out.printf("%22s\n","구매금액기준 무료주차시간 자동부여"); //공백4칸 + 글자18자 = %22s
		System.out.printf("%-27s%9s\n", "차량번호 :","38코****");	//차량번호 임의로 입력
		System.out.printf("%-18s%9s\n", "입차시간 :", k38_sdf2.format(k38_calendar.getTime()));	// 입차시간은 실시간시간으로 출력함.      
		System.out.printf("-----------------------------------------\n");	//실습실 영수증 기계는 너비가 41칸이다=> 구분선길이 41칸
		System.out.printf("%-29s%9s\n", "캐셔:084599 양00","1150");	//안내문구 출력
		System.out.printf("%38s\n","|| ||| |||| |||  | |||||||||||| |||"); // 바코드 출력
		System.out.printf("%15s%s",(k38_barcode_sdf3.format(k38_calendar.getTime())),"/00119861/00164980/31"); //바코드 번호: 현재날짜 + 나머지	
}	//main	
			

	
	
	//*******핵심부*******
	//4. 바이트수로 한글 자르기
	//String을 반환하는 함수생성, 인자로 String과 int를 받는다.
	//k38_lengthLimit은 문자열을 자르는 기준이 되는 정수값
	public static String k38_subStrByte(String k38_str, int k38_lengthLimit) {	//String, int인자 받고
		if (!k38_str.isEmpty()) {	//k38_str가 빈값이 아니라면
			k38_str = k38_str.trim();	//trim메서드 : 문자열의 제일 왼쪽공백, 제일 오른쪽 공백 제거하고 다시 k38_str에 대입
			if (k38_str.getBytes().length < k38_lengthLimit) {	//인자로 받은 k38_str의 바이트수를 받고, 바이트수의 길이가 k38_lengthLimit보다 작으면 => 범위안이라면
				//상품명 공간으로 지정한 길이 보다 해당문자열 길이가 짧으면 그 차이만큼 공백추가 => 상품가격, 수량 등이 고정위치 갖게됨.
				for (int k38_i = k38_lengthLimit - k38_str.getBytes().length; k38_i > 0; k38_i--) {
					k38_str += " ";		//공백을 추가한다.
				}
				
				return k38_str;		//공백이 추가된 값을 반환
			} else {
				//StringBuffer : 문자열 추가, 변경하는 메서드
				StringBuffer k38_sb = new StringBuffer(k38_lengthLimit);	//k38_sb라는 객체생성
				int k38_cnt = 0;	//문자열 길이체크위한 변수 선언 및 0으로 값 설정
				
				//foreach문 :  for(타입 값받아줄 변수명 : 출력하고 싶은 자료구조(=배열)) =>인덱스 표시필요없이 배열값 다 출력함
				for (char k38_ch : k38_str.toCharArray()) {		//String k38_str을 한글자씩잘라서(toCharArray()) 모두 꺼낸다.
					//String.valuOf : 파라미터가 null이면 null반환, 항상 String형식 출력
					k38_cnt += String.valueOf(k38_ch).getBytes().length;	//인자로 받은 String의 바이트수를 얻고, 해당바이트의 길이를 cnt에 더함
					if (k38_cnt > k38_lengthLimit)	//cnt가 상품명 문자열 입력칸 최대길이보다크면
						break;	//반복중단
					k38_sb.append(k38_ch);	//append는 StringBuffer에 값 추가할 때 사용.
											//=> k38_ch값을 추가한다. => k38_ch는 인자로 받은 String을 한글자씩쪼갠것
				}
				
				//상품명 칸 길이를 15칸으로 설정했다. 만약 14칸이라면 공백문자를 한개 추가해서 위치를 조정한다.
				if (k38_sb.toString().getBytes().length == k38_lengthLimit - 1) {
					k38_sb.append(" ");	//끝에 공백1칸 추가
				}
				//N toString : N타입을 String자료형으로 변환한다. 
				return k38_sb.toString();
			}
		} else {	//k38_str이 빈값이면 공백 반환
			return "";
		}
	}
}//class