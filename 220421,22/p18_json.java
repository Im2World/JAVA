package javaPro_lec09_0421;
//자바심화 9강 슬라이드 18
//JSON만들기
//JSON simple라이브러리 다운받아야 JSONObject, JSONArray 사용가능
//https://code.google.com/archive/p/json-simple/downloads 
//json-simple.1.1.1.jar 다운로드 
//이클립스 프로젝트에서 왼쪽 마우스 properties -> java build path -> Libraries (탭) -> Classpath-> Add External JARS -> 다운로드한 jar파일 선택


import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class p18_json {
	
	//JSONObject 을 리턴하는 메서드
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", name);	// name 태그에는 String name으로 받은 내용을 넣는다.
		dataObject.put("studentid", studentid);	// studentid 태그에는 int studentid으로 받은 내용을 넣는다.	
		
		//JSONArray 객체생성
		//인자값 순서대로 과목 점수를 score에 대입한다.
		JSONArray score = new JSONArray();
		score.add(kor);	
		score.add(eng);
		score.add(mat);
		
		dataObject.put("score", score);	// JSONArray score에 위에서 추가한 국어, 영어, 수학 점수 대입
		
		return dataObject;	//	dataObject리턴
	}
	
	
	public static void main(String[] args) {
		
		//JSONObject 객체 선언
		JSONObject jsonObject = new JSONObject();
		
		//1인씩 성적 정보가 들어갈 JSON정보 담은 JSONArray선언
		JSONArray datasArray = new JSONArray();
		
		//메서드 미사용시 이렇게 하나씩 값을 넣어줘야함.
		//1인 정보 들어갈 JSONObject 선언
		JSONObject dataObject = new JSONObject();
		dataObject.put("name","Nayeon");	//json에서 문자는 앞뒤에 ""처리
		dataObject.put("studentid","209901");

		//메서드 미사용시 이렇게 하나씩 값을 넣어줘야함.
		//JSONArray 생성
		JSONArray score = new JSONArray();
		score.add(90);	//국어점수
		score.add(100);	//영어점수
		score.add(100);	//수학점수
		dataObject.put("score", score);		//score에 점수 대입
		datasArray.add(dataObject);	//datasArray에 datasObject 대입
		
		//편리한 사용을 위해 함수처리
		//이름, 학번, 국어점수, 영어점수, 수학점수 순으로 점수 대입
		datasArray.add(oneRec("Jeongyeon", 209902, 100, 85, 95));
		datasArray.add(oneRec("Momo", 209902, 70, 65, 60));
		datasArray.add(oneRec("Sana", 209902, 100, 80, 75));
		datasArray.add(oneRec("Jihyo", 209902, 100, 85, 95));
		datasArray.add(oneRec("Mina", 209902, 85, 100, 95));
		datasArray.add(oneRec("Dahyun", 209902, 80, 85, 95));
		datasArray.add(oneRec("Chaeyoung", 209902, 95, 95, 100));
		datasArray.add(oneRec("Tzuyu", 209902, 60, 100, 95));
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\kopo\\Desktop\\javaProTest\\test.json");	//해당 경로에 json파일 저장
			file.write(datasArray.toJSONString());	//datasArray의 내용을 JSON문자열로 전환해서 파일쓰기
			file.flush();  			//현재 버퍼에 저장된 내용을 file에 전송하고 버퍼 비움
			file.close();			//파일쓰기 종료			
		}catch(IOException e){
			e.printStackTrace(); 		//오류발생하면 오류내역 출력
		}
		System.out.println("JSON생성완료 : \n" + datasArray);	//함수 종료 멘트 출력
	}
}
