package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ6��_��4

public class p0_methodMake {
	//�޼ҵ� ����
	public static void k38_iamMethod() {
		System.out.printf("�޼ҵ�� �ҷ����~~\n");	//�޼ҵ� ����
	}
	
	//�޼��尡 ���� class�ȿ� ������ �޼�������θ����ε� ȣ�Ⱑ��
	public static void main(String[] args) {
		p0_methodMake.k38_iamMethod();		//��Ģ: [Ŭ������.�Լ���] ���� �Լ�(=�޼���)ȣ��
		k38_iamMethod();	//static���� �޼ҵ� �����ؼ� �� �������� �ٷ�ȣ�Ⱑ��
	}

}
