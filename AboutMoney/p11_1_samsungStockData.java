package javaPro_lec08_0421;

/*
 <�����̵�11>
StockDailyPrice.csv���Ϸ� ������ ���� �ǽ��� �� ���̴�.
�ǽ�1) �Ｚ���� (�����ڵ� A005930) �� �����Ͽ� A005930.csv������ ����ÿ�, �ǽ� �� �ϳ�(��)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class p11_1_samsungStockData {
	// throw declaration: IOException �������
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
		//******���� a���� �����о ���� b�� ������ ���̹Ƿ� BufferedReader 1��, BufferedWriter 1��
		// ���� ��ü ���� �� �ش� ����� ���� �ҷ�����
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\StockDailyPrice.csv");

		// k38_br ���� BufferedReader ��ü ������ �б�
		BufferedReader k38_br = new BufferedReader(new FileReader(k38_f));

		File k38_f1 = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\A005930.csv");// A005930.csv���� ������ ����.

		// BufferedWriter�� ���ο� ���� �����Ͽ� �� �ȿ� ���� �ۼ����ֱ�
		BufferedWriter k38_bw1 = new BufferedWriter(new FileWriter(k38_f1));

	
		String k38_readtxt; // ���ڿ� k38_readtxt ���� <= BufferedReader k38_br�� �ش����� �� �پ� ���� ������ ���� ���ڿ�

		int k38_cnt = 0;	// �� ������ ���� => ���� Ƚ��
		int k38_wcnt = 0;	// ��ȿ�� ������ ���� => �� Ƚ��

		StringBuffer k38_s = new StringBuffer();		//StringBuffer ��ü����
		// k38_readtxt �� �� �о��µ� null�� �ƴϸ� ��� �ݺ� => ������ ����
		while ((k38_readtxt = k38_br.readLine()) != null) {	//k38_br�� ���� �� �о� k38_readtxt�� ���� 
//			StringBuffer k38_s = new StringBuffer();		//StringBuffer ��ü����
			String[] k38_field = k38_readtxt.split(",");//�迭�� �ִ� ������ �а�, �޸��� �����ڷ� ���� �ɰ� k38_field�迭�� ����

			if (k38_field[2].contains("A005930")) {// �������� ���� �����ڵ�(k38_field[2])�� �Ｚ���� (�����ڵ�: A005930)�� ���ԵǾ� �ִٸ�
				k38_s.append(k38_readtxt);// �� ������ k38_readtxt�� �߰�(append)

				//toString() �޼ҵ� ȣ���ؼ� String��ü�� ��ȯ => k38_s ���� ���ڿ�! => k38_bw1.write ���Ͼ���!
				k38_bw1.write(k38_s.toString());	
				k38_bw1.newLine();	//�ٹٲ�
				k38_wcnt++; // ��ȿ�� ������ ��� �б�
			}
			k38_cnt++;// ������ ��� �б�
//			System.out.println(".");	//�ݺ��� ����Ȯ��
		}

		//�� ������ �ݾ��ֱ�!!
		k38_br.close();	// ���۸��� close
		k38_bw1.close();// ���۶����� close

		
		// ���α׷� ����ȳ����� ���
		System.out.printf("Programme End [%d][%d] records\n", k38_cnt, k38_wcnt);						
	}
}