package javaPro_lec08_0421;
//�������Ͽ� ���۸��� ����
//����� ������������ 100�� ���
//���õ����ʹ� https://www.localdata.go.kr/lif/lifeCtacDataView.do?opnEtcSvcId=12_04_07_E 
//�ñ��� ���� ���� �� ���� ���� �ٿ�ε� => ���� ���� �ٸ� �̸����� ���� => csv�� ����ȯ �� �۾�

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class p07_FreeWifi {
	
	//�޼��� : �����б�
	public static void k38_FileRead() throws IOException {
		//���� ��ü ���� �� �ش� ����� ���� �ҷ�����
		//  \�� Ư�����ڶ� �״�� ǥ������ \�ѹ� ����.
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\12_04_07_E_���������������.csv");
		BufferedReader k38_br = new BufferedReader (new FileReader(k38_f));	//k38_f���� BufferedReader ��ü ������ �б�
		
		String k38_readtxt;	// ���ڿ� k38_readtxt ���� <= BufferedReader k38_br�� �ش����� �� �پ� ���� ������ ���� ���ڿ�
		
		//readLine() : �� �پ� ����
		//���⼭ ���� ù�� �о� �ش����� �ʵ�� ȹ��!!
		if ((k38_readtxt = k38_br.readLine()) == null) {	//k38_readtxt �� �� �о��µ� null�̸�
			System.out.printf("�� �����Դϴ�.\n");	//�� �����Դϴ�. ���ڿ� ��� ��
			return;	 //����
		}
		
		//���ڿ� �迭 k38_field_name�� k38_readtxt�� �޸�(,)�� ������ ���� ������ ����
		//�޸�(,)�� ���� => csv������ �����ڰ� �޸�(,)
		//���� ù�� => �׸��̸��� �޸�(,) �����ڷ� �߶� ���ڿ� �迭�� ����
		//������ �� �� ���� �� = �׸�� => k38_field_name �� ����
		String[] k38_field_name = k38_readtxt.split(",");

		//�ش� ���� ���� ���� �������� ������ ���� k38_LineCnt ���� �� 1���� �� �ʱ�ȭ
		int k38_LineCnt = 1;
		
		//k38_readtxt �� �� �о��µ� null�� �ƴϸ� ��� �ݺ� => ������ ����
		//������ k38_field_name�� ����� ù�� ���� �� ���� ����=> �ι�°�ٺ��� ����
		//k38_br.close() �� ���� �ʾұ� ������ �ι�° �ٺ��� �б� ����.
		while ((k38_readtxt = k38_br.readLine()) != null) {
			//���� �׸� ���� ���� ���ڿ� �迭 ����. => csv�������� �޸��� �׸񳪴�
			String[] k38_field = k38_readtxt.split(",");
			System.out.printf("**[%d��° �׸�]*****************\n", k38_LineCnt);	//���� ���� �� ���
			
			//�ݺ��� : ������ ���� j�� 0�̰�, j�� field_name �迭 ũ�� ������ 1�� �����ϸ� �ݺ�			
			for (int j = 0; j < k38_field_name.length; j++) {						
				System.out.printf(" %s : %s\n", k38_field_name[j], k38_field[j]);
			}
			System.out.printf("***********************************\n");		//���м� ���
			if (k38_LineCnt == 100) break;	//k38_LineCnt�� 100 �Ǹ� �ݺ����� => �� ������ �ѹ��� 16�� ���� => 16�� * 100�� �ݺ�
			k38_LineCnt++;	//k38_LineCnt�� 100�� �ƴϸ� +1 �� �ٽ� �ݺ�
		}	
		k38_br.close();	//BufferedReader ����			
	}

	//�����Լ��� IOException ���� ����ó��	
	public static void main(String[] args) throws IOException {
		// ó���� �ð� ȹ��
		long k38_start = System.currentTimeMillis();
		System.out.print("���۽ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
		
		k38_FileRead();
		
		// ó���� �ð� ȹ��
		long k38_end = System.currentTimeMillis();
		System.out.print("���� �� �ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// �ð����� ���_�����Է±��� ������ �ɸ��ð�
		System.out.println("�ҿ�ð� : " + (k38_end - k38_start) / 1000.0 + " seconds\n");
	}
}


/*
**[99��° �׸�]*****************
��ȣ : 99
��ġ��Ҹ� : �ϼ�����ǽ�
��ġ��һ� : �ȳ���
��ġ�õ��� : ����Ư����
��ġ�ñ����� : ���ϱ�
��ġ�ü����� : ������ȭ�ü�
����������� : ����Ư����
��������SSID : PublicWiFi@Seoul
��ġ���� : 14-Jan
���������θ��ּ� : ����Ư���� ���ϱ� ����� 173
�����������ּ� : ����Ư���� ���ϱ� ���� ��28-6
��������� : ����Ư����
���������ȭ��ȣ : 02-901-7212
WGS84���� : 37.6203676
WGS84�浵 : 127.0429886
�����ͱ������� : 2020-06-15
***********************************
*/