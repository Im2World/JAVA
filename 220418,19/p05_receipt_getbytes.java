package javaPro_lec05_0418_ppt;
//******������, �ΰ��� ���*******
//�Һ��ڰ� / 11 = �ΰ���
//�Һ��ڰ� / 11 * 10 = ������
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//�����ʿ� _ �ּ�����, head, body, tail����   // �׸� 3���̻� ���������ϱ�
//��8 
//���������2 => �ʺ� 46ĭ
//���̼� ������ : �ΰ��� 454.5 => �ø��ؼ� 455������
//����: �����հ� 4,545 , �ΰ��� 455 , ���� 5,000
public class p05_receipt_getbytes {
	public static void main(String[] args) {
		//1. ���İ��� �۾�
		//�ŷ����� ��º�		
		Calendar k38_calendar = Calendar.getInstance();		//Calendar.getInstance() �� ������ �������, �ú��� Ȯ��
		SimpleDateFormat k38_sdt = new SimpleDateFormat ("YYYY.MM.dd HH:mm:ss");	//Calendar�� �޾ƿ� ���� ���� ���� ����, SimpleDateFormat�� ������ %s�� �޴´�.
		
		//�ݾ׿� �޸� ���
		//DecimalFormat �� ���ڵ������� ��������		
		DecimalFormat k38_df = new DecimalFormat ("###,###,###,###");	   //3�ڸ�����(õ ������) �޸� ���
		
		//2. �� �׸�� ����
		//�׸�1 
		String k38_itemName1 = "�����׸� KF94 ����ũ";  //�׸�� ���� �� ����
		String k38_itemCode1 = "1031615"; 				//��ǰ�ڵ� ���� �� ����
		int k38_price1 = 3000;  						//�Һ��ڰ� ���� �� ����
		int k38_amount1 = 1;  							//���Ű��� ���� �� ����
		//�׸�2
		String k38_itemName2 = "�ٿ뵵���ɱ�����������(���)"; //�׸�� ���� �� ����
		String k38_itemCode2 = "11008152"; 				//��ǰ�ڵ� ���� �� ����
		int k38_price2 = 1000;  						//�Һ��ڰ� ���� �� ����
		int k38_amount2 = 1;  							//���Ű��� ���� �� ���� 
		//�׸�3
		String k38_itemName3 = "�𳪹�0.3mm(����)"; 	//�׸�� ���� �� ���� 
		String k38_itemCode3 = "1020800"; 				//��ǰ�ڵ� ���� �� ����
		int k38_price3 = 1000;  						//�Һ��ڰ� ���� �� ���� 
		int k38_amount3 = 1;  							//���Ű��� ���� �� ���� 
		//�׸�4
		String k38_itemName4 = "�����ߵǴ�PPĿ����ö��ø(80��/1��)"; 	//�׸�� ���� �� ���� 
		String k38_itemCode4 = "1023723"; 					//��ǰ�ڵ� ���� �� ����
		int k38_price4 = 1000;  							//�Һ��ڰ� ���� �� ���� 
		int k38_amount4 = 1;  								//���Ű��� ���� �� ���� 
						
		
		//3. ����
		//�Һ��ڰ� �Ѿ�(�Һ��ڰ� * ������ ����) _ �׸�3�� �� ����
		double k38_totalPrice =(int) ((k38_price1*k38_amount1) + (k38_price2*k38_amount2) + (k38_price3*k38_amount3));
		
		//�� ������ ��
		double k38_totalPreTaxPrice = (int)(k38_totalPrice / 11 * 10);
		
		//�� �ΰ��� �� = �Һ��ڰ� �Ѿ� - ������ �Ѿ�
		double k38_totalvatPrice = (int) (k38_totalPrice - k38_totalPreTaxPrice);
		
//		//������, �ΰ��� ��� �׽�Ʈ
//		double k38_priceDouble = 3000.0;
//		System.out.println("�Һ��ڰ� : " + k38_priceDouble);
//		System.out.println("������ (k38_priceDouble / 11) : " + (k38_priceDouble / 11));	//��� : 272.72727272727275
//		System.out.println("������ (k38_price1 / 11) : " + (k38_price1 / 11));	//��� : 272  =>  k38_price1 int���̶� �Ҽ����̸� ����
//		System.out.println("������ (k38_price1 / 11 * 10) : " + (k38_price1 / 11 * 10));	//���: 2720 _ k38_price1 int���̶� �Ҽ����̸� ���� 
		
		
		//4.������ ��º�
		//���ڴ� %s�� �̿�, �������� %d�� �̿��� �����ġ�� ����
		//�̹� �������� ������1�� �޸� ���鹮�ھ��� ���ڿ������� ��ġ�� �����ߴ�.
		//-�� ��������(����,���� �ڿ� ĭ Ȯ��), -������ ��������(����, ���� �տ� ĭ Ȯ��)
		//Header
		System.out.printf("%25s\n","���ΰ���, ���̼�"); 	//���ڿ��̶� %s�� �ް�, �������� �� �ٹٲ�
		System.out.println("(��)�Ƽ����̼�_�д缭����");	//println������� �ȳ�������� �� �ٹٲ�
		System.out.println("��ȭ:031-702-6016");			//println������� �ȳ�������� �� �ٹٲ�
		System.out.println("����:���� ������ ���μ�ȯ���� 2748 (���)"); //println������� �ȳ�������� �� �ٹٲ�
		System.out.println("��ǥ��:������,��ȣ�� 213-81-52063");		   //println������� �ȳ�������� �� �ٹٲ�
		System.out.println("����:��� ������ �д籸 �д�� 53���� 11 (����\n��)"); 	 //println������� �ȳ�������� �� �ٹٲ�
		System.out.printf("===============================================\n"); 	//���м� ��� => 46ĭ  //but �ǽ����� 41ĭ�̶� �̰� ������
		System.out.printf("%26s\n","�Һ����߽ɰ濵(CCM) �������");			//���ڿ��̶� %s�� �ް�, �������� �� �ٹٲ�
		System.out.printf("%28s\n","ISO 9001 ǰ���濵�ý��� �������"); 	//���ڿ��̶� %s�� �ް�, �������� �� �ٹٲ�
		System.out.printf("===============================================\n"); 	//���м� ���
		System.out.printf("%30s\n","��ȯ/ȯ�� 14�� (03�� 12��)�̳�,");		//���ڿ��̶� %s�� �ް�, �������� �� �ٹٲ�
		System.out.println("(����)������, ����ī�� ������ ���Ը��忡�� ����"); 
		System.out.printf("%27s\n","����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�"); 	//���ڿ��̶� %s�� �ް�, �������� �� �ٹٲ�
		System.out.printf("%27s\n","üũī�� ��� �� �ִ� 7�� �ҿ�");		//���ڿ��̶� %s�� �ް�, �������� �� �ٹٲ�
		System.out.printf("===============================================\n"); 	//���м� ���
		System.out.printf("%-13s%34s\n","[POS 1383838]",k38_sdt.format(k38_calendar.getTime()));// �ŷ� �ð��� �ǽð����� ����Ʈ����. ������ �̹� �������� �������� �����Ͽ� getTime�ϱ�
		System.out.printf("===============================================\n"); 	//���м� ���
		
		//Body
		//��ǰ��, �Һ��ڰ�, ���Ű���, �Һ��ڰ��Ѿ�(�Һ��ڰ� * ���Ű���), ��ǰ�ڵ� ���
		//�� �ٸ��� �� �׸��� ������ �ִ´�.
		//SimpleDateFormat�� ������ %s�� �޴´�.
		
		//��ǰ1 ���
        System.out.printf("%s %s", k38_subStrByte(k38_itemName1, 24), "");	//��ǰ�� ���
        System.out.printf("%10s %3s %7s\n", k38_df.format(k38_price1), k38_amount1, k38_df.format(k38_price1 * k38_amount1));	//���簡��, ����, �Ѿ�
        System.out.printf("%s%s%s\n","[", k38_itemCode1 ,"]");
        
		//��ǰ2 ���
        System.out.printf("%s %s", k38_subStrByte(k38_itemName2, 24), "");	//��ǰ�� ���
        System.out.printf("%10s %3s %7s\n", k38_df.format(k38_price2), k38_amount2, k38_df.format(k38_price2 * k38_amount2));	//���簡��, ����, �Ѿ�
        System.out.printf("%s%s%s\n","[", k38_itemCode2 ,"]");
        
		//��ǰ3 ���
        System.out.printf("%s %s", k38_subStrByte(k38_itemName3, 24), "");	//��ǰ�� ���
        System.out.printf("%10s %3s %7s\n", k38_df.format(k38_price3), k38_amount3, k38_df.format(k38_price3 * k38_amount3));	//���簡��, ����, �Ѿ�
        System.out.printf("%s%s%s\n","[", k38_itemCode3 ,"]");
        
		//��ǰ4 ���
        System.out.printf("%s %s", k38_subStrByte(k38_itemName4, 24), "");	//��ǰ�� ���
        System.out.printf("%10s %3s %7s\n", k38_df.format(k38_price4), k38_amount4, k38_df.format(k38_price4 * k38_amount4));	//���簡��, ����, �Ѿ�
        System.out.printf("%s%s%s\n","[", k38_itemCode4 ,"]");
		
        //�����հ�, �ΰ���, �Ǹ��հ�, �ſ�ī�� �� ���� ���
		System.out.printf("%-15s%-4s%23s\n","","�����հ�:", k38_df.format((int)k38_totalPreTaxPrice)); // ������ ����
		System.out.printf("%-17s%-3s%23s\n","","�ΰ���:", k38_df.format((int)k38_totalvatPrice)); //�ΰ��� ����
		System.out.printf("-----------------------------------------------\n");	//���м� ���
		System.out.printf("%-1s%39s\n","�Ǹ��հ�", k38_df.format((int)(k38_totalPreTaxPrice + k38_totalvatPrice))); 	//������ ���� + �ΰ��� ���� = �Һ��ڰ� ����
		System.out.printf("===============================================\n"); 	//���м� ���
		System.out.printf("%-1s%39s\n","�ſ�ī��", k38_df.format((int)(k38_totalPreTaxPrice + k38_totalvatPrice)));		//�ſ�ī�� ������ = �Ǹ��հ��
		System.out.printf("-----------------------------------------------\n");	//���м� ���
		System.out.printf("%-1s%39s\n","����ī��","511120**********");  //���ڿ��̶� %s�� ����
		System.out.printf("%-1s%16s%7s\n","���ι�ȣ 77982843(0)","���αݾ�", k38_df.format((int)(k38_totalPreTaxPrice + k38_totalvatPrice)));	//���αݾ� = �Ǹ��հ��
		
		//Tail
		System.out.printf("===============================================\n"); 	//���м� ���
		System.out.printf("%27s%7s\n", k38_sdt.format(k38_calendar.getTime()), "�д缭����");	//Calendar.getInstance() �� ������ �������, �ú��� Ȯ��
		System.out.println("��ǰ �� ��Ÿ ���� : 1577-1577");	//println������� �ȳ�������� �� �ٹٲ�
		System.out.println("����� �� �����̼� ���� ���� : 1599-2211");	//println������� �ȳ�������� �� �ٹٲ�
		System.out.printf("%38s\n","||||| |||| ||||||||||| ||||");		//���ڵ����� ���
		System.out.printf("%32s\n","2112820610158231");	//���ڿ��̶� %s�� �ް�, �������� �� �ٹٲ�
		System.out.printf("-----------------------------------------------\n");	//���м� ���
		System.out.printf("%s%25s","�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n","ȸ������ �� �پ��� ������ ����������! ��"); //printf������� �ȳ�������� �� �ٹٲ�
	}	//main
	
	

