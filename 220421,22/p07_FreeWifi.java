package javaPro_lec08_0421;
//실제파일에 버퍼리더 응용
//서울시 공공와이파이 100개 출력
//샘플데이터는 https://www.localdata.go.kr/lif/lifeCtacDataView.do?opnEtcSvcId=12_04_07_E 
//시군구 지역 선택 후 엑셀 파일 다운로드 => 파일 열고 다른 이름으로 저장 => csv로 형변환 후 작업

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class p07_FreeWifi {
	
	//메서드 : 파일읽기
	public static void k38_FileRead() throws IOException {
		//파일 객체 생성 후 해당 경로의 파일 불러오기
		//  \가 특수문자라 그대로 표현위해 \한번 더씀.
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\12_04_07_E_무료와이파이정보.csv");
		BufferedReader k38_br = new BufferedReader (new FileReader(k38_f));	//k38_f파일 BufferedReader 객체 생성해 읽기
		
		String k38_readtxt;	// 문자열 k38_readtxt 정의 <= BufferedReader k38_br로 해당파일 한 줄씩 읽은 내용을 담을 문자열
		
		//readLine() : 한 줄씩 읽음
		//여기서 파일 첫줄 읽어 해당파일 필드명 획득!!
		if ((k38_readtxt = k38_br.readLine()) == null) {	//k38_readtxt 한 줄 읽었는데 null이면
			System.out.printf("빈 파일입니다.\n");	//빈 파일입니다. 문자열 출력 후
			return;	 //종료
		}
		
		//문자열 배열 k38_field_name에 k38_readtxt를 콤마(,)로 구분해 나눈 내용을 대입
		//콤마(,)로 구분 => csv파일의 구분자가 콤마(,)
		//파일 첫줄 => 항목이름을 콤마(,) 구분자로 잘라서 문자열 배열에 넣음
		//위에서 한 줄 읽은 것 = 항목명 => k38_field_name 에 저장
		String[] k38_field_name = k38_readtxt.split(",");

		//해당 파일 라인 수를 세기위한 정수형 변수 k38_LineCnt 선언 및 1으로 값 초기화
		int k38_LineCnt = 1;
		
		//k38_readtxt 한 줄 읽었는데 null이 아니면 계속 반복 => 끝까지 읽음
		//위에서 k38_field_name에 저장된 첫줄 다음 줄 부터 읽음=> 두번째줄부터 읽음
		//k38_br.close() 를 하지 않았기 때문에 두번째 줄부터 읽기 시작.
		while ((k38_readtxt = k38_br.readLine()) != null) {
			//실제 항목 값들 담을 문자열 배열 선언. => csv구분자인 콤마로 항목나눔
			String[] k38_field = k38_readtxt.split(",");
			System.out.printf("**[%d번째 항목]*****************\n", k38_LineCnt);	//현재 라인 수 출력
			
			//반복문 : 정수형 변수 j는 0이고, j는 field_name 배열 크기 전까지 1씩 증가하며 반복			
			for (int j = 0; j < k38_field_name.length; j++) {						
				System.out.printf(" %s : %s\n", k38_field_name[j], k38_field[j]);
			}
			System.out.printf("***********************************\n");		//구분선 출력
			if (k38_LineCnt == 100) break;	//k38_LineCnt가 100 되면 반복종료 => 이 파일은 한번에 16줄 읽음 => 16줄 * 100번 반복
			k38_LineCnt++;	//k38_LineCnt가 100이 아니면 +1 후 다시 반복
		}	
		k38_br.close();	//BufferedReader 종료			
	}

	//메인함수에 IOException 에러 예외처리	
	public static void main(String[] args) throws IOException {
		// 처리전 시간 획득
		long k38_start = System.currentTimeMillis();
		System.out.print("시작시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
		
		k38_FileRead();
		
		// 처리후 시간 획득
		long k38_end = System.currentTimeMillis();
		System.out.print("종료 후 시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// 시간차이 출력_숫자입력까지 실제로 걸린시간
		System.out.println("소요시간 : " + (k38_end - k38_start) / 1000.0 + " seconds\n");
	}
}


/*
**[99번째 항목]*****************
번호 : 99
설치장소명 : 북서울꿈의숲
설치장소상세 : 안내소
설치시도명 : 서울특별시
설치시군구명 : 강북구
설치시설구분 : 지역문화시설
서비스제공사명 : 서울특별시
와이파이SSID : PublicWiFi@Seoul
설치연월 : 14-Jan
소재지도로명주소 : 서울특별시 강북구 월계로 173
소재지지번주소 : 서울특별시 강북구 번동 산28-6
관리기관명 : 서울특별시
관리기관전화번호 : 02-901-7212
WGS84위도 : 37.6203676
WGS84경도 : 127.0429886
데이터기준일자 : 2020-06-15
***********************************
*/