package javaPro_lec06_self_ppt;
//class p09_tvRemotecon2 �� ������, �޼��� ȣ���ؼ� ����ϴ� Ŭ����
//�ڹ� 6�� ��14 _ ������

public class p14_tvRemotecon2_Main {
	//1. [Ŭ������ ��ü��] ���� ��ü����
	//p09_tvRemotecon2 ��� ���� Ŭ������ �ٸ� �̸����� ������ ȣ��
	static p14_tvRemotecon2 k38_Remotecon1;
	static p14_tvRemotecon2 k38_Remotecon2;
	
	public static void main(String[] args) {
		//2. �ν��Ͻ� ������ ��ü����(new p09_tvRemotecon2() ��)
		k38_Remotecon1 = new p14_tvRemotecon2();
		k38_Remotecon2 = new p14_tvRemotecon2(10, 0, 18, 1, 2, 3); //���� ������ => �ִ뺼��, �ּҺ���, ������ä��,  ó��ä��, ���纼��, ����ä��
		
		//3. ��������
		//���� 1�� �ø��� �޼��� 10ȸ ����
		for(int k38_i = 0; k38_i < 9; k38_i++) {
			k38_Remotecon2.k38_volUp(); //p09_tvRemotecon2 Ŭ������ k38_volUp() ����
			k38_Remotecon2.k38_volInfo("2�� ������ ���� 1 ����");	//���� �� ������ �ȳ������� �Բ� ���
		}
		
		//���� 2�� ������ �޼��� 3ȸ ����
		for (int k38_i = 0; k38_i < 3; k38_i++) {
			k38_Remotecon2.k38_volDown(2); //p09_tvRemotecon2 Ŭ������ k38_volDown (int k38_u) ����
			k38_Remotecon2.k38_volInfo("2�� ������ ���� 2 ����");	//���� �� ������ �ȳ������� �Բ� ���
		}
		
		//4. ä������
		//ä�� 1�� �ø��� �޼��� 10ȸ ����
		for(int k38_i = 0; k38_i < 10; k38_i++) {
			k38_Remotecon2.k38_channelUp(); //p09_tvRemotecon2 Ŭ������ k38_channelUp() �޼��� ����
			k38_Remotecon2.k38_chInfo("2�� ������ä�� 1 ����");	//���� �� ������ �ȳ������� �Բ� ���
		}
		
		//ä�� 2�� ������ �޼��� 3ȸ ����
		for (int k38_i = 0; k38_i < 3; k38_i++) {
			k38_Remotecon2.k38_channelDown(2); //p09_tvRemotecon2 Ŭ������ k38_channelDown (int k38_u) �޼��� ����
			k38_Remotecon2.k38_chInfo("2�� ������ ä�� 2 ����");	//���� �� ������ �ȳ������� �Բ� ���
		}
	}
}