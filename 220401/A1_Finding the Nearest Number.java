package a_0401;

import java.util.ArrayList;
import java.util.Scanner;

//입력된 수 중에서 근사값 출력
public class A1_Finding the Nearest Number.java {

	public static void main(String[] args) {
		calNearestNumber();
	}

	public static void calNearestNumber() {
		while (true) {
			// 1. 숫자목록을 String으로 받고 쪼개기
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a series of numbers : ");
			System.out.println("When you enter the next number, please put it up one space at a time.");
			System.out.println("ex) 1.1 2.2 -5.7 10.3 20.2 -31.2");
			String inputNum = sc.nextLine();
			String[] inputNumArray = inputNum.split(" ");
			System.out.println("Please enter one of the numbers above.");
			double pickNum = sc.nextDouble(); // 근사값 기준이 되는 수
			double nearestNum = 0;
			double min = Double.MAX_VALUE;

			// 2. 절대값으로 근접값 찾기
			for (int i = 0; i < inputNumArray.length; i++) {
				double distance = Math.abs((Double.parseDouble(inputNumArray[i]) - pickNum));

				if (min > distance) {
					if (distance == 0) {
						continue;
					} else {
						min = distance;
						nearestNum = Double.parseDouble(inputNumArray[i]);
					}
				}
			}
			System.out.println("The closest value to the number entered is " + nearestNum + "\n");
		}
	}
} // class
