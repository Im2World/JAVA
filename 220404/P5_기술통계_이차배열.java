package �ǽ�_0404;

public class P5_������_�����迭 {

	public static void main(String[] args) {
		//1. ������ �迭 ����
		String[][] data = {
				{ "Name", "Korean", "English", "Math" },  //data[0][0],data[0][1],data[0][2],data[0][3]
				{ "Jeong", "70", "80", "100" }, //data[1][0], data[1][1], data[1][2], data[1][3]
				{ "Pyo", "60", "70", "86" }, //data[2][0], data[2][1], data[2][2], data[2][3]
				{ "Choi", "54", "100", "82" }, //data[3][0], data[3][1], data[3][2], data[3][3]
				{ "Mike", "87", "95", "79" } //data[4][0], data[4][1], data[4][2], data[4][3]
				};
				
		//2. ������ �迭 ���� ���
		for (int i = 0; i < data.length; i++) { 	// �� ���� ����
			for (int j = 0; j < data[i].length; j++) {	//�� �������� ���� �� ������ �p����
				System.out.print(data[i][j] + "\t");	//��½� ����������� \t ���
			}
			System.out.println(""); //�ٹٲ�
		}
		System.out.println("");
		
		//3. �л��� �հ�, ���, �ִ밪, �ּڰ� ���
		int[] sumStudent = new int[data.length - 1];	//1���迭 ũ��� 2���迭 �� �ε������� ����
		int[] avgStudent = new int[data.length - 1];
		int[] minStudent = new int[data.length - 1];	
		int[] maxStudent = new int[data.length - 1];
		
		//���ʼ���
		System.out.println("NAME" + "\t" + "SUM" + "\t" + "AVG" + "\t" + "MIN" + "\t" + "MAX");
		for (int i = 0; i < data.length - 1; i++) {	//2���迭 ��Ž��
			minStudent[i] = Integer.MAX_VALUE; 
				//�ּڰ� ã��������. ������ �� ���� ū���� min�� ����. //��� �׳� ������� ���̴�. ������� �͵� �꺸�� �۴�.
			maxStudent[i] = Integer.MIN_VALUE;
			for (int j = 1; j < data[i].length; j++) {	//��Ž��, ���ʻ��� ���ڰ��ִ� �ε���1������ Ž�� 
				sumStudent[i] += Integer.parseInt(data[i + 1][j]);
				//sumStudent[0] = sumStudent[0]+data[1][1]+data[1][2]+data[1][3]
				//sumStudent[1] = sumStudent[1]+data[2][1]+data[2][2]+data[2][3]
				//sumStudent[2] = sumStudent[2]+data[3][1]+data[3][2]+data[3][3]
				//sumStudent[3] = sumStudent[3]+data[4][1]+data[4][2]+data[4][3]
				
				//���ʻ��� ���ڰ��� [1][1], [2][1]���Ͷ� data[i + 1][j]��.
				minStudent[i] = Math.min(minStudent[i], Integer.parseInt(data[i + 1][j]));
					//minStudent[i], Integer.parseInt(data[i + 1][j]) �� �������� minStudent[i]�� ���
					//�̰� ��� �ݺ��Ǹ�, ���� ���� ���� minStudent[i]�� ���� �ȴ�.
				maxStudent[i] = Math.max(maxStudent[i], Integer.parseInt(data[i + 1][j]));
				//Math.min (a,b) : �� ���� ���� �� ��ȯ
			}
			avgStudent[i] = sumStudent[i] / (data[i].length - 1);
				//�л��� ��� 1�� ��. �л��� ��� ����.
				//avgStudent[0] = sumStudent[0] / (data[0].length - 1); => data[0].length - 1�� data[0]�� ������ �ε�����
			
			//���ʸ��缭 ������� ���
			System.out.println(data[i + 1][0] + "\t" + sumStudent[i] + "\t" + avgStudent[i] + "\t" + minStudent[i] + "\t"
					+ maxStudent[i]);
			//i = 0; data[1][0]+sumStudent[0]+avgStudent[0]+minStudent[0]+maxStudent[0]
		} //�� for�� ����
		System.out.println();
		
		//3. ���� �հ�, ���, �ִ�, �ּڰ� ���
		int[] sumSubject = new int[data[0].length - 1];	//1���迭�̴�
		int[] avgSubject = new int[data[0].length - 1];
		int[] minSubject = new int[data[0].length - 1];
		int[] maxSubject = new int[data[0].length - 1];
		
		System.out.println("SUBJECT" + "\t" + "SUM" + "\t" + "AVG" + "\t" + "MIN" + "\t" + "MAX");
		
		for (int i = 0; i < data[i].length - 1; i++) {
			minSubject[i] = Integer.MAX_VALUE; //��� �׳� ������� ���̴�. ������� �͵� �꺸�� �۴�.
			maxSubject[i] = Integer.MIN_VALUE;
			for (int j = 1; j < data.length; j++) {	//0���� �̸��̶� �ʿ��� 1������ ����
				sumSubject[i] += Integer.parseInt(data[j][i + 1]);
					//sumSubject[i] ���� ��� data[1][1]+data[2][1]+data[3][1]�� ���Ѵ�.
				minSubject[i] = Math.min(minSubject[i], Integer.parseInt(data[j][i + 1]));
				maxSubject[i] = Math.max(maxSubject[i], Integer.parseInt(data[j][i + 1]));
			}
			avgSubject[i] = sumSubject[i] / (data.length - 1);
			
			System.out.println(data[0][i + 1] + "\t" + sumSubject[i] + "\t" + avgSubject[i] + "\t" + minSubject[i]
					+ "\t" + maxSubject[i]);
		} //�� for��
	} //main
} //class
