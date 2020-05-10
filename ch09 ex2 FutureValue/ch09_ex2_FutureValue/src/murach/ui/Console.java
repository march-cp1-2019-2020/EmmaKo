package murach.ui;

import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);

	public static void displayLine() {
		System.out.println();
	}

	public static void displayLine(String s) {
		System.out.println(s);
	}

	public static String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine();
		return s;
	}

	public static int getInt(String prompt) {
		int i = 0;
		while (true) {
			System.out.print(prompt);
			try {
				i = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Invalid integer. Try again.");
			}
		}
		return i;
	}

	public static double getDouble(String prompt) {
		double d = 0;
		while (true) {
			System.out.print(prompt);

			// TEACHER NOTES: the charAt() method is not available for a double, which is what variable d is declared to be.
			// charAt is for String and StringBuilder.  Thats why this next line doesn't compile
			if (d.charAt(i) == '$') {
				// TEACHER NOTES: deleteCharAt is a method on the StringBuilder class not the double primitive type.
				d.deleteCharAt(i);
				i--;
			}

			// I tried to copy the book but java won't let me use i, what should I put in
			// instead?
			// TEACHER NOTES:  you never declared i.  You have to tell Java what it is, it cannot guess.  You need 
			// something like int i = 0; before you can use i somewhere.

			if (d.charAt(i) == '%') {
				d.deleteCharAt(i);
				i--;
			}
			try {
				d = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error! Invalid decimal. Try again.");
			}
		}
		return d;
	}
}
