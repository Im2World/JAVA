package Practice_상속;
//기존에 틀은 있고 몇가지 기능 추가할 때 이렇게 사용한다.
//부모 : Parents, 자식 : Main
public class Main extends Parents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		main.myName();
		main.myAge();
	}
	//우클릭  + sources + override + 체크
	
	
	
	@Override
	public void myName() {
		// TODO Auto-generated method stub
		super.myName();
		System.out.println("Son : Jade");	//기존 myName()에 정보를 추가한다.
	}



	@Override
	public void myAge() {
		// TODO Auto-generated method stub
		super.myAge();
		System.out.println("Son : 20");
	}

}
