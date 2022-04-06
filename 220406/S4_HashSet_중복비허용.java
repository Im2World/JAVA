package lecture0406_9강;

import java.util.HashSet;

public class S4_HashSet_중복비허용 {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("kim");	//[kim]
		System.out.println(name);
		name.add("lee");	//[lee,kim] => set은 add하면 왼쪽에서부터 추가된다.
		System.out.println(name);
		name.add("kim");	//중복비허용이라 마지막 kim은 추가되지 않는다.
		System.out.println(name);
		
		//길이 출력
		System.out.println(name.size());	//
	}
}
