package javaPro_lec08_0421;
//max, min값 구하는 것
//sort 정렬 방법은 항상 암기!

public class max_Min {

	public static void main(String[] args) {
		int[] a = {1, 4, 6, 9, 10, 3};
		int iMax = -1;	//최댓값을 일부러 가장 작은 갓으로 설정함.
		int iMaxPointer = 0;	//최댓값의 포인터
		for (int i = 0; i < a.length; i++) {
			if (a[i] > iMax) {
				iMax = a[i];
				iMaxPointer = i;
			}
		}
		System.out.printf("%-10d%d",iMax, iMaxPointer);

	}

}
