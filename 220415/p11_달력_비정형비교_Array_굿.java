package javaPro_lec04_0415_ppt;

//������ ��(���� �ָ���)�� �迭�� �̿��ϴ� �͵� �� ���.
//��, �迭�� 0���� �����Ѵ�. k38_lastMonthDate
public class p11_�޷�_��������_Array_�� {

	public static void main(String[] args) {
		//�迭 ���� �� �ʱ�ȭ
		int[] k38_lastMonthDate = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// �迭�� �ε����� 0���� ����!
		// k38_lastMonthDate[0] ~ k38_lastMonthDate[11]

		//�� ��� : 1~12��
		for (int k38_i = 1; k38_i < 13; k38_i++) {
			System.out.printf(" %d�� => ", k38_i);	//%d�� k38_i���� ����.
			
			//�� ��� : 1~31��
			for (int k38_j = 1; k38_j < 32; k38_j++) {
				System.out.printf("%d", k38_j);	//%d�� k38_j���� ����.
				//�� if�� ���п� �� ���� ������ ���ڴ� , �� ��������. ������ �Ǹ� System.out.printf(","); ���� �����ʰ� break
				if (k38_lastMonthDate[k38_i - 1] == k38_j)	//�迭 �ε����� 0���� �����ϴϱ� k38_i-1�� ��. �� ���� ���������� �� ã��.
					break;
				System.out.printf(",");	//���� ���̿� , ���
			}
			System.out.printf("\n");	//�� �ٲ�
		}
	}
}

/*
<1ȸ��>
k38_i = 1�� ��
k38_lastMonthDate[k38_i - 1] == k38_j => k38_lastMonthDate[1 - 1] => k38_lastMonthDate[0] = 31 => k38_lastMonthDate[0] == k38_j �϶� ���� => k38_j�� 31�̸� ����

<2ȸ��>
k38_i =2 �϶�
k38_lastMonthDate[k38_i - 1] == k38_j => k38_lastMonthDate[2 - 1] => k38_lastMonthDate[1] = 28 => k38_lastMonthDate[1] == k38_j �϶� ���� => k38_j�� 28�̸� ����

...

k38_i = 12���� �ݺ�
 */
