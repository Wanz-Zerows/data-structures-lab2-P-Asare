/**
 * Generic product class serving as a super
 * class for multiple types of products
 * 
 */
public class Product<E> {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock){
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

}
