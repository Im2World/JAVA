package lecture0406_9��;

import java.util.LinkedList;
import java.util.Queue;

public class S8_Queue {

	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();
		name.offer("Kim"); // Queue�� �����߰� .offer
		System.out.println(name);
		name.offer("lee");
		System.out.println(name); // [Kim, lee]

		System.out.println(name.poll()); // Queue �� ���� ù��° ��� ���� // Kim
		System.out.println(name); // kim �������ϱ� name�� [lee] �� ����
		System.out.println(name.poll()); // lee�� ����.
		System.out.println(name); // �ƹ��͵� �ȳ���.
	}
}
