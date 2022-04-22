package javaPro_lec08_0421;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//�ڹٽ�ȭ 8�� _ �����̵�5
//�����ϰ� �а� ����
//���� ���� char[N]�� �迭��� �б�
//�ڹ��� exceptionó�� (try {}catch(e){} ���� )
//������ ���ٵ���, �ϵ��ũ ��������� ���ٵ���
//���丮�� C:\�� �����ϰ� �ǽ�
//HanCount�� �־��� ���ڿ��� �ѱۼ��� ������
import java.text.SimpleDateFormat;


public class p05 {
	public static void main(String[] args) {
		// ó���� �ð� ȹ��
		long k38_start = System.currentTimeMillis();
		System.out.print("���۽ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
		
		try {			
			//�������� ���丮 �� ���ϸ� ����
			File k38_f = new File ("C:\\Users\\kopo\\Desktop\\k38MyTest.txt");	//write �Էµ� ������ ��� �ش� ���� ����
			FileWriter k38_fw = new FileWriter(k38_f); //FileWriter: ���Ͽ� �� �� �� �ְ���. => k38MyTest.txt�� �� �Է�
			
			//���Ͽ� �۾���
			k38_fw.write("�ȳ� ����\n"); //k38MyTest.txt���Ͽ� ù�� "�ȳ� ����"�̶�� �ؽ�Ʈ �Է�.
			k38_fw.write("hello ���\n"); //k38MyTest.txt���Ͽ� ������ "hello ���" �ؽ�Ʈ �Է�.
			
			//���Ͼ��� ���� _open������ �� close�� �ؾ��Ѵ�.
			k38_fw.close();
			
			//�����б� => FileReader(���� ���ϸ�)
			FileReader k38_fr = new FileReader(k38_f);
			
			int k38_n = -1; //�Ŀ� 0���� �������� ������ ����� �ʱ�ȭ�� 0���� ���� -1�� ����
			char [] k38_ch; //char�迭 ����
			
			//���ѹݺ��� : true�� ��ӹݺ�
			while(true) {
				k38_ch = new char[100]; // char�迭 ũ�⸦ 100���� ����
				//k38_fr.read => k38_fr�� k38MyTest.txt�� �а� �� ������ k38_ch �迭�� �ѱ��ھ� ����.
				//�̶�, \n�� 1�� ī��Ʈ
				//.read �� ���� ���� ������ -1�� ��ȯ�Ѵ�.
				//.read�� ���ϸ����� ���� ������ ()�ȿ� �ѱ��ھ� ��ȯ�Ѵ�. 
				k38_n = k38_fr.read(k38_ch); //k38_ch�� char�迭 ���� ����� ���� k38_n�� ����
				
				//�� �̻� ���� �� ������ -1�� ��µ�
				if (k38_n == -1) //k38_n�� ���� -1�̸� �ݺ�����
					break;
				//i�� 0~ k38_n ������ 1�� �����ϸ� �ݺ�
				for (int i = 0; i < k38_n; i++) {
					System.out.printf("%c", k38_ch[i]); //  k38_ch�� ��簪�� �ٹٲ޾��� ��� & char���̶� %c�� ����
				}
//				System.out.println(k38_n);		=> ���: 15
			}
//			System.out.println(k38_n);		=> 		���: -1
			
			//���ϸ��� ����.
			//���Ͽ����ϸ� �� close�������.
			k38_fr.close(); //.close���ϸ� ��� ���� ���»��¶� ����Ұ�			
			System.out.printf("\nFILE READ END\n\n"); //���ϸ��� �����ߴٰ� ��� => ����� ����������.
			
		} catch (Exception e) {	//try������ ���� �߻��ϸ� catch ��������
			System.out.printf("�� ���� [%s]\n", e); // �������� "�� ����"���, e�� ���� ������ �ǹ�=> �� ���� ������ �������� ���
		}
		
		// ó���� �ð� ȹ��
		long k38_end = System.currentTimeMillis();
		System.out.print("���� �� �ð� : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// �ð����� ���_�����Է±��� ������ �ɸ��ð�
		System.out.println("�ҿ�ð� : " + (k38_end - k38_start) / 1000.0 + " seconds\n");
	}
}	//class