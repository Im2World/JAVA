package javaPro_lec08_0421;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//자바심화 8강 _ 슬라이드5
//무식하게 읽고 쓰기
//버퍼 없이 char[N]개 배열잡아 읽기
//자바의 exception처리 (try {}catch(e){} 구문 )
//파일이 없다든지, 하드디스크 쓰기권한이 없다든지
//디렉토리를 C:\로 지정하고 실습
//HanCount는 주어진 문자열의 한글수를 리턴함
import java.text.SimpleDateFormat;


public class p05 {
	public static void main(String[] args) {
		// 처리전 시간 획득
		long k38_start = System.currentTimeMillis();
		System.out.print("시작시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
		
		try {			
			//파일저장 디렉토리 및 파일명 정의
			File k38_f = new File ("C:\\Users\\kopo\\Desktop\\k38MyTest.txt");	//write 입력된 내용이 담겨 해당 파일 생성
			FileWriter k38_fw = new FileWriter(k38_f); //FileWriter: 파일에 글 쓸 수 있게함. => k38MyTest.txt에 글 입력
			
			//파일에 글쓰기
			k38_fw.write("안녕 파일\n"); //k38MyTest.txt파일에 첫줄 "안녕 파일"이라는 텍스트 입력.
			k38_fw.write("hello 헬로\n"); //k38MyTest.txt파일에 다음줄 "hello 헬로" 텍스트 입력.
			
			//파일쓰기 종료 _open했으면 꼭 close도 해야한다.
			k38_fw.close();
			
			//파일읽기 => FileReader(읽을 파일명)
			FileReader k38_fr = new FileReader(k38_f);
			
			int k38_n = -1; //후에 0보다 작을때의 범위를 고려해 초기화값 0보다 작은 -1로 설정
			char [] k38_ch; //char배열 생성
			
			//무한반복문 : true면 계속반복
			while(true) {
				k38_ch = new char[100]; // char배열 크기를 100으로 지정
				//k38_fr.read => k38_fr로 k38MyTest.txt를 읽고 그 내용을 k38_ch 배열에 한글자씩 저장.
				//이때, \n도 1로 카운트
				//.read 는 읽을 값이 없으면 -1을 반환한다.
				//.read는 파일리더로 읽은 내용을 ()안에 한글자씩 반환한다. 
				k38_n = k38_fr.read(k38_ch); //k38_ch의 char배열 읽은 결과를 변수 k38_n에 저장
				
				//더 이상 읽을 게 없으면 -1이 출력됨
				if (k38_n == -1) //k38_n의 값이 -1이면 반복종료
					break;
				//i가 0~ k38_n 전까지 1씩 증가하며 반복
				for (int i = 0; i < k38_n; i++) {
					System.out.printf("%c", k38_ch[i]); //  k38_ch의 모든값이 줄바꿈없이 출력 & char형이라 %c로 받음
				}
//				System.out.println(k38_n);		=> 출력: 15
			}
//			System.out.println(k38_n);		=> 		출력: -1
			
			//파일리더 닫음.
			//파일오픈하면 꼭 close해줘야함.
			k38_fr.close(); //.close안하면 계속 파일 오픈상태라 제어불가			
			System.out.printf("\nFILE READ END\n\n"); //파일리더 종료했다고 출력 => 사용자 편의위함임.
			
		} catch (Exception e) {	//try문에서 오류 발생하면 catch 구문시행
			System.out.printf("나 에러 [%s]\n", e); // 에러나면 "나 에러"출력, e는 오류 정보를 의미=> 나 에러 문구와 오류정보 출력
		}
		
		// 처리후 시간 획득
		long k38_end = System.currentTimeMillis();
		System.out.print("종료 후 시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// 시간차이 출력_숫자입력까지 실제로 걸린시간
		System.out.println("소요시간 : " + (k38_end - k38_start) / 1000.0 + " seconds\n");
	}
}	//class