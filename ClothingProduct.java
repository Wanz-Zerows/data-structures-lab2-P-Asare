public class ClothingProduct extends Product{

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
        super(name, price, stock);
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return this.name + " " + this.price;
    }
    
}
