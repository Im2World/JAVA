package lecture0328;

//silde19_switch
public class lec02_slide19_switch {
	public static void main(String[] args) {
		int n;
		n =2;
		switch (n) {
			case 1:
				System.out.println("One!");
				break;	//얘지우면 one!, two! 출력
			case 2:
				System.out.println("Two!");
				break;	//라인11에서 break지웠으니까 case1만족해도 case2를 한 번 타고 나감.
			default:
				System.out.println("Except 1, 2");
				break;
		}
	}
}
