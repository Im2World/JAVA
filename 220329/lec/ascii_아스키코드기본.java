package lecture0329;

public class ascii_아스키코드기본 {
	public static void main(String[] args) {
		 //1.아스키코드를 char로 형변환해 char배열에 담기
        char[] arr = new char[26];	//배열 크기는 알파벳개수만큼 

        for(int i=0;i<arr.length;i++)	// 배열의 길이만큼 i값 증가
        {    
            arr[i] = (char)(65+i); // ASCII Code를 char로 형변환하여 배열에 담기
        }
    
        //2.출력
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
	}
}

//소문자와 대문자 아스키코드 차이는 32
//대문자를 소문자로 만들려면 -32
//대문자 65~90, 소문자 97~122(a~z)