package javaPro_lec04_0415_ppt;
//���� �� �� ã��
public class p06_������_�־�_�� {

	public static void main(String[] args) {
		int k38_val;	//int�� ��������
		
		//k38_i�� 0���� 299����, 1�� ����
		for(int k38_i = 0; k38_i < 300; k38_i++) {
			
			//���� ����
			//0���� 1499���� 5�� ����鸸 ��µȴ�.
			//k38_i�� 0~ 299�� 0*5 < k38_val < 299*5
			k38_val = 5 * k38_i;
			
			//0�̻� 10�̸� = "��"�� �� ���
			if(k38_val >= 0 && k38_val < 10) System.out.printf("�� %d\n", k38_val);		//%d�� int k38_val ����
			
			//10�̻� 100�̸� = "��"�� �� ���
			else if (k38_val >= 10 && k38_val < 100) System.out.printf("�� %d\n", k38_val);		//%d�� int k38_val ����
			
			//100�̻� 1000�̸� = "��"�� �� ���
			else if (k38_val >= 100 && k38_val < 1000) System.out.printf("�� %d\n", k38_val);		//%d�� int k38_val ����
			
			//�� �� (= 1000�̻�) = "õ"�� �� ���
			else System.out.printf("õ %d\n", k38_val);		//%d�� int k38_val ����
		} //for
	} //main
}

/*
0~9 : ��
10~99 : ��
100~999 : ��
1000~9999 : õ
*/