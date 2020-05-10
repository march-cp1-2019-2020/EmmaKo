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
			// change to while loop
			int guess = sc.nextInt();
			System.out.println("You guessed: " + guess);

			// TODO: compare the guess to the random number
			System.out.println(Integer.compare((int) d, guess));

			// TODO: what should happen if the user enters a number outside the range?
			//TEACHER NOTES: the way this is called here only checks if guess is greater than 0
			// because your version of inRange returns 0 every time.  Look at my inRange method
			// at the bottom of your code and how I call it here on line 39-41
			if (guess > inRange(0, 10)) {
				System.out.println("Out of Range!");
			}
			if(!inRange(guess, 0, 10, true)) {
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

			System.out.println("You used " + count + " tries");

		}
	}

	private static int inRange(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * TEACHER NOTES: here is my interpretation of a possible inRange method you could do
	 */
	public static boolean inRange(int num, int low, int high, boolean inclusive){
	    if(inclusive){
	        // include high and low as inside the range
	        if((low <= num ) && (num <= high))
	            return true;
	    } else {
	        // do not include high and low in the range. use strictly less than and greater than
	    	if((low < num ) && (num < high))
	            return true;
	    }
	    // the above conditions were not met so the result is false.   
	    return false;
	}
}
