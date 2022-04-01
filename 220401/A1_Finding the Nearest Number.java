package a_0401;

import java.util.ArrayList;
import java.util.Scanner;

//�Էµ� �� �߿��� �ٻ簪 ���
public class A1_Finding the Nearest Number.java {

	public static void main(String[] args) {
		calNearestNumber();
	}

	public static void calNearestNumber() {
		while (true) {
			// 1. ���ڸ���� String���� �ް� �ɰ���
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a series of numbers : ");
			System.out.println("When you enter the next number, please put it up one space at a time.");
			System.out.println("ex) 1.1 2.2 -5.7 10.3 20.2 -31.2");
			String inputNum = sc.nextLine();
			String[] inputNumArray = inputNum.split(" ");
			System.out.println("Please enter one of the numbers above.");
			double pickNum = sc.nextDouble(); // �ٻ簪 ������ �Ǵ� ��
			double nearestNum = 0;
			double min = Double.MAX_VALUE;

			// 2. ���밪���� ������ ã��
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
