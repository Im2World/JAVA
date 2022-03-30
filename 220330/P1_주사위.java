package lecture0330;

import java.util.Arrays;
import java.util.Scanner;

public class P1_주사위 {
	static int N;
	static int sumLast;
	static int[] result;
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 변수 선언 및 초기화
		System.out.println("Enter the number of dice. : ");
		N = sc.nextInt();	//주사위 개수
		
		System.out.println("Enter the sum of dice. : ");
		sumLast = sc.nextInt();
		
		if (sumLast > N * 6 || sumLast < N) {
			System.out.println("error");
		}
		result = new int[N]; // 결과값 저장할 배열
		int diceNum = 0; // 0~(N-1)번 주사위를 의미_배열크기와 인덱스는 1차이

		// 2. 재귀함수 호출
		roll(diceNum);
	}

	// 계산부
	private static void roll(int diceNum) {
		// 3. 탈출
		if (diceNum == N) { // N번째 주사위에 값 넣으면
			for (int i = 0; i < N; i++) {
				sum += result[i];
			}
			if (sum == sumLast) {
				System.out.println(Arrays.toString(result));
				return; // print 후 메서드 종료
			} else {
				sum = 0;
			}
		} else {
			// 4. 경로 탐색
			for (int i = 1; i <= 6; i++) { // i에 1~6까지 해당 값 부여(주사위 눈)
				// 4.1 값 바꾸기
				result[diceNum] = i; // n번 주사위에 i의 값을 부여
				diceNum = diceNum + 1; // n+1번 주사위로 넘어감
				// 4.2 재귀호출
				roll(diceNum); // n+1번 주사위에 대하여 재귀호출
				// 4.3 값 원복
				diceNum = diceNum - 1; // 다시 n번 주사위로 복귀
				result[diceNum] = 0; // 퇴각 검색을 위해 기존값으로 복원
			}
		}
	}
}