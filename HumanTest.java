package com.codingdojo.ObjectMasterPart1;

public class HumanTest {

	public static void main(String[] args) {
		Human tester1 = new Human();
		Human tester2 = new Human();
		
		tester1.attack(tester2);
		System.out.println(tester1.getHealth());
		System.out.println(tester2.getHealth());
	}

}
