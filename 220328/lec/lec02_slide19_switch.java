package lecture0328;

//silde19_switch
public class lec02_slide19_switch {
	public static void main(String[] args) {
		int n;
		n =2;
		switch (n) {
			case 1:
				System.out.println("One!");
				break;	//������� one!, two! ���
			case 2:
				System.out.println("Two!");
				break;	//����11���� break�������ϱ� case1�����ص� case2�� �� �� Ÿ�� ����.
			default:
				System.out.println("Except 1, 2");
				break;
		}
	}
}
