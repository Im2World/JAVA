package javaPro_lec06_self_ppt;
//슬17
//상속으로 클래스만들기
//건전지 잔량 확인 메서드 추가
//class p11_TvRemoteconX 의 메서드들 실행하는 클래스
public class p17_TvRemoteconX_Main {
	public static void main(String[] args) {
		//1. [클래스명 객체명] 으로 객체생성 후  인스턴스 생성해 객체연결
		p17_TvRemoteconX k38_rmt3 = new p17_TvRemoteconX();

		//2. 건전지 잔량 안내 메서드 실행
		k38_rmt3.k38_batteryCheckinfo();
		
		//3. 볼륨조정
		//볼륨 1씩 올리는 메서드 10회 실행
		//k38_rmt3은 p09_tvRemotecon2 클래스(부모클래스)를 상속받은 p11_TvRemoteconX클래스에 연결된 객체
		//=> p09_tvRemotecon2 메서드 실행 가능
		for(int k38_i = 0; k38_i < 9; k38_i++) {
			k38_rmt3.k38_volUp(); //p09_tvRemotecon2 클래스의 k38_volUp() 실행
			k38_rmt3.k38_volInfo("2번 리모콘 볼륨 1 증가");	//실행 할 때마다 안내문구도 함께 출력			
			k38_rmt3.k38_batteryCheck(k38_i + 1);	//건전지는 볼륨 1회 조절할때마다 -1씩 감소하게 설정
			
			//건전지 볼륨이 0이 되면 볼륨조절 불가!
			//건전지를 교체하라는 안내문 출력 후 반복문 종료
			if ((k38_rmt3.k38_battery - (k38_i + 1)) == 0) {
				System.out.println("**건전지를 교체하세요**");
				break;
			}
		}	//for
	}	//main
} 	//class
