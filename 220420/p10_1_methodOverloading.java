package javaPro_lec06_self_ppt;
//�޼��� �����ε� _ �ڹٽ�ȭ06�� ��10
//���� �޼���� ���ڸ� �ٸ��� ����ϴ� ��.
public class p10_1_methodOverloading {
	//���� ���ϱ� �޼����������, �Ű����� ���ڰ� �ٸ���.
	
	//1. �޼��� sum �����ε� : int�� ����
	public int k38_sum(int k38_a, int k38_b) {	//������ ���� k38_a,k38_b�� �Ű������� ����
		return k38_a + k38_b;		//������ ���� ��ȯ
	}
	
	public int k38_sum(int k38_a, int k38_b, int k38_c) {	//������ ���� k38_a,k38_b,k38_c�� �Ű������� ����
		return k38_a + k38_b + k38_c;	//������ ���� ��ȯ
	}
	
	public int k38_sum(int k38_a, int k38_b, int k38_c, int k38_d) {	//������ ���� k38_a,k38_b,k38_c,k38_d�� �Ű������� ����
		return k38_a + k38_b + k38_c + k38_d;	//������ ���� ��ȯ
	}
	
	//2. �Ű������� k38_a, k38_b�� (int k38_a, int k38_b)�� ���Ƽ� �� �޼���� double������ ����
	//double�� ����
	public double k38_sum(double k38_a, double k38_b) {	//������ ���� k38_a,k38_b�� �Ű������� ����
		return k38_a + k38_b;	//������ ���� ��ȯ
	}
}
