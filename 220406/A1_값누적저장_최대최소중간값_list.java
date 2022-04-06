package a_0406_9강;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1_값누적저장_최대최소중간값_list {
//list를 사용하라.
	public static void main(String[] args) {
		cal();
	}

	public static void cal() {
		int count = 1, sum = 0, mean = 0, max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
		int text;

		while (true) {
			List<Integer> data = new ArrayList<Integer>();
			System.out.println("Enter the number : ");
			text = sc.nextInt();
			data.add(text);

			for (int i = 0; i < data.size(); i++) {
				sum += data.get(i);
			}

			if (count == 1) {
				mean = data.get(0);
				max = data.get(0);
				min = data.get(0);
			}

			for (int j = 0; j < data.size(); j++) {
				if (count > 1) {
					if (data.get(j) > max) {
						max = data.get(j);
					} else if (data.get(j) < min) {
						min = data.get(j);
					}
				}
			}

			mean = sum / count;

			System.out.println("Number of trials : " + count + ", SUM : " + sum + ", MEAN : " + mean + ", MAX : " + max
					+ ", MIN : " + min);
			System.out.println("______________________________________________________________");
			System.out.println("");
			count++;
		}
	}
}

/*
Enter the number : 
10
Number of trials : 1, SUM : 10, MEAN : 10, MAX : 10, MIN : 10
______________________________________________________________

Enter the number : 
5
Number of trials : 2, SUM : 15, MEAN : 7, MAX : 10, MIN : 5
______________________________________________________________

Enter the number : 
2
Number of trials : 3, SUM : 17, MEAN : 5, MAX : 10, MIN : 2
______________________________________________________________

Enter the number : 
*/
