package P1_this_method_new;

import java.util.Scanner;

public class Function {
	int a, b, c, d;
	
	//»ý¼ºÀÚ constructor
	public Function(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public void showMenu() {
		System.out.println("<Price>");
		System.out.println("1. Apple");
		System.out.println("2. Straqberry");
		System.out.println("3. Grape");
		System.out.println("4. Watermelon");
	}
	
	public void pricePrint() {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		if(inputNum == 1) {
			System.out.println(this.a);
		} else if (inputNum == 2) {
			System.out.println(this.b);			
		} else if (inputNum == 3) {
			System.out.println(this.c);			
		} else if (inputNum == 4) {
			System.out.println(this.d);			
		} else {
			System.out.println("Wrong Number");
		}

	}
}
