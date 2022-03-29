package a_0329;

import java.util.Scanner;

//a1_계산기
public class a1_무한루프_계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1, sum = 0, mean = 0, max = 0, min = 0;

		System.out.println("Enter the number.");
		while (true) {// 무한반복
			int num = sc.nextInt();

			// 계산
			sum += num;
			if (count == 1) {
				mean = num;
				max = num;
				min = num;
			} else {
				if (num > max) {
					max = num;
				}
				if (min > num) {
					min = num;
				}
			}
			mean = sum / count;

			// 출력
			System.out.println(
					"Result: " + count + " - " + "Sum " + sum + ", Mean " + mean + ", Max " + max + ", Min " + min);
			System.out.println("");
			count++;
		} // while(true) close
	}
}
