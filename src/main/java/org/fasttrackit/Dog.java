package org.fasttrackit;

public class Dog extends Animal {

   private int senseOfSmell;       // int senseOfSmell = 10; on a 1-10 scale for example

    public Dog(String name, String colour, String species, String favouriteFood, String favouriteActivity, int age,
               int healthLevel, int hungerLevel, int spiritLevel, int senseOfSmell) {
        super(name, colour, species, favouriteFood, favouriteActivity, age, healthLevel, hungerLevel, spiritLevel);
        this.senseOfSmell = senseOfSmell;
    }

    public Dog() {}

    public int getSenseOfSmell() {
        return senseOfSmell;
    }

    public void setSenseOfSmell(int senseOfSmell) {
        this.senseOfSmell = senseOfSmell;
    }

    @Override
    public int increaseSpiritLevel(String favouriteFood, String favouriteActivity) {
        System.out.println("The dog is wagging its tail.");
        return 0;
    }
}
