// Emma Ko
//3.25.2020

package guessNumber;

import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		final int LIMIT = 10;

		System.out.println("Guess the number!");
		System.out.println("I'm thinking of a number from 1 to " + LIMIT);
		System.out.println();

		// get a random number between 1 and the limit
		double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
		// prepare to read input from the user
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

	int count = 1;
		{
//change to while loop
			int guess = sc.nextInt();
			System.out.println("You guessed: " + guess);

			// TODO: compare the guess to the random number
			System.out.println(Integer.compare((int) d, guess));

		
			// TODO: what should happen if the user enters a number outside the range?
			if (guess > inRange(0, 10)) {
				System.out.println("Out of Range!");
			}

			// TODO: print out a message to the user saying "Too high" or "Too low"
			if (guess < d) {
				System.out.println("Too small!");
			}

			if (guess > d) {
				System.out.println("Too Big!");
			}

			if (guess == d) {
				System.out.println("YES! YOU GUESSED IT");
			}
			
		System.out.println ("You used " + count + " tries");

		}
	}

	private static int inRange(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
