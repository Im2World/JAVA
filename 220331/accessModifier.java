package lecture0331;

public class accessModifier {
//Access Modifiers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMyMoney1();	//�޼��� �ϳ� ȣ��
		//public static void : �׻� �޸� �� ���ִ�.
		//���� ��ü���� ���ص� �ȴ�.
		//showMyMoney2(); ��� static�� �ƴ϶� �׳� ȣ�� �Ұ�. ��ü�����ؾ���.		
		
		//��ü����_ Ŭ����:accessModifier�ǽ� �� main�̶�� ��ü�� ����
		accessModifier�ǽ� main = new accessModifier�ǽ�();
		main.showMyMoney2();	//��üȣ��
		main.showMyMoney3();
		main.showMyMoney4();	
		main.showMyMoney5();
	}
	
	//�޼ҵ� 5�� �������.
	public static void showMyMoney1() {
		System.out.println("1000won");
	}
	public void showMyMoney2() {	//static ���� �̷��� ���°� �ٶ����ϴ�. 
		System.out.println("1000won");
	}
	private void showMyMoney3() {
		System.out.println("1000won");
	}		
	protected void showMyMoney4() {
		System.out.println("1000won");
	}		
	void showMyMoney5() {
		System.out.println("1000won");
	}
}
