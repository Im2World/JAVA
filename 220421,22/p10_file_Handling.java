package javaPro_lec08_0421;
//StockDailyPrice.csv �� �����ϴ� Ŭ����!
/*
 <�ҽ��ڵ� �״�� �ۼ�>
<�� ���� �������� ��������>
StockDailyPrice.csv���Ϸ� �޸��и��� ������ �����.
���̴� ������(^%_%^)�� �ƴѵ��ϴ� �����ڸ� (%_%)�� ��� �� �ʵ忡�� (^)�� ������ �۾����� ó���Ͽ���,
��ĭ�� ��ȿ���� ���� ���ڵ尡 �־ �����ڵ�� A�� �ݵ�� �����ϱ⿡ A�� ��Ƴ´�.(������ «�信 ���� �ϱ�� �����)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p10_file_Handling {
	public static void main(String[] args) throws IOException {	
		//���� ���� �ҷ�����
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\THTSKS010H00.dat");
		BufferedReader k38_br = new BufferedReader (new FileReader(k38_f));						
		
		//������ StockDailyPrice.csv �� ������� 
		File k38_f1 = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\StockDailyPrice.csv");
		BufferedWriter k38_bw1 = new BufferedWriter(new FileWriter(k38_f1));					
		
		String k38_readtxt;		 // ���ڿ� k38_readtxt ���� <= BufferedReader k38_br�� �ش����� �� �پ� ���� ������ ���� ���ڿ�
		
		int k38_cnt = 0;	//�ѵ����� ������ ���� ������ ���� ���� �� �� �ʱ�ȭ	=> ���� Ƚ�� ī��Ʈ
		int k38_wcnt = 0; 	//��ȿ�� ������ ���� ���� ������ ���� ���� �� �� �ʱ�ȭ => ��Ƚ�� ī��Ʈ
		
		
		// k38_readtxt �� �� �о��µ� null�� �ƴϸ� ��� �ݺ� => ������ ����
		while ((k38_readtxt = k38_br.readLine()) != null) {
			
			StringBuffer k38_s = new StringBuffer();	//��Ʈ������ ��ü����
			
			//dat���� ������ : %_%
			//k38_readtxt�� %_%�� �����ڷ� �и��ؼ� ���ڿ� �迭 k38_field�� ����
			String[] k38_field = k38_readtxt.split("%_%");	


			//append : ���� �� �߰�
			//replace �� ó�������� ^�� ���� 
			//substring (a,b) : �ε��� a���� b-1���� �߶� ���
			//trim : ���ڿ� �� �� ��������
			//field �迭�� ���̰� 2���� ũ�� field�迭�� [2]��° ����� ^�� ���ְ� �յ� ������ ���� ���� ���ڿ� 0��°(1��°) ���ڰ� A�� true
			//�� ���Ͽ��� A�� �����ϴ� ���� �ֽ��� �ǹ��Ѵ�.
			if(k38_field.length > 2 && k38_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				
				//k38_field[0]�� ^�� �����ְ�, ���ڿ� �� �� ������ ������ ���� k38_s�� ���߰�
				k38_s.append(k38_field[0].replace("^","").trim());
				
				//ù ���� �޸�(,)�� �� �־��ֱ� ������ ���� ���� ����. <= ���� csv���� �����Ϸ����ϴϱ�!
				//k38_filed���� ������ �ݺ�
				for (int k38_j = 1; k38_j < k38_field.length; k38_j++) {
					//������ �����ؼ� StringBuffer s�� �� �߰�
					//�޸�(,)�߰� && field�迭 [k38_j]��°�� ^�� ���ְ�, ���ڿ� �յ� ������ ���� ���� �߰� 
					k38_s.append("," + k38_field[k38_j].replace("^","").trim());
				}
				
				//toString() �޼ҵ� ȣ���ؼ� String��ü�� ��ȯ => k38_s ���� ���ڿ�! => k38_bw1.write ���Ͼ���!
				k38_bw1.write(k38_s.toString());
				k38_bw1.newLine();		//�� �ٲ�
				k38_wcnt++;				//wcnt�� 1 ���ؼ� ��ȿ�� ������ ��� �б�
			}
			k38_cnt++;		//cnt�� 1�� ���� ���������α��� �б�
		} //while
		
		//�� ������ �� close!!!
		k38_br.close();		//BufferedReader ����
		k38_bw1.close();	//BufferedWriter ����
		
		//����� ���Ǹ� ���� �ȳ����� ��� => wcnt�� �� Ƚ��, cnt�� ���� Ƚ��
		System.out.printf("Program End[%d][%d]records\n", k38_cnt, k38_wcnt);	//22519418 , 1146121
	}
}	
