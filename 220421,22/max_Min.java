package javaPro_lec08_0421;
//max, min�� ���ϴ� ��
//sort ���� ����� �׻� �ϱ�!

public class max_Min {

	public static void main(String[] args) {
		int[] a = {1, 4, 6, 9, 10, 3};
		int iMax = -1;	//�ִ��� �Ϻη� ���� ���� ������ ������.
		int iMaxPointer = 0;	//�ִ��� ������
		for (int i = 0; i < a.length; i++) {
			if (a[i] > iMax) {
				iMax = a[i];
				iMaxPointer = i;
			}
		}
		System.out.printf("%-10d%d",iMax, iMaxPointer);

	}

}
