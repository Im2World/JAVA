package javaPro_lec04_0415_ppt;

import java.util.Arrays;

//슬23
//일십억만 이라고 0만값 출력되는 오류 수정
//numVal를 String으로 바꾸는 이유 : length를 파악하기위함.
//Integer.parseInt 로 String을 Integer로 바꾸는 이유 : k38_units 배열에서 해당 문자 불러오기위함(영일이삼사...)
//입력된 숫자를 일의자리, 십의자리 ,백의자리... 십억자리까지 읽고 한글로 출력
public class p13_숫자읽기고급_금액한글로읽기2_오류수정 {

	public static void main(String[] args) {	
		//***********핵심부************
		//한글 숫자 배열생성
		String [] k38_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		
		//***********핵심부************
		//뒤에서부터 앞으로 거꾸로 단위 입력 : 십,백,천,만,십만,백만,천만,억,십억
		//0이 있을 때는 숫자,단위 모두 생략
		//십억까지 카운트 가능
		String [] k38_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		
		//배열 출력
		System.out.printf("String [] k38_units : ");
		System.out.printf("%s \n",Arrays.toString(k38_units));
		System.out.printf("String [] k38_unitX : ");
		System.out.printf("%s \n\n",Arrays.toString(k38_unitX));		
		
		///////////////////////////////////////////////////////////////////////
		//한글로 표기할 숫자 선언
		int k38_numVal = 1001034567;
		//int k38_numVal = 2030200000;		//2030200000[이십억삼천이십만]
		
		//입력된 숫자 길이 파악
		String k38_sNumVal = String.valueOf(k38_numVal);   // String.valuOf(int) : int인 numVal를 String으로 반환한다.
		String k38_sNumVoice = ""; 	//빈값, 여기에 한글로 숫자를 읽은 값을 계속 대입할 것이다.
		System.out.printf("==> %s [%d자리]\n", k38_sNumVal, k38_sNumVal.length());	//출력결과 : [10자리]
		
		
		////////////////////계산 및 출력////////////////////
		//k38_i, k38_j변수로 while문 반복할 범위 지정
		int k38_i, k38_j;
		k38_i = 0;	//0으로 값 초기화
		k38_j = k38_sNumVal.length()-1;	//.length()는 1부터 크기를 센다=> 인덱스는 0부터 시작 => .length -1 하면 마지막 인덱스번호가 된다.
		
		
		//조건식이 참일 때 무한 반복
		while (true) {
			//k38_i가 입력된 숫자 길이 이상되면 반복종료
			//k38_i = k38_sNumVal.length() 면 k38_sNumVal의 인덱스+1이라 outOfIndex다.
			if (k38_i >= k38_sNumVal.length()) break;
			//if (k38_j < 0) break;         //k38_i는 계속증가, k38_j는 계속 감소=> k38_i는 인덱스와 같이 움직이고, k38_j는 i와 같이 움직이니까 k38_j가 0보다 작아지면 중단해도 됨.
			
			//substring(int beginIndex, int endIndex) : 시작인덱스부터 중료인덱스 앞까지만 추출
			//k38_sNumVal.substring(k38_i, k38_i+1) : 해당 인덱스 값만 출력한다.
			//Integer.parseInt(String s) : 숫자형 문자열을 인자값으로 받으면 해당 값을 10진수 Integer로 반환
			//printf니까 줄바꿈없이 우측에 계속 이어서 출력 : 예시) 1[일]0[영]0[영]1[일]0[영]3[삼]4[사]5[오]6[육]7[칠]
			System.out.printf("%s[%s]", k38_sNumVal.substring(k38_i, k38_i+1), k38_units[Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1))] );
			
