package javaPro_lec06_self_ppt;
//�ڹٽ�ȭ 6��_��7
//Ŭ����, ��ü, �ν��Ͻ�
//�޼���� �����ص� Ŭ����

public class p07_1_elevator {

		int k38_limitUpFloor = 10; 	//�ֻ��� ��
		int k38_limitDownFloor = 0; 	//��������
		int k38_floor = 1;	//���� �� => ��� ���ϰ� �ȴ�.
		String k38_help;	//�ȳ����� ���� ���ڿ� ����
		
		//���������� ��� �޼��� : ���ϰ� ����
		void k38_up() {
			if (k38_floor == k38_limitUpFloor) {	//�������� �ֻ����̸�
				k38_help = "������ �� �Դϴ�.";	//�������� �ȳ���Ʈ�� ����
			} else {
				k38_floor++;	//�ֻ��� �ƴϸ� �� ���� �ø�.
				//String.format : ���ϵǴ� ���ڿ� ���������ϴ� �޼���
				k38_help = String.format("%d���Դϴ�.", k38_floor);	//k38_help�� ������ �ȳ���Ʈ�� ����	
			}
		}
		
		//���������� �ϰ� �޼���  : ���ϰ� ����
		void k38_down() {
			if (k38_floor == k38_limitDownFloor) {	//�������� �������̸�
				k38_help = "ó�� �� �Դϴ�.";	//ó���� �ȳ���Ʈ�� ����
			} else {
				k38_floor--;	//������ �ƴϸ� �� ���� ������.
				k38_help = String.format("%d���Դϴ�.", k38_floor);	//k38_help�� ������ �ȳ���Ʈ�� ����	
			}		
		}
	}
