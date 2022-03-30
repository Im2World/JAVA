package lecture0330;

import java.util.Scanner;
//소문자와 대문자 아스키코드 차이는 32
//대문자를 소문자로 만들려면 -32
//대문자 65~90, 소문자 97~122

public class P4_암호화와_해독_시저암호_최종 {
//자신만의 암호화방식 만들기
//알파벳 뒤로 3만큼 밀기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	}	//main
	
	public String solution(String s, int n) {	//함수선언
        String str = "";
	    int[] c = new int[s.length()];
	    int ascii = 26 - n; //z+1 = a가 되려면 26(알파벳개수)을 빼주면 된다.
	          
	    for(int i = 0; i < s.length(); i++) {
	    	c[i] = (int)s.charAt(i); // 아스키 코드를 숫자로 바꾼 값.
	    	 //charAt() : 문자열의 해당 인덱스값 리턴
	    	
	    	if(c[i] + n > 122) { // 소문자
	    		c[i] -=  ascii ;
	    	}else if(c[i] + n > 90){ // 대문자
	    		if(c[i] > 96) {
	    			c[i] += n;
	    		}else {
	    			c[i] -=  ascii;
		    	}
	    	}else if(c[i] == 32) {	//빈칸
	    		c[i] = 32;
	        } else { 
	    		c[i] += n;
	    	}
	    	str += (char)c[i]; 
	     }
	     return str;
    }
	
	
	
}	//class
