package org.fasttrackit;

public class Adopter {

    String name;
    int availableMoney;
    int age;

    public Adopter(String name, int availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;

    }
    public void feed (Animal animal, Food food) {
        System.out.println(name + " just gave some " + food.name + " to " + animal.name);
        animal.hungerLevel = animal.hungerLevel -5;

    }

    public void playing(Animal animal, Activity activity) {
        System.out.println(name + " was " + activity.name + " with " + animal.name + " in the " + activity.location +
                ".");
        animal.spiritLevel = animal.spiritLevel +5;
    }
}



