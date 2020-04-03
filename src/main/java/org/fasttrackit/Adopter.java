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
        animal.spiritLevel = 3;

        if (animal.favouriteFood == food.name) {
            animal.spiritLevel++;
            System.out.println("Now Jack is happy. This much: " + animal.spiritLevel + ".");
        }

    }

    public void playing(Animal animal, Activity activity) {
        animal.spiritLevel = 3;
        System.out.println(name + " was " + activity.name + " with " + animal.name + " in the " + activity.location +
                ".");
        animal.spiritLevel = animal.spiritLevel +5;

        if (activity.name == animal.favouriteActivity) {
            animal.spiritLevel++;
            System.out.println("Yaay, I love it. I'm happy. This muuch: " + animal.spiritLevel);
        } else {
            animal.spiritLevel--;
            System.out.println("Oh, I don't like it... I'm not in my mood: " + animal.spiritLevel);
        }
    }
}



