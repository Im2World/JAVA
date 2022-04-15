package javaPro_lec04_0415_ppt;

//범위 지정, 숫자 자르기
public class p12_숫자읽기 {

	public static void main(String[] args) {
		//한글 배열 생성
		String[] k38_numArr = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		
		//k38_i는 0 ~ 100까지 k38_i가 1씩 증가하며 반복
		for (int k38_i = 0; k38_i < 101; k38_i++) {
			
			//k38_i가 0~9면 일의자리
			if (k38_i >= 0 && k38_i < 10) {
				System.out.printf("일의 자리 : %s\n", k38_numArr[k38_i]);	//k38_numArr[k38_i]가 String이라서 %s로 받아준다.
			}
			
			//k38_i가 10~99까지는 십의자리, 일의자리 분리해서 따로 읽음
			// 56 = 오십육
			// 0은 읽지 않는다.
			else if (k38_i >= 10 && k38_i < 100) {
				int k38_ten, k38_zero;	//정수형 변수 선언
				k38_ten = k38_i / 10; // 십의 자리 => k38_i를 10으로 나눈 몫
				k38_zero = k38_i % 10; // 일의 자리	=> k38_i를 10으로 나눈 나머지
				if (k38_zero == 0) {	//일의자리가 0이라면
					System.out.printf("십의자리 : %s십\n", k38_numArr[k38_ten]);	//일의자리는 출력하지않는다.  => 10을 십영이라고 하지 않음
				} else { //일의 자리가 0이 아니라면
					System.out.printf("십의자리 : %s십%s\n", k38_numArr[k38_ten], k38_numArr[k38_zero]);	//십의자리, 일의 자리 모두 출력.
				}
			}	//else if
			else	//i의 마지막 값인 100출력
				System.out.printf("==> %d\n", k38_i);
		}	//for
	}
}

/*
k38_ten = k38_i / 10; => k38_i가 10이라면 k38_ten 은 1
k38_zero = k38_i % 10 => k38_i가 10이라면 k38_zero 는 0 => 일의 자리는 읽지 않음
=> 출력: 십
*/