	//*******�ٽɺ�*******
	//��ǰ����� 24ĭ
	//5. ����Ʈ���� �ѱ� �ڸ���
	//String�� ��ȯ�ϴ� �Լ�����, ���ڷ� String�� int�� �޴´�.
	//k38_lengthLimit�� ���ڿ��� �ڸ��� ������ �Ǵ� ������
	public static String k38_subStrByte(String k38_str, int k38_lengthLimit) {	//String, int���� �ް�
		if (!k38_str.isEmpty()) {	//k38_str�� ���� �ƴ϶��
			k38_str = k38_str.trim();	//trim�޼��� : ���ڿ��� ���� ���ʰ���, ���� ������ ���� �����ϰ� �ٽ� k38_str�� ����
			if (k38_str.getBytes().length < k38_lengthLimit) {	//���ڷ� ���� k38_str�� ����Ʈ���� �ް�, ����Ʈ���� ���̰� k38_lengthLimit���� ������ => �������̶��
				//��ǰ�� �������� ������ ���� ���� �ش繮�ڿ� ���̰� ª���� �� ���̸�ŭ �����߰� => ��ǰ����, ���� ���� ������ġ ���Ե�.
				for (int k38_i = k38_lengthLimit - k38_str.getBytes().length; k38_i > 0; k38_i--) {
					k38_str += " ";		//������ �߰��Ѵ�.
				}				
				
				return k38_str;		//������ �߰��� ���� ��ȯ
			} else {
				//StringBuffer : ���ڿ� �߰�, �����ϴ� �޼���
				StringBuffer k38_sb = new StringBuffer(k38_lengthLimit);	//k38_sb��� ��ü����
				int k38_cnt = 0;	//���ڿ� ����üũ���� ���� ���� �� 0���� �� ����
				
				//foreach�� :  for(Ÿ�� ���޾��� ������ : ����ϰ� ���� �ڷᱸ��(=�迭)) =>�ε��� ǥ���ʿ���� �迭�� �� �����
				for (char k38_ch : k38_str.toCharArray()) {		//String k38_str�� �ѱ��ھ��߶�(toCharArray()) ��� ������.
					//String.valuOf : �Ķ���Ͱ� null�̸� null��ȯ, �׻� String���� ���
					k38_cnt += String.valueOf(k38_ch).getBytes().length;	//���ڷ� ���� String�� ����Ʈ���� ���, �ش����Ʈ�� ���̸� cnt�� ����
					if (k38_cnt > k38_lengthLimit)	//cnt�� ��ǰ�� ���ڿ� �Է�ĭ �ִ���̺���ũ��
						break;	//�ݺ��ߴ�
					k38_sb.append(k38_ch);	//append�� StringBuffer�� �� �߰��� �� ���.
											//=> k38_ch���� �߰��Ѵ�. => k38_ch�� ���ڷ� ���� String�� �ѱ��ھ��ɰ���
				}
				
				//��ǰ�� ĭ ���̸� 24ĭ���� �����ߴ�. ���� 23ĭ�̶�� ���鹮�ڸ� �Ѱ� �߰��ؼ� ��ġ�� �����Ѵ�.
				if (k38_sb.toString().getBytes().length == 23) {
					k38_sb.append(" ");
				}
				//N toString : NŸ���� String�ڷ������� ��ȯ�Ѵ�. 
				return k38_sb.toString();
			}
		} else {	//k38_str�� ���̸� ���� ��ȯ
			return "";
		}
	}
}//class
