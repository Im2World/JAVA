package javaPro_lec04_0415_ppt;

public class p05_���ڹ������� {

	public static void main(String[] args) {
		int k38_a;
		double k38_b;

		k38_a = 10 / 3; // ���: 3
		k38_b = 10 / 3.0; // ���: 3.3333333333333335
		// double���̶� 3.0���� ������ �Ҽ������ϱ��� ���
		// 10/3 �ϸ� 3.0���� ��µȴ�.
		System.out.println(k38_b);

		// int�� ������ ����, double�� �Ǽ��� ����
		// if�� else �ڵ尡 1�� �� ���� { } ��������
		if (k38_a == k38_b)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double) k38_a, k38_b);	//k38_a�� double������ ����ȯ�� ���

		// ��ȿ���ڱ��� ǥ�õ��� �� ���� �ٸ���.
		// .3333�� �󸶳� ��� �������� �� �� ���� ����
		if (k38_b == 3.333333)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[3.333333][%f]\n", (double) k38_b);	//���� 3.33333�̶�� �Է�

		// double�� k38_b�� int������ ����ȯ �� ��(type casting)
		k38_b = (int) k38_b; // �Ҽ������ϰ� ��������. => k38_b = 3.0
		if (k38_a == k38_b)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double) k38_a, k38_b);	//k38_a�� double������ ����ȯ�� ���

		// int k38_a�� int�� double�� �μ��� �� ��
		System.out.printf("int�� �μ�[%d][%f]\n", k38_a, k38_b);
		System.out.printf("double�� �μ�[%f][%f]\n", (double) k38_a, k38_b);	//k38_a�� double������ ����ȯ�� ���

		// char ���� �񱳴� ==
		char k38_charA = 'c';
		if (k38_charA == 'b')		//k38_charA�� 'b'�� 
			System.out.printf("k38_charA�� b�̴�.\n");	//�� ���� ���
		if (k38_charA == 'c')		//k38_charA�� 'c'�� 
			System.out.printf("k38_charA�� c�̴�.\n");	//�� ���� ���
		if (k38_charA == 'd')		//k38_charA�� 'd'�� 
			System.out.printf("k38_charA�� d�̴�.\n");	//�� ���� ���

		// String ���ڿ� �� equals
		String k38_charB = "efghijk";	//k38_charB����

		if (k38_charB.equals("efghijk"))	//k38_charB�� efghijk�� ������
			System.out.printf("k38_charB�� efghijk�̴�.\n");		//�� ���� ���
		else	//efghijk �� �ٸ���
			System.out.printf("k38_charB�� efghijk�� �ƴϴ�.\n");	//�� ���� ���

		// �� ���� ����
		//!! �� not not �̴�. =>  ���ߺ���
		boolean k38_tf = true;
		if (!!k38_tf)	//k38_tf�� �ƴϰ�, k38_tf�� �ƴ϶��
			System.out.printf("tf�� �ƴϰ� �ƴϸ� ���̴�.\n");	//�� ���� ���
		else
			System.out.printf("tf�� �ƴϰ� �ƴϸ� �����̴�.\n");	//�� ���� ���
	}
}
