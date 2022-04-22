package javaPro_lec09_0421;
//소스코드 따라하기
//JSON파싱
//JSON simple라이브러리 다운받아야 JSONObject, JSONArray 사용가능
//https://code.google.com/archive/p/json-simple/downloads 
//json-simple.1.1.1.jar 다운로드 
//이클립스 프로젝트에서 왼쪽 마우스 properties -> java build path -> Libraries (탭) -> Classpath-> Add External JARS -> 다운로드한 jar파일 선택

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class p20_jsonParsing {
	//try catch문 사용하지 않으려고 throws로 관련예외들을 미리 처리
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//클래스명 참조변수명 으로 JSONParser 객체생성
		JSONParser parser = new JSONParser();
		
		//자바심화 9강 슬라이드 18에서 만든 test.json 파일을 파싱한다.
		//Object는 가장 큰 클래스
		Object obj = parser.parse(new FileReader ("C:\\Users\\kopo\\Desktop\\javaProTest\\test.json"));
		JSONArray array = (JSONArray)obj; //딱히 키가 없는 어레이라 이런식으로 연결

		System.out.println("========================================");	//구분선 출력
		
		//배열크기만큼 반복 => 배열의 값들 모두 출력
		for (int i = 0; i < array.size(); i++) {
			JSONObject result = (JSONObject) array.get(i); //array.get(i) 값을 JSONObject result에 대입
			System.out.println("이름 : " + result.get("name")); 	//이름 출력
			System.out.println("학번 : " + result.get("studentid")); //학번 출력
			
			JSONArray score = (JSONArray) result.get("score");//성적 값을 get으로 가져와서 JSONArray score에 대입
			
			///////////성적출력부//////////
			//JSONArray score의 0번인덱스(=1번째 줄) = 국어 성적
			//JSONArray score의 1번인덱스(=2번째 줄) = 영어 성적
			//JSONArray score의 2번인덱스(=3번째 줄) = 수학 성적
			//long은 int보다 큰 값을 받을 수 있는 타입
			long kor = (long)score.get(0);
			long eng = (long)score.get(1);
			long math = (long)score.get(2); //만약, json배열이 잘못만들어져서 3개가 아니면 에러
			System.out.println("국어 : " + kor); 	//국어점수 출력
			System.out.println("영어 : " + eng);	//영어점수 출력
			System.out.println("수학 : " + math);	//수학점수 출력
			System.out.println("총점 : " + (kor + eng + math)); 	//총점 = 국어점수 + 영어점수 + 수학점수
			System.out.println("평균 : " + ((kor + eng + math) / 3.0)); 	//평균 = 총점 / 과목수 => 평균은 double형으로 출력
			System.out.println("========================================");		//구분선 출력
		}
	}
}