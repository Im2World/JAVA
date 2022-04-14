package javaPro_lec03_0414_ppt;

//소비자가 세금계산1
public class p07_소비자가_세금_계산 {
	//k38_netprice 함수는 int를 return하기때문에 void 대신 int를 적는다.
	public static int k38_netprice(int k38_price, double k38_rate) {
		return (int)(k38_price / (1+k38_rate));		//세율을 더함
	}

	public static void main(String[] args) {
		int k38_price = 1234;		//상품가격
		double k38_tax_rate = 0.1;	//세금비율

		int k38_netprice = k38_netprice(k38_price, k38_tax_rate);	//함수명과 변수명이 동일=> 잘 구분해야함.
		int k38_tax = k38_price - k38_netprice;	//세금계산
		
		//출력
		System.out.printf("****************************************************\n");
		System.out.printf("%-12s%15s%12s","*","소비자가, 세전가격, 세금 계산","*\n");
		System.out.printf("----------------------------------------------------\n");
		System.out.printf("소비자가격: %d,    세전가격: %d,     세금: %d\n", k38_price, k38_netprice, k38_tax);
		System.out.printf("****************************************************\n");
	}
}
