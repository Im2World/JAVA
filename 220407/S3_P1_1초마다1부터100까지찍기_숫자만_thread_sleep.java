package lecture0407;

public class S3_P1_1�ʸ���1����100�������_���ڸ�_thread_sleep {
//1�ʸ��� 1�� �� 1~100���� 100�ʵ��� ���
	public static void main(String[] args) {
		cal();
		}
	
	public static void cal() {
		for (int i = 1; i < 101; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000); // 1�ʸ��� ����
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


/*
1
2
3
4
5
6
7
8
9
10
11
... 100���� ������.
*/
