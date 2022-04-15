package javaPro_lec04_0415_ppt;
//범위 내 값 찾기
public class p06_범위를_주어_비교 {

	public static void main(String[] args) {
		int k38_val;	//int형 변수선언
		
		//k38_i는 0부터 299까지, 1씩 증가
		for(int k38_i = 0; k38_i < 300; k38_i++) {
			
			//변수 정의
			//0부터 1499까지 5의 배수들만 출력된다.
			//k38_i가 0~ 299라서 0*5 < k38_val < 299*5
			k38_val = 5 * k38_i;
			
			//0이상 10미만 = "일"과 값 출력
			if(k38_val >= 0 && k38_val < 10) System.out.printf("일 %d\n", k38_val);		//%d에 int k38_val 대입
			
			//10이상 100미만 = "십"과 값 출력
			else if (k38_val >= 10 && k38_val < 100) System.out.printf("십 %d\n", k38_val);		//%d에 int k38_val 대입
			
			//100이상 1000미만 = "백"과 값 출력
			else if (k38_val >= 100 && k38_val < 1000) System.out.printf("백 %d\n", k38_val);		//%d에 int k38_val 대입
			
			//그 외 (= 1000이상) = "천"과 값 출력
			else System.out.printf("천 %d\n", k38_val);		//%d에 int k38_val 대입
		} //for
	} //main
}

/*
0~9 : 일
10~99 : 십
100~999 : 백
1000~9999 : 천
*/