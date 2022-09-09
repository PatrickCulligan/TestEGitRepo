package com.polymorph.test;

public class Kangaroo extends Animal{

	@Override
	public void move() {
		
		System.out.println("Jumps high and moves fast");
		
	}
	
	@Override
	public String toString() {
		return "The kangaroo Animal has legs =" + getLegs() + ", and color=" + getColor();
	}
	
	public void isMamalType() {
		
		System.out.println("Is Marcupial mamal");
		
	}

}
