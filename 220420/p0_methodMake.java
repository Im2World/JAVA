package javaPro_lec06_self_ppt;
//자바심화6강_슬4

public class p0_methodMake {
	//메소드 생성
	public static void k38_iamMethod() {
		System.out.printf("메소드라 불러줘요~~\n");	//메소드 내용
	}
	
	//메서드가 동일 class안에 있으면 메서드명으로만으로도 호출가능
	public static void main(String[] args) {
		p0_methodMake.k38_iamMethod();		//원칙: [클래스명.함수명] 으로 함수(=메서드)호출
		k38_iamMethod();	//static으로 메소드 선언해서 위 과정없이 바로호출가능
	}

}
