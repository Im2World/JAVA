package PackA;

public class PrintClass {
	int a, b, n;
	
	public PrintClass(int a, int b, int n) {	//constructor 생성자
		this.a = a;	//this.a는 라인4의 int a다.  =a;는 바로 윗줄에서 선언한 a
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
