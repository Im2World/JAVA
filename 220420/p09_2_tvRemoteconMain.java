package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6��_��9
//Ŭ����, ��ü, �ν��Ͻ�
public class p09_2_tvRemoteconMain {
	public static void main(String[] args) {
		//1. �غ��۾� : ��ü����
		p09_1_tvRemotecon k38_move;	//[Ŭ������ ��ü��] => Ŭ���� �޾� ��ü����
		k38_move = new p09_1_tvRemotecon();	//�ν��Ͻ������� ��ü����
			//=> move�� p05_1_tvRemoconŬ���� �޼��� ��밡��
			//*** p05_1_tvRemotecon k38_move = new p05_1_tvRemotecon();   => ��� �� ������ �� �ٷ� ���� �� �ִ�!!***
		
		//2. �ٸ� Ŭ������ �޼��� ����
		System.out.printf("<ä�ξȳ�>\n");	//�޼��� ��°�� ���� �������� �ȳ����� ��� �� �ٹٲ�
		//ä�ξ�
		for(int k38_i =0; k38_i < 10; k38_i++) {	//0~9���� �� 10ȸ �ݺ�
			k38_move.k38_channelUp();	//05_1_tvRemocon Ŭ������ �޼��� ����
			System.out.printf("info [%s]\n", k38_move.k38_info);	//����ä�� �ȳ� ���� ��� �� �ٹٲ�
		}
		
		//ä�� �ٿ�
		for(int k38_i =0; k38_i < 10; k38_i++) {	//0~9���� �� 10ȸ �ݺ�
			k38_move.k38_channelDown();	//05_1_tvRemocon Ŭ������ �޼��� ����
			System.out.printf("info [%s]\n", k38_move.k38_info);	//����ä�� �ȳ� ���� ��� �� �ٹٲ�
		}
		
		System.out.printf("\n<�����ȳ�>\n");	//�ٹٲ� �� �޼��� ��°�� ���� �������� �ȳ����� ��� �� �ٹٲ�	
		//������
		for(int k38_i =0; k38_i < 5; k38_i++) {	//0~4���� �� 5ȸ �ݺ�
			k38_move.k38_volUp();	//05_1_tvRemocon Ŭ������ �޼��� ����
			System.out.printf("info [%s]\n", k38_move.k38_info);	//����ä�� �ȳ� ���� ��� �� �ٹٲ�
		}
		
		//���� �ٿ�
		for(int k38_i =0; k38_i < 5; k38_i++) {	//0~4���� �� 5ȸ �ݺ�
			k38_move.k38_volDown();	//05_1_tvRemocon Ŭ������ �޼��� ����
			System.out.printf("info [%s]\n", k38_move.k38_info);	//����ä�� �ȳ� ���� ��� �� �ٹٲ�
		}
	}
}
