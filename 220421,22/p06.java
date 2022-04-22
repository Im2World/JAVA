package javaPro_lec08_0421;
/*
<자바심화 8강 슬라이드 6>
Buffered읽고 쓰기
****readLine() : 같은 함수를 사용하여 한줄(\n)단위로 읽음****
해당 예시는 try-catch안하고 throws IOException으로 에러메시지 받음. 콘솔창에 에러만 뜨고 디버그에 에러 뜸.
코드는 편해지는데, 에러났을 때 정확하게 처리하기가 어려워짐.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class p06 {

	//메서드1 : 파일쓰기
	public static void k38_FileWrite() throws IOException {
		File k38_f = new File ("C:\\Users\\kopo\\Desktop\\p06MyTest.txt"); // 파일 저장 경로 지정 및 파일 생성
		
		//BufferedWriter: Buffer를 가지고 k38_f의 내용을 쓰게함
		//BufferedWriter의 경우, 버퍼가 있기때문에 반드시 flush()또는 close()로 닫아줘야함.
		BufferedWriter k38_bw = new BufferedWriter(new FileWriter(k38_f));

		//p06MyTest.txt파일에 내용작성
		k38_bw.write("안녕 파일");		//첫번째 줄에 "안녕 파일"이라는 텍스트 입력
		k38_bw.newLine(); 				//newLine() : 한 줄(\n) 생성 후 다음 줄로 넘어감
		k38_bw.write("hello 헬로");		//두번째 줄에"hello 헬로"라는 텍스트 입력
		k38_bw.newLine(); 				//newLine() : 한 줄(\n) 생성 후 다음 줄로 넘어감
		
		//BufferedWriter 닫기
		k38_bw.close();
	}
	
	//메서드2 : 파일읽기
	public static void k38_FileRead() throws IOException {
		File k38_f = new File ("C:\\Users\\kopo\\Desktop\\p06MyTest.txt"); // 파일 저장 경로 지정 및 파일 생성
		//BufferedReader : 한 줄 씩 읽어 들이는 readLine 메소드로 한 줄씩 읽기 가능 
		BufferedReader k38_br = new BufferedReader (new FileReader(k38_f));
		String k38_readtxt; //텍스트를 읽어줄 변수를 생성
		
		
		//버퍼리더로 해당 파일읽었는데 다음줄이 빈줄이면 while문 종료
		while ((k38_readtxt = k38_br.readLine()) != null) { 	//readLine()으로 한줄(\n)씩 읽고 readtxt에 저장
			System.out.printf("%s\n", k38_readtxt); 		//위에서 새 값들을 저장한 k38_readtxt을 한 줄씩 줄바꿈해서 출력
		}
		//버퍼리더 종료
		k38_br.close();
	}
	
	public static void main (String[] args) throws IOException {
		// 처리전 시간 획득
		long k38_start = System.currentTimeMillis();
		System.out.print("시작시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
		
		
		k38_FileWrite();	//메서드 호출
		k38_FileRead();		//메서드 호출
		
		
		// 처리후 시간 획득
		long k38_end = System.currentTimeMillis();
		System.out.print("종료 후 시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// 시간차이 출력_숫자입력까지 실제로 걸린시간
		System.out.println("소요시간 : " + (k38_end - k38_start) / 1000.0 + " seconds\n");
		
		
	}
}