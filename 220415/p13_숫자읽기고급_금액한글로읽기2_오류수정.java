package javaPro_lec04_0415_ppt;

import java.util.Arrays;

//��23
//�Ͻʾ︸ �̶�� 0���� ��µǴ� ���� ����
//numVal�� String���� �ٲٴ� ���� : length�� �ľ��ϱ�����.
//Integer.parseInt �� String�� Integer�� �ٲٴ� ���� : k38_units �迭���� �ش� ���� �ҷ���������(�����̻��...)
//�Էµ� ���ڸ� �����ڸ�, �����ڸ� ,�����ڸ�... �ʾ��ڸ����� �а� �ѱ۷� ���
public class p13_�����б���_�ݾ��ѱ۷��б�2_�������� {

	public static void main(String[] args) {	
		//***********�ٽɺ�************
		//�ѱ� ���� �迭����
		String [] k38_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		
		//***********�ٽɺ�************
		//�ڿ������� ������ �Ųٷ� ���� �Է� : ��,��,õ,��,�ʸ�,�鸸,õ��,��,�ʾ�
		//0�� ���� ���� ����,���� ��� ����
		//�ʾ���� ī��Ʈ ����
		String [] k38_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		
		//�迭 ���
		System.out.printf("String [] k38_units : ");
		System.out.printf("%s \n",Arrays.toString(k38_units));
		System.out.printf("String [] k38_unitX : ");
		System.out.printf("%s \n\n",Arrays.toString(k38_unitX));		
		
		///////////////////////////////////////////////////////////////////////
		//�ѱ۷� ǥ���� ���� ����
		int k38_numVal = 1001034567;
		//int k38_numVal = 2030200000;		//2030200000[�̽ʾ��õ�̽ʸ�]
		
		//�Էµ� ���� ���� �ľ�
		String k38_sNumVal = String.valueOf(k38_numVal);   // String.valuOf(int) : int�� numVal�� String���� ��ȯ�Ѵ�.
		String k38_sNumVoice = ""; 	//��, ���⿡ �ѱ۷� ���ڸ� ���� ���� ��� ������ ���̴�.
		System.out.printf("==> %s [%d�ڸ�]\n", k38_sNumVal, k38_sNumVal.length());	//��°�� : [10�ڸ�]
		
		
		////////////////////��� �� ���////////////////////
		//k38_i, k38_j������ while�� �ݺ��� ���� ����
		int k38_i, k38_j;
		k38_i = 0;	//0���� �� �ʱ�ȭ
		k38_j = k38_sNumVal.length()-1;	//.length()�� 1���� ũ�⸦ ����=> �ε����� 0���� ���� => .length -1 �ϸ� ������ �ε�����ȣ�� �ȴ�.
		
		
		//���ǽ��� ���� �� ���� �ݺ�
		while (true) {
			//k38_i�� �Էµ� ���� ���� �̻�Ǹ� �ݺ�����
			//k38_i = k38_sNumVal.length() �� k38_sNumVal�� �ε���+1�̶� outOfIndex��.
			if (k38_i >= k38_sNumVal.length()) break;
			//if (k38_j < 0) break;         //k38_i�� �������, k38_j�� ��� ����=> k38_i�� �ε����� ���� �����̰�, k38_j�� i�� ���� �����̴ϱ� k38_j�� 0���� �۾����� �ߴ��ص� ��.
			
			//substring(int beginIndex, int endIndex) : �����ε������� �߷��ε��� �ձ����� ����
			//k38_sNumVal.substring(k38_i, k38_i+1) : �ش� �ε��� ���� ����Ѵ�.
			//Integer.parseInt(String s) : ������ ���ڿ��� ���ڰ����� ������ �ش� ���� 10���� Integer�� ��ȯ
			//printf�ϱ� �ٹٲ޾��� ������ ��� �̾ ��� : ����) 1[��]0[��]0[��]1[��]0[��]3[��]4[��]5[��]6[��]7[ĥ]
			System.out.printf("%s[%s]", k38_sNumVal.substring(k38_i, k38_i+1), k38_units[Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1))] );
			
