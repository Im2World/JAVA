package lecture0329;
//
public class StringClass_lenth_charAT_char�迭 {
	public static void main(String[] args) {
		String text = "Hello,hi,";
		System.out.println(text);	//���ڱ״�� ���
		System.out.println(text.length());	//���ڿ����� ���. 1~ 
		System.out.println(text.charAt(2));
			//charAt�޼���_ ���ڿ����� ������ �ε��� ���.
			//charAt(5)�� ��ǥ. ���̴�9 ,�ε�����0~8
		
		char[] c = text.toCharArray(); //Hello,hi,�� text�� �ϳ��� �־��.
		System.out.println(c[0]);	//�ҹ���h�� �ε���6
		
		System.out.println(text.replace("H", "h"));	//before, after
		
		String[] t = text.split(",");	//,�� �������� �����ؼ� �־��.
		System.out.println(t[0]);	
		System.out.println(t[1]);		
		System.out.println(t[2]);	//,�������� 2���� ������ ������ �ε���012 ����°�� ����. ������	
	}
}
