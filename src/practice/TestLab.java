package practice;

import java.util.Random;
import java.util.Scanner;

public class TestLab {

	public static void main(String[] args) {
		// Setup scanner for user input
		Scanner sc = new Scanner(System.in);
		// Assign variable to user input
		String choice = "y";
		
		// Welcome message and question for user
		System.out.println("Welcome to the Grand Circus Casino!  Do you want to play? (y/n): ");
		choice = sc.nextLine();
		System.out.println();
		
		
		// Set while loop to look for "y" from user input
		while (choice.equalsIgnoreCase("y")) {
		
			
			// Ask user how many dice sides to use
			System.out.println("Please enter how many faces on your dice: ");
			int rolls;
			rolls = sc.nextInt();
			sc.nextLine();
			// Import random class and set to variable
			randomDice(rolls);
		
			// Ask if user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
		
		sc.close();
		System.out.println("See Ya!");
	}

	public static void randomDice(int rolls) {
		Random rand = new Random();
		int dice = 1;
		int dice2 = 1;
		dice = rand.nextInt(rolls) + 1;
		dice2 = rand.nextInt(rolls) + 1;
		System.out.println(dice);
		System.out.println(dice2);
		
	}



}
