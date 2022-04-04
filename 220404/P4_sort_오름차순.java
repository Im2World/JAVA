package 실습_0404;

public class P4_sort_오름차순 {

	public static void main(String[] args) {
		//1.배열선언
		int[] numArr = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		//numArr.length = 11 , index = 0~10
		int tmp = 0;
		
		//2. 오름차순 정렬 : 가장 작은 값은 numArr[0]에 저장
		for (int i = 0; i < numArr.length; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if(numArr[i] > numArr[j]) {	//numArr[0]일 때 numArr[1]~numArr[마지막인덱스]까지 값비교.
					tmp = numArr[i];
					numArr[i] = numArr[j];	//최소값을 비교한 값 중 최소값으로 바꿔 저장
					numArr[j] = tmp;
				}
			} 	//for
		}	//for
						
		//3. 배열출력해서 확인해보기
		System.out.println("배열 확인 : ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]+ " ");
		}
	} //main
} //class
