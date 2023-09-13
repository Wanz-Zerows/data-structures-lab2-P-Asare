public class ElectronicProduct extends Product{

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
    public String toString(){
        return this.name + " " + this.price;
    }

    
}
