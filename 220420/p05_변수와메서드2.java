package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6��_��5

public class p05_�����͸޼���2 {
	static int k38_iStatic;	//Ŭ������ ���� ���� static ����
	
	
	//add��� �޼��� ����
	public static void k38_add(int k38_i) {
		k38_iStatic++;	//�������� �� 1����
		k38_i++;	//�� 1����
		System.out.printf("add�޼��忡�� => k38_iStatic=[%d]\n", k38_iStatic);	//������ k38_iStatic����	
		System.out.printf("add�޼��忡�� => k38_i=[%d]\n", k38_i);	//������ k38_iMain����		
	}
	
	
	//add2��� �޼��� ����, ������ return
	public static int k38_add2(int k38_i) {
		k38_iStatic++;	//�������� �� 1����
		k38_i++;	//�� 1����
		System.out.printf("add�޼��忡�� => k38_iStatic=[%d]\n", k38_iStatic);	//������ k38_iStatic����	
		System.out.printf("add�޼��忡�� => k38_i=[%d]\n", k38_i);	//������ k38_iMain����				
		return k38_i;	//������ i ��ȯ
	}
	
	//main��
	public static void main(String[] args) {
		int k38_iMain;	//��������
		k38_iMain = 1;	//������ �ʱ�ȭ
		k38_iStatic = 1;	//�� ������ class������ ��밡���� ��������
		
		System.out.printf("*****************************************\n");
		System.out.printf("�޼���ȣ���� ���ο��� => k38_iStatic=[%d]\n", k38_iStatic);	//������ k38_iStatic����
		System.out.printf("�޼���ȣ���� ���ο��� => k38_iMain=[%d]\n", k38_iMain);	//������ k38_iMain����
		System.out.printf("*****************************************\n");
		
		//�޼��� ȣ��
		k38_add(k38_iMain);	//�� �޼��忡�� k38_iStatic�� 1 ����=> 2��, k38_iMain�� i�� �޾Ƽ� i���� 1������ 2����.
		//k38_iStatic �� ���������� �����ؼ� �ٸ� �޼ҵ忡�� ����� ���� ���޵ȴ�.
		//k38_iMain �� k38_add���� ���ϰ��� �����Ƿ� ��ȭx
		System.out.printf("*****************************************\n");
		System.out.printf("�޼���ȣ���� ���ο��� => k38_iStatic=[%d]\n", k38_iStatic);		//�� : 2
		System.out.printf("�޼���ȣ���� ���ο��� => k38_iMain=[%d]\n", k38_iMain);	//�� : 1  => **k38_iMain�� �� ��ȭ ����**
		System.out.printf("*****************************************\n");
		
		
		//********�ٽɺ�*********
		//������ k38_add2�޼��� ��ȯ������
		//�̷��� �� �����ϰ� �޴� ����� ���ؽ���.
		//���������� ���� �� �޼ҵ� �ڲ� �����ϸ� ���� �Ǵ� �����
		//k38_iMain�� k38_add2���ڷ� ������, �켱 k38_iStatic �� 1����,  k38_iMain�� i�� �޾Ƽ� k38_iMain�� 1���� => k38_iMain�� ��ȯ.
		//��ȯ�� k38_iMain�� main�� k38_iMain�� ����
		k38_iMain = k38_add2(k38_iMain);	//k38_iStatic �� : 3, k38_iMain�� : 2
		
		System.out.printf("*****************************************\n");
		System.out.printf("�޼��� k38_add2ȣ���� ���ο��� => k38_iStatic=[%d]\n", k38_iStatic);		//�� 3
		System.out.printf("�޼��� k38_add2ȣ���� ���ο��� => k38_iMain=[%d]\n", k38_iMain);		//�� 2		
			//*******k38_add�޼���� �޸� k38_add2�޼���� �� ��ȯ	=> k38_iMain���� ��ȭ�Ѵ�.**********
		System.out.printf("*****************************************\n");		
	}	
}