			//***********핵심부************
			//해당 자리 숫자가 0이면 if문 실행. 아니라면 else문 실행
			if(k38_sNumVal.substring(k38_i, k38_i+1).equals("0")) {
				//해당자리가 0일 땐 단위값을 안붙이는데, 억, 만 자리는 붙인다.
				//이백 사만 이십.. 이백 만원..
				
				//해당 자리 숫자가 0이고 한글이 '만' 또는 '억'이면 k38_sNumVoice에 [k38_sNumVoice + 빈값 + 한글단위] 대입
				//즉, 한글단위만 추가입력한다. (=해당자리가 0이면 단위만 붙여줌)
				if(k38_unitX[k38_j].equals("만") || k38_unitX[k38_j].equals("억")) {
					k38_sNumVoice = k38_sNumVoice + "" + k38_unitX[k38_j];
					
					// 만 ~ 천만 (즉, 배열에서 천만~만) 이 모두 0이면 한글단위에서 만 제거, 이십억만 오류방지
					//substring(length() - 8, length() - 4) => 인덱스 2 ~ 5 를 추출 = 천만 ~ 만 범위에 해당하는 숫자
					//이 범위가 0000이면
					if(k38_sNumVal.substring(k38_sNumVal.length()-8,k38_sNumVal.length()-4).equals("0000")) {
						k38_sNumVoice = k38_sNumVoice.replace("만", "");	//"만"이라는 문자를 공백으로 변경
						}
					}
					
				//해당 자리 숫자가 0이고 한글이 '억' 이외의 것이면 출력자체를 안한다. 	
				else {
				}
			} //라인 61 if
			
			//해당 자리 숫자가 0이 아니면
			//인덱스 0일 때는 k38_sNumVoice가 ""상태다.
			//k38_unitX[k38_j] 는 입력된 숫자의 마지막 인덱스부터 읽는다.
			//Integer.parseInt : String을 Integer 숫자열로 변경
			else {
				k38_sNumVoice = k38_sNumVoice + k38_units[Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1))] + k38_unitX[k38_j];
			}
			k38_i++; k38_j--;	//k38_i는 1반복끝나면 1씩 증가, k38_j는 1반복끝나면 1씩 감소

		} //while
		
		
		//숫자를 한글로 읽은 결과 출력 : 숫자값, 한글로 읽은 값
		//printf니까 줄바꿈없이 우측에 계속 이어서 출력 : 1001034567[일십억일백삼만사천오백육십칠]
		System.out.printf("\n %s[%s]\n", k38_sNumVal, k38_sNumVoice);
		
	} //main
} //class

