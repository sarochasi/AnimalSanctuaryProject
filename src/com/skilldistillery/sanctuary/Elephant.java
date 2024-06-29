package com.skilldistillery.sanctuary;

public class Elephant extends Animal{
	private static String noise = "RUMBLES";
	
	public Elephant(String name) {
		super.setName(name);
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	
	public void eat(int amount) {
		System.out.println(noise);
		System.out.println("I love eating " + amount + " pounds of food\n");
	}
}
