package Overriding_Overloading;
//������ �������.
public class AdditionalA {
	
	//������
	public AdditionalA() {
		System.out.println("Object Created");
	}
	
	//overload : ���� �̸��Լ��� �ٸ����� ���
	public AdditionalA(String name) {
		System.out.println(name + " Object Created");
	}
	
	//������ ����ϴ� �Լ�
	protected void printMutiple() {
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}
	}
	
	//��ο��� ����ϴ� �Լ�
	public void printHello () {
		System.out.println("Hello World!");
	}

}
