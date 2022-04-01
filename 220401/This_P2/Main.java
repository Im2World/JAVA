package This_P2;
//P2
//객체생성(메소드부르기)ClassName ObjectName = new ClassName();
public class Main {

	public static void main(String[] args) {
		character callChar = new character("A", 200, 30.5, 32.1);	//값
		character callChar2 = new character("B", 123, 47.1, 18.9);
		character callChar3 = new character("C", 765, 21.6, 42.3);
		
		callChar.printCharacter();
		callChar2.printCharacter();
		callChar3.printCharacter();
	}
}

