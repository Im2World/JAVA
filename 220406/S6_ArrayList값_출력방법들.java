package lecture0406_9강;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ArrayList 의 값 하나씩 꺼내기
public class S6_ArrayList값_출력방법들 {

	public static void main(String[] args) {
		List <String> list = new ArrayList <String>();
		list.add("kim");
		list.add("lee");
		list.add("park");

		Iterator<String> iterator = list.iterator();
		
		//ArrayList값 출력방법들
		System.out.println("iterator : ");
		while(iterator.hasNext()) {	//.hasNext() : 모든값 반환
			System.out.println(iterator.next());   //다음값이 있으면 다음값도 계속 출력
		}
		System.out.println("-----------------");
		
		//for each(타입 변수명 : 출력할 list)
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
