// EMMa Ko
// 1/10/2020

package murach.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        // calculate and display a total
        String productCode = "java";
        double price = 49.50;
        int quantity = 2;
        double total = price * quantity;
        String message = 
            "Code:     " + productCode + "\n" +
            "Price:    " + price + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total:    " + total + "\n";
        System.out.println(message);

        // display your name        
        // TODO: add code here
        System.out.println ("EMMa");
        
        int sum;
		// calculate and display an average        
        // TODO: add code here
        double average = sum/args.length;

        System.out.println(average );

        // display a goodbye message
        System.out.println("Bye!");
    }
}
