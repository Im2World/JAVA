package javaPro_lec06_self_ppt;
//자바심화 6강_슬9
//클래스, 객체, 인스턴스
public class p09_2_tvRemoteconMain {
	public static void main(String[] args) {
		//1. 준비작업 : 객체생성
		p09_1_tvRemotecon k38_move;	//[클래스명 객체명] => 클래스 받아 객체생성
		k38_move = new p09_1_tvRemotecon();	//인스턴스생성해 객체연결
			//=> move로 p05_1_tvRemocon클래스 메서드 사용가능
			//*** p05_1_tvRemotecon k38_move = new p05_1_tvRemotecon();   => 라고 위 두줄을 한 줄로 줄일 수 있다!!***
		
		//2. 다른 클래스의 메서드 실행
		System.out.printf("<채널안내>\n");	//메서드 출력결과 쉽게 보기위한 안내문구 출력 후 줄바꿈
		//채널업
		for(int k38_i =0; k38_i < 10; k38_i++) {	//0~9까지 총 10회 반복
			k38_move.k38_channelUp();	//05_1_tvRemocon 클래스의 메서드 실행
			System.out.printf("info [%s]\n", k38_move.k38_info);	//현재채널 안내 문구 출력 후 줄바꿈
		}
		
		//채널 다운
		for(int k38_i =0; k38_i < 10; k38_i++) {	//0~9까지 총 10회 반복
			k38_move.k38_channelDown();	//05_1_tvRemocon 클래스의 메서드 실행
			System.out.printf("info [%s]\n", k38_move.k38_info);	//현재채널 안내 문구 출력 후 줄바꿈
		}
		
		System.out.printf("\n<볼륨안내>\n");	//줄바꿈 후 메서드 출력결과 쉽게 보기위한 안내문구 출력 후 줄바꿈	
		//볼륨업
		for(int k38_i =0; k38_i < 5; k38_i++) {	//0~4까지 총 5회 반복
			k38_move.k38_volUp();	//05_1_tvRemocon 클래스의 메서드 실행
			System.out.printf("info [%s]\n", k38_move.k38_info);	//현재채널 안내 문구 출력 후 줄바꿈
		}
		
		//볼륨 다운
		for(int k38_i =0; k38_i < 5; k38_i++) {	//0~4까지 총 5회 반복
			k38_move.k38_volDown();	//05_1_tvRemocon 클래스의 메서드 실행
			System.out.printf("info [%s]\n", k38_move.k38_info);	//현재채널 안내 문구 출력 후 줄바꿈
		}
	}
}
