package javaPro_lec06_self_ppt;
//��17
//������� Ŭ���������
//������ �ܷ� Ȯ�� �޼��� �߰�
//class p11_TvRemoteconX �� �޼���� �����ϴ� Ŭ����
public class p17_TvRemoteconX_Main {
	public static void main(String[] args) {
		//1. [Ŭ������ ��ü��] ���� ��ü���� ��  �ν��Ͻ� ������ ��ü����
		p17_TvRemoteconX k38_rmt3 = new p17_TvRemoteconX();

		//2. ������ �ܷ� �ȳ� �޼��� ����
		k38_rmt3.k38_batteryCheckinfo();
		
		//3. ��������
		//���� 1�� �ø��� �޼��� 10ȸ ����
		//k38_rmt3�� p09_tvRemotecon2 Ŭ����(�θ�Ŭ����)�� ��ӹ��� p11_TvRemoteconXŬ������ ����� ��ü
		//=> p09_tvRemotecon2 �޼��� ���� ����
		for(int k38_i = 0; k38_i < 9; k38_i++) {
			k38_rmt3.k38_volUp(); //p09_tvRemotecon2 Ŭ������ k38_volUp() ����
			k38_rmt3.k38_volInfo("2�� ������ ���� 1 ����");	//���� �� ������ �ȳ������� �Բ� ���			
			k38_rmt3.k38_batteryCheck(k38_i + 1);	//�������� ���� 1ȸ �����Ҷ����� -1�� �����ϰ� ����
			
			//������ ������ 0�� �Ǹ� �������� �Ұ�!
			//�������� ��ü�϶�� �ȳ��� ��� �� �ݺ��� ����
			if ((k38_rmt3.k38_battery - (k38_i + 1)) == 0) {
				System.out.println("**�������� ��ü�ϼ���**");
				break;
			}
		}	//for
	}	//main
} 	//class
