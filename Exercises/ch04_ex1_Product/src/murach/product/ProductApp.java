//Emma Ko 2.27.2020

package murach.product;

import java.util.Scanner;

public class ProductApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Product Viewer");
        System.out.println();

        // create 1 or more line items
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();

            // get the Product object
            // TEACHER NOTES: good job!!
            Product product = ProductDB.getProduct(productCode);

            // display the output
            String message = "\nPRODUCT\n" +
                "Code:        " + product.getCode() + "\n" +
                "Description: " + product.getDescription() + "\n" +
                "Price:       " + product.getPriceFormatted() + "\n";
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
// TEACHER NOTES: these are extra parenthesis.  You have too many so it will not compile.
//  make sure you are using your compiler and it will tell you they are unmatched.
}
}
}
