package javaPro_lec06_self_ppt;
//��38
//ReportSheet, Ŭ���� �����
//class p38_inputData �� �޼ҵ�� ���
public class p38_reportSheetMain {
	public static void main(String[] args) {
		int k38_iPerson = 10;	//�ο��� ���������� �Է� 10��
		
		//1. [Ŭ������ ��ü��] ���� ��ü���� ��  �ν��Ͻ� ������ ��ü���� => p38_inputDataŬ������ �޼ҵ�� ��밡��!
		p38_inputData k38_inData = new p38_inputData(k38_iPerson);
		
		//2. ��������
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			//���ڿ� �̸� : �迬 + ����2�ڸ� => ����2�ڸ����� k38_i�� ���� �ѹ��� 00, 01, 02 ..
			String k38_name = String.format("�迬%02d", k38_i);
			
			//(int) Math.random() * (�ִ�-�ּҰ�+1) + �ּҰ�
			//0��~100�� ���� ���� ������ ���� ���� Math.random()�Լ� ���.
			//Math.random�� double�� ���� ��ȯ => �������� int�� ����ȯ
			int k38_kor = (int)(Math.random() * 100);	// ��������, int������ ����ȯ
			int k38_eng = (int)(Math.random() * 100);	// ��������, int������ ����ȯ 
			int k38_mat = (int)(Math.random() * 100);	// ��������, int������ ����ȯ 
			
			// ������ ������ ���� �޴� �ٸ� Ŭ������ p12_inputData�� k38_SetData�޼ҵ�� ���� ����
			k38_inData.k38_SetData(k38_i,k38_name,k38_kor,k38_eng,k38_mat);	
		}
		
		//3. ���� �� �ԷµƳ� Ȯ������ �Է� ���� �ο�����ŭ for�� ����
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			// �л����� ��ȣ, �̸�, �� ���� ����, ����, ����� ��� ���� ��� �� �ٹٲ�.
			// ����� �Ǽ����̶� %f�� ����.
			// ��������� �Ҽ������� 2�ڸ������� ǥ���Ϸ��� %5.2f ���
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",
					k38_i, k38_inData.k38_name[k38_i], k38_inData.k38_kor[k38_i], k38_inData.k38_eng[k38_i],
					k38_inData.k38_mat[k38_i], k38_inData.k38_sum[k38_i], k38_inData.k38_ave[k38_i]);
		}
	}
}