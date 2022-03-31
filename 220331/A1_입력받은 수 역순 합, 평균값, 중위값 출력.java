package a_0331;

import java.util.Scanner;
//입력받은 수 역순 출력, 합, 평균값, 중위값 출력
public class A1_입력받은 수 역순 합, 평균값, 중위값 출력 {

		public static void main(String[] args) {
			float sum = 0;
			float avg = 0;
			float median = 0;
			int center = 0;
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int[] numArr = new int[num];

			for (int i = num; i > 0; i--) {
				numArr[i - 1] = i;
				System.out.println(numArr[i - 1]);
				// 배열인덱스는 0부터임. 배열 마지막 칸은 사이즈-1임!!!
			}
			for (int i = 0; i < numArr.length; i++) {
				sum = sum + numArr[i];
			}
			System.out.println("SUM : " + sum);

			avg = sum / numArr.length;
			System.out.println("AVG : " + avg);

			center = numArr.length / 2;
			if ((numArr.length % 2) == 1) {
				median = numArr[numArr.length / 2];
			} else {
				median = ((numArr[center - 1] + numArr[center])) / 2;
			}
			System.out.println("MEDIAN : " + median);

		} // main
	} // class


/*
10
10
9
8
7
6
5
4
3
2
1
SUM : 55.0
AVG : 5.5
MEDIAN : 5.0
*/