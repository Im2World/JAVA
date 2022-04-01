package This_P2;

import java.util.Scanner;

public class character {
	String name;
	int age;
	double offensePower;	//실수형은 double로 작성
	double defensePower;
	
	public character(String name, int age, double offensePower, double defensePower) {	
		this.name = name;	
		this.age = age;
		this.offensePower = offensePower;
		this.defensePower = defensePower;
	}
	
	public void printCharacter () {
		System.out.println("<Character>");
		System.out.println (name + " / " + age + " / " + offensePower +" / "+ defensePower);
		System.out.println("");
	}
	
	
	
} //example
