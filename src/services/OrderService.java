package services;

import models.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void createOrder(int orderId, int userId, int productId) {
        orders.add(new Order(orderId, userId, productId));
    }

    public List<Order> getOrdersByUserId(int userId) {
        List<Order> userOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUserId() == userId) {
                userOrders.add(order);
            }
        }
        return userOrders;
    }
}
