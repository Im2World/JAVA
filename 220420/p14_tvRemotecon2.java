package javaPro_lec06_self_ppt;
//자바 6강 슬14 _ 생성자

public class p14_tvRemotecon2 {
	//1. 각종 변수 선언
	int k38_volUpMax;		//정수형 변수 최대볼륨 선언
	int k38_volDownMin;		//정수형 변수 최소볼륨 선언
	int k38_channelUpMax;	//정수형 변수 최대채널 선언
	int k38_channerDownMin;	//정수형 변수 최소채널 선언
	int k38_vol;	//정수형 변수 현재 볼륨 선언
	int k38_channel;	//정수형 변수 현재 채널 선언
	String k38_info;	//안내문구출력할 문자열 k38_info 선언
	
	//2. 생성자 정의
	p14_tvRemotecon2() {
		k38_volUpMax = 5;				//k38_volUpMax는 5로 정의
		k38_volDownMin = 0;				//k38_volDownMin을 0으로 정의
		k38_channelUpMax = 10;			//k38_channelUpMax을 10으로 정의
		k38_channerDownMin = 0;			//k38_channerDownMin을 0으로 정의
		k38_vol = 1;						//k38_vol을 1로 정의
		k38_channel = 1;					//k38_channel을 1로 정의
		k38_info = "TV 기본 설정 완료";		//k38_info를 "TV 기본 설정 완료"로 정의
	}
	
	//3. 생성자 오버로딩
	p14_tvRemotecon2(int k38_volMax, int k38_volMin, int k38_chMax, int k38_chMin, int k38_volNow, int k38_chNow) {		//인자를 받는 생성자 정의
		k38_volUpMax = k38_volMax;		//k38_volUpMax는 k38_volMax로 정의
		k38_volDownMin = k38_volMin;	//k38_volDownMin을 k38_volMin으로 정의
		k38_channelUpMax = k38_chMax;		//k38_channelUpMax을 k38_chMax으로 정의
		k38_channerDownMin = k38_chMin;	//k38_channerDownMin을 k38_chMin으로 정의
	    k38_vol = k38_volNow;			//k38_vol을 k38_volNow로 정의
	    k38_channel = k38_chNow;		//k38_channel을 k38_chNow로 정의
	    k38_info = "TV 맞춤 설정 완료";	//k38_info를 "TV 맞춤 설정 완료"로 정의
	}		
	
	//4. 볼륨관련 메서드 : 리턴값 없음
	//볼륨업
	void k38_volUp() {
		if (k38_vol == k38_volUpMax) {	//현재 볼륨이 최대볼륨이면
			k38_info = "최대 볼륨입니다.";	//안내멘트는 "최대 볼륨입니다"로 정의
		} else {	//현재볼륨이 최대볼륨이 아니면
			k38_vol++;	//볼륨 1씩 증가
			k38_info = String.format("현재 볼륨은 %d 입니다.", k38_vol);	//현재볼륨 안내멘트로 정의
		}
	}

	//볼륨다운
	void k38_volDown() {	
		if (k38_vol == k38_volDownMin) {		//현재 볼륨이 최소볼륨이면
			k38_info = "최소 볼륨입니다.";		//안내멘트는 "최소 볼륨입니다"로 정의
		} else {		//현재볼륨이 최소볼륨이 아니면
			k38_vol--;	//볼륨 1씩 감소	
			k38_info = String.format("현재 볼륨은 %d 입니다.", k38_vol);	//현재볼륨 안내멘트로 정의
		}
	}


	//5. 채널관련 메서드 : 리턴값 없음
	//채널업
	void k38_channelUp() {
		if (k38_channel == k38_channelUpMax) {		//현재 채널이 마지막채널이면
			k38_info = "마지막 채널입니다.";		//안내멘트는 "마지막 채널입니다"로 정의
		} else {		//현재채널이 마지막채널이 아니면
			k38_channel++;	//채널 1씩 감소	
			k38_info = String.format("현재 채널은 %d 입니다.", k38_channel);	//현재채널 안내멘트로 정의
		}
	}

	//채널다운
	void k38_channelDown() {
		if (k38_channel == k38_channerDownMin) {		//현재 채널이 처음채널이면
			k38_info = "처음 채널입니다.";		//안내멘트는 "처음 채널입니다"로 정의
		} else {		//현재채널이 처음채널 아니면
			k38_channel--;	//채널 1씩 감소	
			k38_info = String.format("현재 채널은 %d 입니다.", k38_channel);	//현재채널 안내멘트로 정의
		}
	}
	
	
	//6. 입력받은 값만큼 값 변경
	//입력받은 값만큼 볼륨업
	void k38_volUp (int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++)//0에서 k38_u 전까지 반복
			this.k38_volUp();	//this를 쓰면 명확
	}
	
	//입력받은 값만큼 볼륨 다운
	void k38_volDown (int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++)//0에서 k38_u 전까지 반복
			this.k38_volDown();	//this를 쓰면 명확
	}
	
	//입력받은 값만큼 채널업
	void k38_channelUp (int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++)//0에서 k38_u 전까지 반복
			this.k38_channelUp();	//this를 쓰면 명확
	}
	
	//입력받은 값만큼 채널 다운
	void k38_channelDown (int k38_u) {
		for (int k38_i = 0; k38_i < k38_u; k38_i++)//0에서 k38_u 전까지 반복
			this.k38_channelDown();	//this를 쓰면 명확
	}
	
	//7. 상황 안내문구 출력 메서드
	//최대 볼륨, 최소 볼륨, 현재볼륨 안내
	void k38_volInfo (String k38_id) {
		System.out.printf("%s => [%s] 최대볼륨 [%d] 최소볼륨[%d] 현재볼륨[%d]\n", k38_id, k38_info, k38_volUpMax , k38_volDownMin , k38_vol); 
	}
	////마지막 채널, 처음 채널, 현재 채널 안내
	void k38_chInfo (String k38_id) {
		System.out.printf("%s => [%s] 마지막채널 [%d] 처음채널[%d] 현재채널[%d]\n", k38_id, k38_info, k38_channelUpMax, k38_channerDownMin, k38_channel); 
	}
}