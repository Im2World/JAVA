package javaPro_lec06_self_ppt;
//��Ӱ� �������̵� _ �ڹٽ�ȭ 6�� ��16, �� 18
//p10_elevator3 Ŭ������ p08_elevator2Ŭ������ ��ӹ���.
//�θ�Ŭ���� p08_elevator2 �� �޼��带 �״�� ��밡��
//�ڹٴ� ���߻�� ������ �� Ŭ������ �ϳ��� Ŭ������ ��Ӱ���
//�θ�Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� �������� ����ϴ� ��.
//�޼ҵ带 �������̵� �ϸ�, �׻� �ڽ�Ŭ�������� ���ǵ� �޼ҵ尡 ȣ��

public class p16_elevator3 extends p13_elevator2{
	//��16
	void k38_Repair() {
		k38_info = String.format("�������Դϴ�.");		//�ش� ������ p08_elevator2�� public String k38_info �� ����
	}
	
	// ��18
	// �θ� Ŭ������ ��ӹ޾����ϱ� �޼��� ������ ���� => �θ�Ŭ���� �޼��� ���빫���ϰ� �ڽ�Ŭ�������� �������� �������� ����
	@Override
	void k38_up() {
		if (k38_floor >= k38_limitUpFloor) { // �θ� Ŭ������ k38_up ���뺯��
			k38_info = "���������Դϴ�."; // �ش� ������ p08_elevator2�� public String k38_info �� ����
		} else {
			k38_floor = k38_floor + 2; // �ֻ��� �ƴϸ� 2�� �ö�. => k38_floor += 2 �� ��ü�� ���� ����.
			k38_info = String.format("%d���Դϴ�.", k38_floor); // �ش� ������ p08_elevator2�� public String k38_info �� ����
		} ///////////////////////////////////////////////////

		// �Ʒ��� k38_down() �޼��� ����=> 1�� ������ printf�� �����ص� �޼��� ���
		// k38_down()�������� 2�� �ö󰡰� 1�� ������. => 1���� �ö�
		this.k38_down();
		super.k38_up();
	}
	
	
	void k38_down() {
		//�θ� Ŭ����(super) k38_down�޼��� ����
		super.k38_down();
		
		//Ŭ���� �ȿ��� �޼��� ��� Ȯ��
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n",this.k38_floor);
		//this.k38_down(); ���ȣ��� ������
	}
}	//class


/*
�Ʒ�ó�� �׳� �����ϸ� �������̵尡 �ȵȴ�. => Source - Override �� �������̵�(�θ�Ŭ���� �޼��� ������)
void k38_up() {	
	if(k38_floor >= k38_limitUpFloor) {	//�θ� Ŭ������ k38_up ���뺯��
		k38_info = "���������Դϴ�.";		//�ش� ������ p08_elevator2�� public String k38_info �� ����
	} else {
		k38_floor = k38_floor + 2;	//�ֻ��� �ƴϸ� 2�� �ö�. => k38_floor += 2 �� ��ü�� ���� ����.
		k38_info = String.format("%d���Դϴ�.", k38_floor);		//�ش� ������ p08_elevator2�� public String k38_info �� ����
	}
	
	//�Ʒ��� k38_down() �޼��� ����=> 1�� ������ printf�� �����ص� �޼��� ���
	//k38_down()�������� 2�� �ö󰡰� 1�� ������. => 1���� �ö�
	this.k38_down();
}
*/