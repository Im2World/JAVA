package lecture0329;
//
public class StringClass_lenth_charAT_char배열 {
	public static void main(String[] args) {
		String text = "Hello,hi,";
		System.out.println(text);	//문자그대로 출력
		System.out.println(text.length());	//문자열길이 출력. 1~ 
		System.out.println(text.charAt(2));
			//charAt메서드_ 문자열에서 지정한 인덱스 출력.
			//charAt(5)는 쉼표. 길이는9 ,인덱스는0~8
		
		char[] c = text.toCharArray(); //Hello,hi,를 text에 하나씩 넣어라.
		System.out.println(c[0]);	//소문자h가 인덱스6
		
		System.out.println(text.replace("H", "h"));	//before, after
		
		String[] t = text.split(",");	//,를 기준으로 구분해서 넣어라.
		System.out.println(t[0]);	
		System.out.println(t[1]);		
		System.out.println(t[2]);	//,기준으로 2개만 나오기 때문에 인덱스012 세번째는 없음. 에러뜸	
	}
}
