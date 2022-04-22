package javaPro_lec09_0421;
//�ڹٽ�ȭ 09��
//�����̵� 15
//XML�Ḻ̌⺻
//weather.xml ������ �޸������� �̸� ����� �� �ڹ����Ͽ��� �Ľ���

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//�ǽ��� �ǽ�
public class p15_2_xmlParsing_weather {

	//TRY CATCH�Ⱦ����� �� �ҽ����� ������ ���ܿ����� ���� throws�� �־����.
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//�Ľ��� ���� �غ�
		DocumentBuilder k38_docBuilder =  DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		//xml���� ó�� => ������ ���� testdata.xml������ ������� �Ľ��Ѵ�.
		Document k38_doc = k38_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\javaProTest\\weather.xml"));
		
		//root�±׸� ��� ������ => ù �±��� data seq=0
		Element k38_root = k38_doc.getDocumentElement();
		
		//NodeList ��ü�� �±��̸��� ��Ҹ� ����
		//���� ����api xml������ data��� �±� �ȿ� 19�� �±װ� ����ִ�.
		NodeList k38_tag_001 = k38_doc.getElementsByTagName("data");	//xml�� data �±׿�Ҹ� k38_tag_001�� ����
		
		
		//�������� �� ���� ���ڿ� ������ ���� �� �� ���·� �ʱ�ȭ
		String k38_seq = "";	//48�ð� �� �� ��° ���� ����Ŵ
		String k38_hour = "";	//���׿��� 3�ð� ����
		String k38_day = "";	//1��° �� (0: ���� / 1: ����/ 2:��)
		String k38_temp = "";	//���� �ð� �µ�		
		String k38_tmx = "";	//�ְ� �µ�
		String k38_tmn = "";	//���� �µ�	
		String k38_sky = "";	//�ϴ� �����ڵ� => (1: ����, 2: ��������, 3:��������, 4:�帲)
		String k38_pty = "";	//���� ���� �ڵ�=> (0: ����, 2: ��, 2:��/��, 3:��/��, 4:��)
		String k38_wfKor = "";	//���� �ѱ���
		String k38_wfEn = "";	//���� ����
		String k38_pop = "";	//���� Ȯ��%
		String k38_r12 = "";	//12�ð� ���� ������
		String k38_s12 = "";	//12�ð� ���� ������
		String k38_ws = "";		//ǳ��(m/s)
		String k38_wd = "";		//ǳ�� (0~7: ��, �ϵ�, �� ,����, ��, ����, ��, �ϼ�)
		String k38_wdKor = "";	//�ѱ��� ǳ��
		String k38_wdEn = "";	//���� ǳ��
		String k38_reh = "";	//���� %
		String k38_r06 = "";	//6�ð� ���� ������
		String k38_s06 = "";	//6�ð� ���� ������

		System.out.printf("*************************************************************\n");	//���м� ���
		

		//.getFirstChild().getNodeValue() �� ������ String���� ���� �޴´�.
		//���߿� ����� �� ���� int������ ����ȯ �ʼ�
		//getFirstChild() : The first child of this node. If there is no such node, this returns null. => �� ����� ù��° �� ��ȯ.
		//getNodeValue() : �ش� ����� �� ��ȯ
		//�����±��� data�� ����Ű�� k38_tag_001 �±��� ���̸�ŭ �ݺ�
		for(int k38_i = 0; k38_i < k38_tag_001.getLength(); k38_i++) {
			Element k38_elmt = (Element)k38_tag_001.item(k38_i);
		try {
			//������ �������� String �����鿡 xml�� �� �� �����ͼ� ����
			//�� �±׵��� ��Ұ� 1�����ۿ� ��� k38_seq�� ������ item �ε����� ��� 0
			k38_seq = k38_tag_001.item(k38_i).getAttributes().getNamedItem("seq").getNodeValue();
			k38_hour = k38_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k38_day = k38_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();			
			k38_temp = k38_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k38_tmx = k38_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();			
			k38_tmn = k38_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k38_sky = k38_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();			
			k38_pty = k38_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();			
			k38_wfKor = k38_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();			
			k38_wfEn = k38_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();			
			k38_pop = k38_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();			
			k38_r12 = k38_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k38_s12 = k38_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();			
			k38_ws = k38_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();			
			k38_wd = k38_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();			
			k38_wdKor = k38_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k38_wdEn = k38_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();			
			k38_reh = k38_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();			
			k38_r06 = k38_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();			
			k38_s06 = k38_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();			
			
			
			System.out.printf("%s%s\n", "48�ð� �� ���� : ", k38_seq);			
			System.out.printf("%s%s\n", "�ð�(��) : ", k38_hour);
			System.out.printf("%s%s\n", "3�� �� ����(0: ���� / 1: ����/ 2:��) : ", k38_day);
			System.out.printf("%s%s\n", "���� �ð� �µ� : ", k38_temp);
			System.out.printf("%s%s\n", "�ְ� �µ� : ", k38_tmx);
			System.out.printf("%s%s\n", "���� �µ� : ", k38_tmn);
			System.out.printf("%s%s\n", "�ϴ� �����ڵ�(1: ����, 2: ��������, 3:��������, 4:�帲) : ", k38_sky);
			System.out.printf("%s%s\n", "���� ���� �ڵ�(0: ����, 2: ��, 2:��/��, 3:��/��, 4:��) : ", k38_pty);
			System.out.printf("%s%s\n", "����(�ѱ���) : ", k38_wfKor);
			System.out.printf("%s%s\n", "����(����) : ", k38_wfEn);
			System.out.printf("%s%s\n", "���� Ȯ��% : ", k38_pop);
			System.out.printf("%s%s\n", "12�ð� ���� ������ : ", k38_r12);
			System.out.printf("%s%s\n", "12�ð� ���� ������ : ", k38_s12);
			System.out.printf("%s%s\n", "ǳ��(m/s) : ", k38_ws);
			System.out.printf("%s%s\n", "ǳ��(0~7: ��, �ϵ�, �� ,����, ��, ����, ��, �ϼ�) : ", k38_wd);
			System.out.printf("%s%s\n", "ǳ��(�ѱ���) : ", k38_wdKor);
			System.out.printf("%s%s\n", "ǳ��(����) : ", k38_wdEn);
			System.out.printf("%s%s\n", "���� % : ", k38_reh);
			System.out.printf("%s%s\n", "6�ð� ���� ������ : ", k38_r06);
			System.out.printf("%s%s\n", "6�ð� ���� ������ : ", k38_s06);			
		} catch (Exception e){
			e.printStackTrace();
		}
			

//���� �Ľ����� ����
//			System.out.printf("�̸� : %s\n", k38_tag_name.item(0).getFirstChild().getNodeValue());

			System.out.printf("*************************************************************\n");
		}
	}
}


