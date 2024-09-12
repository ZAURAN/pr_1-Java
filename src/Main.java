import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Categories
        Category electronics = new Category(1, "Electronics");
        Category smartphones = new Category(2, "Smartphones");
        Category accessories = new Category(3, "Accessories");

        // Products
        Product product1 = new Product(1, "Laptop", 19999.99, "High-performance laptop", electronics);
        Product product2 = new Product(2, "Smartphone", 12999.50, "Large screen smartphone", smartphones);
        Product product3 = new Product(3, "Headphones", 2499.00, "Noise-cancelling headphones", accessories);

        // Cart
        Cart cart = new Cart();

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1 - View products");
            System.out.println("2 - Add product to cart");
            System.out.println("3 - View cart");
            System.out.println("4 - Place order");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(product1);
                    System.out.println(product2);
                    System.out.println(product3);
                    break;
                case 2:
                    System.out.println("Enter product ID to add to cart:");
                    int id = scanner.nextInt();
                    if (id == 1) cart.addProduct(product1);
                    else if (id == 2) cart.addProduct(product2);
                    else if (id == 3) cart.addProduct(product3);
                    else System.out.println("Product not found");
                    break;
                case 3:
                    System.out.println(cart);
                    break;
                case 4:
                    if (cart.getProducts().isEmpty()) {
                        System.out.println("Cart is empty. Add products before ordering.");
                    } else {
                        Order order = new Order(cart);
                        System.out.println("Order placed:");
                        System.out.println(order);
                        cart.clear();
                    }
                    break;
                case 0:
                    System.out.println("Thank you for using our store!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}