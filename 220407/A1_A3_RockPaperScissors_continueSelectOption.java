package a_0407;

import java.util.Scanner;

public class A1_A3_RockPaperScissors_continueSelectOption {
	public static void main(String[] args) {
		RockPaperScissors();
	}

	public static void RockPaperScissors() {
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		while (exit == 0) {
			int randomNum = (int) (Math.random() * 3); // (int) Math.random() * (최댓값-최소값+1) + 최소값
			System.out.println("0: Rock, 1: Paper, 2: Scissor");
			System.out.print("Enter the number : ");
			int input = sc.nextInt();

			if (input == 0 || input == 1 || input == 2) {
				// 컴퓨터 패
				if (randomNum == 0) {
					System.out.println("Computer : Rock");
				} else if (randomNum == 1) {
					System.out.println("Computer : Paper");
				} else if (randomNum == 2) {
					System.out.println("Computer : Scissor");
				}

				// 플레이어패
				if (input == 0) {
					System.out.println("Player : Rock");
				} else if (input == 1) {
					System.out.println("Player : Paper");
				} else if (input == 2) {
					System.out.println("Player : Scissor");
				}

				// 승패판정
				if ((randomNum == 0 && input == 1) || (randomNum == 1 && input == 2)
						|| (randomNum == 2 && input == 0)) {
					System.out.println("Player wins!\n");
				} else if ((randomNum == 0 && input == 2) || (randomNum == 1 && input == 0)
						|| (randomNum == 2 && input == 1)) {
					System.out.println("Computer wins!\n");
				} else if (randomNum == input) {
					System.out.println("Player and computer draw.\n");
				}
			} else {
				System.out.println("Check the number.\n");
				System.out.println("");
				continue;
			}

			// 게임 종료 여부
			int continueChoice = 0;
			while (continueChoice == 0) {
				System.out.println("Do you want continue the game?");
				System.out.println("1: YES , 2: NO");
				System.out.print("Enter the number : ");
				int choice = sc.nextInt();

				if (choice == 1) {
					exit = 0;
					continueChoice++;
				} else if (choice == 2) {
					exit = 1;
					continueChoice++;
					System.out.println("Bye Bye~");
				} else {
					System.out.println("Check the number!");
					System.out.println("");
					continue;
				}
				System.out.println("");
			}
		} // while
	}
} // class
