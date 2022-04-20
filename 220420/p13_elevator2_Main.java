package javaPro_lec06_self_ppt;
//자바심화 6강 _ 슬라이드13
//생성자
//class p08_elevator2 의 메서드를 호출하는 클래스
//객체를 다 따로 생성해서 각 개체의 층수변화는 서로 영향을 미치지않는다.

public class p13_elevator2_Main {
	//1. [클래스명 객체명] 으로 객체생성
	//p08_elevator2 라는 동일 클래스는 다른 이름으로 여러번 호출
	static p13_elevator2 k38_elev1;
	static p13_elevator2 k38_elev2;
	static p13_elevator2 k38_elev3;
	
	public static void main(String[] args) {
		
		//2. 인스턴스 생성해 객체연결(new p08_elevator2() 등)
		k38_elev1 = new p13_elevator2();	//생성자 호출
		k38_elev2 = new p13_elevator2(20, 1, 8);	//최고 20층, 최저 1층, 현재 8층으로 설정
		k38_elev3 = new p13_elevator2(50, -3, 5);	//최고 50층, 최저 지하3층, 현재 5층으로 설정
		
		//3. 메서드 호출 
		for (int k38_i = 0; k38_i < 20; k38_i++) {	//0~19까지 20회 반복
			//층수 1층씩 올림, 층수오를때마다 안내문구도 같이 출력
				//아래 예시) p08_elevator2()생성자 호출 후 k38_up(), k38_msg 호출
				//메서드 종료 후 현재층 = 최고층 10층
			k38_elev1.k38_up(); k38_elev1.k38_msg("1번엘베 한층 오르기"); //2 3 4 5 6 ..
//			k38_elev2.k38_up(); k38_elev2.k38_msg("2번엘베 한층 오르기");
//			k38_elev3.k38_up(); k38_elev3.k38_msg("3번엘베 한층 오르기");
		}
		
		//해당 층 수 만큼 상승하는 매서드 호출 + 층수 오를 때마다 안내문구 출력
		for (int k38_i = 0; k38_i < 20; k38_i++) {
//			k38_elev1.k38_up(2); k38_elev1.k38_msg("1번엘베 2층 오르기");
//			k38_elev2.k38_up(2); k38_elev2.k38_msg("2번엘베 2층 오르기");
			k38_elev3.k38_up(2); k38_elev3.k38_msg("3번엘베 2층 오르기");	//k38_up(int k38_u) 메서드사용
				//k38_elev3 은 현재층 
		}
		
		//해당 층 수 만큼 하강하는 매서드 호출 + 층수 내릴 때마다 안내문구 출력
		for (int k38_i = 0; k38_i < 20; k38_i++) {
//			k38_elev1.k38_down(3); k38_elev1.k38_msg("1번엘베 3층 내리기");
			k38_elev2.k38_down(3); k38_elev2.k38_msg("2번엘베 3층 내리기");	//k38_down(int k38_u) 메서드사용
//			k38_elev3.k38_down(3); k38_elev3.k38_msg("3번엘베 3층 내리기");
		}
	}
}
