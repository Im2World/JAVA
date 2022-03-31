package lecture0331;
//main�Լ��� �� ���� �־���Ѵ�.
import java.util.Scanner;
public class P4_Calculator {

	public static void main(String[] args) {
		inputText();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		calculation(input);
	}


	//�ȳ�����
	public static void inputText() {
		System.out.println("���� : 1000*30");
		System.out.println("���� ���� �Է��ϼ���: ");
	}
	
	public static void calculation(String input) {		
		String[] cutString = input.split("");
		String listOper = "+-*/";		
		String a = "";
		String b = "";
		String oper = "";
		
		for (int i = 0; i < cutString.length; i++) {	//�����ڸ����� �����ϰ� �ٲ�
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
