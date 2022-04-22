package javaPro_lec09_0421;
//자바심화 09강
//슬라이드 15
//XML파싱기본
//weather.xml 파일을 메모장으로 미리 만들고 이 자바파일에서 파싱함

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
public class p15_2_xmlParsing_weather {

	//TRY CATCH안쓰려고 이 소스에서 생성된 예외에러를 전부 throws에 넣어버림.
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//파싱을 위한 준비
		DocumentBuilder k38_docBuilder =  DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		//xml파일 처리 => 사전에 만든 testdata.xml파일을 대상으로 파싱한다.
		Document k38_doc = k38_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\javaProTest\\weather.xml"));
		
		//root태그를 모두 가져옴 => 첫 태그인 data seq=0
		Element k38_root = k38_doc.getDocumentElement();
		
		//NodeList 객체로 태그이름의 요소를 얻음
		//날씨 오픈api xml파일은 data라는 태그 안에 19개 태그가 들어있다.
		NodeList k38_tag_001 = k38_doc.getElementsByTagName("data");	//xml의 data 태그요소를 k38_tag_001에 대입
		
		
		//가져오는 값 담을 문자열 변수들 생성 및 빈 상태로 초기화
		String k38_seq = "";	//48시간 중 몇 번째 인지 가리킴
		String k38_hour = "";	//동네예보 3시간 단위
		String k38_day = "";	//1번째 날 (0: 오늘 / 1: 내일/ 2:모레)
		String k38_temp = "";	//현재 시간 온도		
		String k38_tmx = "";	//최고 온도
		String k38_tmn = "";	//최저 온도	
		String k38_sky = "";	//하늘 상태코드 => (1: 맑음, 2: 구름조금, 3:구름많음, 4:흐림)
		String k38_pty = "";	//강수 상태 코드=> (0: 없음, 2: 비, 2:비/눈, 3:눈/비, 4:눈)
		String k38_wfKor = "";	//날씨 한국어
		String k38_wfEn = "";	//날씨 영어
		String k38_pop = "";	//강수 확률%
		String k38_r12 = "";	//12시간 예상 강수량
		String k38_s12 = "";	//12시간 예상 적설량
		String k38_ws = "";		//풍속(m/s)
		String k38_wd = "";		//풍향 (0~7: 북, 북동, 동 ,남동, 남, 남서, 서, 북서)
		String k38_wdKor = "";	//한국어 풍향
		String k38_wdEn = "";	//영어 풍향
		String k38_reh = "";	//습도 %
		String k38_r06 = "";	//6시간 예상 강수량
		String k38_s06 = "";	//6시간 예상 적설량

		System.out.printf("*************************************************************\n");	//구분선 출력
		

		//.getFirstChild().getNodeValue() 는 무조건 String으로 값을 받는다.
		//나중에 계산할 때 따로 int형으로 형변환 필수
		//getFirstChild() : The first child of this node. If there is no such node, this returns null. => 이 노드의 첫번째 값 반환.
		//getNodeValue() : 해당 노드의 값 반환
		//상위태그인 data를 가리키는 k38_tag_001 태그의 길이만큼 반복
		for(int k38_i = 0; k38_i < k38_tag_001.getLength(); k38_i++) {
			Element k38_elmt = (Element)k38_tag_001.item(k38_i);
		try {
			//위에서 정의해준 String 변수들에 xml의 각 값 가져와서 대입
			//각 태그들이 요소가 1개씩밖에 없어서 k38_seq를 제외한 item 인덱스는 모두 0
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
			
			
			System.out.printf("%s%s\n", "48시간 중 순서 : ", k38_seq);			
			System.out.printf("%s%s\n", "시간(시) : ", k38_hour);
			System.out.printf("%s%s\n", "3일 중 일자(0: 오늘 / 1: 내일/ 2:모레) : ", k38_day);
			System.out.printf("%s%s\n", "현재 시간 온도 : ", k38_temp);
			System.out.printf("%s%s\n", "최고 온도 : ", k38_tmx);
			System.out.printf("%s%s\n", "최저 온도 : ", k38_tmn);
			System.out.printf("%s%s\n", "하늘 상태코드(1: 맑음, 2: 구름조금, 3:구름많음, 4:흐림) : ", k38_sky);
			System.out.printf("%s%s\n", "강수 상태 코드(0: 없음, 2: 비, 2:비/눈, 3:눈/비, 4:눈) : ", k38_pty);
			System.out.printf("%s%s\n", "날씨(한국어) : ", k38_wfKor);
			System.out.printf("%s%s\n", "날씨(영어) : ", k38_wfEn);
			System.out.printf("%s%s\n", "강수 확률% : ", k38_pop);
			System.out.printf("%s%s\n", "12시간 예상 강수량 : ", k38_r12);
			System.out.printf("%s%s\n", "12시간 예상 적설량 : ", k38_s12);
			System.out.printf("%s%s\n", "풍속(m/s) : ", k38_ws);
			System.out.printf("%s%s\n", "풍향(0~7: 북, 북동, 동 ,남동, 남, 남서, 서, 북서) : ", k38_wd);
			System.out.printf("%s%s\n", "풍향(한국어) : ", k38_wdKor);
			System.out.printf("%s%s\n", "풍향(영어) : ", k38_wdEn);
			System.out.printf("%s%s\n", "습도 % : ", k38_reh);
			System.out.printf("%s%s\n", "6시간 예상 강수량 : ", k38_r06);
			System.out.printf("%s%s\n", "6시간 예상 적설량 : ", k38_s06);			
		} catch (Exception e){
			e.printStackTrace();
		}
			

//이전 파싱파일 샘플
//			System.out.printf("이름 : %s\n", k38_tag_name.item(0).getFirstChild().getNodeValue());

			System.out.printf("*************************************************************\n");
		}
	}
}


/*
 <데이터 구조>
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
			<wfKor>흐림</wfKor>
			<wfEn>Cloudy</wfEn>
			<pop>30</pop>
			<r12>0.0</r12>
			<s12>0.0</s12>
			<ws>5.1000000000000005</ws>
			<wd>5</wd>
			<wdKor>남서</wdKor>
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
			<wfKor>비</wfKor>
			<wfEn>Rain</wfEn>
			<pop>60</pop>
			<r12>0.0</r12>
			<s12>0.0</s12>
			<ws>3.4000000000000004</ws>
			<wd>6</wd>
			<wdKor>서</wdKor>
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
			<wfKor>흐림</wfKor>
			<wfEn>Cloudy</wfEn>
			<pop>30</pop>
			<r12>0.0</r12>
			<s12>0.0</s12>
			<ws>2.1</ws>
			<wd>5</wd>
			<wdKor>남서</wdKor>
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
			<wfKor>흐림</wfKor>
			<wfEn>Cloudy</wfEn>
			<pop>30</pop>
			<r12>0.0</r12>
			<s12>0.0</s12>
			<ws>1.5</ws>
			<wd>5</wd>
			<wdKor>남서</wdKor>
			<wdEn>SW</wdEn>
			<reh>65</reh>
			<r06>0.0</r06>
			<s06>0.0</s06>
		</data>
	</body>
</wid>		
		
 */
