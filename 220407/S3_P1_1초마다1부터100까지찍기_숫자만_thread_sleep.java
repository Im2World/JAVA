package lecture0407;

public class S3_P1_1초마다1부터100까지찍기_숫자만_thread_sleep {
//1초마다 1씩 찍어서 1~100까지 100초동안 출력
	public static void main(String[] args) {
		cal();
		}
	
	public static void cal() {
		for (int i = 1; i < 101; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000); // 1초마다 실행
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


/*
1
2
3
4
5
6
7
8
9
10
11
... 100까지 찍힌다.
*/
