package lecture0328;

//silde11 _연산자
public class lec02_slide11_연산자기본 {
	public static void main(String[] args) {
		int x = 7;
		System.out.println(x);

		x += 3; // x에 3만큼 더한 값을 넣어라 = 7 +3 = 10
		System.out.println(x);
		x -= 3;
		System.out.println(x);
		x *= 3;
		System.out.println(x);
		x /= 3;
		System.out.println(x);
		x %= 3; // 현재있는 값에 3을 나눈 나머지를 구하라.
		System.out.println(x);
		x = 10;
		System.out.println(x);
		x &= 3;
		System.out.println(x);
		x |= 3;
		System.out.println(x);
		x = 10;
		System.out.println(x);
		x ^= 3;
		System.out.println(x);
		x >>= 3;
		System.out.println(x);
		x <<= 3;
		System.out.println(x);
	}
}
