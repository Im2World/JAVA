package a_0401;
//Course Registration Program

import java.util.Scanner;

public class A1_Course Registration Program {
	static Scanner sc = new Scanner(System.in);
	public static int menuNum;
	public static int index = 0;
	public static String courseArr[] = new String[10];

	public static void main(String[] args) {
		showMenu();
	}

	public static void showMenu() {
		System.out.println("<Menu>");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		System.out.println("Select number : ");
		menuNum = sc.nextInt();
		if (menuNum == 1) {
			showCourseList();
		} else if (menuNum == 2) {
			showMyCourse();
		} else {
			System.out.println("Check the number.");
			showMenu();
		}
	}

	public static void showCourseList() {
		int pickCourse = 99;
		while (pickCourse != 0) {
			System.out.println("<Course List>");
			System.out.println("1. Korean\n2. Math\n3. English\n4. Social Studies\n5. Science\n0. Back to Main");
			System.out.println("");
			System.out.println("Select number : ");
			pickCourse = sc.nextInt();
			if (pickCourse == 1) {
				courseArr[index] = "Korean";
				System.out.println("Korean is registered.\n");
			} else if (pickCourse == 2) {
				courseArr[index] = "Math";
				System.out.println("Math is registered.\n");
			} else if (pickCourse == 3) {
				courseArr[index] = "English";
				System.out.println("English is registered.\n");
			} else if (pickCourse == 4) {
				courseArr[index] = "Social Studies";
				System.out.println("Social Studies is registered.\n");
			} else if (pickCourse == 5) {
				courseArr[index] = "Science";
				System.out.println("Science is registered.\n");
			} else if (pickCourse == 0) {
				System.out.println("Back to Main\n");
				showMenu();
			} else {
				System.out.println("Check the number.\n");
				index--;
			}
			index++;
		}
	}

	public static void showMyCourse() {
		int backMenu = 99;
		System.out.println("<My Course>");
		for (int i = 0; i < index; i++) {
			System.out.println((i + 1) + ". " + courseArr[i]);
		}
		System.out.println("\n--END--");
		System.out.println("0 is back to <Menu>");
		System.out.println("Enter the number : ");

		while (backMenu != 0) {
			backMenu = sc.nextInt();
			if (backMenu == 0) {
				showMenu();
			} else {
				System.out.println("Check the number.");
				continue;
			}
		}
	}
}
