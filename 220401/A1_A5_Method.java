package a_0401;

import java.util.Scanner;

public class A1_A5_Method {
	public static double inputNum = 0, result = 0;
	public static int unitOne = 0, unitTwo = 0;
	static String unitOneShow, unitTwoShow;
	static Scanner sc = new Scanner(System.in);

	public static void ShowMenu() {
		System.out.println("<Unit>");
		System.out.println("1. mm\n2. cm\n3. m\n4. km\n5. mile");

	}

	public static void inputUnit() {
		System.out.println("Enter the unit of reference : ");
		unitOne = sc.nextInt();
		System.out.println("Enter the unit to be replaced : ");
		unitTwo = sc.nextInt();
	}

	public static void inputNumber() {
		System.out.println("Enter the number : ");
		inputNum = sc.nextInt();
	}

	public static void calUnit() {
		if (unitOne == 1) {
			mm(unitTwo);
		} else if (unitOne == 2) {
			cm(unitTwo);
		} else if (unitOne == 3) {
			m(unitTwo);
		} else if (unitOne == 4) {
			km(unitTwo);
		} else if (unitOne == 5) {
			mile(unitTwo);
		} else {
			System.out.println("Check the number.");
		}
	}

	//결과값 단위 출력
	public static String ShowUnitOne() {
		if (unitOne == 1) {
			unitOneShow = "mm";
		} else if (unitOne == 2) {
			unitOneShow = "cm";
		} else if (unitOne == 3) {
			unitOneShow = "m";
		} else if (unitOne == 4) {
			unitOneShow = "km";
		} else if (unitOne == 5) {
			unitOneShow = "mile";
		}
		return unitOneShow;
	} // ShowUnitOne

	//결과값 단위 출력
	public static String ShowUnitTwo() {
		if (unitTwo == 1) {
			unitTwoShow = "mm";
		} else if (unitTwo == 2) {
			unitTwoShow = "cm";
		} else if (unitTwo == 3) {
			unitTwoShow = "m";
		} else if (unitTwo == 4) {
			unitTwoShow = "km";
		} else if (unitTwo == 5) {
			unitTwoShow = "mile";
		}
		return unitTwoShow;
	} // ShowUnitTwo

	// 환산 값 계산
	public static void mm(int unitTwo) {
		if (unitTwo == 1) { // mm → mm
			result = inputNum;
		} else if (unitTwo == 2) { // mm → cm
			result = inputNum * 0.1;
		} else if (unitTwo == 3) { // mm → m
			result = inputNum * 0.001;
		} else if (unitTwo == 4) { // mm → km
			result = inputNum / 1e-6;
		} else if (unitTwo == 5) { // mm → mile
			result = inputNum / 1.609e+6;
		} else {
			System.out.println("Check the number.");
		}
	} // mm

	public static void cm(int unitTwo) {
		if (unitTwo == 1) { // cm → mm
			result = inputNum * 10;
		} else if (unitTwo == 2) { // cm → cm
			result = inputNum;
		} else if (unitTwo == 3) { // cm → m
			result = inputNum / 100;
		} else if (unitTwo == 4) { // cm → km
			result = inputNum / 100000;
		} else if (unitTwo == 5) { // cm → mile
			result = inputNum / 160934;
		} else {
			System.out.println("Check the number.");
		}
	} // cm

	public static void m(int unitTwo) {
		if (unitTwo == 1) { // m → mm
			result = inputNum * 1000;
		} else if (unitTwo == 2) { // m → cm
			result = inputNum * 100;
		} else if (unitTwo == 3) { // m → m
			result = inputNum;
		} else if (unitTwo == 4) { // m → km
			result = inputNum / 1000;
		} else if (unitTwo == 5) { // m → mile
			result = inputNum / 1609;
		} else {
			System.out.println("Check the number.");
		}
	} // m

	public static void km(int unitTwo) {
		if (unitTwo == 1) { // km → mm
			result = inputNum * 1e+6;
		} else if (unitTwo == 2) { // km → cm
			result = inputNum * 100000;
		} else if (unitTwo == 3) { // km → m
			result = inputNum * 1000;
		} else if (unitTwo == 4) { // km → km
			result = inputNum;
		} else if (unitTwo == 5) { // km → mile
			result = inputNum / 1.609;
		} else {
			System.out.println("Check the number.");
		}
	} // km

	public static void mile(int unitTwo) {
		if (unitTwo == 1) { // mile → mm
			result = inputNum * 1.609e+6;
		} else if (unitTwo == 2) { // mile → cm
			result = inputNum * 160934;
		} else if (unitTwo == 3) { // mile → m
			result = inputNum * 1609;
		} else if (unitTwo == 4) { // mile → km
			result = inputNum * 1.609;
		} else if (unitTwo == 5) { // mile → mile
			result = inputNum;
		} else {
			System.out.println("Check the number.");
		}
	} // mile

	// 각 환산값 계산에서 return하는 것보다 메소드 1개쓰는게 낫다.
	public static void printResult() {
		System.out.println(inputNum + ShowUnitOne() + " → " + result + ShowUnitTwo());
	}

} // class
