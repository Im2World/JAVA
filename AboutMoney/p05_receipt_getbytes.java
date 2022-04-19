package javaPro_lec05_0418_ppt;
//******세전가, 부가세 계산*******
//소비자가 / 11 = 부가세
//소비자가 / 11 * 10 = 세전가
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//수정필요 _ 주석수정, head, body, tail구분   // 항목 3개이상 자율생성하기
//슬8 
//영수증출력2 => 너비 46칸
//다이소 영수증 : 부가세 454.5 => 올림해서 455원받음
//정답: 과세합계 4,545 , 부가세 455 , 총합 5,000
public class p05_receipt_getbytes {
	public static void main(String[] args) {
		//1. 형식관련 작업
		//거래일자 출력부		
		Calendar k38_calendar = Calendar.getInstance();		//Calendar.getInstance() 로 영수증 출력일자, 시분초 확보
		SimpleDateFormat k38_sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss");	//Calendar로 받아온 일자 형태 포맷 설정, SimpleDateFormat은 무조건 %s로 받는다.
		
		//금액에 콤마 출력
		//DecimalFormat 은 숫자데이터의 형식지정		
		DecimalFormat k38_df = new DecimalFormat ("###,###,###,###");	   //3자리마다(천 단위로) 콤마 출력
		
		//2. 각 항목들 선언
		//항목1 
		String k38_itemName1 = "에버그린 KF94 마스크";  //항목명 선언 및 정의
		String k38_itemCode1 = "1031615"; 				//상품코드 선언 및 정의
		int k38_price1 = 3000;  						//소비자가 선언 및 정의
		int k38_amount1 = 1;  							//구매개수 선언 및 정의
		//항목2
		String k38_itemName2 = "다용도만능길이조절서랍(흰색)"; //항목명 선언 및 정의
		String k38_itemCode2 = "11008152"; 				//상품코드 선언 및 정의
		int k38_price2 = 1000;  						//소비자가 선언 및 정의
		int k38_amount2 = 1;  							//구매개수 선언 및 정의 
		//항목3
		String k38_itemName3 = "모나미0.3mm(검정)"; 	//항목명 선언 및 정의 
		String k38_itemCode3 = "1020800"; 				//상품코드 선언 및 정의
		int k38_price3 = 1000;  						//소비자가 선언 및 정의 
		int k38_amount3 = 1;  							//구매개수 선언 및 정의 
		//항목4
		String k38_itemName4 = "공부잘되는PP커버상철수첩(80매/1개)"; 	//항목명 선언 및 정의 
		String k38_itemCode4 = "1023723"; 					//상품코드 선언 및 정의
		int k38_price4 = 1000;  							//소비자가 선언 및 정의 
		int k38_amount4 = 1;  								//구매개수 선언 및 정의 
						
		
		//3. 계산부
		//소비자가 총액(소비자가 * 수량의 총합) _ 항목3개 다 더함
		double k38_totalPrice =(int) ((k38_price1*k38_amount1) + (k38_price2*k38_amount2) + (k38_price3*k38_amount3));
		
		//총 세전가 합
		double k38_totalPreTaxPrice = (int)(k38_totalPrice / 11 * 10);
		
		//총 부가세 합 = 소비자가 총액 - 세전가 총액
		double k38_totalvatPrice = (int) (k38_totalPrice - k38_totalPreTaxPrice);
		
//		//세전가, 부가세 계산 테스트
//		double k38_priceDouble = 3000.0;
//		System.out.println("소비자가 : " + k38_priceDouble);
//		System.out.println("세전가 (k38_priceDouble / 11) : " + (k38_priceDouble / 11));	//출력 : 272.72727272727275
//		System.out.println("세전가 (k38_price1 / 11) : " + (k38_price1 / 11));	//출력 : 272  =>  k38_price1 int형이라서 소수점미만 버림
//		System.out.println("세전가 (k38_price1 / 11 * 10) : " + (k38_price1 / 11 * 10));	//출력: 2720 _ k38_price1 int형이라서 소수점미만 버림 
		
		
		//4.영수증 출력부
		//문자는 %s을 이용, 정수형은 %d를 이용해 출력위치를 조정
		//이번 영수증은 영수증1과 달리 공백문자없이 문자열만으로 위치를 조정했다.
		//-는 좌측정렬(문자,숫자 뒤에 칸 확보), -없으면 우측정렬(문자, 숫자 앞에 칸 확보)
		//Header
		System.out.printf("%25s\n","국민가게, 다이소"); 	//문자열이라 %s로 받고, 우측정렬 후 줄바꿈
		System.out.println("(주)아성다이소_분당서현점");	//println사용으로 안내문구출력 후 줄바꿈
		System.out.println("전화:031-702-6016");			//println사용으로 안내문구출력 후 줄바꿈
		System.out.println("본사:서울 강남구 남부순환도로 2748 (도곡동)"); //println사용으로 안내문구출력 후 줄바꿈
		System.out.println("대표자:박정부,신호섭 213-81-52063");		   //println사용으로 안내문구출력 후 줄바꿈
		System.out.println("매장:경기 성남시 분당구 분당로 53번길 11 (서현\n동)"); 	 //println사용으로 안내문구출력 후 줄바꿈
		System.out.printf("===============================================\n"); 	//구분선 출력 => 46칸  //but 실습실은 41칸이라 이거 못뽐음
		System.out.printf("%26s\n","소비자중심경영(CCM) 인증기업");			//문자열이라 %s로 받고, 우측정렬 후 줄바꿈
		System.out.printf("%28s\n","ISO 9001 품질경영시스템 인증기업"); 	//문자열이라 %s로 받고, 우측정렬 후 줄바꿈
		System.out.printf("===============================================\n"); 	//구분선 출력
		System.out.printf("%30s\n","교환/환불 14일 (03월 12일)이내,");		//문자열이라 %s로 받고, 우측정렬 후 줄바꿈
		System.out.println("(전자)영수증, 결제카드 지참후 구입매장에서 가능"); 
		System.out.printf("%27s\n","포장/가격 택 훼손시 교환/환불 불가"); 	//문자열이라 %s로 받고, 우측정렬 후 줄바꿈
		System.out.printf("%27s\n","체크카드 취소 시 최대 7일 소요");		//문자열이라 %s로 받고, 우측정렬 후 줄바꿈
		System.out.printf("===============================================\n"); 	//구분선 출력
		System.out.printf("%-13s%34s\n","[POS 1383838]",k38_sdt.format(k38_calendar.getTime()));// 거래 시간을 실시간으로 프린트해줌. 위에서 이미 지정해준 포맷으로 설정하여 getTime하기
		System.out.printf("===============================================\n"); 	//구분선 출력
		
		//Body
		//상품명, 소비자가, 구매개수, 소비자가총액(소비자가 * 구매개수), 상품코드 출력
		//각 줄마다 각 항목의 정보를 넣는다.
		//SimpleDateFormat은 무조건 %s로 받는다.
		
		//상품1 출력
        System.out.printf("%s %s", k38_subStrByte(k38_itemName1, 24), "");	//상품명 출력
        System.out.printf("%10s %3s %7s\n", k38_df.format(k38_price1), k38_amount1, k38_df.format(k38_price1 * k38_amount1));	//개당가격, 수량, 총액
        System.out.printf("%s%s%s\n","[", k38_itemCode1 ,"]");
        
		//상품2 출력
        System.out.printf("%s %s", k38_subStrByte(k38_itemName2, 24), "");	//상품명 출력
        System.out.printf("%10s %3s %7s\n", k38_df.format(k38_price2), k38_amount2, k38_df.format(k38_price2 * k38_amount2));	//개당가격, 수량, 총액
        System.out.printf("%s%s%s\n","[", k38_itemCode2 ,"]");
        
		//상품3 출력
        System.out.printf("%s %s", k38_subStrByte(k38_itemName3, 24), "");	//상품명 출력
        System.out.printf("%10s %3s %7s\n", k38_df.format(k38_price3), k38_amount3, k38_df.format(k38_price3 * k38_amount3));	//개당가격, 수량, 총액
        System.out.printf("%s%s%s\n","[", k38_itemCode3 ,"]");
        
		//상품4 출력
        System.out.printf("%s %s", k38_subStrByte(k38_itemName4, 24), "");	//상품명 출력
        System.out.printf("%10s %3s %7s\n", k38_df.format(k38_price4), k38_amount4, k38_df.format(k38_price4 * k38_amount4));	//개당가격, 수량, 총액
        System.out.printf("%s%s%s\n","[", k38_itemCode4 ,"]");
		
        //과세합계, 부가세, 판매합계, 신용카드 등 정보 출력
		System.out.printf("%-15s%-4s%23s\n","","과세합계:", k38_df.format((int)k38_totalPreTaxPrice)); // 세전가 총합
		System.out.printf("%-17s%-3s%23s\n","","부가세:", k38_df.format((int)k38_totalvatPrice)); //부가세 총합
		System.out.printf("-----------------------------------------------\n");	//구분선 출력
		System.out.printf("%-1s%39s\n","판매합계", k38_df.format((int)(k38_totalPreTaxPrice + k38_totalvatPrice))); 	//세전가 총합 + 부가세 총합 = 소비자가 총합
		System.out.printf("===============================================\n"); 	//구분선 출력
		System.out.printf("%-1s%39s\n","신용카드", k38_df.format((int)(k38_totalPreTaxPrice + k38_totalvatPrice)));		//신용카드 결제액 = 판매합계액
		System.out.printf("-----------------------------------------------\n");	//구분선 출력
		System.out.printf("%-1s%39s\n","신한카드","511120**********");  //문자열이라 %s로 받음
		System.out.printf("%-1s%16s%7s\n","승인번호 77982843(0)","승인금액", k38_df.format((int)(k38_totalPreTaxPrice + k38_totalvatPrice)));	//승인금액 = 판매합계액
		
		//Tail
		System.out.printf("===============================================\n"); 	//구분선 출력
		System.out.printf("%27s%7s\n", k38_sdt.format(k38_calendar.getTime()), "분당서현점");	//Calendar.getInstance() 로 영수증 출력일자, 시분초 확보
		System.out.println("상품 및 기타 문의 : 1577-1577");	//println사용으로 안내문구출력 후 줄바꿈
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211");	//println사용으로 안내문구출력 후 줄바꿈
		System.out.printf("%38s\n","||||| |||| ||||||||||| ||||");		//바코드형태 출력
		System.out.printf("%32s\n","2112820610158231");	//문자열이라 %s로 받고, 우측정렬 후 줄바꿈
		System.out.printf("-----------------------------------------------\n");	//구분선 출력
		System.out.printf("%s%25s","◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n","회원가입 후 다양한 혜택을 누려보세요! ◈"); //printf사용으로 안내문구출력 후 줄바꿈
	}	//main
	
	

	//*******핵심부*******
	//상품명공간 24칸
	//5. 바이트수로 한글 자르기
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
				
				//상품명 칸 길이를 24칸으로 설정했다. 만약 23칸이라면 공백문자를 한개 추가해서 위치를 조정한다.
				if (k38_sb.toString().getBytes().length == 23) {
					k38_sb.append(" ");
				}
				//N toString : N타입을 String자료형으로 변환한다. 
				return k38_sb.toString();
			}
		} else {	//k38_str이 빈값이면 공백 반환
			return "";
		}
	}
}//class
