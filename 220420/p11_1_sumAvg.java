package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6�� ��11
//�޼ҵ� �����ε� _ ����, ��ձ��ϱ�

public class p11_1_sumAvg {
	//1.����������� �޼���
	//3�� ���� ����
	public int k38_sum (int k38_a, int k38_b, int k38_c) {
		return k38_a + k38_b + k38_c;	//���ڸ� ��� ���� �� ��ȯ
	}
	
	//4�� ���� ����
	public int k38_sum (int k38_a, int k38_b, int k38_c, int k38_d) {
		return k38_a + k38_b + k38_c + k38_d;	//���ڸ� ��� ���� �� ��ȯ
	}
	
	//5�� ���� ����
	public int k38_sum (int k38_a, int k38_b, int k38_c, int k38_d, int k38_e) {
		return k38_a + k38_b + k38_c + k38_d + k38_e;	//���ڸ� ��� ���� �� ��ȯ
	}
	
	//2. ������հ�� �޼���
	//3�� ���� ���
	public double k38_avg (int k38_a, int k38_b, int k38_c) {
		return (k38_a + k38_b + k38_c) / 3;	//���ڸ� ��� ���� �� ���ڼ� ��ŭ ������ ��ȯ
	}

	//4�� ���� ���
	public double k38_avg (int k38_a, int k38_b, int k38_c, int k38_d) {
		return (k38_a + k38_b + k38_c + k38_d) / 4;	//���ڸ� ��� ���� �� ���ڼ� ��ŭ ������ ��ȯ
	}

	//5�� ���� ���
	public double k38_avg (int k38_a, int k38_b, int k38_c, int k38_d, int k38_e) {
		return (k38_a + k38_b + k38_c + k38_d + k38_e) / 5;	//���ڸ� ��� ���� �� ���ڼ� ��ŭ ������ ��ȯ
	}
}