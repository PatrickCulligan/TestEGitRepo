package com.polymorph.test;

public abstract class Animal implements IsAMamal{

	private int legs;

	private String color;

	public abstract void move();

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [legs=" + legs + ", color=" + color + "]";
	}

}
