package PackA;

public class PrintClass {
	int a, b, n;
	
	public PrintClass(int a, int b, int n) {	//constructor ������
		this.a = a;	//this.a�� ����4�� int a��.  =a;�� �ٷ� ���ٿ��� ������ a
		this.b = b;
		this.n = n;
	}
	
	public void printInteger () {
		System.out.println(n);
	}
	
	public void printAdd() {
		int sum;
		sum = a + b;
		System.out.println(sum);
	}
}
