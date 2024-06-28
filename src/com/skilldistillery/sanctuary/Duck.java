package com.skilldistillery.sanctuary;

public class Duck extends Animal{
	private static String noise = "QUACKKK";
	
	
	
	
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		super.makeNoise();
	}




	public void eat(int amount) {
		System.out.println(noise);
		System.out.println("Thanks for " + amount + "yummy bugs");
	}
}
