package �ǽ�_0404;

public class P4_sort_�������� {

	public static void main(String[] args) {
		//1.�迭����
		int[] numArr = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		//numArr.length = 11 , index = 0~10
		int tmp = 0;
		
		//2. �������� ���� : ���� ���� ���� numArr[0]�� ����
		for (int i = 0; i < numArr.length; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if(numArr[i] > numArr[j]) {	//numArr[0]�� �� numArr[1]~numArr[�������ε���]���� ����.
					tmp = numArr[i];
					numArr[i] = numArr[j];	//�ּҰ��� ���� �� �� �ּҰ����� �ٲ� ����
					numArr[j] = tmp;
				}
			} 	//for
		}	//for
						
		//3. �迭����ؼ� Ȯ���غ���
		System.out.println("�迭 Ȯ�� : ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]+ " ");
		}
	} //main
} //class
