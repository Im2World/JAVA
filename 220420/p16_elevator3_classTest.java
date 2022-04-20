package javaPro_lec06_self_ppt;
//상속과 오버라이딩 _ 자바심화 6강 슬16, 슬 18
//p10_elevator3 클래스는 p08_elevator2클래스를 상속받음.
//부모클래스 p08_elevator2 의 메서드를 그대로 사용가능
//자바는 다중상속 금지라서 한 클래스당 하나의 클래스만 상속가능
//부모클래스의 메소드를 자식 클래스에서 재정의해 사용하는 것.
//메소드를 오버라이드 하면, 항상 자식클래스에서 정의된 메소드가 호출
public class p16_elevator3_classTest {

	public static void main(String[] args) {
	//1. [클래스명 객체명] 으로 객체생성
	p16_elevator3 k38_elev3;
	
	//2. 인스턴스 생성해 객체연결
	k38_elev3 = new p16_elevator3();
	
	//3. 해당 메서드들 실행 후 안내문구도 함께 출력
	for (int k38_i = 0; k38_i < 10; k38_i++) {
		k38_elev3.k38_up();		//class p10_elevator3의 k38_up() 메서드 호출 
		System.out.printf("MSG elev3[%s]\n", k38_elev3.k38_info);
		}
		
	for (int k38_i = 0; k38_i < 10; k38_i++) {
		k38_elev3.k38_down();		//class p10_elevator3의 k38_down() 메서드 호출
		System.out.printf("MSG elev3[%s]\n", k38_elev3.k38_info);
		}
	
	// p10_elevator3클래스의 k38_Repair메서드 호출 
		k38_elev3.k38_Repair();		//class p10_elevator3의 k38_Repair() 메서드 호출
		System.out.printf("MSG elev3[%s]\n", k38_elev3.k38_info);
	}
}