package com.skilldistillery.sanctuary;

public class Duck extends Animal{
	private static String noise = "QUACKKK";
	
	
	
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}




	public void eat(int amount) {
		System.out.println(noise);
		System.out.println("Thanks for " + amount + "yummy bugs");
	}
}
