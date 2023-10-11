package src;

import java.util.Random;

public class Product{
    Long id;
    String name;
    String catagory;
    Double price;
    public Product( String name , String catagory, Double price) {
        Random rndm = new Random();
        this.id = rndm.nextLong(999999999);
        this.name = name;
        this.catagory= catagory;
        this.price = price;
    }

    public String getCatagory(){
        return catagory;
    }

    public Double getPrice() {
        return price;
    }

    public  String toString () {
        return "Product: " + name + " Category: " +catagory + " Price: " +price;
    }
}
