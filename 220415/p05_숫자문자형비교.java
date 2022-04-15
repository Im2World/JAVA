package javaPro_lec04_0415_ppt;

public class p05_숫자문자형비교 {

	public static void main(String[] args) {
		int k38_a;
		double k38_b;

		k38_a = 10 / 3; // 출력: 3
		k38_b = 10 / 3.0; // 출력: 3.3333333333333335
		// double형이라서 3.0으로 나눠야 소수점이하까지 출력
		// 10/3 하면 3.0으로 출력된다.
		System.out.println(k38_b);

		// int는 정수형 연산, double은 실수형 연산
		// if나 else 코드가 1개 일 때는 { } 생략가능
		if (k38_a == k38_b)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double) k38_a, k38_b);	//k38_a는 double형으로 형변환해 출력

		// 유효숫자까지 표시됐을 뿐 서로 다르다.
		// .3333이 얼마나 길게 나올지를 알 수 없기 때문
		if (k38_b == 3.333333)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[3.333333][%f]\n", (double) k38_b);	//직접 3.33333이라고 입력

		// double인 k38_b를 int형으로 형변환 후 비교(type casting)
		k38_b = (int) k38_b; // 소수점이하가 버려진다. => k38_b = 3.0
		if (k38_a == k38_b)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double) k38_a, k38_b);	//k38_a는 double형으로 형변환해 출력

		// int k38_a을 int와 double로 인쇄할 때 비교
		System.out.printf("int로 인쇄[%d][%f]\n", k38_a, k38_b);
		System.out.printf("double로 인쇄[%f][%f]\n", (double) k38_a, k38_b);	//k38_a는 double형으로 형변환해 출력

		// char 문자 비교는 ==
		char k38_charA = 'c';
		if (k38_charA == 'b')		//k38_charA가 'b'면 
			System.out.printf("k38_charA는 b이다.\n");	//이 문구 출력
		if (k38_charA == 'c')		//k38_charA가 'c'면 
			System.out.printf("k38_charA는 c이다.\n");	//이 문구 출력
		if (k38_charA == 'd')		//k38_charA가 'd'면 
			System.out.printf("k38_charA는 d이다.\n");	//이 문구 출력

		// String 문자열 비교 equals
		String k38_charB = "efghijk";	//k38_charB선언

		if (k38_charB.equals("efghijk"))	//k38_charB가 efghijk와 같으면
			System.out.printf("k38_charB는 efghijk이다.\n");		//이 문구 출력
		else	//efghijk 와 다르면
			System.out.printf("k38_charB는 efghijk가 아니다.\n");	//이 문구 출력

		// 참 거짓 구분
		//!! 은 not not 이다. =>  이중부정
		boolean k38_tf = true;
		if (!!k38_tf)	//k38_tf가 아니고, k38_tf가 아니라면
			System.out.printf("tf가 아니고 아니면 참이다.\n");	//이 문구 출력
		else
			System.out.printf("tf가 아니고 아니면 거짓이다.\n");	//이 문구 출력
	}
}
