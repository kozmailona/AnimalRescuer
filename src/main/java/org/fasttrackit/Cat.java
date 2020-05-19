package org.fasttrackit;

public class Cat extends Animal {

    boolean purring;

    public Cat(String name, String colour, String species, String favouriteFood, String favouriteActivity, int age,
               int healthLevel, int hungerLevel, int spiritLevel) {
        super(name, colour, species, favouriteFood, favouriteActivity, age, healthLevel, hungerLevel, spiritLevel);
    }

    public boolean isPurring() {
        return purring;
    }

    public void setPurring(boolean purring) {
        this.purring = purring;
    }
}
