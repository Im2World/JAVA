package javaPro_lec04_0415_ppt;

//���������� �̷� ���α׷����� ����X
public class p10_�޷�_��������_case��_�ſ쳪�ۿ� {
	public static void main(String[] args) {
		
		//�� �� ��� : 1~12��    k38_i�� 1~12
		for(int k38_i = 1; k38_i < 13; k38_i++) {
			System.out.printf(" %d�� => ", k38_i);
			
			//LOOP!!!
			// k38_i�� 1~ 31 => �� �� ���� ǥ��
			LOOP:for(int k38_j = 1; k38_j < 32; k38_j++) {
				System.out.printf("%d,",k38_j);
				
				//for�� ��� switch�� ��� 
				switch(k38_i) {
				//k38_i�� 4 �Ǵ� 6�Ǵ� 9�Ǵ� 11�̸� k38_j�� 1���� 30���� ���
				case 4:case 6:case 9: case 11:
					if(k38_j == 30) break LOOP;
					//�̷�ǥ���� ���� ���Ѵ�.
					//LOOP��� ǥ���ڰ� ������ ������ ������
					//k38_j �� 30�̸� switch�� Ż�� �ؼ� LOOP�� ���ư�
					break;
					
				case 2:
					//k38_i�� 2�̸� k38_j�� 1���� 28���� ���
					if(k38_j == 28) break LOOP;	//22����LOOP���� �� 12���� LOOP�� �����ؼ� �ǵ��� ����.
					//k38_j �� 28�̸� switch�� Ż�� �ؼ� LOOP�� ���ư�
					break;
					
				//�̿��� ���̽��� 1,3,5,7,10,12���� 31�ϱ��� ���
				}
			}
			System.out.printf("\n");	//�ٹٲ�
		}
	}
}