			//***********�ٽɺ�************
			//�ش� �ڸ� ���ڰ� 0�̸� if�� ����. �ƴ϶�� else�� ����
			if(k38_sNumVal.substring(k38_i, k38_i+1).equals("0")) {
				//�ش��ڸ��� 0�� �� �������� �Ⱥ��̴µ�, ��, �� �ڸ��� ���δ�.
				//�̹� �縸 �̽�.. �̹� ����..
				
				//�ش� �ڸ� ���ڰ� 0�̰� �ѱ��� '��' �Ǵ� '��'�̸� k38_sNumVoice�� [k38_sNumVoice + �� + �ѱ۴���] ����
				//��, �ѱ۴����� �߰��Է��Ѵ�. (=�ش��ڸ��� 0�̸� ������ �ٿ���)
				if(k38_unitX[k38_j].equals("��") || k38_unitX[k38_j].equals("��")) {
					k38_sNumVoice = k38_sNumVoice + "" + k38_unitX[k38_j];
					
					// �� ~ õ�� (��, �迭���� õ��~��) �� ��� 0�̸� �ѱ۴������� �� ����, �̽ʾ︸ ��������
					//substring(length() - 8, length() - 4) => �ε��� 2 ~ 5 �� ���� = õ�� ~ �� ������ �ش��ϴ� ����
					//�� ������ 0000�̸�
					if(k38_sNumVal.substring(k38_sNumVal.length()-8,k38_sNumVal.length()-4).equals("0000")) {
						k38_sNumVoice = k38_sNumVoice.replace("��", "");	//"��"�̶�� ���ڸ� �������� ����
						}
					}
					
				//�ش� �ڸ� ���ڰ� 0�̰� �ѱ��� '��' �̿��� ���̸� �����ü�� ���Ѵ�. 	
				else {
				}
			} //���� 61 if
			
			//�ش� �ڸ� ���ڰ� 0�� �ƴϸ�
			//�ε��� 0�� ���� k38_sNumVoice�� ""���´�.
			//k38_unitX[k38_j] �� �Էµ� ������ ������ �ε������� �д´�.
			//Integer.parseInt : String�� Integer ���ڿ��� ����
			else {
				k38_sNumVoice = k38_sNumVoice + k38_units[Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1))] + k38_unitX[k38_j];
			}
			k38_i++; k38_j--;	//k38_i�� 1�ݺ������� 1�� ����, k38_j�� 1�ݺ������� 1�� ����

		} //while
		
		
		//���ڸ� �ѱ۷� ���� ��� ��� : ���ڰ�, �ѱ۷� ���� ��
		//printf�ϱ� �ٹٲ޾��� ������ ��� �̾ ��� : 1001034567[�Ͻʾ��Ϲ�︸��õ��������ĥ]
		System.out.printf("\n %s[%s]\n", k38_sNumVal, k38_sNumVoice);
		
	} //main
} //class

