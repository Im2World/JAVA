package lecture0331;

public class accessModifier {
//Access Modifiers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMyMoney1();	//메서드 하나 호출
		//public static void : 항상 메모리 상에 떠있다.
		//굳이 객체생성 안해도 된다.
		//showMyMoney2(); 얘는 static이 아니라 그냥 호출 불가. 객체생성해야함.		
		
		//객체생성_ 클래스:accessModifier실습 를 main이라는 객체로 생성
		accessModifier실습 main = new accessModifier실습();
		main.showMyMoney2();	//객체호출
		main.showMyMoney3();
		main.showMyMoney4();	
		main.showMyMoney5();
	}
	
	//메소드 5개 만들었다.
	public static void showMyMoney1() {
		System.out.println("1000won");
	}
	public void showMyMoney2() {	//static 없이 이렇게 쓰는게 바람직하다. 
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
