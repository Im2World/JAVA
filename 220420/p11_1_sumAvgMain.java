package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6�� ��11
//class p07_1_sumAvg �� �޼��带 ȣ���ؼ� ����ϴ� Ŭ����

public class p11_1_sumAvgMain {

	public static void main(String[] args) {
		//1. [Ŭ������ ��ü��] ���� ��ü���� �� �ν��Ͻ� ������ ��ü����(new k38_p07_1_sumAvg())
		p11_1_sumAvg k38_result = new p11_1_sumAvg();
		
		//2. ���� ����ǥ ���
		System.out.printf("%23s\n", "3�� ����ǥ");	//%s�� ���ڿ� �ް�, ��ġ����
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4s%3s%3s%3s%5s\n", "�̸�", "����", "����", "����", "����", "���");	//%s�� �ѱ� ���� ����
		System.out.printf("============================================\n");
		
		//����� �Ҽ������� ǥ���ϱ����� %f ���
		//%9.1f : f�� ���ڿ� 9ĭ �Ҿ�, �Ҽ������� 1�ڸ������� ���
		System.out.printf("%-4s%4d%5d%5d%5d%9.1f\n\n", "������", 100, 100, 100, k38_result.k38_sum(100, 100, 100), k38_result.k38_avg(100, 100, 100));
		
		System.out.printf("%23s\n", "4�� ����ǥ");//%s�� ���ڿ� �ް�, ��ġ����
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4s%3s%3s%3s%3s%5s\n", "�̸�", "����", "����", "����", "����",  "����", "���");//%s�� �ѱ� ���� ����
		System.out.printf("============================================\n");
		
		//����� �Ҽ������� ǥ���ϱ����� %f ���
		//%9.1f : f�� ���ڿ� 9ĭ �Ҿ�, �Ҽ������� 1�ڸ������� ���
		System.out.printf("%-4s%4d%5d%5d%5d%5d%9.1f\n\n", "������", 100, 100, 100, 100, k38_result.k38_sum(100, 100, 100, 100), k38_result.k38_avg(100, 100, 100, 100));
		
		System.out.printf("%23s\n", "5�� ����ǥ");//%s�� ���ڿ� �ް�, ��ġ����
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4s%3s%3s%3s%3s%3s%4s\n", "�̸�", "����", "����", "����", "����", "��ȸ", "����", "���");//%s�� �ѱ� ���� ����
		System.out.printf("============================================\n");
		
		//����� �Ҽ������� ǥ���ϱ����� %f ���
		//%8.1f : f�� ���ڿ� 8ĭ �Ҿ�, �Ҽ������� 1�ڸ������� ��� => ������� �������� 1ĭ ����
		System.out.printf("%-4s%4d%5d%5d%5d%5d%5d%8.1f\n\n", "������", 100, 100, 100, 100, 100, k38_result.k38_sum(100, 100, 100, 100, 100), 
				k38_result.k38_avg(100, 100, 100, 100, 100));		
	}
}