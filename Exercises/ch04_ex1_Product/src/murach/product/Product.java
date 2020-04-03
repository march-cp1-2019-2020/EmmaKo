//Emma Ko, 2/27/2020
//I couldn't figure out some steps
package murach.product;

import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    
    }
    
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(price);
        return priceFormatted;
    }    
}

	// TEACHER NOTES:  don't need a private constructor because no other class could see it.
	private ProductConstructor ([code, description, price]) {
	
}

	// TEACHER NOTES: this constructor already exists at the top of the class so you don't need it again.
	public Product () {
		code = "";
		description = "";
		price = 0.0;

	}

	// TEACHER NOTES: This is a good constructor! only thing I see is double is misspelled so it won't compile.
	public Product (String code, String description, doulbe price) {
		this.code = code;
		this.description = description;
		this.price = price;
}
