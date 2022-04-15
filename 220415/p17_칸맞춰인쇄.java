package javaPro_lec04_0415_ppt;

import java.text.DecimalFormat;

//ĭ ���߱� �ǽ�
public class p17_ĭ�����μ� {

	public static void main(String[] args) {
		
		//��������
		String k38_item = "���";	//������, ��ǰ��
		int k38_unit_price = 5000;		//������, ����
		int k38_num = 500;	//������, ����
		int k38_total = 0;	//������, �հ�� ����� ����
		
		//DecimalFormat ������� ���ڸ� , �� �����ؼ� ��°���
		DecimalFormat k38_df = new DecimalFormat("###,###,###,###,###");
		
		//���Header ��� : DecimalFormat�� ��� ���� %s�� �޾ƾ��Ѵ�.
		//ǰ��, �ܰ�, ����, �հ踦 �������ķ� ��20,8,8,8 ũ�� ����
		//�� �׸��� 20��, 8��, 8��, 8�� ���� ��°���
		System.out.printf("=========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","ǰ��","�ܰ�","����","�հ�");		
		System.out.printf("=========================================================\n");
		
		//�� ��� : DecimalFormat�� ��� ���� %s�� �޾ƾ��Ѵ�.
		//item, k38_unit_price, k38_num, k38_total�� �������ķ� �� 20, 10, 10, 10 ũ�� ����
		//�� �׸��� 20,10,10,10 �� ���� ��°���
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",k38_item, k38_df.format(k38_unit_price), k38_df.format(k38_num), k38_df.format(k38_unit_price*k38_num));			
		System.out.printf("=========================================================\n");		
	}
}

/*
printf ��¼���
%����s : �������� => �ش� ���� �տ� ���ڸ�ŭ ���� Ȯ��
%����1.����2s : ����1��ŭ ���ڰ���Ȯ��, �޸� �� ����2��ŭ�� ���ڰ��� ��� 
	ex) System.out.printf("%20.20s","ǰ��") : ���� ���� 20ĭ Ȯ��, "ǰ��"�̶�� �������� 20�� ��°���
*/