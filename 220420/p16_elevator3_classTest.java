package javaPro_lec06_self_ppt;
//��Ӱ� �������̵� _ �ڹٽ�ȭ 6�� ��16, �� 18
//p10_elevator3 Ŭ������ p08_elevator2Ŭ������ ��ӹ���.
//�θ�Ŭ���� p08_elevator2 �� �޼��带 �״�� ��밡��
//�ڹٴ� ���߻�� ������ �� Ŭ������ �ϳ��� Ŭ������ ��Ӱ���
//�θ�Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� �������� ����ϴ� ��.
//�޼ҵ带 �������̵� �ϸ�, �׻� �ڽ�Ŭ�������� ���ǵ� �޼ҵ尡 ȣ��
public class p16_elevator3_classTest {

	public static void main(String[] args) {
	//1. [Ŭ������ ��ü��] ���� ��ü����
	p16_elevator3 k38_elev3;
	
	//2. �ν��Ͻ� ������ ��ü����
	k38_elev3 = new p16_elevator3();
	
	//3. �ش� �޼���� ���� �� �ȳ������� �Բ� ���
	for (int k38_i = 0; k38_i < 10; k38_i++) {
		k38_elev3.k38_up();		//class p10_elevator3�� k38_up() �޼��� ȣ�� 
		System.out.printf("MSG elev3[%s]\n", k38_elev3.k38_info);
		}
		
	for (int k38_i = 0; k38_i < 10; k38_i++) {
		k38_elev3.k38_down();		//class p10_elevator3�� k38_down() �޼��� ȣ��
		System.out.printf("MSG elev3[%s]\n", k38_elev3.k38_info);
		}
	
	// p10_elevator3Ŭ������ k38_Repair�޼��� ȣ�� 
		k38_elev3.k38_Repair();		//class p10_elevator3�� k38_Repair() �޼��� ȣ��
		System.out.printf("MSG elev3[%s]\n", k38_elev3.k38_info);
	}
}