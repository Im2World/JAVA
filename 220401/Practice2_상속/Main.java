package Practice2_���;
//��� : implements
//�����⸸ ��ӹް� ���빰�� �ڽ� Ŭ�������� ä���.

public class Main implements Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		main.myName();
		main.myAge();
	}

	@Override
	public void myName() {
		// TODO Auto-generated method stub
		System.out.println("My name is JUNG");
		
	}

	@Override
	public void myAge() {
		// TODO Auto-generated method stub
		System.out.println("20");
	}
}
