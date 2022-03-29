package lecture0329;

//1부터 45중에서 숫자 6개 출력하기.
public class Math매서드3_1부터45까지중_숫자6개 {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45) + 1;
			System.out.println(random);
		}
	}
}


//random을 int로 형변환!!!
//0이 안나오고 45가 나오게하려면 int random = (int)(Math.random() * 45);에 +1