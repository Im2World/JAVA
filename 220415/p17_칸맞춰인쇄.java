package javaPro_lec04_0415_ppt;

import java.text.DecimalFormat;

//칸 맞추기 실습
public class p17_칸맞춰인쇄 {

	public static void main(String[] args) {
		
		//변수선언
		String k38_item = "사과";	//문자형, 제품명
		int k38_unit_price = 5000;		//정수형, 가격
		int k38_num = 500;	//정수형, 수량
		int k38_total = 0;	//정수형, 합계로 사용할 변수
		
		//DecimalFormat 사용으로 숫자를 , 로 구분해서 출력가능
		DecimalFormat k38_df = new DecimalFormat("###,###,###,###,###");
		
		//헤더Header 찍기 : DecimalFormat은 모든 값을 %s로 받아야한다.
		//품목, 단가, 수량, 합계를 우측정렬로 각20,8,8,8 크기 배정
		//각 항목은 20자, 8자, 8자, 8자 까지 출력가능
		System.out.printf("=========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","품목","단가","수량","합계");		
		System.out.printf("=========================================================\n");
		
		//값 찍기 : DecimalFormat은 모든 값을 %s로 받아야한다.
		//item, k38_unit_price, k38_num, k38_total을 우측정렬로 각 20, 10, 10, 10 크기 배정
		//각 항목은 20,10,10,10 자 까지 출력가능
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",k38_item, k38_df.format(k38_unit_price), k38_df.format(k38_num), k38_df.format(k38_unit_price*k38_num));			
		System.out.printf("=========================================================\n");		
	}
}

/*
printf 출력서식
%숫자s : 우측정렬 => 해당 문자 앞에 숫자만큼 공간 확보
%숫자1.숫자2s : 숫자1만큼 문자공간확보, 콤마 뒤 숫자2만큼의 문자개수 출력 
	ex) System.out.printf("%20.20s","품목") : 문자 공간 20칸 확보, "품목"이라는 글자포함 20자 출력가능
*/