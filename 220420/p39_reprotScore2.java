package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6�� ��39
//��������ǥ ���
//�������� : �л� ���� 30��, �� �л� ������ ���� ����
//���ڴ� ��������, ���ڴ� ��������
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p39_reprotScore2 {
	
	///////////////////<�����غ�>///////////////////
	// Calendar Ŭ������ ���� �ð� �� ��¥ ������
	static Calendar k38_calendar = Calendar.getInstance();
	
	// SimpleDateFormat Ŭ������ ���ڵ����� ������� ����
	// �ð� ǥ�� => �����.����.���� �ý�:�к�:���� => dd�� �ҹ���!!!!
	static SimpleDateFormat k38_df = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
	
	//�ο� ���� 30��
	static int k38_iPerson = 30; // �ش� ũ�⸸ŭ �迭ũ�� ����, ���ǿ��� 030�������� ����Ѵ�. => 0���� 29���� �ݺ� = 30��
	
	//[Ŭ������ ��ü��] ���� ��ü���� �� �ν��Ͻ� ������ ��ü����
	//*****�տ��� ����� �״� �̸�, �� ���� �迭�� ���� �� p38_inputData Ŭ���� Ȱ��*****
	static p38_inputData k38_inData = new p38_inputData(k38_iPerson);
	
	//�� �޼��忡�� ���� �������� static������ ����
	//�� ���� ���� ���� ���� �� 0���� �ʱ�ȭ
	static int k38_korSum = 0; // ��������
	static int k38_engSum = 0; // ��������
	static int k38_mathSum = 0; // ��������

	// �� �������� ��� ���� ���� �� 0���� �ʱ�ȭ
	static int k38_korAvg = 0; // �������� ���
	static int k38_engAvg = 0; // �������� ���
	static int k38_mathAvg = 0; // �������� ���

	// ���� �� �� �հ� �� ���� ���հ��� ��� ���� ���� �� 0���� �ʱ�ȭ
	static int k38_totalSum = 0;	//������ �հ�
	static int k38_avgOf30Total = 0; // 30�� �հ��� ���
	static int k38_totalAvg = 0;	//������ ���
	static int k38_avgOf30Avg = 0; // 30���� ��յ��� ���
	
	
	///////////////�����Լ�////////////////
	public static void main(String[] args) {
		haderPrint();
		bodyPrint();
		tailPrint();
	} //main
	
	
	//��� ��� �޼���
	public static void haderPrint() {
		// ���� �������ķ� ��� �� �ٹٲ�2ȸ
		System.out.printf("%-25s%s\n\n", "", "��������ǥ");	//�������, ���ڶ� �������ķ� ��ġ����
		System.out.printf("%-31s%s\n", "", "������� : " + k38_df.format(k38_calendar.getTime())); // SimpleDateFormat�� ���ڿ��� �޴´�.
		System.out.println("============================================================="); 	//���м� ���
		System.out.printf("%1s%-5s %-9s %-5s %-5s %-7s %-7s %s\n", "","��ȣ", "�̸�", "����", "����", "����", "����", "���"); // %s�� ��ġ����
		System.out.println("============================================================="); 	//���м� ���
	}
	
	//������� �� ��� �޼���
	public static void bodyPrint() {
		// �� �������� �հ� ���� ���� �� 0���� �ʱ�ȭ
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			// ���ڿ� �̸� : �迬 + ����3�ڸ� => ����3�ڸ����� k38_i�� ���� �ѹ��� 001, 002, 003 ..
			String k38_name = String.format("�迬%03d", k38_i + 1);	//�̸� �� �ѹ����� 001���� �����ؼ� (k38_i + 1) ����� 01���� ����

			// 0��~100�� ���� ���� ������ ���� ���� Math.random()�Լ� ���.
			// Math.random�� double�� ���� ��ȯ => �������� int�� ����ȯ
			int k38_kor = (int) (Math.random() * 100); // ��������
			int k38_eng = (int) (Math.random() * 100); // ��������
			int k38_math = (int) (Math.random() * 100); // ��������

			// Ŭ���� �� �� �Է�
			k38_inData.k38_SetData(k38_i, k38_name, k38_kor, k38_eng, k38_math);
		}	//BodyPrint()

		//��ȣ, �̸�, ����, ����, ����, ����, ��� ���
		// �Էµ� ���� �� ������ �ݺ������� ������ Ȯ��
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			//���ڿ� �����ʹ� %s��, ������ �����ʹ� %d�� ���� ���� ���. ��� �������� ���
			//���� ���ǿ��� ����� ���������� ��� => (int)k38_inData.k38_ave[k38_i] �� double���� ���������� ����ȯ
			System.out.printf("%2s%03d %8s %8s %7s %7d %9d %9d\n", "", (k38_i + 1), k38_inData.k38_name[k38_i], k38_inData.k38_kor[k38_i], k38_inData.k38_eng[k38_i],
					k38_inData.k38_mat[k38_i], k38_inData.k38_sum[k38_i], (int) k38_inData.k38_ave[k38_i]);
			
			//�� �迭�� �Էµ� ���� ���� ������ ����.
			k38_korSum += k38_inData.k38_kor[k38_i]; // ���� ���� : k38_kor[i] ���� ��� ���� k38_korSum �� �Է�
			k38_engSum += k38_inData.k38_eng[k38_i]; // ���� ����
			k38_mathSum += k38_inData.k38_mat[k38_i]; // ���� ����
			k38_totalSum += k38_inData.k38_sum[k38_i]; // ������ �հ� : p12_inputData Ŭ�������� ���� k38_sum���� ��� ���� k38_totalSum�� ����
			k38_totalAvg += k38_inData.k38_ave[k38_i]; // ������ ���

			//���� ���ǿ��� �л� ���� 30��
			k38_korAvg = k38_korSum / k38_iPerson;	 // 30���� �������� ���
			k38_engAvg = k38_engSum / k38_iPerson;	// 30���� �������� ���
			k38_mathAvg = k38_mathSum / k38_iPerson;	// 30���� �������� ���
			k38_avgOf30Total = k38_totalSum / k38_iPerson;	// 30���� ���� ���� �հ��� ���
			k38_avgOf30Avg = k38_totalAvg / k38_iPerson;		// 30���� ��յ��� ���
		}
	}
	
	//�հ�, ��� ��� �޼���
	public static void tailPrint() {
		//�հ�, ��� ���
		System.out.println("=============================================================");	 //���м� ���
		System.out.printf("�հ� %20d %7d %7d %9d %9d\n", k38_korSum, k38_engSum, k38_mathSum, k38_totalSum, k38_totalAvg);	//������ �����Ͷ� %d�� ��ġ����
		System.out.printf("��� %20d %7d %7d %9d %9d\n", k38_korAvg, k38_engAvg, k38_mathAvg, k38_avgOf30Total, k38_avgOf30Avg);	//������ �����Ͷ� %d�� ��ġ����
	}	//tailPrint()
}	//class