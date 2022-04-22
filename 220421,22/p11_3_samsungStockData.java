package javaPro_lec08_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
 <�����̵�11>
StockDailyPrice.csv���Ϸ� ������ ���� �ǽ��� �� ���̴�.
�ǽ�3) �Ｚ������ �ְ��� ���Ͽ� 2015�� �ִ밪�� �ּҰ��� ���Ͻÿ�(��������), 

<A005930.csv ���� ������ ����>
ǥ�� �����ڵ�, �ֽ� ���� ����, �������� ���� �����ڵ�, �ֽ� ����, �ֽ� �ð�, �ֽ� �ְ�, �ֽ� ������, ���ϴ�� ��ȣ ��
KR7000321000	20150112	A000325		14600		14600		14650		14300
 */


public class p11_3_samsungStockData {
	public static void main(String[] args) throws IOException {
		// ó���� �ð� ȹ��
		long k38_start = System.currentTimeMillis();
		System.out.print("���۽ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
				
		k38_FileHandling();		//�޼��� ȣ��
				
		// ó���� �ð� ȹ��
		long k38_end = System.currentTimeMillis();
		System.out.print("���� �� �ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// �ð����� ���_�����Է±��� ������ �ɸ��ð�
		System.out.println("�ҿ�ð� : " + (k38_end - k38_start) / 1000.0 + " seconds\n");		
	}
	
	
	//�޼���
	public static void k38_FileHandling() throws IOException {
		//�ݾ� õ���� ���� �޸� �������� DecimalFormat ��ü����
		DecimalFormat k38_df = new DecimalFormat("###,###,###,###");
		
		//******���� a���� �����о ���� b�� ������ ���̹Ƿ� BufferedReader 1��, BufferedWriter 1��
		// ���� ��ü ���� �� �ش� ����� ���� �ҷ�����
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\A005930.csv");
		
		// k38_br ���� BufferedReader ��ü ������ �б�
		BufferedReader k38_br = new BufferedReader(new FileReader(k38_f)); 

		//I_LIKE_SAMSUNG2015.csv �� ���� ������ ��.
		File k38_f1 = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\LOVE_SAMSUNG2015.csv");
		
		// BufferedWriter�� ���ο� ���� �����Ͽ� �� �ȿ� ���� �ۼ����ֱ�
		BufferedWriter k38_bw1 = new BufferedWriter(new FileWriter(k38_f1)); 

		String k38_readtxt;	 // ���ڿ� k38_readtxt ���� <= BufferedReader k38_br�� �ش����� �� �پ� ���� ������ ���� ���ڿ�

		int k38_cnt = 0;	// �� ������ ���� => ���� Ƚ��
		int k38_wcnt = 0;	// ��ȿ�� ������ ���� => �� Ƚ��

		double k38_max = Double.MIN_VALUE; // �������� �ִ밪 ���ϱ����� ���� => Min������ �ʱ�ȭ
		double k38_min = Double.MAX_VALUE;// �������� �ּҰ��� ���ϱ����� ���� => MAX������ �ʱ�ȭ
		String k38_maxDate = ""; // �ִ� ���� ������ ����
		String k38_minDate = "";//�ּڰ� ���� ������ ����

		// k38_readtxt �� �� �о��µ� null�� �ƴϸ� ��� �ݺ� => ������ ����
		while ((k38_readtxt = k38_br.readLine()) != null) { 	//k38_br�� ���� �� �о� k38_readtxt�� ����
			StringBuffer k38_s = new StringBuffer();		//StringBuffer ��ü����
			String[] k38_field = k38_readtxt.split(","); 		//�迭�� �ִ� ������ �а�, �޸��� �����ڷ� ���� �ɰ� k38_field�迭�� ����
			double k38_cPrice2015; // ���� ���� ���� double������ ���� , closing Price => Ȥ�ó� �Ǽ��� ���� ����Ǿ����� ���� �ֱ⶧��

			//�ֽ� ���� ���� (k38_field[1])�� ���� 2015�� ���ԵǾ��ְ�
			if (k38_field[1].contains("2015")) {
				if (k38_field[2].contains("A005930")) {	// �������� ���� �����ڵ�(k38_field[2])�� �Ｚ���� (�����ڵ�: A005930)�� ���ԵǾ� �ִٸ�
					//=> 2015�� �Ｚ���� ����
					k38_cPrice2015 = Double.parseDouble(k38_field[3]); // k38_cPrice2015�� �ֽ�����(k38_field[3]) ���� double�� ����ȯ �� ����
					k38_s.append(k38_readtxt);// �� ������ k38_readtxt�� �߰�(append)	**********�� �߰� ��������!!!**********
					
					//�ֽ����� �ִ�, �ּڰ� ��
					if (k38_cPrice2015 < k38_min) { // ������ k38_min���� ������
						k38_min = k38_cPrice2015; // k38_min�� k38_value2015�� ���� => �ּڰ� �����
						k38_minDate = k38_field[1]; // �ּҰ� ��¥
					} else if (k38_cPrice2015 > k38_max) { // ������ k38_max���� ũ��
						k38_max = k38_cPrice2015;// k38_max�� k38_value2015�� ���� => �ִ� �����
						k38_maxDate = k38_field[1];// �ִ밪 ��¥
					}
					
					//toString() �޼ҵ� ȣ���ؼ� String��ü�� ��ȯ => k38_s ���� ���ڿ�! => k38_bw1.write ���Ͼ���!
					k38_bw1.write(k38_s.toString());
					k38_bw1.newLine();	//�ٹٲ�
					k38_wcnt++; // ��ȿ�� ������ ��� �б�					
				}
			} //if
			k38_cnt++;// ������ ��� �б�
		}
		
		//�� ������ �ݾ��ֱ�!!
		k38_br.close();	// ���۸��� close
		k38_bw1.close();// ���۶����� close
		
		//����� ���� ���� ���� ��� => ���ϴݾƼ� ���Ͽ��� ����ȵ�.
		System.out.printf("\n****2015�� �Ｚ���� �ְ� �м�****\n");
		System.out.printf("���������� ���\n");		
		System.out.printf("�� �ִ�: %s ��\n", k38_df.format(k38_max));
		System.out.printf("�� �ִ� ��� ����: %s\n\n", k38_maxDate);
		System.out.printf("�� �ּҰ�: %s ��\n", k38_df.format(k38_min));
		System.out.printf("�� �ּҰ� ��� ����: %s\n\n", k38_minDate);
		

		// ���α׷� ����ȳ����� ���
		System.out.printf("Programme End [%d][%d] records\n", k38_cnt, k38_wcnt);				
	}
}