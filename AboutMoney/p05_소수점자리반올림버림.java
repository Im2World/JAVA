package javaPro_lec03_0414_ppt;

public class p05_소수점자리반올림버림 {
//#5. 소수점 이하
	public static void main(String[] args) {
		int k38_MyVal = 14 / 5;
		// 결과 2.8 => 소수점이하 버리면 2, 반올림하면 3

		System.out.printf("#5-1 : %d\n", k38_MyVal);
		// k38_MyVal은 int(정수형)이라 소수점이하 버림

		double k38_MyValF;

		//이건 정수형 연산이다.=> 잘못!
		k38_MyValF = 14 / 5;
		System.out.printf("#5-2 : %f\n", k38_MyValF);
		// 몫을 double 형으로 출력

		//<double형 연산 정답>
		k38_MyValF = 14.0 / 5;
		System.out.printf("#5-3 : %f\n", k38_MyValF);
		// 14.0이라 소수점 이하 첫째자리까지 연산

		//소수점 이하에서 반올림하기 위해서 0.5를 더한다.
		//0.5를 더하는 이유 : 1미만 값을 반올림하려면 해당 소수점자리가 0.5이상이어야함.
		//0.5를 더하면 무조건 반올림된다.
		k38_MyValF = (14.0) / 5 + 0.5;
		System.out.printf("#5-4 : %f\n", k38_MyValF);
		// (14.0) / 5 = 2.800000 => 2.800000 + 0.5 => 3.300000

		//소수점 이하에서 반올림 제대로 출력 => double을 int형으로 변환해줘야한다.
		k38_MyValF = (int) ((14.0) / 5 + 0.5);
		System.out.printf("#5-5 : %f\n", k38_MyValF);
		// 위의 값 계산 후 (int)형으로 전환=> 3.300000 이 소수점이하 버려진다.
	}
}
