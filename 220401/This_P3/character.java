package This_P3;

import java.util.Scanner;

public class character {
	String name;
	String feature;
	int age;
	double offensePower;
	double defensePower;

	public character(String name) {
		this.name = name;
	}
	
	public character(String name, double defensePower) {
		this.name = name;
		this.defensePower = defensePower;
	}	
	
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
