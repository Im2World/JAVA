package lecture0328;

import java.util.Scanner;

//p3_거스름돈 환전프로그램
public class lec02_slide09_거스름돈_환전 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int recieved, price;
		recieved = scanner.nextInt();
		price = scanner.nextInt();
		int change = recieved - price;
		int[] coinUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		// 거스름돈 화폐단위_큰 돈부터 거슬러준다.

		System.out.println("받은 돈 : " + recieved);
		for (int i = 0; i < coinUnit.length; i++) {
			//System.out.println(coinUnit[i] + "원: " + recieved / coinUnit[i]);
			recieved = recieved % coinUnit[i];
			System.out.println(coinUnit[i] + "원: " + recieved / coinUnit[i]);
		}
	}
}

