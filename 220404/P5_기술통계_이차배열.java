package 실습_0404;

public class P5_기술통계_이차배열 {

	public static void main(String[] args) {
		//1. 이차원 배열 선언
		String[][] data = {
				{ "Name", "Korean", "English", "Math" },  //data[0][0],data[0][1],data[0][2],data[0][3]
				{ "Jeong", "70", "80", "100" }, //data[1][0], data[1][1], data[1][2], data[1][3]
				{ "Pyo", "60", "70", "86" }, //data[2][0], data[2][1], data[2][2], data[2][3]
				{ "Choi", "54", "100", "82" }, //data[3][0], data[3][1], data[3][2], data[3][3]
				{ "Mike", "87", "95", "79" } //data[4][0], data[4][1], data[4][2], data[4][3]
				};
				
		//2. 이차원 배열 동적 출력
		for (int i = 0; i < data.length; i++) { 	// 각 행의 개수
			for (int j = 0; j < data[i].length; j++) {	//각 묶음으로 들어갔을 때 개수가 몆개냐
				System.out.print(data[i][j] + "\t");	//출력시 모양잡으려고 \t 사용
			}
			System.out.println(""); //줄바꿈
		}
		System.out.println("");
		
		//3. 학생당 합계, 평균, 최대값, 최솟값 출력
		int[] sumStudent = new int[data.length - 1];	//1차배열 크기는 2차배열 행 인덱스보다 작음
		int[] avgStudent = new int[data.length - 1];
		int[] minStudent = new int[data.length - 1];	
		int[] maxStudent = new int[data.length - 1];
		
		//범례설정
		System.out.println("NAME" + "\t" + "SUM" + "\t" + "AVG" + "\t" + "MIN" + "\t" + "MAX");
		for (int i = 0; i < data.length - 1; i++) {	//2차배열 행탐색
			minStudent[i] = Integer.MAX_VALUE; 
				//최솟값 찾기위함임. 정수형 중 가장 큰값을 min에 넣음. //얘는 그냥 명시적인 값이다. 어느값이 와도 얘보다 작다.
			maxStudent[i] = Integer.MIN_VALUE;
			for (int j = 1; j < data[i].length; j++) {	//열탐색, 범례빼고 숫자값있는 인덱스1열부터 탐색 
				sumStudent[i] += Integer.parseInt(data[i + 1][j]);
				//sumStudent[0] = sumStudent[0]+data[1][1]+data[1][2]+data[1][3]
				//sumStudent[1] = sumStudent[1]+data[2][1]+data[2][2]+data[2][3]
				//sumStudent[2] = sumStudent[2]+data[3][1]+data[3][2]+data[3][3]
				//sumStudent[3] = sumStudent[3]+data[4][1]+data[4][2]+data[4][3]
				
				//범례빼고 숫자값이 [1][1], [2][1]부터라서 data[i + 1][j]다.
				minStudent[i] = Math.min(minStudent[i], Integer.parseInt(data[i + 1][j]));
					//minStudent[i], Integer.parseInt(data[i + 1][j]) 중 작은값이 minStudent[i]에 담김
					//이게 계속 반복되면, 가장 작은 값이 minStudent[i]에 담기게 된다.
				maxStudent[i] = Math.max(maxStudent[i], Integer.parseInt(data[i + 1][j]));
				//Math.min (a,b) : 두 값중 작은 값 반환
			}
			avgStudent[i] = sumStudent[i] / (data[i].length - 1);
				//학생이 행당 1명 들어감. 학생당 평균 구함.
				//avgStudent[0] = sumStudent[0] / (data[0].length - 1); => data[0].length - 1는 data[0]의 마지막 인덱스값
			
			//범례맞춰서 순서대로 출력
			System.out.println(data[i + 1][0] + "\t" + sumStudent[i] + "\t" + avgStudent[i] + "\t" + minStudent[i] + "\t"
					+ maxStudent[i]);
			//i = 0; data[1][0]+sumStudent[0]+avgStudent[0]+minStudent[0]+maxStudent[0]
		} //겉 for문 종료
		System.out.println();
		
		//3. 과목별 합계, 평균, 최대, 최솟값 출력
		int[] sumSubject = new int[data[0].length - 1];	//1차배열이다
		int[] avgSubject = new int[data[0].length - 1];
		int[] minSubject = new int[data[0].length - 1];
		int[] maxSubject = new int[data[0].length - 1];
		
		System.out.println("SUBJECT" + "\t" + "SUM" + "\t" + "AVG" + "\t" + "MIN" + "\t" + "MAX");
		
		for (int i = 0; i < data[i].length - 1; i++) {
			minSubject[i] = Integer.MAX_VALUE; //얘는 그냥 명시적인 값이다. 어느값이 와도 얘보다 작다.
			maxSubject[i] = Integer.MIN_VALUE;
			for (int j = 1; j < data.length; j++) {	//0열은 이름이라 필요없어서 1열부터 시작
				sumSubject[i] += Integer.parseInt(data[j][i + 1]);
					//sumSubject[i] 값에 계속 data[1][1]+data[2][1]+data[3][1]을 더한다.
				minSubject[i] = Math.min(minSubject[i], Integer.parseInt(data[j][i + 1]));
				maxSubject[i] = Math.max(maxSubject[i], Integer.parseInt(data[j][i + 1]));
			}
			avgSubject[i] = sumSubject[i] / (data.length - 1);
			
			System.out.println(data[0][i + 1] + "\t" + sumSubject[i] + "\t" + avgSubject[i] + "\t" + minSubject[i]
					+ "\t" + maxSubject[i]);
		} //겉 for문
	} //main
} //class
