import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;
    private String status;

    public Order(Cart cart) {
        this.products = new ArrayList<>(cart.getProducts());
        this.totalPrice = cart.getTotalPrice();
        this.status = "New";
    }

    public List<Product> getProducts() { return products; }
    public double getTotalPrice() { return totalPrice; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order:\n");
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Total price: ").append(totalPrice).append("\n");
        sb.append("Status: ").append(status);
        return sb.toString();
    }
}
