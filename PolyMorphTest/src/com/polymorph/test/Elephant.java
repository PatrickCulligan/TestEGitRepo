package com.polymorph.test;

public class Elephant extends Animal {

	@Override
	public void move() {

		System.out.println("The Elephant Walks Slowly");

	}

	@Override
	public String toString() {
		return "The Elephane Animal has legs =" + getLegs() + ", and the color is =" + getColor();
	}

	
	public void isMamalType() {
		// 
		
		System.out.println("Is a placenta mamal");
		
	}


}
