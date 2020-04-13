package org.fasttrackit;

public class Animal {

    
    private String name;
    private String colour;
    private String species;
    private String favouriteFood;
    private String favouriteActivity;
    private String favouriteToy;
    private String favouriteLeash;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int spiritLevel;
    private double weightAnimal;
    private boolean chip;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public String getFavouriteLeash() {
        return favouriteLeash;
    }

    public void setFavouriteLeash(String favouriteLeash) {
        this.favouriteLeash = favouriteLeash;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public double getWeightAnimal() {
        return weightAnimal;
    }

    public void setWeightAnimal(double weightAnimal) {
        this.weightAnimal = weightAnimal;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }
}
