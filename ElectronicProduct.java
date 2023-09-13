public class ElectronicProduct extends Product<Object>{

    String name;
    double price;
    int stock;

    /**
     * Constructor to create an electronic product
     * 
     * @param name
     * @param price
     * @param stock
     */
    public ElectronicProduct(String name, double price, int stock){
        super(name, price, stock); // Increase stock of all products
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){ // Alter how object is displayed for testing purposes
        return this.name + " " + this.price;
    }

    
}
