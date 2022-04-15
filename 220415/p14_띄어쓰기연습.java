package javaPro_lec04_0415_ppt;

public class p14_띄어쓰기연습 {

	public static void main(String[] args) {
		for(int k38_i = 0; k38_i < 10; k38_i++) {	//한 줄씩 출력
			for(int k38_j = 0; k38_j < k38_i; k38_j++) {	//띄어쓰기 출력
				System.out.printf(" ");
			}
			System.out.printf("%d\n", k38_i);	//int k38_i라서 %d 사용
		}
	}
}

/*
0
 1
  2
   3
    4
     5
      6
       7
        8
         9
*/

/*
<1회차>
k38_i = 0, k38_j = 0
k38_j < k38_i 여야하는데 둘이 같으므로 띄어쓰기 출력없이 바로 k38_i출력 = > 0

<2회차>
k38_i = 1, k38_j = 0
k38_j < k38_i 이면 띄어쓰기 출력 => 띄어쓰기 1회만 출력 => 띄어쓰기1

<3회차>
k38_i = 2, k38_j = 0
k38_j < k38_i 이면 띄어쓰기 출력 => 띄어쓰기 0, 1회 => 총띄어쓰기 2회 => 띄어쓰기2번 2

<4회차>
k38_i = 3, k38_j = 0
k38_j < k38_i 이면 띄어쓰기 출력 => 띄어쓰기 0, 1, 2회 => 총띄어쓰기 3회 => 띄어쓰기3번 3

k38_i = 9까지 계속 반복
k38_i = 9는 띄어쓰기 0~8 => 총 9회
*/