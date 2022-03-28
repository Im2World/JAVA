package a_0328;

//a2 _ switch 1ȸ, while2ȸ
public class a2 { 
	public static void main(String[] args) {
		int i = 2;
		int j = 2;

		while (i < 10) {
			i++;

			switch (i) {
			case 2:
				while (i == 2) {				
					j = 2;
					while (j <= 9) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
						j++;
					}
					i++;
				}
				break;

			case 3:
				while (i == 3) {
					j = 2;
					while (j <= 9) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
						j++;
					}
					i++;
				}
				break;

			case 4:
				while (i == 4) {
					j = 2;
					while (j <= 9) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
						j++;
					}
					i++;
				}
				break;

			case 5:
				while (i == 5) {
					j = 2;
					while (j <= 9) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
						j++;
					}
					i++;

				}
				break;

			case 6:
				while (i == 6) {
					j = 2;
					while (j <= 9) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
						j++;
					}
					i++;
				}
				break;
 
			case 7:
				while (i == 7) {
					j = 2;
					while (j <= 9) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
						j++;
					}
					i++;
				}
				break;

			case 8:
				while (i == 8) {
					j = 2;
					while (j <= 9) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
						j++;
					}
					i++;
				}
				break;

			case 9:
				while (i == 9) {
					j = 2;
					while (j <= 9) {
						System.out.printf("%d x %d = %d\n", i, j, i * j);
						j++;
					}
					i++;
				}
				break;
			default:
				System.out.println(i);
				System.out.println("Please enter a number from 2 to 9");
				break;
			}
		}
	}
}