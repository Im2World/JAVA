package lecture0329;
//SimpleDateFormat �� ��¥ ���¸� ��������� ��ȯ
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class calendar_�ش���ϼ�����_�����Է¹ޱ� {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		System.out.println("���۳���� �Է� : ");
		System.out.println("��) 2020/02/03 ");
		String date1 = sc.nextLine();
		System.out.println("�񱳳���� �Է� : ");
		System.out.println("��) 2020/02/12 ");
		String date2 = sc.nextLine();

		Date format1 = new SimpleDateFormat("yyyy/MM/dd").parse(date1);
		Date format2 = new SimpleDateFormat("yyyy/MM/dd").parse(date2);

		long diffSec = (format1.getTime() - format2.getTime()) / 1000; // �� ����
		long diffMin = (format1.getTime() - format2.getTime()) / 60000; // �� ����
		long diffHor = (format1.getTime() - format2.getTime()) / 3600000; // �� ����
		long diffDays = diffSec / (24 * 60 * 60); // ���ڼ� ����(��*��*��)

		System.out.println(diffSec + "�� ����");
		System.out.println(diffMin + "�� ����");
		System.out.println(diffHor + "�� ����");
		System.out.println(diffDays + "�� ����");
	}
}