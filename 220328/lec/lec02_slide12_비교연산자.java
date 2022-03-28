package lecture0328;

//silde12 _비교 연산자
public class lec02_slide12_비교연산자 {
	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		int z = 5;
		System.out.println(x == y);
		System.out.println(x != y); // x와 y가 같은데, 같지않냐고 물었으니 false나온다.
		// java는 c언어처럼 0,1이 아니라 true, false로 나온다.
		System.out.println(x > y);
		System.out.println(x < z);
		System.out.println(x >= z);
		System.out.println(y >= z);
	}
}
