package javaPro_lec04_0415_ppt;

//억지예제라서 이런 프로그래밍은 권장X
public class p10_달력_비정형비교_case문_매우나쁜예 {
	public static void main(String[] args) {
		
		//각 월 출력 : 1~12월    k38_i는 1~12
		for(int k38_i = 1; k38_i < 13; k38_i++) {
			System.out.printf(" %d월 => ", k38_i);
			
			//LOOP!!!
			// k38_i는 1~ 31 => 각 월 일자 표시
			LOOP:for(int k38_j = 1; k38_j < 32; k38_j++) {
				System.out.printf("%d,",k38_j);
				
				//for문 대신 switch문 사용 
				switch(k38_i) {
				//k38_i가 4 또는 6또는 9또는 11이면 k38_j는 1부터 30까지 출력
				case 4:case 6:case 9: case 11:
					if(k38_j == 30) break LOOP;
					//이런표현은 거의 안한다.
					//LOOP라는 표시자가 없으면 엉뚱한 결과출력
					//k38_j 가 30이면 switch문 탈출 해서 LOOP로 돌아감
					break;
					
				case 2:
					//k38_i가 2이면 k38_j는 1부터 28까지 출력
					if(k38_j == 28) break LOOP;	//22라인LOOP종료 후 12라인 LOOP로 점프해서 되돌아 간다.
					//k38_j 가 28이면 switch문 탈출 해서 LOOP로 돌아감
					break;
					
				//이외의 케이스인 1,3,5,7,10,12월은 31일까지 출력
				}
			}
			System.out.printf("\n");	//줄바꿈
		}
	}
}
