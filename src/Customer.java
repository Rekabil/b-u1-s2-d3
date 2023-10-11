package src;

import java.util.Random;

public class Customer{
    Long id;
    String name;
    int tier;

    public Customer(String name ,int tier) {

        Random rndm = new Random();
        this.id = rndm.nextLong(999999999);
        this.name = name;
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }


}
