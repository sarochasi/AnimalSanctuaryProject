package com.skilldistillery.sanctuary;

public class Lion extends Animal{
	private static String noise = "ROARRRR";
	
	public Lion(String name) {
		super.setName(name);
	}
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	
	public void eat(int amount) {
		System.out.println(noise);
		System.out.println("I'm chomping " + amount + " pounds of meat\n");
		
	}

}
