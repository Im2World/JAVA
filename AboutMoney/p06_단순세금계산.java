package javaPro_lec03_0414_ppt;

public class p06_단순세금계산 {
//단순세금계산
	// 함수선언
	public static int k38_taxcal(int k38_val, int k38_rate) {
		int k38_ret;

		//소수점이하 계산위해 double형으로 형변환해서 계산. 100.0도 같은 맥락.
		//double형 계산 값과 int형 계산 값이 같으면 if 결과로 k38_ret 출력
		//다르면 else 결과로 k38_ret 계산
		// 100 + 1을 하는 이유 : 소수점 이하값을 무조건 올림하기 위함이다.
		if (((double) k38_val * (double) k38_rate / 100.0) == k38_val * k38_rate / 100) {
			k38_ret = k38_val * k38_rate / 100;		//여기는 그냥 / 100이다!!
		} else {	//k38_val, k38_rate를 실수형으로 계산한 값과 정수형으로 계산한 값이 다르면 올림처리!
			k38_ret = k38_val * k38_rate / 100 + 1;	
		}
		return k38_ret;		//함수 k38_taxcal은 k38_ret값을 리턴
	}
	
	// 실행
	public static void main(String[] args) {
		int k38_val = 271; // 세전 물건값
		int k38_rate = 3; // 세금 3%

		//함수가 static이라 new 없이 바로 함수명사용
		//static이 아니라면 k38_taxcal aa = new k38_taxcal 해서 참조변수명 aa로 사용했어야함.
		int tax = k38_taxcal(k38_val, k38_rate);

		//결과출력
		System.out.printf("**********************************************\n");
		System.out.printf("*                단순 세금계산               *\n");
		System.out.printf("실제 세금계산: %f\n", k38_val * k38_rate / 100.0);
		
		// 하나라도 double형 연산하면 실수로 표시
		System.out.printf("세전가격: %d    세금:%d      세포함가격: %d\n", k38_val, tax, k38_val + tax);
		System.out.printf("**********************************************\n");
	}
}
