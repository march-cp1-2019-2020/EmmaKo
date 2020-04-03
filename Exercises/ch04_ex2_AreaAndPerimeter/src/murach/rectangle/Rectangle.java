import java.text.NumberFormat;
import java.util.Scanner;

//Emma Ko, 2/27/2020
public class Rectangle1 {

	public int length;

	void getlength() {
	}

	void setlength() {
	}

	public int width;

	void getwidth() {
	}

	void setwidth() {
	}

	// TEACHER NOTES: this constructor is extra, not really necesssary since you have the one below it doing the same thing.
public Rectangle1 (length width) {
	length = 00.00;
	width = 00.00;
	}

	// TEACHER NOTES: step 4 says the constructor should have zero arguments. like this:
	//  public Rectangle(){
	//	length = 0;
	//	width = 0;
	//}
	
	// typically if calling code passes in values, you would use those values to initialize your variables.
public Rectangle (length, width) {
	length = 00.00;
	width = 00.00;
}

	// TEACHER NOTES: missing steps 5, 6, 7 where you create these methods (it said you can copy them from Main):
	// double getArea()
	// String getFormattedArea() //using NumberFormat class
	// double getPerimeter()
	// String getFormattedPerimeter() // usering NumberFormat class

	
	//this should all be in the Main.java
    public static void main(String args[]) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());

            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());

            // calculate total
            double area = width * length;
            double perimeter = 2 * width + 2 * length;
            
            // format and display output
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMinimumFractionDigits(3);
            String message = 
                "Area:         " + number.format(area) + "\n" +
                "Perimeter:    " + number.format(perimeter) + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Bye!");
    }
}
