//Emma Ko 2/27/2020


package murach.product;

public class ProductDB {

    public Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Product product = new Product();

        // fill the Product object with data
        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            product.setDescription("Murach's Java Programming");
            product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
            product.setDescription("Murach's Java Servlets and JSP");
            product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
            product.setDescription("Murach's MySQL");
            product.setPrice(54.50);
        } else {
            product.setDescription("Unknown");
        // TEACHER NOTES: this else if block is unreachable code.  Make sure you are looking at the compile errors in eclipse
        //  move this block above the else on line 28, because the else on linee 28 catches everything that the else if's 
        //  above it didn't catch.  Otherwise, this looks great (expensive!)
        } else if (productCode.equalsIgnoreCase ("Emm's Code")) {
        	product.setDescription("Emm's Fabulous Code Factory");
        	product.setPrice(58397.00);
        }
        
        return product;
    }
}
