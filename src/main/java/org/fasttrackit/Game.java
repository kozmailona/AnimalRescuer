package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Food> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[5];

    private Animal animal;
    private Adopter adopter;
    private Vet vet;

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

