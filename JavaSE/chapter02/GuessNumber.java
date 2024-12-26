/*
	Guess a number
*/

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int rightNumber = r.nextInt(100) + 1;
		boolean gameIsOn = true;
		
		while(gameIsOn) {
			System.out.print("Enter your guess: ");
			int guessNumber = sc.nextInt();
			if (guessNumber < rightNumber) {
				System.out.println("Too lower!");
			} else if (guessNumber > rightNumber) {
				System.out.println("Too higher!");
			} else {
				System.out.println("You got it! The right number is " + rightNumber);
				gameIsOn = false;
			}
		}
	}
}