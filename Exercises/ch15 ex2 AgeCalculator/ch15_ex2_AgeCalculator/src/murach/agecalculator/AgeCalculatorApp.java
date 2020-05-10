//Emma Ko 3.5.2020
//I can't figure out how to minus the date of birth from the current time. If you take that out everything else works fine. 
package murach.agecalculator;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");

        // Get input from the the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        // Get and print user's date of birth
        System.out.println("Your date of birth is " + dateOfBirthString);
        
        //TEACHER NOTES:I wouldn't call this currentDateString because its not a String type.  Call it currentDate
        LocalDate currentDateString = LocalDate.now();
        
        // Get and print the current date
        System.out.println("The current date is " + currentDateString); 

        //Calculate the user's age
        //TEACHER NOTES: variables should start with a lowercase letter
        // why do you turn these to strings just to turn them back to Dates?
        String Date1 = dateOfBirthString;
        String Date2 = currentDateString;

        //TEACHER NOTES: where does format come from?
        Date date1 = format.parse(Date1);
        Date date2 = format.parse(Date2);
        long difference = date2.getDate() - date1.getDate();
        
        age = long difference;
       
        //Print the user's age
        System.out.println("Your age is "+ age);
        sc.close();
    }
}
