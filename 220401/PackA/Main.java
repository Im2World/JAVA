package PackA;
//프로젝트 D0401
//객체생성(메소드부르기)ClassName ObjectName = new ClassName();

public class Main {

	public static void main(String[] args) {
		
		PrintClass printClass = new PrintClass(1, 2, 5);
			//생성자에 인자가 있기때문에, 출력할 때도 인자가 있어야한다.
		/*
		 * PrintClass printClass = new PrintClass();
		 * 하면, PrintClass.java에 생성자가 없으면 이 문구는 그냥 건너뛴다.
		 */
		printClass.printAdd();
		printClass.printInteger();
	}
}


//AdditionalA addA = new AdditionalA("HAEIM");