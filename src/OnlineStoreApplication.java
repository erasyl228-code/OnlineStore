import services.ProductService;
<<<<<<< HEAD
=======
import services.UserService;
import services.OrderService;
>>>>>>> e3c82ee (Milestone 2)
import utils.DatabaseConnection;

public class OnlineStoreApplication {
    public static void main(String[] args) {
        try {
            DatabaseConnection.initialize();
            ProductService productService = ProductService.getInstance();
<<<<<<< HEAD
=======
            UserService userService = new UserService();
            OrderService orderService = new OrderService();

            userService.registerUser(1, "Erasyl", "erasyl@example.com", "password123");
            userService.registerUser(2, "John Doe", "john@example.com", "123456");
>>>>>>> e3c82ee (Milestone 2)

            productService.addProduct("Laptop", 1200.99);
            productService.addProduct("Smartphone", 800.50);

<<<<<<< HEAD
            productService.getAllProducts().forEach(System.out::println);
=======
            orderService.createOrder(1, 1, 1);

            System.out.println("Users:");
            System.out.println(userService.getUserByEmail("erasyl@example.com"));
            System.out.println(userService.getUserByEmail("john@example.com"));

            System.out.println("Orders:");
            orderService.getOrdersByUserId(1).forEach(System.out::println);

>>>>>>> e3c82ee (Milestone 2)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
