package lecture0406_9��;

import java.util.HashSet;

public class S4_HashSet_�ߺ������ {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("kim");	//[kim]
		System.out.println(name);
		name.add("lee");	//[lee,kim] => set�� add�ϸ� ���ʿ������� �߰��ȴ�.
		System.out.println(name);
		name.add("kim");	//�ߺ�������̶� ������ kim�� �߰����� �ʴ´�.
		System.out.println(name);
		
		//���� ���
		System.out.println(name.size());	//
	}
}