/*
			else {
				k38_sNumVoice = k38_sNumVoice + k38_units[Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1))] + k38_unitX[k38_j];
			}
			k38_i++; k38_j--;
			해당 자리 숫자가 0이 아니면 else문 시행
			
			int k38_numVal = 1001034567 이라면, 
			
			<1회차>
			k38_i = 0, k38_j = 9 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 1
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(1) => String 1 을 숫자 Integer 1 로 출력 => k38_units[1] => 일
			k38_unitX[k38_j] = k38_unitX[9] = 십
			k38_sNumVocie = 일십
			k38_i++, k38_j-- => k38_i = 1, k38_j = 8
			
			<2회차>
			k38_i = 1, k38_j = 8 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 0
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(0) => String 0 을 숫자 Integer 0 으로 출력 => k38_units[0] => 영
			k38_unitX[k38_j] = k38_unitX[8] = 억
			k38_sNumVocie = 영억????  => No!
			*** k38_sNumVal.substring(k38_i, k38_i+1)가 0이고 한글이 "만"또는 "억"이면 k38_sNumVoice에 [k38_sNumVoice + 빈값 + 한글단위] 대입
			=> k38_sNumVoice = 일십억
			k38_i++, k38_j-- => k38_i = 2, k38_j = 7			
			
			<3회차>
			k38_i = 2, k38_j = 7 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 0
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(0) => String 0 을 숫자 Integer 0 으로 출력 => k38_units[0] => 영
			k38_unitX[k38_j] = k38_unitX[7] = 천
			k38_sNumVocie = 영천????  => No!
			*** k38_sNumVal.substring(k38_i, k38_i+1)가 0이고 한글이 "만"또는 "억"이면 k38_sNumVoice에 [k38_sNumVoice + 빈값 + 한글단위] 대입
			*k38_sNumVal.substring(k38_i, k38_i+1)은 0이지만, 한글 단위가 "천"이라서 출력안한다.
			sNumVocie = 일십억
			k38_i++, k38_j-- => k38_i = 3, k38_j = 6
			
			<4회차>
			k38_i = 3, k38_j = 6 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 1
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(1) => String 1 을 숫자 Integer 1 로 출력 => k38_units[1] => 일
			k38_unitX[k38_j] = k38_unitX[6] = 백
			k38_sNumVocie = 일십억+일백 = 일십억일백
			k38_i++, k38_j-- => k38_i = 4, k38_j = 5
			
			<5회차>
			k38_i = 4, k38_j = 5 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 0
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(0) => String 0 을 숫자 Integer 0 으로 출력 => k38_units[0] => 영
			*** k38_sNumVal.substring(k38_i, k38_i+1)가 0이고 한글이 "만"또는 "억"이면 k38_sNumVoice에 [k38_sNumVoice + 빈값 + 한글단위] 대입
			*** k38_sNumVal.substring(k38_i, k38_i+1)은 0이지만, 한글 단위가 "십"이라서 출력안한다.			
			k38_unitX[j] = k38_unitX[5] = 십
			k38_sNumVocie = 일십억일백
			k38_i++, k38_j-- => k38_i = 5, k38_j = 4			
			
			<6회차>
			k38_i = 5, k38_j = 4 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 3
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(3) => String 3 을 숫자 Integer 3 로 출력 => k38_units[3] => 삼
			k38_unitX[k38_j] = k38_unitX[4] = 만
			k38_sNumVocie = 일십억일백+삼만 = 일십억일백삼만
			k38_i++, k38_j-- => k38_i = 6, k38_j = 3			
			
			<7회차>
			k38_i = 6, k38_j = 3 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 4
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(4) => String 4 을 숫자 Integer 4 로 출력 => k38_units[4] => 사
			k38_unitX[k38_j] = k38_unitX[3] = 천
			k38_sNumVocie = 일십억일백삼만 + 사천 = 일십억일백삼만사천
			k38_i++, k38_j-- => k38_i = 7, k38_j = 2			
			
			<8회차>
			k38_i = 7, k38_j = 2 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 5
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(5) => String 5 을 숫자 Integer 5 로 출력 => k38_units[5] => 오
			k38_unitX[k38_j] = k38_unitX[2] = 백
			k38_sNumVocie = 일십억일백삼만사천 + 오백 = 일십억일백삼만사천오백
			k38_i++, k38_j-- => k38_i = 8, k38_j = 1				
			
			<9회차>
			k38_i = 8, k38_j = 1 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 6
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(6) => String 6 을 숫자 Integer 6 로 출력 => k38_units[6] => 육
			k38_unitX[k38_j] = k38_unitX[1] = 십
			k38_sNumVocie = 일십억일백삼만사천오백 + 육십 = 일십억일백삼만사천오백육십
			k38_i++, k38_j-- => k38_i = 9, k38_j = 0		
			
			<10회차>
			k38_i = 9, k38_j = 0 일때
			k38_sNumVal.substring(k38_i, k38_i+1) = 7
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(7) => String 7 을 숫자 Integer 7 로 출력 => k38_units[7] => 칠
			k38_unitX[k38_j] = k38_unitX[0] = ""
			k38_sNumVocie = 일십억일백삼만사천오백육십 + 칠 = 일십억일백삼만사천오백육십칠
			k38_i++, k38_j-- => k38_i = 10, k38_j = -1	
			if (k38_i >= k38_sNumVal.length()) break; 라서 while문 종료
			
			while문 종료 후 입력받은 숫자+한글문자출력
			System.out.printf("\n %s[%s]\n", k38_sNumVal, k38_sNumVoice);
			
			///////////이 코드의 핵심부//////////
			숫자값을 문자값, 자리값을 문자단위로 변환하는 배열을 인덱스에 맞춰 0부터 시작한 것.
			String [] k38_units : [영, 일, 이, 삼, 사, 오, 육, 칠, 팔, 구] 	
			String [] k38_unitX : [, 십, 백, 천, 만, 십, 백, 천, 억, 십]
 */
