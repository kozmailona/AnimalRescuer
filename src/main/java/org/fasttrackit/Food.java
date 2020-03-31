package org.fasttrackit;
import java.util.Date;

public class Food {

    String name;
    int price;
    int quantity;
    boolean availability;       //kg
    Date expirationDate;

    public Food(String name, int price, int quantity, boolean availability, Date expirationDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.availability = availability;
        this.expirationDate = expirationDate;
    }
}
