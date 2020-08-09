package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Food> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[4];

    private Animal animal;
    private Adopter adopter;
    private Vet vet;

    public void start() {
        System.out.println("Yay! It is an animal rescuer game!");
        System.out.println();
        initFood();
        initActivities();
        displayFood();
        displayActivities();
    }

    private void initFood() {
        Food food1 = new Food();
        food1.setName("Pedigree");
        availableFood.add(food1);

        Food food2 = new Food();
        food2.setName("Whiskas");
        availableFood.add(food2);

        Food food3 = new Food();
        food3.setName("MilkyWay");
        availableFood.add(food3);

        Food food4 = new Food();
        food4.setName("MiniHeart");
        availableFood.add(food4);
    }

    private void initActivities() {

        Activity activity1 = new Activity();
        activity1.setName("walking");
        availableActivities[0] = activity1;

        Activity activity2 = new Activity();
        activity2.setName("playing");
        availableActivities[1] = activity2;

        Activity activity3 = new Activity();
        activity3.setName("sleeping");
        availableActivities[2] = activity3;

        Activity activity4 = new Activity();
        activity4.setName("running");
        availableActivities[3] = activity4;

    }

    private void displayFood() {

        System.out.println("The available foods for the puppy are: ");

        int foodCounter = 1;
        for (Food food : availableFood) {
            System.out.println(foodCounter + ": " + food.getName());
            foodCounter++;
        }
    }

    private void displayActivities() {

        System.out.println("The available activities for the puppy are: ");

        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println((i + 1) + ". " + availableActivities[i].getName());
            }
        }

    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}

