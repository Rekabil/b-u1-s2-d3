import src.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Random rndm =new Random();

        Supplier<Double> doubleSupplier = () -> {
            return rndm.nextDouble(0.99, 200.99);
        };
        Supplier<Integer> intSupplier = () -> {
            return rndm.nextInt(4);
        };

        Supplier<Product> bookSupplier = () -> new Product("Product" , "Books" , doubleSupplier.get());
        Supplier<Product> babySupplier = () -> new Product("Product" , "Baby" , doubleSupplier.get());
        Supplier<Product> boysSupplier = () -> new Product("Product" , "Boys" , doubleSupplier.get());


        List<Product> products =new ArrayList<>();

        for (int i = 0 ; i < 20 ; i++) {
            products.add(bookSupplier.get());
            products.add(babySupplier.get());
            products.add(boysSupplier.get());
        }


        List<Product> expensiveBooks = new ArrayList<>();

        for (Product value : products) {
            if (Objects.equals(value.getCatagory(), "Books")) {
                if (value.getPrice() > 100) {
                    expensiveBooks.add(value);
                }
            }

        }
        expensiveBooks.forEach(product -> System.out.println(product.toString()));


    }
}
