package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6�� _ �����̵�13
//������ Ȱ��
//������ : Ŭ������� ���� �̸��� �޼��� => ���� ���� ȣ��ȴ�.
//�����ڵ� �����ε�(�Ű������ٸ��� �޴°�) ����

public class p13_elevator2 {
	//1. ��꿡 �ʿ��� ������ ����
	//private ������ �ش� Ŭ���� �������� ��밡��
	//=> p10_elevator3 �ǽ����� public ����
	public int k38_limitUpFloor;	//������ ���� ����, �ְ���
	public int k38_limitDownFloor;	//������ ���� ����, ������
	public int k38_floor;	//������ ���� ����, ������
	public String k38_info;	//���ڿ��� ���� ����, �ȳ��޽���

	//2. ������ ����
	p13_elevator2() {
		k38_limitUpFloor = 10;	//�ְ����� 10���� ����
		k38_limitDownFloor = 1;	//�������� 1�� ����
		k38_floor = 1;	//�������� 1�� ����
		k38_info = "���������� �⺻ �ذ��Ϸ�";	//�ȳ��޽��� ����
	}
	
	//3. ������ �����ε�
	//������ ������ 3�� �޴´�.
	p13_elevator2(int k38_up_floor, int k38_d_floor, int k38_in_floor) {
		k38_limitUpFloor = k38_up_floor;	//�ְ������� k38_up_floor ����
		k38_limitDownFloor = k38_d_floor;	//���������� k38_d_floor ����
		k38_floor = k38_in_floor;	//���������� k38_in_floor ����
		k38_info = "���������� ���� �ذ��Ϸ�";	//�ȳ��޽��� ����
	}
	
	//4.�޼��� ����
	//���� ��� �޼���
	void k38_up() {
		if (k38_floor == k38_limitUpFloor) {	//�������� �ְ����̶��
			k38_info = "������ ���Դϴ�.";	//�ش� �޽����� ����
		} else {	//�ְ����� �ƴ϶��
			k38_floor++;	//1�� �ø���
			k38_info = String.format("[%d] ���Դϴ�.", k38_floor);	//������ �޽����� ����
				//k38_floor�� �������̶� %d ���
		}
	}
	
	//���� �ϰ� �޼���
	void k38_down() {
		if (k38_floor == k38_limitDownFloor) {	//�������� �������̶��
			k38_info = "ó�� ���Դϴ�.";	//�ش� �޽����� ����
		} else {	//�������� �ƴ϶��
			k38_floor--;	//1�� ����
			k38_info = String.format("[%d] ���Դϴ�.", k38_floor);	//������ �޽����� ����
		}
	}
	
	//���� ������ ��� �޼���
	//������ ������ �� ����ŭ ��� =>  k38_i�� 0���� �����̶� k38_i < k38_u
	//this���� ��Ȯ
	void k38_up(int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++) this.k38_up();
	}

	//���� ������ �ϰ� �޼���
	//������ ������ �� ����ŭ �ϰ� =>  k38_i�� 0���� �����̶� k38_i < k38_u => ex) k38_u = 5 => 0~4���� 5ȸ �ݺ�
	//this�Ƚẽ
	void k38_down(int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++) k38_down();
	}

	//�����ȳ� �޼���
	//�Է¹��� k38_id �� ��������ϰ�, �ִ�, �ּ�, ������ ������ ���
	//���ڿ��� %s, �������� %d�� �Է¹���
	void k38_msg(String k38_id) {
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", k38_id, k38_info, k38_limitUpFloor, k38_limitDownFloor, k38_floor);
	}

}