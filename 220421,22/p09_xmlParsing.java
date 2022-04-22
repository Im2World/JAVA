package javaPro_lec09_0421;
//�ڹٽ�ȭ 09��
//�����̵� 9
//XML�Ḻ̌⺻
//testdata.xml ������ �޸������� �̸� ����� �� �ڹ����Ͽ��� �Ľ���

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
public class p09_xmlParsing {

	//TRY CATCH�Ⱦ����� �� �ҽ����� ������ ���ܿ����� ���� throws�� �־����.
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//�Ľ��� ���� �غ�
		DocumentBuilder k38_docBuilder =  DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		//xml���� ó�� => ������ ���� testdata.xml������ ������� �Ľ��Ѵ�.
		Document k38_doc = k38_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\javaProTest\\testdata.xml"));
		
		//root�±׸� ��� ����������, ������ ���̴� ���� ����.
		Element k38_root = k38_doc.getDocumentElement();
		
		//NodeList ��ü�� �� �±��̸��� ��Ҹ� ����
		NodeList k38_tag_name = k38_doc.getElementsByTagName("name");	//name�±׿�Ҹ� k38_tag_name�� ����
		NodeList k38_tag_studentid = k38_doc.getElementsByTagName("studentid");		//studentid�±׿�Ҹ� k38_tag_studentid�� ����	
		NodeList k38_tag_kor = k38_doc.getElementsByTagName("kor");			//kor�±׿�Ҹ� k38_tag_kor�� ����
		NodeList k38_tag_eng = k38_doc.getElementsByTagName("eng");			//eng�±׿�Ҹ� k38_tag_eng�� ����
		NodeList k38_tag_mat = k38_doc.getElementsByTagName("mat");			//mat�±׿�Ҹ� k38_tag_mat�� ����
		
		System.out.printf("*************************************************************\n");	//���м� ���
		
		//.getFirstChild().getNodeValue() �� ������ String���� ���� �޴´�.
		//���߿� ����� �� ���� int������ ����ȯ �ʼ�
		//������ k38_tag_�� ���̰� �� �Ȱ��⿡ �ݺ� Ƚ���� ���� ó�� �ۼ��ϴ� �±��� k38_tag_name�� ���̸�ŭ �ݺ����� ����.
		//getFirstChild() : The first child of this node. If there is no such node, this returns null. => �� ����� ù��° �� ��ȯ.
		//getNodeValue() : �ش� ����� �� ��ȯ
		for(int k38_i = 0; k38_i < k38_tag_name.getLength(); k38_i++) {
			System.out.printf("�̸� : %s\n", k38_tag_name.item(k38_i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", k38_tag_studentid.item(k38_i).getFirstChild().getNodeValue());			
			System.out.printf("���� : %s\n", k38_tag_kor.item(k38_i).getFirstChild().getNodeValue());			
			System.out.printf("���� : %s\n", k38_tag_eng.item(k38_i).getFirstChild().getNodeValue());			
			System.out.printf("���� : %s\n", k38_tag_mat.item(k38_i).getFirstChild().getNodeValue());
			System.out.printf("*************************************************************\n");
		}
	}
}
