package com.skilldistillery.sanctuary;

public class Cow extends Animal{
	private static String noise = "MOO!!!";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	
	public void eat(int amount) {
		System.out.println(noise);
		System.out.println("I love eating " + amount + "pounds of hay");
	}
}
