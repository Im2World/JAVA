package PackA;
//������Ʈ D0401
//��ü����(�޼ҵ�θ���)ClassName ObjectName = new ClassName();

public class Main {

	public static void main(String[] args) {
		
		PrintClass printClass = new PrintClass(1, 2, 5);
			//�����ڿ� ���ڰ� �ֱ⶧����, ����� ���� ���ڰ� �־���Ѵ�.
		/*
		 * PrintClass printClass = new PrintClass();
		 * �ϸ�, PrintClass.java�� �����ڰ� ������ �� ������ �׳� �ǳʶڴ�.
		 */
		printClass.printAdd();
		printClass.printInteger();
	}
}


//AdditionalA addA = new AdditionalA("HAEIM");