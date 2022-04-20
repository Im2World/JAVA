package javaPro_lec06_self_ppt;
//자바심화 6강_슬5

public class p05_변수와메서드2 {
	static int k38_iStatic;	//클래스내 전역 변수 static 선언
	
	
	//add라는 메서드 선언
	public static void k38_add(int k38_i) {
		k38_iStatic++;	//전역변수 값 1증가
		k38_i++;	//값 1증가
		System.out.printf("add메서드에서 => k38_iStatic=[%d]\n", k38_iStatic);	//정수형 k38_iStatic대입	
		System.out.printf("add메서드에서 => k38_i=[%d]\n", k38_i);	//정수형 k38_iMain대입		
	}
	
	
	//add2라는 메서드 선언, 정수형 return
	public static int k38_add2(int k38_i) {
		k38_iStatic++;	//전역변수 값 1증가
		k38_i++;	//값 1증가
		System.out.printf("add메서드에서 => k38_iStatic=[%d]\n", k38_iStatic);	//정수형 k38_iStatic대입	
		System.out.printf("add메서드에서 => k38_i=[%d]\n", k38_i);	//정수형 k38_iMain대입				
		return k38_i;	//정수형 i 반환
	}
	
	//main부
	public static void main(String[] args) {
		int k38_iMain;	//변수선언
		k38_iMain = 1;	//변수값 초기화
		k38_iStatic = 1;	//이 변수는 class내에서 사용가능한 전역변수
		
		System.out.printf("*****************************************\n");
		System.out.printf("메서드호출전 메인에서 => k38_iStatic=[%d]\n", k38_iStatic);	//정수형 k38_iStatic대입
		System.out.printf("메서드호출전 메인에서 => k38_iMain=[%d]\n", k38_iMain);	//정수형 k38_iMain대입
		System.out.printf("*****************************************\n");
		
		//메서드 호출
		k38_add(k38_iMain);	//이 메서드에서 k38_iStatic값 1 증가=> 2됨, k38_iMain을 i로 받아서 i값은 1증가해 2가됨.
		//k38_iStatic 은 전역변수로 선언해서 다른 메소드에서 변경된 값이 전달된다.
		//k38_iMain 은 k38_add에서 리턴값이 없으므로 변화x
		System.out.printf("*****************************************\n");
		System.out.printf("메서드호출후 메인에서 => k38_iStatic=[%d]\n", k38_iStatic);		//값 : 2
		System.out.printf("메서드호출후 메인에서 => k38_iMain=[%d]\n", k38_iMain);	//값 : 1  => **k38_iMain은 값 변화 없음**
		System.out.printf("*****************************************\n");
		
		
		//********핵심부*********
		//변수에 k38_add2메서드 반환값대입
		//이렇게 값 전달하고 받는 방법이 이해쉽다.
		//전역변수로 선언 후 메소드 자꾸 변경하면 로직 판단 어려움
		//k38_iMain을 k38_add2인자로 넣으면, 우선 k38_iStatic 값 1증가,  k38_iMain을 i로 받아서 k38_iMain도 1증가 => k38_iMain을 반환.
		//반환된 k38_iMain을 main의 k38_iMain에 대입
		k38_iMain = k38_add2(k38_iMain);	//k38_iStatic 값 : 3, k38_iMain값 : 2
		
		System.out.printf("*****************************************\n");
		System.out.printf("메서드 k38_add2호출후 메인에서 => k38_iStatic=[%d]\n", k38_iStatic);		//값 3
		System.out.printf("메서드 k38_add2호출후 메인에서 => k38_iMain=[%d]\n", k38_iMain);		//값 2		
			//*******k38_add메서드와 달리 k38_add2메서드는 값 반환	=> k38_iMain값이 변화한다.**********
		System.out.printf("*****************************************\n");		
	}	
}
