package javaPro_lec06_self_ppt;
//자바심화 6강 _ 슬라이드13
//생성자 활용
//생성자 : 클래스명과 같은 이름의 메서드 => 가장 먼저 호출된다.
//생성자도 오버로딩(매개변수다르게 받는것) 가능

public class p13_elevator2 {
	//1. 계산에 필요한 변수들 선언
	//private 변수는 해당 클래스 내에서만 사용가능
	//=> p10_elevator3 실습위해 public 선언
	public int k38_limitUpFloor;	//정수형 변수 선언, 최고층
	public int k38_limitDownFloor;	//정수형 변수 선언, 최하층
	public int k38_floor;	//정수형 변수 선언, 현재층
	public String k38_info;	//문자열형 변수 선언, 안내메시지

	//2. 생성자 생성
	p13_elevator2() {
		k38_limitUpFloor = 10;	//최고층을 10으로 설정
		k38_limitDownFloor = 1;	//최저층을 1로 설정
		k38_floor = 1;	//현재층을 1로 설정
		k38_info = "엘레베이터 기본 준공완료";	//안내메시지 설정
	}
	
	//3. 생성자 오버로딩
	//정수형 변수를 3개 받는다.
	p13_elevator2(int k38_up_floor, int k38_d_floor, int k38_in_floor) {
		k38_limitUpFloor = k38_up_floor;	//최고층에는 k38_up_floor 대입
		k38_limitDownFloor = k38_d_floor;	//최저층에는 k38_d_floor 대입
		k38_floor = k38_in_floor;	//현재층에는 k38_in_floor 대입
		k38_info = "엘레베이터 맞춤 준공완료";	//안내메시지 설정
	}
	
	//4.메서드 생성
	//층수 상승 메서드
	void k38_up() {
		if (k38_floor == k38_limitUpFloor) {	//현재층이 최고층이라면
			k38_info = "마지막 층입니다.";	//해당 메시지로 설정
		} else {	//최고층이 아니라면
			k38_floor++;	//1층 올리고
			k38_info = String.format("[%d] 층입니다.", k38_floor);	//현재층 메시지로 설정
				//k38_floor가 정수형이라 %d 사용
		}
	}
	
	//층수 하강 메서드
	void k38_down() {
		if (k38_floor == k38_limitDownFloor) {	//현재층이 최저층이라면
			k38_info = "처음 층입니다.";	//해당 메시지로 설정
		} else {	//최저층이 아니라면
			k38_floor--;	//1층 감소
			k38_info = String.format("[%d] 층입니다.", k38_floor);	//현재층 메시지로 설정
		}
	}
	
	//층수 지정후 상승 메서드
	//층수를 받으면 그 층만큼 상승 =>  k38_i가 0부터 시작이라 k38_i < k38_u
	//this쓰면 명확
	void k38_up(int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++) this.k38_up();
	}

	//층수 지정후 하강 메서드
	//층수를 받으면 그 층만큼 하강 =>  k38_i가 0부터 시작이라 k38_i < k38_u => ex) k38_u = 5 => 0~4까지 5회 반복
	//this안써봄
	void k38_down(int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++) k38_down();
	}

	//정보안내 메서드
	//입력받은 k38_id 로 숫자출력하고, 최대, 최소, 현재층 정보도 출력
	//문자열은 %s, 정수형은 %d로 입력받음
	void k38_msg(String k38_id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", k38_id, k38_info, k38_limitUpFloor, k38_limitDownFloor, k38_floor);
	}

}