package lecture0329;

import java.util.Scanner;

public class p15_¹æÁ¤½Ä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operation = sc.next();
		String str1, str2, selectOper = "", oper = "+-*/%";
		String[] operArr = oper.split("");
		float num1 = 0f, num2 = 0f, result = 0f;
		int cut1;

		for (int i = 0; i < operArr.length; i++) {
			if (operation.contains(operArr[i])) {
				cut1 = operation.lastIndexOf(operArr[i]);
				str1 = operation.substring(0, cut1);
				str2 = operation.substring(cut1 + 1);
				num1 = Float.valueOf(str1);
				num2 = Float.valueOf(str2);
				selectOper = operArr[i];
				break;
			}
		}

		if (selectOper.equals("+")) {
			result = num1 + num2;
		} else if (selectOper.equals("-")) {
			result = num1 - num2;
		} else if (selectOper.equals("*")) {
			result = num1 * num2;
		} else if (selectOper.equals("/")) {
			result = num1 / num2;
		} else if (selectOper.equals("%")) {
			result = num1 % num2;
		}

		System.out.println(result);
	}

}
