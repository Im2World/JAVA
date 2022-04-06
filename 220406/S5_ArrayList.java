package lecture0406_9��;

import java.util.ArrayList;
import java.util.Collections;

public class S5_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");

		System.out.println(name); // ���: [kim, lee, john]
		System.out.println(name.size()); // name�� ũ��(����) ��� => 3
		System.out.println(name.get(2)); // name�� �ε���2�� ���� �����´�. => john

		name.remove(1); // name�� �ε���1�� ����
		System.out.println(name); // ��� [kim, john]

		// ArrayList name�� �ε��� 1�� ���� park���� replace
		name.set(1, "park");
		System.out.println(name); // ��� [kim, park]
		System.out.println(name.size()); // ��� : 2

		name.add("lee");
		System.out.println(name); // ��� [kim, park, lee]

		// ArrayList name�� ������������ �ڵ� ����
		Collections.sort(name); // ��� [kim, lee, park]
		System.out.println(name);

		// ArrayList name�� ������������ �ڵ� ����
		Collections.reverse(name); // ��� [park, lee, kim]
		System.out.println(name);
	}
}
