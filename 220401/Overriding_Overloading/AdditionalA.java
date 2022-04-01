package Overriding_Overloading;
//구구단 만들었다.
public class AdditionalA {
	
	//생성자
	public AdditionalA() {
		System.out.println("Object Created");
	}
	
	//overload : 같은 이름함수에 다른인자 사용
	public AdditionalA(String name) {
		System.out.println(name + " Object Created");
	}
	
	//구구단 출력하는 함수
	protected void printMutiple() {
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}
	}
	
	//헬로월드 출력하는 함수
	public void printHello () {
		System.out.println("Hello World!");
	}

}
