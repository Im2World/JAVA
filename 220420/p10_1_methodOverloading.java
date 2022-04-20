package javaPro_lec06_self_ppt;
//메서드 오버로딩 _ 자바심화06강 슬10
//동일 메서드명에 인자를 다르게 사용하는 것.
public class p10_1_methodOverloading {
	//전부 더하기 메서드들이지만, 매개변수 숫자가 다르다.
	
	//1. 메서드 sum 오버로딩 : int값 리턴
	public int k38_sum(int k38_a, int k38_b) {	//정수형 변수 k38_a,k38_b를 매개변수로 받음
		return k38_a + k38_b;		//변수들 합을 반환
	}
	
	public int k38_sum(int k38_a, int k38_b, int k38_c) {	//정수형 변수 k38_a,k38_b,k38_c를 매개변수로 받음
		return k38_a + k38_b + k38_c;	//변수들 합을 반환
	}
	
	public int k38_sum(int k38_a, int k38_b, int k38_c, int k38_d) {	//정수형 변수 k38_a,k38_b,k38_c,k38_d를 매개변수로 받음
		return k38_a + k38_b + k38_c + k38_d;	//변수들 합을 반환
	}
	
	//2. 매개변수가 k38_a, k38_b로 (int k38_a, int k38_b)와 같아서 이 메서드는 double형으로 변경
	//double값 리턴
	public double k38_sum(double k38_a, double k38_b) {	//더블형 변수 k38_a,k38_b를 매개변수로 받음
		return k38_a + k38_b;	//변수들 합을 반환
	}
}
