package a_0329;

import java.util.Scanner;

//a2_입력받은 숫자 성질(양,음,홀,짝) 판별 + 판별결과누적
public class a2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pNum = 0, nNum = 0, oNum = 0, eNum = 0;
		//positive, negative, even, odd Number
		System.out.println("Enter the number.");
		while (true) {// 무한반복
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("0은 판별할 수 없습니다.");
				continue; // 다시입력받음.
			} else if (num > 0) {	//양수
				pNum++;
				if (num % 2 == 0) {
					eNum++;	//짝 even Number
				} else {
					oNum++;	//홀	odd Number
				}
			} else { // 음수
				nNum++;
				if (num % 2 == 0) {
					eNum++;
				} else {
					oNum++;
				}
			}

			// 출력
			System.out.println("P: " + pNum + " , N: " + nNum + " , O: " + oNum + " , E: " + eNum);
			System.out.println("");
		} // while(true) close
	}
}
