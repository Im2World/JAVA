package a_0404;

import java.util.Scanner;

public class A1_�Է¹������忡��_�Է¹��� char�� ù��°�����ϴ��ε���1 {
//�ҹ���, �빮�� ã�� ó���߰ߵ� ����ǥ�� (�ε��� + 1)
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		cal();
	}	//main
		
	public static void cal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String input = sc.nextLine(); // �����Է�
			
		// 2. ����ڰ� ã�� ���ĺ� �Է�, �迭 ����
		System.out.println("Enter the alphabet you are looking for : ");
		String findWord = sc.nextLine();
		char [] arr = findWord.toCharArray();	//String findWord�� char�� �迭arr�� ��ȯ => findWord�� �ѱ��ھ� �߶� char�迭�� ����
		
		// 3. ù��°�� ������ �ε��� ��ȯ
		System.out.println(input.indexOf(arr[0])+1);
	} //cal
} //class



/*
Enter the sentence : 
Live the life you love. Love the life you live.
Enter the alphabet you are looking for : 
y
15
*/