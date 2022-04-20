package javaPro_lec06_self_ppt;
//상속과 오버라이딩 _ 자바심화 6강 슬16, 슬 18
//p10_elevator3 클래스는 p08_elevator2클래스를 상속받음.
//부모클래스 p08_elevator2 의 메서드를 그대로 사용가능
//자바는 다중상속 금지라서 한 클래스당 하나의 클래스만 상속가능
//부모클래스의 메소드를 자식 클래스에서 재정의해 사용하는 것.
//메소드를 오버라이드 하면, 항상 자식클래스에서 정의된 메소드가 호출

public class p16_elevator3 extends p13_elevator2{
	//슬16
	void k38_Repair() {
		k38_info = String.format("수리중입니다.");		//해당 문구를 p08_elevator2의 public String k38_info 에 대입
	}
	
	// 슬18
	// 부모 클래스를 상속받았으니까 메서드 재정의 가능 => 부모클래스 메서드 내용무시하고 자식클래스에서 재정의한 내용으로 실행
	@Override
	void k38_up() {
		if (k38_floor >= k38_limitUpFloor) { // 부모 클래스의 k38_up 내용변경
			k38_info = "마지막층입니다."; // 해당 문구를 p08_elevator2의 public String k38_info 에 대입
		} else {
			k38_floor = k38_floor + 2; // 최상층 아니면 2층 올라감. => k38_floor += 2 로 대체할 수도 있음.
			k38_info = String.format("%d층입니다.", k38_floor); // 해당 문구를 p08_elevator2의 public String k38_info 에 대입
		} ///////////////////////////////////////////////////

		// 아래의 k38_down() 메서드 실행=> 1층 내리고 printf에 설정해둔 메세지 출력
		// k38_down()실행으로 2층 올라가고 1층 내려감. => 1층만 올라감
		this.k38_down();
		super.k38_up();
	}
	
	
	void k38_down() {
		//부모 클래스(super) k38_down메서드 실행
		super.k38_down();
		
		//클래스 안에서 메세지 출력 확인
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n",this.k38_floor);
		//this.k38_down(); 재귀호출시 뺑뺑이
	}
}	//class


/*
아래처럼 그냥 실행하면 오버라이드가 안된다. => Source - Override 로 오버라이딩(부모클래스 메서드 재정의)
void k38_up() {	
	if(k38_floor >= k38_limitUpFloor) {	//부모 클래스의 k38_up 내용변경
		k38_info = "마지막층입니다.";		//해당 문구를 p08_elevator2의 public String k38_info 에 대입
	} else {
		k38_floor = k38_floor + 2;	//최상층 아니면 2층 올라감. => k38_floor += 2 로 대체할 수도 있음.
		k38_info = String.format("%d층입니다.", k38_floor);		//해당 문구를 p08_elevator2의 public String k38_info 에 대입
	}
	
	//아래의 k38_down() 메서드 실행=> 1층 내리고 printf에 설정해둔 메세지 출력
	//k38_down()실행으로 2층 올라가고 1층 내려감. => 1층만 올라감
	this.k38_down();
}
*/