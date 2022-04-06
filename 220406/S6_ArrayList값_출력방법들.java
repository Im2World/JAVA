package lecture0406_9��;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ArrayList �� �� �ϳ��� ������
public class S6_ArrayList��_��¹���� {

	public static void main(String[] args) {
		List <String> list = new ArrayList <String>();
		list.add("kim");
		list.add("lee");
		list.add("park");

		Iterator<String> iterator = list.iterator();
		
		//ArrayList�� ��¹����
		System.out.println("iterator : ");
		while(iterator.hasNext()) {	//.hasNext() : ��簪 ��ȯ
			System.out.println(iterator.next());   //�������� ������ �������� ��� ���
		}
		System.out.println("-----------------");
		
		//for each(Ÿ�� ������ : ����� list)
		System.out.println("for each : ");
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-----------------");
		System.out.println("for : ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
