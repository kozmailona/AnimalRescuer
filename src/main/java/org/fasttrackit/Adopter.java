package org.fasttrackit;

public class Adopter {

    private String name;
    private int availableMoney;
    private int age;

    public Adopter(String name, int availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;

    }
    public void feed (Animal animal, Food food) {

        System.out.println(name + " just gave some " + food.getName() + " to " + animal.getName());

        animal.setSpiritLevel(3);

        if (animal.getFavouriteFood() == food.getName()) {
            animal.setSpiritLevel(animal.getSpiritLevel()+1);
            System.out.println("Now Jack is happy. This much: " + animal.getSpiritLevel() + ".");
        }

    }

    public void playing(Animal animal, Activity activity) {
        animal.setSpiritLevel(3);
        System.out.println(name + " was " + activity.getName() + " with " + animal.getName() + " in the " + activity.getLocation()+
                ".");

        if (activity.getName() == animal.getFavouriteActivity()) {
            animal.setSpiritLevel(animal.getSpiritLevel()+1);
            System.out.println("Yaay, I love it. I'm happy. This muuch: " + animal.getSpiritLevel());
        } else {
            animal.setSpiritLevel(animal.getSpiritLevel()-1);
            System.out.println("Oh, I don't like it... I'm not in my mood: " + animal.getSpiritLevel());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



