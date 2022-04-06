package lecture0406_9°­;

import java.util.Stack;

public class S9_Stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("kim");
		System.out.println(stack);	//[kim]

		stack.add("lee");
		System.out.println(stack);	//[kim, lee]
		
		System.out.println(stack.pop());	//lee
		System.out.println(stack);	//[kim]
	}
}
