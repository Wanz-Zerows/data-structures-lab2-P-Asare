// import java.util.Arrays;

public class TestProductSystem {

    public static void main(String[] args) {
        
        // central inventory storage
        StoreInventory<Product> storage = new StoreInventory<>();

        // add variety of products
        ElectronicProduct mouse = new ElectronicProduct("mouse", 10.0, 5);
        ElectronicProduct computer = new ElectronicProduct("Computer", 240.0, 1);
        ClothingProduct skirt = new ClothingProduct("skirt", 20.0, 1);
        ClothingProduct shoe = new ClothingProduct("shoe", 20.0, 1);

        // Test various storage methods

        storage.addProduct(mouse);
        storage.addProduct(skirt);
        storage.addProduct(shoe);
        storage.addProduct(computer);

        storage.listAllProducts();

        System.out.println("Total inventory value is: " + storage.getTotalValue());

        System.out.println(storage.findProduct("Shoe").name);

        storage.removeProduct("shoe");

        storage.listAllProducts();

        System.out.println(storage.getTotalValue());

        System.out.println(storage.mostExpensiveProduct());

    }
    
}
