package models;

public class Order {
    private int orderId;
    private int userId;
    private int productId;

    public Order(int orderId, int userId, int productId) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;
    }
}
