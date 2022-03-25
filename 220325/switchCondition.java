package basic;

public class switchCondition {
	public static void main(String[] args) {
		int n;
		n =2;
		switch (n) {
			case 1:
				System.out.println("One!");
				break;
			case 2:
				System.out.println("Two!");
				break;
			default:
				System.out.println("Except 1, 2");
				break;
		}
	}
}
