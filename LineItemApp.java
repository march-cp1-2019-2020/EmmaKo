//EMMa Ko
//1/16/20
// i couldn't figure out how to do step 8

package murach.lineitem;

import java.text.NumberFormat;
import java.util.Scanner;

public class LineItemApp {

    public static void main(String args[]) {
        System.out.println("Welcome to the Line Item Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();

            System.out.print("Enter quantity:     ");
            int quantity = Integer.parseInt(sc.nextLine());

            // set product price based on product code
            double price;
            String description;
			if (productCode.equalsIgnoreCase("java")) {
                price = 57.50;
                description = ("FUN but really hard. The perfect torture for students");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                price = 57.50;
                description = ("Terrible. I don't know what this is but probably terrible");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                price = 54.50;
                description = ("my squirrel, not yours.");
            } else if (productCode.equalsIgnoreCase("android, galaxy 7")) {
                price = 650;
                description = ("worse than Iphone but cheaper");
            } else {
                price = 0;
            
            }

            // calculate total
            double total = price * quantity;

            // format and display output
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String priceFormatted = currency.format(price);
            String totalFormatted = currency.format(total);
           
            String description1 = String.format(description);
			String message = "\nLINE ITEM\n"
                    + "Code:        " + productCode + "\n"
                    + "Price:       " + priceFormatted + "\n"
                    + "Quantity:    " + quantity + "\n"
                    + "Total:       " + totalFormatted + "\n"
            		+ "Description: " + description1 +"\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Enter new item? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Thanks For Shopping!");
    }

	private static void format(Object anyNumberType) {
		// TODO Auto-generated method stub
		
	}
}
