package javaproject;
 import java.util.Random;
 import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int lowerBound = 1;
		int upperBound = 100;
		int numberToGuess = rn.nextInt(upperBound - lowerBound + 1) + lowerBound;
		int attempts = 0;
		
		System.out.println("Welcome to the number guessing game");
		System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound + " Try to guess it");
		
		while(true) {
			System.out.print("Enter ur guess: ");
			int userGuess = sc.nextInt();
			attempts++;
			
			if(userGuess<lowerBound || userGuess > upperBound) {
				System.out.println("your guess is out of range. Try again");
				}
			else if(userGuess < numberToGuess ) {
				System.out.println("Too low! Try again");
			}
			else if(userGuess > numberToGuess ) {
				System.out.println("Too high! Try again");
			}
			else {
				System.out.println("congratulation! you have guessed the number " + numberToGuess + " in " + attempts + " attempts");
				break;
				
			}
			
			
		}
		sc.close();
		
		
	}

}
