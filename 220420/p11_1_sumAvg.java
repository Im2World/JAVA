package javaPro_lec06_self_ppt;
//자바심화 6강 슬11
//메소드 오버로딩 _ 총점, 평균구하기

public class p11_1_sumAvg {
	//1.과목총점계산 메서드
	//3개 과목 총점
	public int k38_sum (int k38_a, int k38_b, int k38_c) {
		return k38_a + k38_b + k38_c;	//인자를 모두 더한 값 반환
	}
	
	//4개 과목 총점
	public int k38_sum (int k38_a, int k38_b, int k38_c, int k38_d) {
		return k38_a + k38_b + k38_c + k38_d;	//인자를 모두 더한 값 반환
	}
	
	//5개 과목 총점
	public int k38_sum (int k38_a, int k38_b, int k38_c, int k38_d, int k38_e) {
		return k38_a + k38_b + k38_c + k38_d + k38_e;	//인자를 모두 더한 값 반환
	}
	
	//2. 과목평균계산 메서드
	//3개 과목 평균
	public double k38_avg (int k38_a, int k38_b, int k38_c) {
		return (k38_a + k38_b + k38_c) / 3;	//인자를 모두 더한 뒤 인자수 만큼 나눈값 반환
	}

	//4개 과목 평균
	public double k38_avg (int k38_a, int k38_b, int k38_c, int k38_d) {
		return (k38_a + k38_b + k38_c + k38_d) / 4;	//인자를 모두 더한 뒤 인자수 만큼 나눈값 반환
	}

	//5개 과목 평균
	public double k38_avg (int k38_a, int k38_b, int k38_c, int k38_d, int k38_e) {
		return (k38_a + k38_b + k38_c + k38_d + k38_e) / 5;	//인자를 모두 더한 뒤 인자수 만큼 나눈값 반환
	}
}