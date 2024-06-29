package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {

	Scanner kb = new Scanner(System.in);
	private Sanctuary sanctuary;
	
	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}
	
	private void launchApp() {
		sanctuary = new Sanctuary();
		kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Menu:");
			System.out.println("1. List animals");
			System.out.println("2. Add a new animal");
			System.out.println("3. Start the attendant's rounds");
			System.out.println("4. Quit");
			System.out.print("Enter your choice:");
			int choice = kb.nextInt();
			
			switch(choice) {
			case 1:
				sanctuary.listAnimals();
				break;
			case 2:
				System.out.println("Choose animal type to add:");
				System.out.println("1. Lion \n2. Bird \n3. Elephant");
				System.out.print("Enter you choice: ");
				int option = kb.nextInt();
				System.out.print("Enter the name of the animal: ");
				String name = kb.next();
				
				switch(option) {
				case 1:
					sanctuary.addAnimal(new Lion(name));
					
					break;
				case 2:
					sanctuary.addAnimal(new Bird(name));
					break;
				case 3:
					sanctuary.addAnimal(new Elephant(name));
					break;
				default:
					System.out.println("Invalid choice. Animal not added");
				}
				break;
			case 3:
				sanctuary.startAttendantRounds();
				break;
			case 4:
				System.out.println("Thank you for visiting the sanctuary");
				return;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 to 4: ");
				
				
			}
		}
	}
}

