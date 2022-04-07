package a_0407;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class A1_Timer_currentTimeMillis {
	public static void main(String[] args) {
		calTime();
	}
	
	public static void calTime() {
		// 1. 처리전 시간 획득
		long start = System.currentTimeMillis();
		System.out.print("Now : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(start));

		// 2. 처리할 작업
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seconds you want to add : ");
		long inputNum = sc.nextInt();
		System.out.println("");

		// 3. 처리했어야할 시간 획득  _형 정리해서 출력함.
		long upToTime = start + (inputNum * 1000); //inputNum형이 long이지만 사용자는 int형으로 입력하기에 *1000해줘야 long이 된다.
		System.out.println("Must be entered by this time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(upToTime));

		// 4. 처리후 시간 획득
		long end = System.currentTimeMillis();
		System.out.print("Now : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(end));

		// 5. 시간차이 출력_숫자입력까지 실제로 걸린시간
		System.out.println("Time taken to enter a number : " + (end - start) / 1000.0 + " seconds\n");

		// 6. 시간차이 계산
		if ((end - start) / 1000.0 > (upToTime - start) / 1000.0) {
			System.out.println("Time is over");
			System.out.println("current time : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(end));
		} else if ((end - start) / 1000.0 <= (upToTime - start) / 1000.0) { // 입력한시간보다 더 빠르게 입력했으면=아직 마감시간 전이라면
			try {
				Thread.sleep(inputNum * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 입력시간만큼 지난후에 문구 출력
			System.out.println("Time is over");
			System.out.println("current time : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(upToTime));
			System.out.println("");
		}
	}
}