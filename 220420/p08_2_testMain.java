package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6��_��8
//Ŭ����, ��ü, �ν��Ͻ�
///p04_1_elevator���� ������ �޼������ �����ϴ� Ŭ����
//�ٸ� Ŭ������ ���� �޼��带 ����ϱ� ���ؼ��� ��ü���� �ʼ�!

public class p08_2_testMain {
		private static int k38_inVal;	//�������� ����
		
		//�޼���
		public static void k38_up() {
			k38_inVal++;	//�� 1�� ���� => �����Լ����� k38_inVal�� 0���� �ʱ�ȭ�س���.
			System.out.printf("�� �׳� �޼ҵ�![%d]\n", k38_inVal);	//�� ���
		}
		
		//���θ޼���
		public static void main(String[] args) {
			//1.�غ��۾� : ��ü����
			k38_inVal = 0;	//�� �ʱ�ȭ
			
			p07_1_elevator k38_elev;	//[Ŭ������ ��ü��] => Ŭ���� �޾� ��ü����
			k38_elev = new p07_1_elevator();	//�ν��Ͻ������� ��ü����
			//*** p04_1_elevator k38_elev = new p04_1_elevator();   => ��� �� ������ �� �ٷ� ���� �� �ִ�!!***
			
			k38_up();	//�� Ŭ���� ���� ���� 10�� up�޼��� ��Ī => ��� : �� �׳� �޼ҵ�![1]
			
			//2. �ٸ�Ŭ������ �޼��� ����
			//�ݺ��� 10ȸ ����
			//ù ���� 2���� �ȴ�. => �ֻ����� 10�� �Ǹ� �ȳ���Ʈ ���.
			for (int k38_i = 0; k38_i < 10; k38_i++) {
				k38_elev.k38_up();	//p04_1_elevator Ŭ������ �޼��� ����
				System.out.printf("MSG [%s]\n", k38_elev.k38_help);	//String���ڿ� elev.help ���
			}
			
			//�ݺ��� 10ȸ ����
			//elev.up�޼��� �������� floor(������)�� 10�� ���� ����
			//p04_1_elevator Ŭ�������� k38_floor�� ���������� ��������.
			for (int k38_i = 0; k38_i < 10; k38_i++) {
				k38_elev.k38_down();	//p04_1_elevator Ŭ������ �޼��� ����
				System.out.printf("MSG [%s]\n", k38_elev.k38_help);	//String���ڿ� elev.help ���
			}
		}
}