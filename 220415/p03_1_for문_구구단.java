package javaPro_lec04_0415_ppt;

//�⺻for���� ����for��
//������!
public class p03_1_for��_������ {
	public static void main(String[] args) {
		// 1.�⺻ for��
		// 0~9���� �հ� ���
		int k38_sum = 0;
		for (int k38_i = 0; k38_i < 10; k38_i++) {
			k38_sum = k38_sum + k38_i;		//k38_sum�� k38_sum�� k38_i���� ���� ������ ��ȭ
		}
		System.out.printf("k38_sum %d\n", k38_sum);	//������ ���ڸ� ���� ���̶� %d�� ����ߴ�.

		// 2. ���� for�� : ������
		// �������� �� �ܾ� �ݺ����
		// �ٱ� for���� ������ n��
		for (int k38_i = 1; k38_i < 10; k38_i++) {	//1~9���� �� 9ȸ �ݺ� => 1�� ~ 9��
			System.out.printf("===================\n");
			System.out.printf("    ������ %d ��\n", k38_i);	//������ n�ܿ� k38_i���� ���� ��� ��ȭ
			System.out.printf("===================\n");

			// ���� for���� �����ܿ� ���ϴ� �� : 1~9
			for (int k38_j = 1; k38_j < 10; k38_j++) {
				System.out.printf("%5d * %d = %3d \n", k38_i, k38_j, k38_i * k38_j);	//%5d * %d �� �������, k38_i * k38_j�� ���� ����
			}
		} // �ٱ� for��
	}
}
