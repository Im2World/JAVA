package lecture0329;

public class Math�ż���2 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int random = (int)(Math.random() * 45) + 1;
			System.out.println(random);
		}
	}
}


//random�� int�� ����ȯ!!!
//0�� �ȳ����� 45�� �������Ϸ��� int random = (int)(Math.random() * 45);�� +1