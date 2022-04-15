package javaPro_lec04_0415_ppt;

//비정형 비교(룰이 애매한)는 배열을 이용하는 것도 한 방법.
//단, 배열은 0부터 시작한다. k38_lastMonthDate
public class p11_달력_비정형비교_Array_굿 {

	public static void main(String[] args) {
		//배열 선언 및 초기화
		int[] k38_lastMonthDate = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 배열은 인덱스가 0부터 시작!
		// k38_lastMonthDate[0] ~ k38_lastMonthDate[11]

		//월 출력 : 1~12월
		for (int k38_i = 1; k38_i < 13; k38_i++) {
			System.out.printf(" %d월 => ", k38_i);	//%d에 k38_i값이 들어간다.
			
			//일 출력 : 1~31일
			for (int k38_j = 1; k38_j < 32; k38_j++) {
				System.out.printf("%d", k38_j);	//%d에 k38_j값이 들어간다.
				//이 if문 덕분에 각 월의 마지막 일자는 , 가 안찍힌다. 말일이 되면 System.out.printf(","); 까지 가지않고 break
				if (k38_lastMonthDate[k38_i - 1] == k38_j)	//배열 인덱스가 0부터 시작하니까 k38_i-1을 함. 각 월의 마지막일자 값 찾음.
					break;
				System.out.printf(",");	//일자 사이에 , 출력
			}
			System.out.printf("\n");	//줄 바꿈
		}
	}
}

/*
<1회차>
k38_i = 1일 때
k38_lastMonthDate[k38_i - 1] == k38_j => k38_lastMonthDate[1 - 1] => k38_lastMonthDate[0] = 31 => k38_lastMonthDate[0] == k38_j 일때 종료 => k38_j가 31이면 종료

<2회차>
k38_i =2 일때
k38_lastMonthDate[k38_i - 1] == k38_j => k38_lastMonthDate[2 - 1] => k38_lastMonthDate[1] = 28 => k38_lastMonthDate[1] == k38_j 일때 종료 => k38_j가 28이면 종료

...

k38_i = 12까지 반복
 */
