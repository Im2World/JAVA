package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6�� ��17
//������� Ŭ���������
//Ŭ���� p09_tvRemotecon2 �� ��ӹ���.
public class p17_TvRemoteconX extends p14_tvRemotecon2{
	//������ ó�� �ܷ��� 5�� ����
	static int k38_battery = 5;
	
	//������ �ܷ� �ȳ� �޼��� ����
	void k38_batteryCheckinfo() {
		System.out.printf("�ʱ� ������ �ܷ�: %d \n\n", k38_battery);	//������ �ܷ� ���� ���	
	}
	
	//���ڸ� �޾� ������ �ܷ��� ��ȭ�� �޼��� ����
	//k38_num�� ���������ϴ� Ƚ��
	//�ʱ� ������ �ܷ� - ��������Ƚ�� = �������� �� ������ �ܷ�
	//class p11_TvRemoteconX_Main ���� �������� ���� 1ȸ �����Ҷ����� -1�� �����ϰ� ����
	void k38_batteryCheck(int k38_num) {
		System.out.printf("������ �ܷ�: %d \n\n", k38_battery - k38_num);	//������ �ܷ� ���� ���	
	}
}
