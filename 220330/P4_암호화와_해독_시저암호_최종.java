package lecture0330;

import java.util.Scanner;
//�ҹ��ڿ� �빮�� �ƽ�Ű�ڵ� ���̴� 32
//�빮�ڸ� �ҹ��ڷ� ������� -32
//�빮�� 65~90, �ҹ��� 97~122

public class P4_��ȣȭ��_�ص�_������ȣ_���� {
//�ڽŸ��� ��ȣȭ��� �����
//���ĺ� �ڷ� 3��ŭ �б�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	}	//main
	
	public String solution(String s, int n) {	//�Լ�����
        String str = "";
	    int[] c = new int[s.length()];
	    int ascii = 26 - n; //z+1 = a�� �Ƿ��� 26(���ĺ�����)�� ���ָ� �ȴ�.
	          
	    for(int i = 0; i < s.length(); i++) {
	    	c[i] = (int)s.charAt(i); // �ƽ�Ű �ڵ带 ���ڷ� �ٲ� ��.
	    	 //charAt() : ���ڿ��� �ش� �ε����� ����
	    	
	    	if(c[i] + n > 122) { // �ҹ���
	    		c[i] -=  ascii ;
	    	}else if(c[i] + n > 90){ // �빮��
	    		if(c[i] > 96) {
	    			c[i] += n;
	    		}else {
	    			c[i] -=  ascii;
		    	}
	    	}else if(c[i] == 32) {	//��ĭ
	    		c[i] = 32;
	        } else { 
	    		c[i] += n;
	    	}
	    	str += (char)c[i]; 
	     }
	     return str;
    }
	
	
	
}	//class
