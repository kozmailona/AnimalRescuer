package org.fasttrackit;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Food> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[4];

    private Animal animal;
    private Dog dog;
    private Cat cat;
    private Adopter adopter;
    private Vet vet;

    public void start() {
        System.out.println("Yay! It is an animal rescuer game!");
        System.out.println();
        initFood();
        initActivities();
        displayFood();
        displayActivities();
        initAnimal();
        initAdopter();
        nameAnimal();
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

    private void initAnimal() {
        Dog dog = new Dog();
        dog.setName("Jack");
        dog.setAge(5);

    }

    private void initAdopter() {

        Adopter adopter = new Adopter();
        System.out.println("Please, enter your name!");
        Scanner scanner = new Scanner(System.in);
        String adopterName = scanner.nextLine();
        adopter.setName(adopterName);

        //note to myself: The character class [a-zA-Z] matches any character from a to z or A to Z.
        try {
            if(adopterName.matches("[a-zA-Z]+")){       //"+" one or more
                System.out.println("Yay! " + adopterName + ", we are happy for having you here.");
            } else {
                throw new InputMismatchException();}
            } catch (InputMismatchException e) {
            System.out.println("Oops! You have entered an invalid value. Please, try again.");
        }
    }

    private void nameAnimal() {
        System.out.println("Hello, please, give a name to your puppy.");

        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        dog.setName(animalName);

        System.out.println("Hurray! The puppy's name is " + animalName);
        System.out.println(dog);
    }

    private void requireFeeding() {

        System.out.println("The puppy is hungry. Here are the foods for " + dog.getName());

        int foodCounter = 1;
        for (Food food : availableFood) {
            System.out.println(foodCounter + ": " + food.getName());
            foodCounter++;
        }

        System.out.println();
        System.out.println("Select your puppy's favourite food and feed it! ");
        Scanner scanner = new Scanner(System.in);
        int chosenFood = scanner.nextInt();

        System.out.println("The food you've chosen: " + chosenFood);

    }

//    private void getSelectedFoodFromUser() throws Exception {
//        System.out.println("Please, select food!");
//
//        try {
//            int availableFood = ScannerUtils.nextSingleInt();
//            return tracks[trackNumber - 1];
//        } catch (InputMismatchException e) {
//            throw new Exception("You have entered an invalid option.");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException("Wrong number entered.");
//        } finally {
//            System.out.println("Finally block always executed. ");
//        }


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

