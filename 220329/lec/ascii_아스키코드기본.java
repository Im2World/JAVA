package lecture0329;

public class ascii_�ƽ�Ű�ڵ�⺻ {
	public static void main(String[] args) {
		 //1.�ƽ�Ű�ڵ带 char�� ����ȯ�� char�迭�� ���
        char[] arr = new char[26];	//�迭 ũ��� ���ĺ�������ŭ 

        for(int i=0;i<arr.length;i++)	// �迭�� ���̸�ŭ i�� ����
        {    
            arr[i] = (char)(65+i); // ASCII Code�� char�� ����ȯ�Ͽ� �迭�� ���
        }
    
        //2.���
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
	}
}

//�ҹ��ڿ� �빮�� �ƽ�Ű�ڵ� ���̴� 32
//�빮�ڸ� �ҹ��ڷ� ������� -32
//�빮�� 65~90, �ҹ��� 97~122(a~z)