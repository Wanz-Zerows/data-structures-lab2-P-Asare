import java.util.*;

public class StoreInventory<E extends Product> {
    
    public ArrayList<E> store = new ArrayList<>();

    /**
     * Puts new product into the store
     * 
     * @param product
     */
    public void addProduct(E product){
        store.add(product);
    }

    /**
     * Remove product from store based on name of product
     * 
     * @param name
     */
    public void removeProduct(String name){
        
        for (int i = 0; i < store.size(); i++){
            if (store.get(i).name.toLowerCase().equals(name.toLowerCase())){
                store.remove(i);
                break;
            }
        }
    }

    /**
     * Searches for a product in the store
     * array list.
     * 
     * @param name
     * @return product found
     */
    public E findProduct(String name){
        
        for (int i = 0; i < store.size(); i++){
            if (store.get(i).name.toLowerCase().equals(name.toLowerCase())){
                return store.get(i);
            }
        }

        return null;
    }

    /**
     * List out names of all the products
     * in the store.
     */
    public void listAllProducts(){

        for (E e : store) {
            
            System.out.println(">>> " + e.name);
        }
    }

    /**
     * Sums up the price of each product in
     * the store.
     * 
     * @return
     */
    public double getTotalValue(){
        double total = 0.0;
        
        for (E e : store) {
            total += (e.price * e.stock); // multiple price of particular product by the stock of that product's category
        }
        
        return total;
    }

    /**
     * Find the most expensive product in inventory
     * 
     * @return Product Object
     */
    public E mostExpensiveProduct(){
        E max = store.get(0);

        for (E e : store) {
            if (e.price >= max.price) max = e;
        }

        return max;
    }


}
