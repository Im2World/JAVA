package lecture0329;

import java.util.Scanner;

public class p14_����_��_����üũ {
//����consonant and ����vowel
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		String vowelGroup = "aeiou";
		String consonantGroup = "bcdfghjklmnpqrstvwxyz";

		String[] vowel = vowelGroup.split("");	//�ɰ���
		String[] consonant = consonantGroup.split("");

		for (int i = 1; i < strArr.length; i++) {
			for (int j = 0; j < vowel.length; j++) {
				if (strArr[i].substring(0, 1).contains(vowel[j])) {
					if (strArr[i - 1].equals("a")) {
						strArr[i - 1] = "an";
					}
				}
			}
			for (int z = 0; z < consonant.length; z++) {
				if (strArr[i].substring(0, 1).contains(consonant[z])) {
					if (strArr[i - 1].equals("an")) {
						strArr[i - 1] = "a";
					}
				}
			}
		}
		for (int i = 0; i < strArr.length; i++)
			System.out.print(strArr[i] + " ");
	}
}