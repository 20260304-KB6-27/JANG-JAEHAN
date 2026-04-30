package lecture.exercise2;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<Product> products;
    private LocalDate orderDate;

    public Order(int orderId, String customerName, List<Product> products, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.products = products;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    // 주문의 총액을 계산하는 메서드
    public double getTotalAmount() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}