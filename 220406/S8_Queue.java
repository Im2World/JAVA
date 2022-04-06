package lecture0406_9강;

import java.util.LinkedList;
import java.util.Queue;

public class S8_Queue {

	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();
		name.offer("Kim"); // Queue에 인자추가 .offer
		System.out.println(name);
		name.offer("lee");
		System.out.println(name); // [Kim, lee]

		System.out.println(name.poll()); // Queue 의 가장 첫번째 요소 빼냄 // Kim
		System.out.println(name); // kim 나갔으니까 name에 [lee] 만 남음
		System.out.println(name.poll()); // lee도 빼냄.
		System.out.println(name); // 아무것도 안남음.
	}
}
