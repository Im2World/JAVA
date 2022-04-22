package javaPro_lec08_0421;
//pg8
//공공와이파이
//분당 융기원으로부터의 거리계산 + 최대거리지점, 최소거리지점 계산
//파일에 잘못입력된 값들이 많아서 검사해야한다!!!!
/*
txt로 실습할 거면 아래 형식 따라하기.
엑셀파일 => csv 파일 => txt 파일로 변경했다.
12_04_07_E_무료와이파이정보.txt 는 서울시 것으로 받았다. 

<12_04_07_E_무료와이파이정보.csv   인덱스 설명>
csv로 실습해서 엑셀 파일에서 바꾸기 기능으로 콤마(,) 를 * 로 바꿔야 정상처리가능. => 가게이름 등에 콤마(,) 가있다.
도로명주소 : 인덱스  9
지번주소 :  인덱스 10
위도 lat : 인덱스 13
경도 lng : 인덱스 14

 
점(a,b) 점(c,d)간의 거리는
피타고라스 정리 : 거리 = 루트((a-c)^2 + (b-d)^2)  
실습2) 분당융기원과 가장 가까운 곳과, 먼곳을 찾아 인쇄 실습 별 하나(★)  
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class p08_no2_FreeWifi_csv_method {
	public static void main(String[] args) throws IOException {
		// 처리전 시간 획득
		long k38_start = System.currentTimeMillis();
		System.out.print("시작시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_start));
				
		k38_FileRead();		//메서드 호출
				
		// 처리후 시간 획득
		long k38_end = System.currentTimeMillis();
		System.out.print("종료 후 시간 : ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(k38_end));
		
		// 시간차이 출력_숫자입력까지 실제로 걸린시간
		System.out.println("소요시간 : " + (k38_end - k38_start) / 1000.0 + " seconds\n");
	}
	
	public static void k38_FileRead() throws IOException {
		// 파일 객체 생성 후 해당 경로의 파일 불러오기
		// \가 특수문자라 그대로 표현위해 \한번 더씀.
		File k38_f = new File("C:\\Users\\kopo\\Desktop\\javaProTest\\12_04_07_E_무료와이파이정보.csv");
		BufferedReader k38_br = new BufferedReader(new FileReader(k38_f)); // k38_f파일 BufferedReader 객체 생성해 읽기

		String k38_readtxt; // 문자열 k38_readtxt 정의 <= BufferedReader k38_br로 해당파일 한 줄씩 읽은 내용을 담을 문자열

		// readLine() : 한 줄씩 읽음
		//여기서 파일 첫줄 읽어 해당파일 필드명 획득!!
		if ((k38_readtxt = k38_br.readLine()) == null) { // k38_readtxt 는 BufferedReader k38_br로 File k38_f를 한 줄씩 읽는데, 그 값이 null이면
			System.out.printf("빈 파일입니다.\n"); // 빈 파일입니다. 문자열 출력 후
			return; // 종료
		}

		//문자열 배열 k38_field_name에 k38_readtxt를 콤마(,)로 구분해 나눈 내용을 대입
		//콤마(,)로 구분 => csv파일의 구분자가 콤마(,)
		//파일 첫줄 => 항목이름을 콤마(,) 구분자로 잘라서 문자열 배열에 넣음
		//위에서 한 줄 읽은 것 = 항목명 => k38_field_name 에 저장
		String[] k38_field_name = k38_readtxt.split(",");

		// 찾을 위도, 경도 값 입력 => 분당융기원
		double k38_lat = 37.3860521; // 분당 융기원 위도를 실수형 변수 k38_lat으로 선언 후 값 초기화
		double k38_lng = 127.1214038; // 분당 융기원 경도를 실수형 변수 k38_lng으로 선언 후 값 초기화

		// 해당 파일 라인 수를 세기위한 정수형 변수 k38_LineCnt 선언 및 1으로 값 초기화
		int k38_LineCnt = 1;
		
		
		//최대 최솟값 구하기 위한 변수선언 및 값 정의
		double k38_min = Double.MAX_VALUE;	//거리차 최솟값에 실수형 변수 Double의 최대값 대입
		double k38_max = Double.MIN_VALUE;	//거리차 최댓값에 실수형 변수 Double의 최솟값 대입	
		String k38_minRoadName = null;		//가장가까운거리 주차장명 대입할 변수 선언 및 null로 초기화
		String k38_maxRoadName = null;		//가장 먼 거리 주차장명 대입할 변수 선언 및 null로 초기화
		String k38_minLat = null;			//가장가까운거리 위도 대입할 변수 선언 및 null로 초기화
		String k38_minLng = null;			//가장가까운거리 경도 대입할 변수 선언 및 null로 초기화
		String k38_maxLat = null;			//가장먼거리 위도 대입할 변수 선언 및 null로 초기화
		String k38_maxLng = null;			//가장먼거리 경도 대입할 변수 선언 및 null로 초기화
	
		// k38_readtxt 한 줄 읽었는데 null이 아니면 계속 반복 => 끝까지 읽음
		// 위에서 k38_field_name에 저장된 첫줄 다음 줄 부터 읽음=> 두번째줄부터 읽음
		while ((k38_readtxt = k38_br.readLine()) != null) {

			// 실제 항목 값들 담을 문자열 배열 선언. => csv파일 구분자인 콤마(,)로 항목나눔
			String[] k38_field = k38_readtxt.split(",");

			System.out.printf("**[%d번째 항목]************************************\n", k38_LineCnt); // 현재 라인 수 출력
			System.out.printf(" %s : %s\n", k38_field_name[9], k38_field[9]); // 소재지 도로명주소 : 배열 field_name, k38_field 인덱스 9
			System.out.printf(" %s : %s\n", k38_field_name[13], k38_field[13]); // 위도 : 배열 field_name, k38_field 의 인덱스 13
			System.out.printf(" %s : %s\n", k38_field_name[14], k38_field[14]); // 경도 : 배열 field_name, k38_field 의 인덱스 14

			
			// ********현재 지점과 목표지점의 거리계산*********
			// 피타고라스 정리 활용
			// 좌표(x1,y1), 좌표(x2,y2)인 경우 
			// 융기원과 각 목적지 도로명주소 위도, 경도 비교
			// 루트{(x1-x2)^2+(y1-y2)^2}
			// Math.sqrt : 루트 씌우기
			// Math.pow : 제곱 표현 => 2제곱이라서 숫자 2
			// 기준지점(분당융기원)과의 거리 계산 후  변수 dist에 대입
			double k38_dist = Math.sqrt(Math.pow(Double.parseDouble(k38_field[13]) - k38_lat, 2) + Math.pow(Double.parseDouble(k38_field[14]) - k38_lng, 2));
			System.out.printf(" 현재지점과 거리 : %f\n", k38_dist); // 현재지점(분당융기원)과의 거리
			System.out.printf("***************************************************\n"); // 구분선 출력

			//거리 최대, 최솟값 계산
			if (k38_dist < k38_min) {			//최소거리가 거리보다 크면 => 현재거리가 더 작으면
				k38_min = k38_dist;				//최소거리를 거리로 재정의
				k38_minRoadName = k38_field[9];	//k38_min_field를 k38_field 배열의 9번째 요소로 재정의 (최소거리의 도로명주소)
//				k38_minRoadName = k38_field[9] + " " + k38_field[1];	//k38_min_field를 k38_field 배열의 9번째 요소로 재정의 (최소거리의 도로명주소)
				k38_minLat = k38_field[13];	//min_lat를 최소거리 위도로 재정의 (k38_field 배열 13번째 요소= 위도)
				k38_minLng = k38_field[14];	//min_lng를 최소거리 경도로 재정의 (k38_field 배열 14번째 요소= 경도)
			} else if (k38_dist > k38_max) {	//최대거리가 거리보다 작으면
				k38_max = k38_dist;				//최대거리를 거리로 재정의
				k38_maxRoadName = k38_field[9];	//k38_max_field를 최대거리도로명주소로 재정의
				k38_maxLat = k38_field[13];	//k38_max_lat를 최대거리의 위도로 재정의
				k38_maxLng = k38_field[14];	//k38_max_lng를 최대거리의 경도로 재정의				
			}
						
		
			k38_LineCnt++; // k38_LineCnt 증가
		}
		//최종 최소거리지점 도로명주소와 위도, 경도, 분당융기원과의 거리 출력
		System.out.printf("====================================================\n"); // 구분선 출력	
		System.out.printf("%s : %s\n%s : %s\n%s : %s\n%s : %f\n", "가장가까운 곳", k38_minRoadName, "위도", k38_minLat, "경도", k38_minLng, "거리", k38_min);	
		System.out.printf("====================================================\n"); // 구분선 출력																				
		//최종 최대거리지점 도로명주소와 위도, 경도, 분당융기원과의 거리 출력
		System.out.printf("%s : %s\n%s : %s\n%s : %s\n%s : %f\n", "가장 먼 곳", k38_maxRoadName, "위도", k38_maxLat, "경도", k38_maxLng, "거리", k38_max);
		
		k38_br.close(); // BufferedReader 닫기=> close안하면 계속 열려있어서 제어불가!!!				
	}
}



/*
곡선 좌표에서 정확하게 계산하려면.
아래 공식대로 계산해야한다.
아래공식대로 계산한 값의 단위는 m

public static double calDistance(double lat1, double lat2, double lon1, double lon2) {

final int R = 6371; // Radius of the earth

double latDistance = Math.toRadians(lat2 - lat1);
double lonDistance = Math.toRadians(lon2 - lon1);
double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
        + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
        * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
double k23_distance = R * c * 1000; // convert to meters

k23_distance = Math.pow(k23_distance, 2);

return Math.sqrt(k23_distance);
}



<정상출력결과>
====================================================
가장가까운 곳 : 서울특별시 강남구 세곡동 102-17
위도 : 37.465694
경도 : 127.109268
거리 : 0.080561
====================================================
가장 먼 곳 : 서울특별시 강서구 허준로 65
위도 : 37.869314
경도 : 126.846543
거리 : 0.555959
종료 후 시간 : 2022-04-22 15:21:10.190
소요시간 : 0.763 seconds
*/