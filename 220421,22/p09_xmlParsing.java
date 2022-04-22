package javaPro_lec09_0421;
//자바심화 09강
//슬라이드 9
//XML파싱기본
//testdata.xml 파일을 메모장으로 미리 만들고 이 자바파일에서 파싱함

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//실습실 실습
public class p09_xmlParsing {

	//TRY CATCH안쓰려고 이 소스에서 생성된 예외에러를 전부 throws에 넣어버림.
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//파싱을 위한 준비
		DocumentBuilder k38_docBuilder =  DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		//xml파일 처리 => 사전에 만든 testdata.xml파일을 대상으로 파싱한다.
		Document k38_doc = k38_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\javaProTest\\testdata.xml"));
		
		//root태그를 모두 가져오지만, 지금은 쓰이는 곳이 없다.
		Element k38_root = k38_doc.getDocumentElement();
		
		//NodeList 객체로 각 태그이름의 요소를 얻음
		NodeList k38_tag_name = k38_doc.getElementsByTagName("name");	//name태그요소를 k38_tag_name에 대입
		NodeList k38_tag_studentid = k38_doc.getElementsByTagName("studentid");		//studentid태그요소를 k38_tag_studentid에 대입	
		NodeList k38_tag_kor = k38_doc.getElementsByTagName("kor");			//kor태그요소를 k38_tag_kor에 대입
		NodeList k38_tag_eng = k38_doc.getElementsByTagName("eng");			//eng태그요소를 k38_tag_eng에 대입
		NodeList k38_tag_mat = k38_doc.getElementsByTagName("mat");			//mat태그요소를 k38_tag_mat에 대입
		
		System.out.printf("*************************************************************\n");	//구분선 출력
		
		//.getFirstChild().getNodeValue() 는 무조건 String으로 값을 받는다.
		//나중에 계산할 때 따로 int형으로 형변환 필수
		//어차피 k38_tag_는 길이가 다 똑같기에 반복 횟수를 가장 처음 작성하는 태그인 k38_tag_name의 길이만큼 반복으로 설정.
		//getFirstChild() : The first child of this node. If there is no such node, this returns null. => 이 노드의 첫번째 값 반환.
		//getNodeValue() : 해당 노드의 값 반환
		for(int k38_i = 0; k38_i < k38_tag_name.getLength(); k38_i++) {
			System.out.printf("이름 : %s\n", k38_tag_name.item(k38_i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", k38_tag_studentid.item(k38_i).getFirstChild().getNodeValue());			
			System.out.printf("국어 : %s\n", k38_tag_kor.item(k38_i).getFirstChild().getNodeValue());			
			System.out.printf("영어 : %s\n", k38_tag_eng.item(k38_i).getFirstChild().getNodeValue());			
			System.out.printf("수학 : %s\n", k38_tag_mat.item(k38_i).getFirstChild().getNodeValue());
			System.out.printf("*************************************************************\n");
		}
	}
}
