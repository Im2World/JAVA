package lecture0406_9��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Ư����_���� {
//�ε����ƴϰ� Ư���� ��ü�� ����
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 4, 3, 2, 1, 1));
		// value�� 1�� element ����
		list.remove(Integer.valueOf(5));
		System.out.println(list); // [4, 3, 2, 1, 1]
	}
}
