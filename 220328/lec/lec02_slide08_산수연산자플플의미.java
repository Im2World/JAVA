package lecture0328;
//산수연산자
public class lec02_slide08_산수연산자플플의미 {
	public static void main(String[] args) {
		int a = 3;	//우측 값이 왼쪽으로 들어간다.
		System.out.println(a);
		System.out.println(a++);
			//++해도 1이 안올라가는 이유는 ++이 뒤에있어서. 해당 라인이 끝나야 ++이 된다.
		System.out.println(++a);
			//얘는 해당 라인값 a에서 ++한다.
			//라인7에서 ++해서 4가 됐고 여기에 또 ++이니까5
		System.out.println(a);
			//라인9에서의 a값과 같음.
	}
}
