package javaPro_lec06_self_ppt;
//class p09_tvRemotecon2 의 생성자, 메서드 호출해서 사용하는 클래스
//자바 6강 슬14 _ 생성자

public class p14_tvRemotecon2_Main {
	//1. [클래스명 객체명] 으로 객체생성
	//p09_tvRemotecon2 라는 동일 클래스는 다른 이름으로 여러번 호출
	static p14_tvRemotecon2 k38_Remotecon1;
	static p14_tvRemotecon2 k38_Remotecon2;
	
	public static void main(String[] args) {
		//2. 인스턴스 생성해 객체연결(new p09_tvRemotecon2() 등)
		k38_Remotecon1 = new p14_tvRemotecon2();
		k38_Remotecon2 = new p14_tvRemotecon2(10, 0, 18, 1, 2, 3); //맞춤 리모콘 => 최대볼륨, 최소볼륨, 마지막채널,  처음채널, 현재볼륨, 현재채널
		
		//3. 볼륨조정
		//볼륨 1씩 올리는 메서드 10회 실행
		for(int k38_i = 0; k38_i < 9; k38_i++) {
			k38_Remotecon2.k38_volUp(); //p09_tvRemotecon2 클래스의 k38_volUp() 실행
			k38_Remotecon2.k38_volInfo("2번 리모콘 볼륨 1 증가");	//실행 할 때마다 안내문구도 함께 출력
		}
		
		//볼륨 2씩 내리는 메서드 3회 실행
		for (int k38_i = 0; k38_i < 3; k38_i++) {
			k38_Remotecon2.k38_volDown(2); //p09_tvRemotecon2 클래스의 k38_volDown (int k38_u) 실행
			k38_Remotecon2.k38_volInfo("2번 리모콘 볼륨 2 감소");	//실행 할 때마다 안내문구도 함께 출력
		}
		
		//4. 채널조정
		//채널 1씩 올리는 메서드 10회 실행
		for(int k38_i = 0; k38_i < 10; k38_i++) {
			k38_Remotecon2.k38_channelUp(); //p09_tvRemotecon2 클래스의 k38_channelUp() 메서드 실행
			k38_Remotecon2.k38_chInfo("2번 리모콘채널 1 증가");	//실행 할 때마다 안내문구도 함께 출력
		}
		
		//채널 2씩 내리는 메서드 3회 실행
		for (int k38_i = 0; k38_i < 3; k38_i++) {
			k38_Remotecon2.k38_channelDown(2); //p09_tvRemotecon2 클래스의 k38_channelDown (int k38_u) 메서드 실행
			k38_Remotecon2.k38_chInfo("2번 리모콘 채널 2 감소");	//실행 할 때마다 안내문구도 함께 출력
		}
	}
}