/*
 <������ ����>
 <?xml version = "1.0" encoding = "UTF-8"?>
<wid>
	<header>
		<tm>202204220800</tm>
		<ts>2</ts>
		<x>61</x>
		<y>123</y>
	</header>
	<body>
		<data seq="0">
			<hour>12</hour>
			<day>0</day>
			<temp>17.0</temp>
			<tmx>19.0</tmx>
			<tmn>-999.0</tmn>
			<sky>4</sky>
			<pty>0</pty>
			<wfKor>�帲</wfKor>
			<wfEn>Cloudy</wfEn>
			<pop>30</pop>
			<r12>0.0</r12>
			<s12>0.0</s12>
			<ws>5.1000000000000005</ws>
			<wd>5</wd>
			<wdKor>����</wdKor>
			<wdEn>SW</wdEn>
			<reh>70</reh>
			<r06>0.0</r06>
			<s06>0.0</s06>
		</data>
		<data seq="1">
			<hour>15</hour>
			<day>0</day>
			<temp>17.0</temp>
			<tmx>19.0</tmx>
			<tmn>-999.0</tmn>
			<sky>4</sky>
			<pty>1</pty>
			<wfKor>��</wfKor>
			<wfEn>Rain</wfEn>
			<pop>60</pop>
			<r12>0.0</r12>
			<s12>0.0</s12>
			<ws>3.4000000000000004</ws>
			<wd>6</wd>
			<wdKor>��</wdKor>
			<wdEn>W</wdEn>
			<reh>70</reh>
			<r06>0.375</r06>
			<s06>0.0</s06>
		</data>
		<data seq="2">
			<hour>18</hour>
			<day>0</day>
			<temp>16.0</temp>
			<tmx>19.0</tmx>
			<tmn>-999.0</tmn>
			<sky>4</sky>
			<pty>0</pty>
			<wfKor>�帲</wfKor>
			<wfEn>Cloudy</wfEn>
			<pop>30</pop>
			<r12>0.0</r12>
			<s12>0.0</s12>
			<ws>2.1</ws>
			<wd>5</wd>
			<wdKor>����</wdKor>
			<wdEn>SW</wdEn>
			<reh>70</reh>
			<r06>0.375</r06>
			<s06>0.0</s06>
		</data>
		....
		<data seq="16">
			<hour>12</hour>
			<day>2</day>
			<temp>20.0</temp>
			<tmx>-999.0</tmx>
			<tmn>11.0</tmn>
			<sky>4</sky>
			<pty>0</pty>
			<wfKor>�帲</wfKor>
			<wfEn>Cloudy</wfEn>
			<pop>30</pop>
			<r12>0.0</r12>
			<s12>0.0</s12>
			<ws>1.5</ws>
			<wd>5</wd>
			<wdKor>����</wdKor>
			<wdEn>SW</wdEn>
			<reh>65</reh>
			<r06>0.0</r06>
			<s06>0.0</s06>
		</data>
	</body>
</wid>		
		
 */
