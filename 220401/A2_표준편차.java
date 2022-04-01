package a_0401;

import java.util.Scanner;

//표준편차구하기
public class A2_표준편차구하기2_완성 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 표준편차 구할 숫자 입력
		int sum = 0;

		// 1.각 값의 합
		for (int i = num; i > 0; i--) { // 입력받은 수 역순 출력 10,9,8,7,6,5,4,3,2,1
			sum += i;
			System.out.println(i);
		}

		// 2.평균계산
		double avg = (double) sum / num;
		System.out.println("평균 : "+avg);

		// 3. 제곱값 계산
		// (각 값에서 평균 빼주고 2제곱)한 값을 더한다.
		double diff = 0;
		double diffSq = 0;
		double diffSqSum = 0;
		for (int i = num; i > 0; i--) {
			diff = i - avg;
			diffSq = Math.pow(diff, 2);
			diffSqSum += diffSq;
		}

		// 4. 자료 개수로 나누기 => / num
		double var = diffSqSum / num;

		// 5. 제곱근 계산
		double std = Math.sqrt(var);
		System.out.println("표준편차 : ");
		System.out.println(std);

	}
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
평균 : 5.5
표준편차 : 
2.8722813232690143
*/