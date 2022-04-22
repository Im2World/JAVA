package javaPro_lec09_0421;
//�ҽ��ڵ� �����ϱ�
//JSON�Ľ�
//JSON simple���̺귯�� �ٿ�޾ƾ� JSONObject, JSONArray ��밡��
//https://code.google.com/archive/p/json-simple/downloads 
//json-simple.1.1.1.jar �ٿ�ε� 
//��Ŭ���� ������Ʈ���� ���� ���콺 properties -> java build path -> Libraries (��) -> Classpath-> Add External JARS -> �ٿ�ε��� jar���� ����

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class p20_jsonParsing {
	//try catch�� ������� �������� throws�� ���ÿ��ܵ��� �̸� ó��
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//Ŭ������ ���������� ���� JSONParser ��ü����
		JSONParser parser = new JSONParser();
		
		//�ڹٽ�ȭ 9�� �����̵� 18���� ���� test.json ������ �Ľ��Ѵ�.
		//Object�� ���� ū Ŭ����
		Object obj = parser.parse(new FileReader ("C:\\Users\\kopo\\Desktop\\javaProTest\\test.json"));
		JSONArray array = (JSONArray)obj; //���� Ű�� ���� ��̶� �̷������� ����

		System.out.println("========================================");	//���м� ���
		
		//�迭ũ�⸸ŭ �ݺ� => �迭�� ���� ��� ���
		for (int i = 0; i < array.size(); i++) {
			JSONObject result = (JSONObject) array.get(i); //array.get(i) ���� JSONObject result�� ����
			System.out.println("�̸� : " + result.get("name")); 	//�̸� ���
			System.out.println("�й� : " + result.get("studentid")); //�й� ���
			
			JSONArray score = (JSONArray) result.get("score");//���� ���� get���� �����ͼ� JSONArray score�� ����
			
			///////////������º�//////////
			//JSONArray score�� 0���ε���(=1��° ��) = ���� ����
			//JSONArray score�� 1���ε���(=2��° ��) = ���� ����
			//JSONArray score�� 2���ε���(=3��° ��) = ���� ����
			//long�� int���� ū ���� ���� �� �ִ� Ÿ��
			long kor = (long)score.get(0);
			long eng = (long)score.get(1);
			long math = (long)score.get(2); //����, json�迭�� �߸���������� 3���� �ƴϸ� ����
			System.out.println("���� : " + kor); 	//�������� ���
			System.out.println("���� : " + eng);	//�������� ���
			System.out.println("���� : " + math);	//�������� ���
			System.out.println("���� : " + (kor + eng + math)); 	//���� = �������� + �������� + ��������
			System.out.println("��� : " + ((kor + eng + math) / 3.0)); 	//��� = ���� / ����� => ����� double������ ���
			System.out.println("========================================");		//���м� ���
		}
	}
}