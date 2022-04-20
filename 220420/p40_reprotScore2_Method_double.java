package javaPro_lec06_self_ppt;
//��40
//��������ǥ �� [���� ����] ���
//�������� : �л� ���� 200��, �� �л� ������ ���� ����
//���ڴ� ��������, ���ڴ� ��������
//200���� 12������ ���� ���� ���;��Ѵ�.
//��� ���� ������ ��Ȯ�� ��� ���� double�� ����.
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p40_reprotScore2_Method_double {

	///////////////////<�����غ�>///////////////////
	// Calendar Ŭ������ ���� �ð� �� ��¥ ������
	static Calendar k38_calendar = Calendar.getInstance();
	
	// SimpleDateFormat Ŭ������ ���ڵ����� ������� ����
	// �ð� ǥ�� => �����.����.���� �ý�:�к�:���� => dd�� �ҹ���!!!!
	static SimpleDateFormat k38_df = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
	
	//******���� ���α׷���!!*******
	static int k38_iPerson = 13; // �ش� ũ�⸸ŭ �迭 ũ������, ���ǿ��� 200�� ������ ����ϴ� ������ ���� => 0 ~ 199���� �ݺ� = 200��
	static int k38_page = 1;	//�������� ǥ�� ���� �������� �� �ʱ�ȭ
	static int k38_numPerPage = 11;	//�������� ����� �ο� ��

	
	// 1. [Ŭ������ ��ü��] ���� ��ü���� �� �ν��Ͻ� ������ ��ü����
	//*****�տ��� ����� �״� �̸�, �� ���� �迭�� ���� �� p38_inputData Ŭ���� Ȱ��*****
	static p38_inputData k38_inData = new p38_inputData(k38_iPerson);
	
	//�� �޼��忡�� ���� �������� static������ ����
	//�� ���� ���� ���� ���� �� 0���� �ʱ�ȭ
	static int k38_korSum = 0; // ��������
	static int k38_engSum = 0; // ��������
	static int k38_mathSum = 0; // ��������

	// �� �������� ��� ���� ���� �� 0���� �ʱ�ȭ
	// ��Ȯ�� ������� double�� ���
	static double k38_korAvg = 0; // �������� ���
	static double k38_engAvg = 0; // �������� ���
	static double k38_mathAvg = 0; // �������� ���

	// ���� �� �� �հ� �� ���� ���հ��� ��� ���� ���� �� 0���� �ʱ�ȭ
	// ����� ��Ȯ�� ������� double�� ���
	static int k38_totalSum = 0;	//������ �հ�
	static double k38_totalAvg = 0.0;	//������ ���
	
	//***��������ǥ 1�������� ����ϴ� �Ͱ� �ٸ��κ�***
	//������ ���ؾ��ϹǷ�, ���� ������ ����.
	// ����� ��Ȯ�� ������� double�� ���
	static int k38_korSumTotal; // ���� ���� ����
	static int k38_engSumTotal; // ���� ���� ����
	static int k38_mathSumTotal; // ���� ���� ����
	static int k38_totalSumTotal; // ������ ���� ����
	static double k38_totalAvgTotal; // ����� ���� ����
	static int k38_cnt = 0; // ��ȣ(����)�� k38_cnt������ �����ؼ� �ʱ�ȭ => ***������ �������� �ٽɺ���!***	
	
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
		System.out.printf("%-7s%03d%-19s%7s%21s\n","Page :", k38_page, "","������� : ", k38_df.format(k38_calendar.getTime()));    // SimpleDateFormat�� ���ڿ��� �޴´�.
		System.out.println("============================================================="); 	//���м� ���
		System.out.printf("%1s%-5s %-9s %-5s %-5s %-7s %-7s %s\n", "","��ȣ", "�̸�", "����", "����", "����", "����", "���"); // %s�� ��ġ����
		System.out.println("============================================================="); 	//���м� ���
	}
		
	//������� �� ��� �޼���
	public static void bodyPrint() {
		// ���� ��������
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			// ���ڿ� �̸� : �迬 + ����2�ڸ� => ����2�ڸ����� k38_i�� ���� �ѹ��� 01, 02, 03 ..
			String k38_name = String.format("�迬%03d", k38_i + 1);	//�̸� �� �ѹ����� 01���� �����ؼ� (k38_i + 1) ����� 01���� ����

			// 0��~100�� ���� ���� ������ ���� ���� Math.random()�Լ� ���.
			// Math.random�� double�� ���� ��ȯ => �������� int�� ����ȯ
			int k38_kor = (int) (Math.random() * 100); // ��������
			int k38_eng = (int) (Math.random() * 100); // ��������
			int k38_math = (int) (Math.random() * 100); // ��������

			//p38_inputData Ŭ������ k38_SetData �Լ��� �� �Է� => �迭�� ��� ����ǰ� ����
			k38_inData.k38_SetData(k38_i, k38_name, k38_kor, k38_eng, k38_math);
		}
		
		// �Էµ� ���� �� ������ �ݺ������� ������ Ȯ��
		for (int k38_i = 0; k38_i < k38_iPerson; k38_i++) {
			k38_cnt++; // k38_cnt�� 1����

			// ���ڿ� �����ʹ� %s��, ������ �����ʹ� %d�� ���� ���� ���. ��� �������� ���
			// ���� ���ǿ��� ����� ���������� ��� => (int)k38_inData.k38_ave[k38_i] �� double���� ���������� ����ȯ
			// ���� ���ǿ��� ������ 001������ ���� => (k38_i+1)
			// k38_sum �� 1���� �� ������ ����
			System.out.printf("%2s%03d %8s %8s %7s %7d %9d %9.2f\n", "", (k38_i + 1), k38_inData.k38_name[k38_i], k38_inData.k38_kor[k38_i], k38_inData.k38_eng[k38_i],
					k38_inData.k38_mat[k38_i], k38_inData.k38_sum[k38_i], k38_inData.k38_ave[k38_i]);

			// �� �迭�� �Էµ� ���� ���� ������ ����.
			k38_korSum += k38_inData.k38_kor[k38_i]; // ���� ���� : k38_kor[i] ���� ��� ���� k38_korSum �� �Է�
			k38_engSum += k38_inData.k38_eng[k38_i]; // ���� ����
			k38_mathSum += k38_inData.k38_mat[k38_i]; // ���� ����
			k38_totalSum += k38_inData.k38_sum[k38_i]; // �� ���� ������ �հ� : p12_inputData Ŭ�������� ���� k38_sum���� ��� ���� k38_totalSum�� ����
			k38_totalAvg += k38_inData.k38_ave[k38_i]; // �� ���� ����� ��

			// �������������� �ش� ������ �� ���� �� �հ�, ��� �Է� => �׷��� ������ ��.
			k38_korSumTotal += k38_inData.k38_kor[k38_i]; // ���� ����
			k38_engSumTotal += k38_inData.k38_eng[k38_i]; // ���� ����
			k38_mathSumTotal += k38_inData.k38_mat[k38_i]; // ���� ����
			k38_totalSumTotal += k38_inData.k38_sum[k38_i]; // �� ���� ������ �հ��� �հ�
			k38_totalAvgTotal += k38_inData.k38_ave[k38_i];	// �� ���� ������ �հ��� �հ��� ��� => �� ���� ������ �հ��� �հ� / �ش������������� �ο� ��

			//*******�ٽɺ� : �������ٲٱ�********
			//���� ���ǿ��� �� �������� 30���� ��� => k38_cnt % 30 == 0 �̰� �Է¹��� ũ�⺸�� ������ ������ �ٲ�
			if (k38_cnt % k38_numPerPage == 0 && k38_cnt < k38_iPerson) {
				k38_page++;// ������ �� 1�� ����
				System.out.println("============================================================="); 	//���м� ���
				
				// ���������� �հ�
				System.out.println("����������");
					// ���������� �ο��� ���� �հ� : ��� ������ �����Ͷ� %d�� �޴´�.
				System.out.printf("�հ� %20d %7d %7d %9d %9.2f\n", k38_korSum, k38_engSum, k38_mathSum, k38_totalSum, k38_totalAvg);
					// ���������� �ο� 30�� ��� => / 30 => �� ���
				//****��Ȯ�� ������� ����� double������ ���****
				System.out.printf("��� %20.2f %7.2f %7.2f %9.2f %9.2f\n", (double)k38_korSum / k38_numPerPage, (double)k38_engSum / k38_numPerPage, (double)k38_mathSum / k38_numPerPage,
						(double)k38_totalSum / k38_numPerPage, (double)k38_totalAvg / k38_numPerPage);
				System.out.println("=============================================================");	//���м� ���

				// �����հ�
				System.out.println("����������");
					//�� ������ ���� �հ�, ������ �����հ�, ����� �����հ� ���
				System.out.printf("�հ� %20d %7d %7d %9d %9.2f\n", k38_korSumTotal, k38_engSumTotal, k38_mathSumTotal, k38_totalSumTotal, k38_totalAvgTotal);

				// �������� / �����ο�(k38_cnt) = �������� ���
				//****��Ȯ�� ������� ����� double������ ���****				
				System.out.printf("��� %20.2f %7.2f %7.2f %9.2f %9.2f\n", (double)k38_korSumTotal / k38_cnt, (double)k38_engSumTotal / k38_cnt, (double)k38_mathSumTotal / k38_cnt, 
						(double)k38_totalSumTotal / k38_cnt, (double)k38_totalAvgTotal / k38_cnt);

				//*****�ٽɺ� : �� �ʱ�ȭ*****
				// �� �ʱ�ȭ => �ش� ������������ �ش� ������ �л����� ������ ����ؾ��ϹǷ� 0���� �ʱ�ȭ	
				k38_korSum = 0;		k38_engSum = 0;		k38_mathSum = 0;		k38_totalSum = 0;		k38_totalAvg = 0.0;

				//������ �ٲ�� �ٽ� ����κ� ���� ��� => k38_page++ �� ���������� 1������.
				System.out.printf("\n%-25s%s\n\n", "", "��������ǥ");	//�������, ���ڶ� �������ķ� ��ġ����
				System.out.printf("%-7s%03d%-19s%7s%21s\n","Page :", k38_page, "","������� : ", k38_df.format(k38_calendar.getTime()));    // SimpleDateFormat�� ���ڿ��� �޴´�.
				System.out.println("============================================================="); 	//���м� ���
				System.out.printf("%1s%-5s %-9s %-5s %-5s %-7s %-7s %s\n", "","��ȣ", "�̸�", "����", "����", "����", "����", "���"); // %s�� ��ġ����
				System.out.println("============================================================="); 	//���м� ���
			}
		} //for				
	}	//BodyPrint()
	
		
	//�հ�, ��� ��� �޼���
	public static void tailPrint() {
		//*******������������ �ο� �� ���ϴ°� �ٽ�!********
		int k38_numLastPage = (k38_iPerson - (k38_numPerPage * (k38_page - 1))) ;	//������ �������� ����� �ο� ��

		//�������������� ����������, ���������� ���
		System.out.println("============================================================="); 	//���м� ���
		// ���������� �հ�
		System.out.println("����������");
			//������������ �ο��հ�
		System.out.printf("�հ� %20d %7d %7d %9d %9.2f\n", k38_korSum, k38_engSum, k38_mathSum, k38_totalSum, k38_totalAvg);
			//�ѿ� 200�� �������� 30�� ����ϸ� �������������� 20�� ��µ�.(200 = (30 * 6) + 20) => �ο��� 20 => /20
		
		//****��Ȯ�� ������� ����� double������ ���****		
		System.out.printf("��� %20.2f %7.2f %7.2f %9.2f %9.2f\n", (double)k38_korSum / k38_numLastPage, (double)k38_engSum / k38_numLastPage, (double)k38_mathSum / k38_numLastPage, 
				(double)k38_totalSum / k38_numLastPage, (double)k38_totalAvg / k38_numLastPage);
		System.out.println("============================================================="); 	//���м� ���
		
		// �����հ�
		System.out.println("����������");
			//�� ������ ���� �հ�, ������ �����հ�, ����� �����հ� ���
		System.out.printf("�հ� %20d %7d %7d %9d %9.2f\n", k38_korSumTotal, k38_engSumTotal, k38_mathSumTotal, k38_totalSumTotal, k38_totalAvgTotal);

		//�������� / �����ο�(k38_cnt) = �������� ���
		//****��Ȯ�� ������� ����� double������ ���****
		System.out.printf("��� %20.2f %7.2f %7.2f %9.2f %9.2f\n\n", (double)k38_korSumTotal / k38_cnt, (double)k38_engSumTotal / k38_cnt, (double)k38_mathSumTotal / k38_cnt,
				(double)k38_totalSumTotal / k38_cnt, (double)k38_totalAvgTotal / k38_cnt);
	}	//tailPrint()	
}	//class