package lecture0328;

//silde13 _논리 연산자
public class lec02_slide13_논리연산자 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(x < 5 && y > 10); // 둘다 t면 t
		System.out.println(x < 5 || y > 10); // 둘중 하나만 t면 t
		System.out.println(!(x < 5 && y > 10)); // x는 f, y는 t => f인데 이것의 !니까 t
	}
}
