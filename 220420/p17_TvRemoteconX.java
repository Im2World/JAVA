package javaPro_lec06_self_ppt;
//자바심화 6강 슬17
//상속으로 클래스만들기
//클래스 p09_tvRemotecon2 를 상속받음.
public class p17_TvRemoteconX extends p14_tvRemotecon2{
	//건전지 처음 잔량을 5로 설정
	static int k38_battery = 5;
	
	//건전지 잔량 안내 메서드 생성
	void k38_batteryCheckinfo() {
		System.out.printf("초기 건전지 잔량: %d \n\n", k38_battery);	//건전지 잔량 문구 출력	
	}
	
	//인자를 받아 건전지 잔량이 변화는 메서드 생성
	//k38_num는 볼륨조절하는 횟수
	//초기 건전지 잔량 - 볼륨조절횟수 = 볼륨변경 후 건전지 잔량
	//class p11_TvRemoteconX_Main 에서 건전지는 볼륨 1회 조절할때마다 -1씩 감소하게 설정
	void k38_batteryCheck(int k38_num) {
		System.out.printf("건전지 잔량: %d \n\n", k38_battery - k38_num);	//건전지 잔량 문구 출력	
	}
}
