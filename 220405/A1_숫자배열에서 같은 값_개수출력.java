package a_0405;

import java.util.Scanner;

//String���� ���ڹޱ�
public class A1_���ڹ迭���� ���� ��_������� {
//String ���ڹ迭���� ���� �� ����ϱ�
	public static void main(String[] args) {
		cal();
	} // main

	public static void cal() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first set of numbers : ");
			String one = sc.nextLine();
			System.out.println("Enter the second set of numbers : ");
			String two = sc.nextLine();

			// String�� ������ �ɰ��� �迭�� ����.
			String[] oneArr = one.split(" ");
			String[] twoArr = two.split(" ");

			System.out.println("Same number is : ");
			int count = 0;
			for (int i = 0; i < oneArr.length; i++) {
				for (int j = 0; j < twoArr.length; j++) {
					if (Double.parseDouble(oneArr[i]) == Double.parseDouble(twoArr[j])) { // double�� ����ȯ�߱� ������ equals�� �ƴ϶� == �����ڻ�밡��.
						System.out.print(Double.parseDouble(oneArr[i]) + " ");
						count++;
					}
				}
			} // �� for��
			System.out.println("\nThe number of the same number is : " + count);
			System.out.println("");
		} // while
	} // cal
} // class

/*
Enter the first set of numbers : 
1.3 2 6.5 2.8 12.9 -9
Enter the second set of numbers : 
2.0 -9 1.8 99 13.9 2.8
Same number is : 
2.0 2.8 -9.0 
The number of the same number is : 3

Enter the first set of numbers : 
*/