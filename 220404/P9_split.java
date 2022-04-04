package ½Ç½À_0404;

public class P9_split {

	public static void main(String[] args) {
		String words = "Kim,Lee,park";
		String[] names = words.split(",");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}