package javaPro_lec08_0421;
/*
<�ڹٽ�ȭ 8�� �����̵� 6>
Buffered�а� ����
****readLine() : ���� �Լ��� ����Ͽ� ����(\n)������ ����****
�ش� ���ô� try-catch���ϰ� throws IOException���� �����޽��� ����. �ܼ�â�� ������ �߰� ����׿� ���� ��.
�ڵ�� �������µ�, �������� �� ��Ȯ�ϰ� ó���ϱⰡ �������.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class p06 {

	//�޼���1 : ���Ͼ���
	public static void k38_FileWrite() throws IOException {
		File k38_f = new File ("C:\\Users\\kopo\\Desktop\\p06MyTest.txt"); // ���� ���� ��� ���� �� ���� ����
		
		//BufferedWriter: Buffer�� ������ k38_f�� ������ ������
		//BufferedWriter�� ���, ���۰� �ֱ⶧���� �ݵ�� flush()�Ǵ� close()�� �ݾ������.
		BufferedWriter k38_bw = new BufferedWriter(new FileWriter(k38_f));

		//p06MyTest.txt���Ͽ� �����ۼ�
		k38_bw.write("�ȳ� ����");		//ù��° �ٿ� "�ȳ� ����"�̶�� �ؽ�Ʈ �Է�
		k38_bw.newLine(); 				//newLine() : �� ��(\n) ���� �� ���� �ٷ� �Ѿ
		k38_bw.write("hello ���");		//�ι�° �ٿ�"hello ���"��� �ؽ�Ʈ �Է�
		k38_bw.newLine(); 				//newLine() : �� ��(\n) ���� �� ���� �ٷ� �Ѿ
		
		//BufferedWriter �ݱ�
		k38_bw.close();
	}
	
	//�޼���2 : �����б�
	public static void k38_FileRead() throws IOException {
		File k38_f = new File ("C:\\Users\\kopo\\Desktop\\p06MyTest.txt"); // ���� ���� ��� ���� �� ���� ����
		//BufferedReader : �� �� �� �о� ���̴� readLine �޼ҵ�� �� �پ� �б� ���� 
		BufferedReader k38_br = new BufferedReader (new FileReader(k38_f));
		String k38_readtxt; //�ؽ�Ʈ�� �о��� ������ ����
		
		
		//���۸����� �ش� �����о��µ� �������� �����̸� while�� ����
		while ((k38_readtxt = k38_br.readLine()) != null) { 	//readLine()���� ����(\n)�� �а� readtxt�� ����
			System.out.printf("%s\n", k38_readtxt); 		//������ �� ������ ������ k38_readtxt�� �� �پ� �ٹٲ��ؼ� ���
		}
		//���۸��� ����
		k38_br.close();
	}
	
	public static void main (String[] args) throws IOException {
		// ó���� �ð� ȹ��
		long k38_start = System.currentTimeMillis();
		System.out.print("���۽ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
		
		
		k38_FileWrite();	//�޼��� ȣ��
		k38_FileRead();		//�޼��� ȣ��
		
		
		// ó���� �ð� ȹ��
		long k38_end = System.currentTimeMillis();
		System.out.print("���� �� �ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// �ð����� ���_�����Է±��� ������ �ɸ��ð�
		System.out.println("�ҿ�ð� : " + (k38_end - k38_start) / 1000.0 + " seconds\n");
		
		
	}
}