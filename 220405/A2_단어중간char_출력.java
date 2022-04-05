package a_0405;
//Program to Print the Characters in the Middle
//입력받은 단어에서 중간 char 출력
import java.util.Scanner;

public class A2_단어중간char_출력 {

	public static void main(String[] args) {
		cal();	
	} //main
	
	public static void cal() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the sentence : ");
			String text = sc.nextLine();
			
			int index = 0;
			int index2 = 0;
				if (text.length() % 2 == 1) {	//문자길이가 홀수면
					index = (text.length() - 1) / 2;
					System.out.println(text.charAt(index));
				} else if (text.length() % 2 == 0) {
					index = (text.length() / 2) - 1;
					index2 = (text.length() / 2);
					System.out.print(text.charAt(index)+ "" +text.charAt(index2)+"\n\n");
				}
		} //while
	} //cal
} //class
