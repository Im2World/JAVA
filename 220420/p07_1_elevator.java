package javaPro_lec06_self_ppt;
//자바심화 6강_슬7
//클래스, 객체, 인스턴스
//메서드들 생성해둔 클래스

public class p07_1_elevator {

		int k38_limitUpFloor = 10; 	//최상위 층
		int k38_limitDownFloor = 0; 	//최하위층
		int k38_floor = 1;	//현재 층 => 계속 변하게 된다.
		String k38_help;	//안내문구 담을 문자열 변수
		
		//엘리베이터 상승 메서드 : 리턴값 없음
		void k38_up() {
			if (k38_floor == k38_limitUpFloor) {	//현재층이 최상층이면
				k38_help = "마지막 층 입니다.";	//마지막층 안내멘트로 정의
			} else {
				k38_floor++;	//최상층 아니면 한 층씩 올림.
				//String.format : 리턴되는 문자열 형식지정하는 메서드
				k38_help = String.format("%d층입니다.", k38_floor);	//k38_help를 현재층 안내멘트로 정의	
			}
		}
		
		//엘리베이터 하강 메서드  : 리턴값 없음
		void k38_down() {
			if (k38_floor == k38_limitDownFloor) {	//현재층이 최하층이면
				k38_help = "처음 층 입니다.";	//처음층 안내멘트로 정의
			} else {
				k38_floor--;	//최하층 아니면 한 층씩 내려감.
				k38_help = String.format("%d층입니다.", k38_floor);	//k38_help를 현재층 안내멘트로 정의	
			}		
		}
	}
