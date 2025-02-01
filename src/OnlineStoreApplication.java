import services.ProductService;
import utils.DatabaseConnection;

public class OnlineStoreApplication {
    public static void main(String[] args) {
        try {
            DatabaseConnection.initialize();
            ProductService productService = ProductService.getInstance();

            productService.addProduct("Laptop", 1200.99);
            productService.addProduct("Smartphone", 800.50);

            productService.getAllProducts().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
