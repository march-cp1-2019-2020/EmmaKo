//Emma Ko
//1.16.20
//Instrutions: This app only works if you enter the values without first putting spaces. Just Type.
// TEACHER NOTES: i can teach you how to handle that!  we will go over that in class!
package ch03_ex2_AreaAndPerimeter;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) {
		System.out.println ("Hi there! What perameters would you like to calculate?");
		System.out.println();

		 Scanner sc = new Scanner(System.in);        
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	        	System.out.println ("Enter Length");
			//TEACHER NOTES: length and width variables should be double not int.
	        	int length = Integer.parseInt(sc.nextLine());
	        	
	        	System.out.println ("Enter Width");
	        	int width = Integer.parseInt(sc.nextLine());
	        	
	        	double Area = length * width;
	        	double Perimeter = (length + width) * 2;
	        	
	        	System.out.println ("Area:            " + 
	        			NumberFormat.getInstance().format (Area));
	        	System.out.println ("Perimeter:       " + 
	        			NumberFormat.getInstance().format(Perimeter));
	        	
	        	System.out.print("Do Another? (y/n): ");
	            choice = sc.nextLine();
	            System.out.println();
	        }
	        sc.close();
	        System.out.println("Thank You For Using This App!");

	}
}
