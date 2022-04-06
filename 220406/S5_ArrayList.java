package lecture0406_9강;

import java.util.ArrayList;
import java.util.Collections;

public class S5_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");

		System.out.println(name); // 출력: [kim, lee, john]
		System.out.println(name.size()); // name의 크기(길이) 출력 => 3
		System.out.println(name.get(2)); // name의 인덱스2번 값을 가져온다. => john

		name.remove(1); // name의 인덱스1번 제거
		System.out.println(name); // 출력 [kim, john]

		// ArrayList name의 인덱스 1의 값을 park으로 replace
		name.set(1, "park");
		System.out.println(name); // 출력 [kim, park]
		System.out.println(name.size()); // 출력 : 2

		name.add("lee");
		System.out.println(name); // 출력 [kim, park, lee]

		// ArrayList name을 오름차순으로 자동 정렬
		Collections.sort(name); // 출력 [kim, lee, park]
		System.out.println(name);

		// ArrayList name을 오름차순으로 자동 정렬
		Collections.reverse(name); // 출력 [park, lee, kim]
		System.out.println(name);
	}
}
