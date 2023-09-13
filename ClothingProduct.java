public class ClothingProduct extends Product<Object>{

    String name;
    double price;
    int stock;

    /**
     * Constructor to produce Clothing Product
     * 
     * @param name
     * @param stock
     * @param price
     */
    public ClothingProduct(String name, double price, int stock){
        super(name, price, stock); // Create product object
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){ // Tailor how object is displayed for testing
        return this.name + " " + this.price;
    }
    
}
