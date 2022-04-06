package a_0406_9°­;
/*
<Condition>
User inputs the 5 sets of names and scores
Print the rank of scores
Use an arraylist
 */
import java.util.Scanner;

public class A2_nameScoreArr_rank {
	public static void main(String[] args) {
		cal();
	}

	public static void cal() {
		String[] data = new String[5];
		Scanner sc = new Scanner(System.in);
		String inputText;
		System.out.println("Enter 5 sets of names and scores : ");
		System.out.println("ex) mike 90");
		for (int i = 0; i < 5; i++) {
			inputText = sc.nextLine();
			data[i] = inputText;
		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < 4; j++) {
				if (Integer.parseInt(data[j].replaceAll("[^0-9]", "")) < Integer.parseInt(data[j + 1].replaceAll("[^0-9]", ""))) {
					String temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		System.out.println("\n<Rank>");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}

/*
Enter 5 sets of names and scores : 
ex) mike 90
haha 100
hoho 90
nana 96
ddubi 88
pho 92

<Rank>
haha 100
nana 96
pho 92
hoho 90
ddubi 88
*/