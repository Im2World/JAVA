package javaPro_lec09_0421;
//�ڹٽ�ȭ 9�� �����̵� 18
//JSON�����
//JSON simple���̺귯�� �ٿ�޾ƾ� JSONObject, JSONArray ��밡��
//https://code.google.com/archive/p/json-simple/downloads 
//json-simple.1.1.1.jar �ٿ�ε� 
//��Ŭ���� ������Ʈ���� ���� ���콺 properties -> java build path -> Libraries (��) -> Classpath-> Add External JARS -> �ٿ�ε��� jar���� ����


import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class p18_json {
	
	//JSONObject �� �����ϴ� �޼���
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", name);	// name �±׿��� String name���� ���� ������ �ִ´�.
		dataObject.put("studentid", studentid);	// studentid �±׿��� int studentid���� ���� ������ �ִ´�.	
		
		//JSONArray ��ü����
		//���ڰ� ������� ���� ������ score�� �����Ѵ�.
		JSONArray score = new JSONArray();
		score.add(kor);	
		score.add(eng);
		score.add(mat);
		
		dataObject.put("score", score);	// JSONArray score�� ������ �߰��� ����, ����, ���� ���� ����
		
		return dataObject;	//	dataObject����
	}
	
	
	public static void main(String[] args) {
		
		//JSONObject ��ü ����
		JSONObject jsonObject = new JSONObject();
		
		//1�ξ� ���� ������ �� JSON���� ���� JSONArray����
		JSONArray datasArray = new JSONArray();
		
		//�޼��� �̻��� �̷��� �ϳ��� ���� �־������.
		//1�� ���� �� JSONObject ����
		JSONObject dataObject = new JSONObject();
		dataObject.put("name","Nayeon");	//json���� ���ڴ� �յڿ� ""ó��
		dataObject.put("studentid","209901");

		//�޼��� �̻��� �̷��� �ϳ��� ���� �־������.
		//JSONArray ����
		JSONArray score = new JSONArray();
		score.add(90);	//��������
		score.add(100);	//��������
		score.add(100);	//��������
		dataObject.put("score", score);		//score�� ���� ����
		datasArray.add(dataObject);	//datasArray�� datasObject ����
		
		//���� ����� ���� �Լ�ó��
		//�̸�, �й�, ��������, ��������, �������� ������ ���� ����
		datasArray.add(oneRec("Jeongyeon", 209902, 100, 85, 95));
		datasArray.add(oneRec("Momo", 209902, 70, 65, 60));
		datasArray.add(oneRec("Sana", 209902, 100, 80, 75));
		datasArray.add(oneRec("Jihyo", 209902, 100, 85, 95));
		datasArray.add(oneRec("Mina", 209902, 85, 100, 95));
		datasArray.add(oneRec("Dahyun", 209902, 80, 85, 95));
		datasArray.add(oneRec("Chaeyoung", 209902, 95, 95, 100));
		datasArray.add(oneRec("Tzuyu", 209902, 60, 100, 95));
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\kopo\\Desktop\\javaProTest\\test.json");	//�ش� ��ο� json���� ����
			file.write(datasArray.toJSONString());	//datasArray�� ������ JSON���ڿ��� ��ȯ�ؼ� ���Ͼ���
			file.flush();  			//���� ���ۿ� ����� ������ file�� �����ϰ� ���� ���
			file.close();			//���Ͼ��� ����			
		}catch(IOException e){
			e.printStackTrace(); 		//�����߻��ϸ� �������� ���
		}
		System.out.println("JSON�����Ϸ� : \n" + datasArray);	//�Լ� ���� ��Ʈ ���
	}
}
