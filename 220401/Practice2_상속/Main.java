package Practice2_상속;
//상속 : implements
//껍데기만 상속받고 내용물은 자식 클래스에서 채운다.

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
