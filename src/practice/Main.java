package practice;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// These are the input and output integers
		int flipMe = 0;
		int imFlipped = 0;
		
		// Create scanner object
		Scanner input = null;
		
		// Output the prompt
		System.out.println("Give me a number: ");
		
		// Wait for the user to make an input
		flipMe = input.nextInt(); 
		
		// Take input and calculate using formula to output in reverse
		while( flipMe != 0 ) {
			imFlipped = imFlipped * 10;
			imFlipped = imFlipped + flipMe%10;
			flipMe = flipMe/10;
		}
		
		// This is your finished answer
		System.out.println("Your number has been flipped: " + imFlipped);
		
		input.close();
		

	}

	private static void nextLine() {
		// TODO Auto-generated method stub
		
	}
}