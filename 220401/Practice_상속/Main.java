package Practice_���;
//������ Ʋ�� �ְ� ��� ��� �߰��� �� �̷��� ����Ѵ�.
//�θ� : Parents, �ڽ� : Main
public class Main extends Parents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		main.myName();
		main.myAge();
	}
	//��Ŭ��  + sources + override + üũ
	
	
	
	@Override
	public void myName() {
		// TODO Auto-generated method stub
		super.myName();
		System.out.println("Son : Jade");	//���� myName()�� ������ �߰��Ѵ�.
	}



	@Override
	public void myAge() {
		// TODO Auto-generated method stub
		super.myAge();
		System.out.println("Son : 20");
	}

}
