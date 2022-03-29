package lecture0329;

public class 문자자르기 {
	public static void main(String[] args) {
		String line = "heLLO";
		char[] chars = line.toCharArray(); //heLLO글자수 만큼 list에 담음
		for (int i = 0; i < 5; i++) { //heLLO글자수 만큼 list에 담음
			System.out.println(chars[i]);
		}
	}
}