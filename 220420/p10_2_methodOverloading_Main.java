package javaPro_lec06_self_ppt;
//�޼��� �����ε� _ �ڹٽ�ȭ06�� ��10
//���� �޼���� ���ڸ� �ٸ��� ����ϴ� ��.
//Ŭ���� p06_1_methodOverloading �� �޼���� ����ϴ� main�Լ�

public class p10_2_methodOverloading_Main {
	public static void main(String[] args) {
		//1. [Ŭ������ ��ü��] ���� ��ü���� �� �ν��Ͻ� ������ ��ü����(new p06_1_�޼�������ε�())
		p10_1_methodOverloading k38_cal = new p10_1_methodOverloading();
		
		//2. p06_1_�޼�������ε� Ŭ���� �޼��� ȣ��
		System.out.printf("2�� ���� ȣ�� [%d]\n", k38_cal.k38_sum(1, 2));	//k38_sum(int k38_a, int k38_b) ȣ��
		System.out.printf("3�� ���� ȣ�� [%d]\n", k38_cal.k38_sum(1, 2, 3));	//k38_sum(int k38_a, int k38_b, int k38_c) ȣ��
		System.out.printf("4�� ���� ȣ�� [%d]\n", k38_cal.k38_sum(1, 2, 3, 4));	//k38_sum(int k38_a, int k38_b, int k38_c, int k38_d) ȣ�� 
		System.out.printf("������ ���� ȣ�� [%f]\n", k38_cal.k38_sum(1.3, 2.4));	//k38_sum(double k38_a, double k38_b) ȣ��
	}
}
