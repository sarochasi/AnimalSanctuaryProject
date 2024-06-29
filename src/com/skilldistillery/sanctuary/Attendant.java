package com.skilldistillery.sanctuary;

import java.util.Random;

public class Attendant {

	public void makeRounds(Animal[] animals) {
		int amount = (int)(Math.random() * 10);
		
		for (Animal animal : animals) {
			if( animal != null) {
				System.out.println("I will feed " + animal.getName() + amount + " foods");
				
				animal.eat(amount);
			}
			else{
				System.out.println("The enclosure is empty.");
			}
		}
		System.out.println("Everyone's fed now, I can take a break.");
	}
}
