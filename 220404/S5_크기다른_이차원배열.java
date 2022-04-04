package 실습_0404;

import java.util.Arrays;

public class S5_크기다른_이차원배열 {
//크기가 다른 이차원배열 동적으로 출력하기!!!
//관용적표현이니까 암기
	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3 }, { 4, 5 }, {6, 7}, {8, 9, 10, 11 } }; // 4행_ 1행은 3칸, 2행은 2칸

		//System.out.println(numbers.length);  //2
		// System.out.println(Arrays.toString(numbers));// 주소를 출력해버린다.
		for (int i = 0; i < numbers.length; i++) { 	// 각 행의 개수
			for (int j = 0; j < numbers[i].length; j++) {	//각 묶음으로 들어갔을 때 개수가 몆개냐
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println(""); //줄바꿈
			//System.out.println(numbersArr.length); // 3과 2가 나온다.
		}	
	}
}

/*
int[] numbersArr = numbers[i];

for (int j = 0; j < numbersArr.length; j++) { => 

*/