package org.fasttrackit;

public class Animal {

    
    String name;
    String colour;
    String species;
    String favouriteFood;
    String favouriteActivity;
    String favouriteToy;
    String favouriteLeash;
    int age;
    int healthLevel;
    int hungerLevel;
    int spiritLevel;
    double weightAnimal;
    boolean chip;

    public Animal(String name, String colour, String species, String favouriteFood, String favouriteActivity, int age
            , int healthLevel, int hungerLevel, int spiritLevel) {
        this.name = name;
        this.colour = colour;
        this.species = species;
        this.favouriteFood = favouriteFood;
        this.favouriteActivity = favouriteActivity;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.spiritLevel = spiritLevel;

    }
}
