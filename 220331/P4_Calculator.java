package lecture0331;
//main함수는 맨 위에 있어야한다.
import java.util.Scanner;
public class P4_Calculator {

	public static void main(String[] args) {
		inputText();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		calculation(input);
	}


	//안내문구
	public static void inputText() {
		System.out.println("예시 : 1000*30");
		System.out.println("띄어쓰기 없이 입력하세요: ");
	}
	
	public static void calculation(String input) {		
		String[] cutString = input.split("");
		String listOper = "+-*/";		
		String a = "";
		String b = "";
		String oper = "";
		
		for (int i = 0; i < cutString.length; i++) {	//여러자리수도 가능하게 바꿈
			for(int j = 1; j <= listOper.length(); j++) {
				if(cutString[i].equals(listOper.substring(j - 1, j))) {
					a = input.substring(0, i);
					b = input.substring(i + 1, input.length());
					oper = listOper.substring(j - 1, j);
				}
			}
		}
		
		if (oper.contains("+")) {
			addOperation(Double.parseDouble(a), Double.parseDouble(b));
		} else if (oper.contains("-")) {
			minusOperation(Double.parseDouble(a), Double.parseDouble(b));
		} else if (oper.contains("*")) {
			multiOperation(Double.parseDouble(a), Double.parseDouble(b));
		} else if (oper.contains("/")) {
			divideOperation(Double.parseDouble(a), Double.parseDouble(b));
			if(Double.parseDouble(b) == 0) {
				System.out.println("Can't divide 0");
			}
		}	
	}	//calculation close

	public static void addOperation(double a, double b) {
		double sum = a + b;
		System.out.println(sum);
	}

	public static void minusOperation(double a, double b) {
		double minus = a - b;
		System.out.println(minus);
	}

	public static void multiOperation(double a, double b) {
		double multi = a * b;
		System.out.println(multi);
	}

	public static void divideOperation(double a, double b) {
		double divide = a / b;
		System.out.println(divide);
	}
}
