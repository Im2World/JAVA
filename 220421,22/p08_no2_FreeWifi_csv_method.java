package javaPro_lec08_0421;
//pg8
//������������
//�д� ��������κ����� �Ÿ���� + �ִ�Ÿ�����, �ּҰŸ����� ���
//���Ͽ� �߸��Էµ� ������ ���Ƽ� �˻��ؾ��Ѵ�!!!!
/*
txt�� �ǽ��� �Ÿ� �Ʒ� ���� �����ϱ�.
�������� => csv ���� => txt ���Ϸ� �����ߴ�.
12_04_07_E_���������������.txt �� ����� ������ �޾Ҵ�. 

<12_04_07_E_���������������.csv   �ε��� ����>
csv�� �ǽ��ؼ� ���� ���Ͽ��� �ٲٱ� ������� �޸�(,) �� * �� �ٲ�� ����ó������. => �����̸� � �޸�(,) ���ִ�.
���θ��ּ� : �ε���  9
�����ּ� :  �ε��� 10
���� lat : �ε��� 13
�浵 lng : �ε��� 14

 
��(a,b) ��(c,d)���� �Ÿ���
��Ÿ��� ���� : �Ÿ� = ��Ʈ((a-c)^2 + (b-d)^2)  
�ǽ�2) �д�������� ���� ����� ����, �հ��� ã�� �μ� �ǽ� �� �ϳ�(��)  
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class p08_no2_FreeWifi_csv_method {
	public static void main(String[] args) throws IOException {
		// ó���� �ð� ȹ��
		long k38_start = System.currentTimeMillis();
		System.out.print("���۽ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
				
		k38_FileRead();		//�޼��� ȣ��
				
		// ó���� �ð� ȹ��
		long k38_end = System.currentTimeMillis();
		System.out.print("���� �� �ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// �ð����� ���_�����Է±��� ������ �ɸ��ð�
		System.out.println("�ҿ�ð� : " + (k38_end - k38_start) / 1000.0 + " seconds\n");
	}
	
	public static void k38_FileRead() throws IOException {
		// ���� ��ü ���� �� �ش� ����� ���� �ҷ�����
		// \�� Ư�����ڶ� �״�� ǥ������ \�ѹ� ����.
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\12_04_07_E_���������������.csv");
		BufferedReader k38_br = new BufferedReader(new FileReader(k38_f)); // k38_f���� BufferedReader ��ü ������ �б�

		String k38_readtxt; // ���ڿ� k38_readtxt ���� <= BufferedReader k38_br�� �ش����� �� �پ� ���� ������ ���� ���ڿ�

		// readLine() : �� �پ� ����
		//���⼭ ���� ù�� �о� �ش����� �ʵ�� ȹ��!!
		if ((k38_readtxt = k38_br.readLine()) == null) { // k38_readtxt �� BufferedReader k38_br�� File k38_f�� �� �پ� �дµ�, �� ���� null�̸�
			System.out.printf("�� �����Դϴ�.\n"); // �� �����Դϴ�. ���ڿ� ��� ��
			return; // ����
		}

		//���ڿ� �迭 k38_field_name�� k38_readtxt�� �޸�(,)�� ������ ���� ������ ����
		//�޸�(,)�� ���� => csv������ �����ڰ� �޸�(,)
		//���� ù�� => �׸��̸��� �޸�(,) �����ڷ� �߶� ���ڿ� �迭�� ����
		//������ �� �� ���� �� = �׸�� => k38_field_name �� ����
		String[] k38_field_name = k38_readtxt.split(",");

		// ã�� ����, �浵 �� �Է� => �д������
		double k38_lat = 37.3860521; // �д� ����� ������ �Ǽ��� ���� k38_lat���� ���� �� �� �ʱ�ȭ
		double k38_lng = 127.1214038; // �д� ����� �浵�� �Ǽ��� ���� k38_lng���� ���� �� �� �ʱ�ȭ

		// �ش� ���� ���� ���� �������� ������ ���� k38_LineCnt ���� �� 1���� �� �ʱ�ȭ
		int k38_LineCnt = 1;
		
		
		//�ִ� �ּڰ� ���ϱ� ���� �������� �� �� ����
		double k38_min = Double.MAX_VALUE;	//�Ÿ��� �ּڰ��� �Ǽ��� ���� Double�� �ִ밪 ����
		double k38_max = Double.MIN_VALUE;	//�Ÿ��� �ִ񰪿� �Ǽ��� ���� Double�� �ּڰ� ����	
		String k38_minRoadName = null;		//���尡���Ÿ� ������� ������ ���� ���� �� null�� �ʱ�ȭ
		String k38_maxRoadName = null;		//���� �� �Ÿ� ������� ������ ���� ���� �� null�� �ʱ�ȭ
		String k38_minLat = null;			//���尡���Ÿ� ���� ������ ���� ���� �� null�� �ʱ�ȭ
		String k38_minLng = null;			//���尡���Ÿ� �浵 ������ ���� ���� �� null�� �ʱ�ȭ
		String k38_maxLat = null;			//����հŸ� ���� ������ ���� ���� �� null�� �ʱ�ȭ
		String k38_maxLng = null;			//����հŸ� �浵 ������ ���� ���� �� null�� �ʱ�ȭ
	
		// k38_readtxt �� �� �о��µ� null�� �ƴϸ� ��� �ݺ� => ������ ����
		// ������ k38_field_name�� ����� ù�� ���� �� ���� ����=> �ι�°�ٺ��� ����
		while ((k38_readtxt = k38_br.readLine()) != null) {

			// ���� �׸� ���� ���� ���ڿ� �迭 ����. => csv���� �������� �޸�(,)�� �׸񳪴�
			String[] k38_field = k38_readtxt.split(",");

			System.out.printf("**[%d��° �׸�]************************************\n", k38_LineCnt); // ���� ���� �� ���
			System.out.printf(" %s : %s\n", k38_field_name[9], k38_field[9]); // ������ ���θ��ּ� : �迭 field_name, k38_field �ε��� 9
			System.out.printf(" %s : %s\n", k38_field_name[13], k38_field[13]); // ���� : �迭 field_name, k38_field �� �ε��� 13
			System.out.printf(" %s : %s\n", k38_field_name[14], k38_field[14]); // �浵 : �迭 field_name, k38_field �� �ε��� 14

			
			// ********���� ������ ��ǥ������ �Ÿ����*********
			// ��Ÿ��� ���� Ȱ��
			// ��ǥ(x1,y1), ��ǥ(x2,y2)�� ��� 
			// ������� �� ������ ���θ��ּ� ����, �浵 ��
			// ��Ʈ{(x1-x2)^2+(y1-y2)^2}
			// Math.sqrt : ��Ʈ �����
			// Math.pow : ���� ǥ�� => 2�����̶� ���� 2
			// ��������(�д������)���� �Ÿ� ��� ��  ���� dist�� ����
			double k38_dist = Math.sqrt(Math.pow(Double.parseDouble(k38_field[13]) - k38_lat, 2) + Math.pow(Double.parseDouble(k38_field[14]) - k38_lng, 2));
			System.out.printf(" ���������� �Ÿ� : %f\n", k38_dist); // ��������(�д������)���� �Ÿ�
			System.out.printf("***************************************************\n"); // ���м� ���

			//�Ÿ� �ִ�, �ּڰ� ���
			if (k38_dist < k38_min) {			//�ּҰŸ��� �Ÿ����� ũ�� => ����Ÿ��� �� ������
				k38_min = k38_dist;				//�ּҰŸ��� �Ÿ��� ������
				k38_minRoadName = k38_field[9];	//k38_min_field�� k38_field �迭�� 9��° ��ҷ� ������ (�ּҰŸ��� ���θ��ּ�)
//				k38_minRoadName = k38_field[9] + " " + k38_field[1];	//k38_min_field�� k38_field �迭�� 9��° ��ҷ� ������ (�ּҰŸ��� ���θ��ּ�)
				k38_minLat = k38_field[13];	//min_lat�� �ּҰŸ� ������ ������ (k38_field �迭 13��° ���= ����)
				k38_minLng = k38_field[14];	//min_lng�� �ּҰŸ� �浵�� ������ (k38_field �迭 14��° ���= �浵)
			} else if (k38_dist > k38_max) {	//�ִ�Ÿ��� �Ÿ����� ������
				k38_max = k38_dist;				//�ִ�Ÿ��� �Ÿ��� ������
				k38_maxRoadName = k38_field[9];	//k38_max_field�� �ִ�Ÿ����θ��ּҷ� ������
				k38_maxLat = k38_field[13];	//k38_max_lat�� �ִ�Ÿ��� ������ ������
				k38_maxLng = k38_field[14];	//k38_max_lng�� �ִ�Ÿ��� �浵�� ������				
			}
						
		
			k38_LineCnt++; // k38_LineCnt ����
		}
		//���� �ּҰŸ����� ���θ��ּҿ� ����, �浵, �д���������� �Ÿ� ���
		System.out.printf("====================================================\n"); // ���м� ���	
		System.out.printf("%s : %s\n%s : %s\n%s : %s\n%s : %f\n", "���尡��� ��", k38_minRoadName, "����", k38_minLat, "�浵", k38_minLng, "�Ÿ�", k38_min);	
		System.out.printf("====================================================\n"); // ���м� ���																				
		//���� �ִ�Ÿ����� ���θ��ּҿ� ����, �浵, �д���������� �Ÿ� ���
		System.out.printf("%s : %s\n%s : %s\n%s : %s\n%s : %f\n", "���� �� ��", k38_maxRoadName, "����", k38_maxLat, "�浵", k38_maxLng, "�Ÿ�", k38_max);
		
		k38_br.close(); // BufferedReader �ݱ�=> close���ϸ� ��� �����־ ����Ұ�!!!				
	}
}



/*
� ��ǥ���� ��Ȯ�ϰ� ����Ϸ���.
�Ʒ� ���Ĵ�� ����ؾ��Ѵ�.
�Ʒ����Ĵ�� ����� ���� ������ m

public static double calDistance(double lat1, double lat2, double lon1, double lon2) {

final int R = 6371; // Radius of the earth

double latDistance = Math.toRadians(lat2 - lat1);
double lonDistance = Math.toRadians(lon2 - lon1);
double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
        + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
        * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
double k23_distance = R * c * 1000; // convert to meters

k23_distance = Math.pow(k23_distance, 2);

return Math.sqrt(k23_distance);
}



<������°��>
====================================================
���尡��� �� : ����Ư���� ������ ��� 102-17
���� : 37.465694
�浵 : 127.109268
�Ÿ� : 0.080561
====================================================
���� �� �� : ����Ư���� ������ ���ط� 65
���� : 37.869314
�浵 : 126.846543
�Ÿ� : 0.555959
���� �� �ð� : 2022-04-22 15:21:10.190
�ҿ�ð� : 0.763 seconds
*/