package a_0328;

public class OnlyWhile_gugudan {
	public static void main(String[] args) {
		int i = 2;
		int j = 2;
		
		while (i <= 9) {
			while (j <= 9) {
				System.out.println(i + "X" + j + "=" + i * j);
				j++;
			}
			j = 2;	//  nx1�ƴϰ� nx2 ���� ���
			i++;
		}
	}
}