package lecture0329;

//1���� 45�߿��� ���� 6�� ����ϱ�.
public class Math�ż���3_1����45������_����6�� {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45) + 1;
			System.out.println(random);
		}
	}
}


//random�� int�� ����ȯ!!!
//0�� �ȳ����� 45�� �������Ϸ��� int random = (int)(Math.random() * 45);�� +1