package javaPro_lec06_self_ppt;
//��38
//ReportSheet, Ŭ���� ����� => ������ �κ�

public class p38_inputData {
	//1. p12_reportSheetMain Ŭ������ ����� �ʿ��� ������ �迭 ����
	//�����ڿ��� �� �迭 ũ�⸦ �����ϱ� ������ �迭�� ���� ����.
	int k38_Person;	//������ ���� : �ο� ��
	int [] k38_i;	//������ ���� : �ѹ���
	String [] k38_name;	//���ڿ� ���� : �̸�
	int [] k38_kor;	//������ ���� : ��������
	int [] k38_eng;	//������ ���� : ��������
	int [] k38_mat;	//������ ���� : ��������
	int [] k38_sum;	//������ ���� : ����
	double [] k38_ave;	//�Ǽ��� ���� => ���
	
	//2. ������ : �Էµ� �ο���(int k38_iPerson = 10)�� ���� ũ���� �迭�� ����
	p38_inputData(int k38_iPerson) {
		//�Է¹��� ����(�л� �ο���)��ŭ �迭ũ�� ����
		k38_name = new String[k38_iPerson];	//�迭ũ�� = k38_iPerson , �̸���� �迭�̶� String �迭
		k38_kor = new int[k38_iPerson];	//�迭ũ�� = k38_iPerson
		k38_eng = new int[k38_iPerson];	//�迭ũ�� = k38_iPerson
		k38_mat = new int[k38_iPerson];	//�迭ũ�� = k38_iPerson
		k38_sum = new int[k38_iPerson];	//�迭ũ�� = k38_iPerson
		k38_ave = new double[k38_iPerson];	//�迭ũ�� = k38_iPerson , ��մ�� �迭�̶� double�� �迭
	}
	
	//3. p12_reportSheetMain Ŭ�������� for�ݺ������� �ѹ��� �ǰ�, �ش� ��ȣ(k38_j)�� �ش� ��(��������,�̸� ��)�� �Է�
	//���ϰ� ����, ������ 4���� ������ 1���� ���ڷ� �޴� �޼ҵ�
	//������ ������ ���ؼ� k38_name2 ó�� ���� ������ �ڿ� ���� 2�� ����.
	public void k38_SetData(int k38_j, String k38_name2, int k38_kor2, int k38_eng2, int k38_mat2) {
		k38_name[k38_j] = k38_name2;	//�迭 k38_name�� k38_j ��° ��Ҹ� k38_name2�� ����
		k38_kor[k38_j] = k38_kor2;	//�迭 k38_kor�� k38_j ��° ��Ҹ� k38_kor2�� ����
		k38_eng[k38_j] = k38_eng2;	//�迭 k38_eng�� k38_j ��° ��Ҹ� k38_eng2�� ����
		k38_mat[k38_j] = k38_mat2;	//�迭 k38_mat�� k38_j ��° ��Ҹ� k38_mat2�� ����
		k38_sum[k38_j] = k38_kor2 + k38_eng2 + k38_mat2;	//���� ����
		k38_ave[k38_j] = k38_sum[k38_j] / 3.0;	//������� => 3�����̴ϱ� /3 => double���̴ϱ� 3.0
	}
} //class