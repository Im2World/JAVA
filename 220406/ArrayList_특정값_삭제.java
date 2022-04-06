package lecture0406_9강;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_특정값_삭제 {
//인덱스아니고 특정값 자체를 삭제
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 4, 3, 2, 1, 1));
		// value가 1인 element 삭제
		list.remove(Integer.valueOf(5));
		System.out.println(list); // [4, 3, 2, 1, 1]
	}
}
