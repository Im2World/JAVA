package Overriding_Overloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testtest");
		//AdditionalA addA = new AdditionalA();	//Ŭ������ ��ü ������ ��_ AdditionalA��� �ٸ� class AdditionalA.java ��������.
		//�Լ� ȣ����ص� ������Ʈ �����ϸ� ������ ������ public AdditionalA() �� ȣ���Ѵ�.
		AdditionalA addA = new AdditionalA("HAEIM");
		//AdditionalA �����ڰ� �ΰ��� ���ڰ� �ִ� ���� ������ش�.
	}

}


/*
 * public static void main(String[] args) {
 *		addA.printMutiple(); 	//��ü ���� �Ŀ� �Լ��� ������.
		addA.printHello();	//��� ������ ��������ϴ� �Լ��� ������.
 * */
