package This_P3;
//P3
//객체생성(메소드부르기)ClassName ObjectName = new ClassName();
public class Main {

	public static void main(String[] args) {
		character callChar1 = new character("A", 200, 30.5, 32.1);	//값
		character callChar2 = new character("B", 123, 47.1, 18.9);
		character callChar3 = new character("C", 765, 21.6, 42.3);
		character callChar4 = new character("D");
		character callChar5 = new character("E", 99.9);		
		//character callCahr4 = new character("D / 260 / 35.5 / 42.1");
		
		callChar1.printCharacter();
		callChar2.printCharacter();
		callChar3.printCharacter();
		System.out.println(callChar4.name);	//D
		System.out.println();
		System.out.println(callChar5.name + " / "+ callChar5.defensePower);	//E / 99.9
		
		//callChar4.printCharacter();	//D / 0 / 0.0 / 0.0  출력됨
		//callChar5.printCharacter();	//E / 0 / 0.0 / 99.9 출력됨
	}

}

