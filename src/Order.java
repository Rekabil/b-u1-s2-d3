package src;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
    Long id;
    String status;

    LocalDate orderDate;
    LocalDate deliveryDate;

    List<Product> products;

    public Order(String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products) {
        Random rndm = new Random();
        this.id = rndm.nextLong(999999999);
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }




}
