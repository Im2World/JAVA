package Overriding_Overloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testtest");
		//AdditionalA addA = new AdditionalA();	//클래스를 객체 생성한 것_ AdditionalA라는 다른 class AdditionalA.java 만들어놨다.
		//함수 호출안해도 오브젝트 생성하면 무조건 생성자 public AdditionalA() 를 호출한다.
		AdditionalA addA = new AdditionalA("HAEIM");
		//AdditionalA 생성자가 두개라서 인자가 있는 것을 출력해준다.
	}

}


/*
 * public static void main(String[] args) {
 *		addA.printMutiple(); 	//객체 생성 후에 함수에 접근함.
		addA.printHello();	//헬로 월드라는 문구출력하는 함수에 접근함.
 * */
