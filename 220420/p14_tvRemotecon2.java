package javaPro_lec06_self_ppt;
//�ڹ� 6�� ��14 _ ������

public class p14_tvRemotecon2 {
	//1. ���� ���� ����
	int k38_volUpMax;		//������ ���� �ִ뺼�� ����
	int k38_volDownMin;		//������ ���� �ּҺ��� ����
	int k38_channelUpMax;	//������ ���� �ִ�ä�� ����
	int k38_channerDownMin;	//������ ���� �ּ�ä�� ����
	int k38_vol;	//������ ���� ���� ���� ����
	int k38_channel;	//������ ���� ���� ä�� ����
	String k38_info;	//�ȳ���������� ���ڿ� k38_info ����
	
	//2. ������ ����
	p14_tvRemotecon2() {
		k38_volUpMax = 5;				//k38_volUpMax�� 5�� ����
		k38_volDownMin = 0;				//k38_volDownMin�� 0���� ����
		k38_channelUpMax = 10;			//k38_channelUpMax�� 10���� ����
		k38_channerDownMin = 0;			//k38_channerDownMin�� 0���� ����
		k38_vol = 1;						//k38_vol�� 1�� ����
		k38_channel = 1;					//k38_channel�� 1�� ����
		k38_info = "TV �⺻ ���� �Ϸ�";		//k38_info�� "TV �⺻ ���� �Ϸ�"�� ����
	}
	
	//3. ������ �����ε�
	p14_tvRemotecon2(int k38_volMax, int k38_volMin, int k38_chMax, int k38_chMin, int k38_volNow, int k38_chNow) {		//���ڸ� �޴� ������ ����
		k38_volUpMax = k38_volMax;		//k38_volUpMax�� k38_volMax�� ����
		k38_volDownMin = k38_volMin;	//k38_volDownMin�� k38_volMin���� ����
		k38_channelUpMax = k38_chMax;		//k38_channelUpMax�� k38_chMax���� ����
		k38_channerDownMin = k38_chMin;	//k38_channerDownMin�� k38_chMin���� ����
	    k38_vol = k38_volNow;			//k38_vol�� k38_volNow�� ����
	    k38_channel = k38_chNow;		//k38_channel�� k38_chNow�� ����
	    k38_info = "TV ���� ���� �Ϸ�";	//k38_info�� "TV ���� ���� �Ϸ�"�� ����
	}		
	
	//4. �������� �޼��� : ���ϰ� ����
	//������
	void k38_volUp() {
		if (k38_vol == k38_volUpMax) {	//���� ������ �ִ뺼���̸�
			k38_info = "�ִ� �����Դϴ�.";	//�ȳ���Ʈ�� "�ִ� �����Դϴ�"�� ����
		} else {	//���纼���� �ִ뺼���� �ƴϸ�
			k38_vol++;	//���� 1�� ����
			k38_info = String.format("���� ������ %d �Դϴ�.", k38_vol);	//���纼�� �ȳ���Ʈ�� ����
		}
	}

	//�����ٿ�
	void k38_volDown() {	
		if (k38_vol == k38_volDownMin) {		//���� ������ �ּҺ����̸�
			k38_info = "�ּ� �����Դϴ�.";		//�ȳ���Ʈ�� "�ּ� �����Դϴ�"�� ����
		} else {		//���纼���� �ּҺ����� �ƴϸ�
			k38_vol--;	//���� 1�� ����	
			k38_info = String.format("���� ������ %d �Դϴ�.", k38_vol);	//���纼�� �ȳ���Ʈ�� ����
		}
	}


	//5. ä�ΰ��� �޼��� : ���ϰ� ����
	//ä�ξ�
	void k38_channelUp() {
		if (k38_channel == k38_channelUpMax) {		//���� ä���� ������ä���̸�
			k38_info = "������ ä���Դϴ�.";		//�ȳ���Ʈ�� "������ ä���Դϴ�"�� ����
		} else {		//����ä���� ������ä���� �ƴϸ�
			k38_channel++;	//ä�� 1�� ����	
			k38_info = String.format("���� ä���� %d �Դϴ�.", k38_channel);	//����ä�� �ȳ���Ʈ�� ����
		}
	}

	//ä�δٿ�
	void k38_channelDown() {
		if (k38_channel == k38_channerDownMin) {		//���� ä���� ó��ä���̸�
			k38_info = "ó�� ä���Դϴ�.";		//�ȳ���Ʈ�� "ó�� ä���Դϴ�"�� ����
		} else {		//����ä���� ó��ä�� �ƴϸ�
			k38_channel--;	//ä�� 1�� ����	
			k38_info = String.format("���� ä���� %d �Դϴ�.", k38_channel);	//����ä�� �ȳ���Ʈ�� ����
		}
	}
	
	
	//6. �Է¹��� ����ŭ �� ����
	//�Է¹��� ����ŭ ������
	void k38_volUp (int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++)//0���� k38_u ������ �ݺ�
			this.k38_volUp();	//this�� ���� ��Ȯ
	}
	
	//�Է¹��� ����ŭ ���� �ٿ�
	void k38_volDown (int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++)//0���� k38_u ������ �ݺ�
			this.k38_volDown();	//this�� ���� ��Ȯ
	}
	
	//�Է¹��� ����ŭ ä�ξ�
	void k38_channelUp (int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++)//0���� k38_u ������ �ݺ�
			this.k38_channelUp();	//this�� ���� ��Ȯ
	}
	
	//�Է¹��� ����ŭ ä�� �ٿ�
	void k38_channelDown (int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++)//0���� k38_u ������ �ݺ�
			this.k38_channelDown();	//this�� ���� ��Ȯ
	}
	
	//7. ��Ȳ �ȳ����� ��� �޼���
	//�ִ� ����, �ּ� ����, ���纼�� �ȳ�
	void k38_volInfo (String k38_id) {
		System.out.printf("%s => [%s] �ִ뺼�� [%d] �ּҺ���[%d] ���纼��[%d]\n", k38_id, k38_info, k38_volUpMax , k38_volDownMin , k38_vol); 
	}
	////������ ä��, ó�� ä��, ���� ä�� �ȳ�
	void k38_chInfo (String k38_id) {
		System.out.printf("%s => [%s] ������ä�� [%d] ó��ä��[%d] ����ä��[%d]\n", k38_id, k38_info, k38_channelUpMax, k38_channerDownMin, k38_channel); 
	}
}