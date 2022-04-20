package javaPro_lec06_self_ppt;
//자바심화 6강_슬9
//클래스, 객체, 인스턴스
public class p09_1_tvRemotecon {
	//1. 각종 변수 선언 및 초기화
	int k38_volUpMax = 5;		//정수형 변수 최대볼륨 10 정의
	int k38_volDownMin = 0;		//정수형 변수 최소볼륨 0 정의
	int k38_channelUpMax = 10;	//정수형 변수 최대채널 5 정의
	int k38_channerDownMin = 0;	//정수형 변수 최소채널 0 정의
	int k38_vol = 1;	//정수형 변수 현재 볼륨 1로정의
	int k38_channel = 1;	//정수형 변수 현재 채널 1로 정의
	String k38_info;	//안내문구출력할 문자열 k38_info 선언
	

	//2. 채널관련 메서드 : 리턴값 없음
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
	
	//3. 볼륨관련 메서드 : 리턴값 없음
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
}