/*
			else {
				k38_sNumVoice = k38_sNumVoice + k38_units[Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1))] + k38_unitX[k38_j];
			}
			k38_i++; k38_j--;
			�ش� �ڸ� ���ڰ� 0�� �ƴϸ� else�� ����
			
			int k38_numVal = 1001034567 �̶��, 
			
			<1ȸ��>
			k38_i = 0, k38_j = 9 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 1
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(1) => String 1 �� ���� Integer 1 �� ��� => k38_units[1] => ��
			k38_unitX[k38_j] = k38_unitX[9] = ��
			k38_sNumVocie = �Ͻ�
			k38_i++, k38_j-- => k38_i = 1, k38_j = 8
			
			<2ȸ��>
			k38_i = 1, k38_j = 8 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 0
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(0) => String 0 �� ���� Integer 0 ���� ��� => k38_units[0] => ��
			k38_unitX[k38_j] = k38_unitX[8] = ��
			k38_sNumVocie = ����????  => No!
			*** k38_sNumVal.substring(k38_i, k38_i+1)�� 0�̰� �ѱ��� "��"�Ǵ� "��"�̸� k38_sNumVoice�� [k38_sNumVoice + �� + �ѱ۴���] ����
			=> k38_sNumVoice = �Ͻʾ�
			k38_i++, k38_j-- => k38_i = 2, k38_j = 7			
			
			<3ȸ��>
			k38_i = 2, k38_j = 7 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 0
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(0) => String 0 �� ���� Integer 0 ���� ��� => k38_units[0] => ��
			k38_unitX[k38_j] = k38_unitX[7] = õ
			k38_sNumVocie = ��õ????  => No!
			*** k38_sNumVal.substring(k38_i, k38_i+1)�� 0�̰� �ѱ��� "��"�Ǵ� "��"�̸� k38_sNumVoice�� [k38_sNumVoice + �� + �ѱ۴���] ����
			*k38_sNumVal.substring(k38_i, k38_i+1)�� 0������, �ѱ� ������ "õ"�̶� ��¾��Ѵ�.
			sNumVocie = �Ͻʾ�
			k38_i++, k38_j-- => k38_i = 3, k38_j = 6
			
			<4ȸ��>
			k38_i = 3, k38_j = 6 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 1
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(1) => String 1 �� ���� Integer 1 �� ��� => k38_units[1] => ��
			k38_unitX[k38_j] = k38_unitX[6] = ��
			k38_sNumVocie = �Ͻʾ�+�Ϲ� = �Ͻʾ��Ϲ�
			k38_i++, k38_j-- => k38_i = 4, k38_j = 5
			
			<5ȸ��>
			k38_i = 4, k38_j = 5 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 0
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(0) => String 0 �� ���� Integer 0 ���� ��� => k38_units[0] => ��
			*** k38_sNumVal.substring(k38_i, k38_i+1)�� 0�̰� �ѱ��� "��"�Ǵ� "��"�̸� k38_sNumVoice�� [k38_sNumVoice + �� + �ѱ۴���] ����
			*** k38_sNumVal.substring(k38_i, k38_i+1)�� 0������, �ѱ� ������ "��"�̶� ��¾��Ѵ�.			
			k38_unitX[j] = k38_unitX[5] = ��
			k38_sNumVocie = �Ͻʾ��Ϲ�
			k38_i++, k38_j-- => k38_i = 5, k38_j = 4			
			
			<6ȸ��>
			k38_i = 5, k38_j = 4 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 3
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(3) => String 3 �� ���� Integer 3 �� ��� => k38_units[3] => ��
			k38_unitX[k38_j] = k38_unitX[4] = ��
			k38_sNumVocie = �Ͻʾ��Ϲ�+�︸ = �Ͻʾ��Ϲ�︸
			k38_i++, k38_j-- => k38_i = 6, k38_j = 3			
			
			<7ȸ��>
			k38_i = 6, k38_j = 3 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 4
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(4) => String 4 �� ���� Integer 4 �� ��� => k38_units[4] => ��
			k38_unitX[k38_j] = k38_unitX[3] = õ
			k38_sNumVocie = �Ͻʾ��Ϲ�︸ + ��õ = �Ͻʾ��Ϲ�︸��õ
			k38_i++, k38_j-- => k38_i = 7, k38_j = 2			
			
			<8ȸ��>
			k38_i = 7, k38_j = 2 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 5
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(5) => String 5 �� ���� Integer 5 �� ��� => k38_units[5] => ��
			k38_unitX[k38_j] = k38_unitX[2] = ��
			k38_sNumVocie = �Ͻʾ��Ϲ�︸��õ + ���� = �Ͻʾ��Ϲ�︸��õ����
			k38_i++, k38_j-- => k38_i = 8, k38_j = 1				
			
			<9ȸ��>
			k38_i = 8, k38_j = 1 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 6
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(6) => String 6 �� ���� Integer 6 �� ��� => k38_units[6] => ��
			k38_unitX[k38_j] = k38_unitX[1] = ��
			k38_sNumVocie = �Ͻʾ��Ϲ�︸��õ���� + ���� = �Ͻʾ��Ϲ�︸��õ��������
			k38_i++, k38_j-- => k38_i = 9, k38_j = 0		
			
			<10ȸ��>
			k38_i = 9, k38_j = 0 �϶�
			k38_sNumVal.substring(k38_i, k38_i+1) = 7
			Integer.parseInt(k38_sNumVal.substring(k38_i, k38_i+1)) = Integer.parseInt(7) => String 7 �� ���� Integer 7 �� ��� => k38_units[7] => ĥ
			k38_unitX[k38_j] = k38_unitX[0] = ""
			k38_sNumVocie = �Ͻʾ��Ϲ�︸��õ�������� + ĥ = �Ͻʾ��Ϲ�︸��õ��������ĥ
			k38_i++, k38_j-- => k38_i = 10, k38_j = -1	
			if (k38_i >= k38_sNumVal.length()) break; �� while�� ����
			
			while�� ���� �� �Է¹��� ����+�ѱ۹������
			System.out.printf("\n %s[%s]\n", k38_sNumVal, k38_sNumVoice);
			
			///////////�� �ڵ��� �ٽɺ�//////////
			���ڰ��� ���ڰ�, �ڸ����� ���ڴ����� ��ȯ�ϴ� �迭�� �ε����� ���� 0���� ������ ��.
			String [] k38_units : [��, ��, ��, ��, ��, ��, ��, ĥ, ��, ��] 	
			String [] k38_unitX : [, ��, ��, õ, ��, ��, ��, õ, ��, ��]
 */
