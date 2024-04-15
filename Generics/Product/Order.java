package Generics.Product;

public class Order {
    private int orderId;
    private double amount;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}