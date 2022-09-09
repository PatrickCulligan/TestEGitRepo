package com.polymorph.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elephant elephant = new Elephant();
		elephant.setLegs(4);
		elephant.setColor("Grey");
		elephant.move();
		elephant.isMamalType();
		System.out.println(elephant);

		Elephant elephant1 = new Elephant();
		elephant1.setLegs(5);
		elephant1.setColor("Greyish");
		elephant1.move();
		elephant1.isMamalType();
		System.out.println(elephant1);

		Kangaroo kangaroo = new Kangaroo();

		kangaroo.setLegs(4);
		kangaroo.setColor("Golden Brown");
		kangaroo.move();
		kangaroo.isMamalType();
		System.out.print(kangaroo);

		Kangaroo kangaroo1 = new Kangaroo();

		kangaroo1.setLegs(4);
		kangaroo1.setColor("Golden Brown");
		kangaroo1.move();
		kangaroo1.isMamalType();
		System.out.print(kangaroo1);

	}

}
