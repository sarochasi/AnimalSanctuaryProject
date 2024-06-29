package com.skilldistillery.sanctuary;

public class Sanctuary {
	
	private Animal[] animals = new Animal[5];
	private Attendant attendant = new Attendant();
	
	
	
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	
	public void  listAnimals() {
		
		for (int i = 0; i < animals.length; i ++) {
			if(animals[i] != null) {
				System.out.println(animals[i].getName());
			}
			else {
				System.out.println("This enclosure is empty");
			}
		}
		
	}
	public void addAimal(Animal animal) {
		
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				System.out.println(animal.getName() + " has been added");
			}
			
			if (animals[animals.length-1] != null) {
				System.out.println("Sorry, the sanctuary is full.");
			}
			
		}
		
	}
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}

}
