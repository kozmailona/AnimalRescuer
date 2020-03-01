package org.fasttrackit;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //Activity
        Activity activityReference = new Activity();
            activityReference.activityOne = "playing";
            activityReference.activityTwo = "sleeping";
            activityReference.activityThree = "bathing";
            activityReference.favouriteToy = "duck;";
            activityReference.favouriteLeash = "red one";
            activityReference.numberOfToys = 10;
            activityReference.numberOfLeashes = 3;


        //Adopter
        Adopter adopterReference = new Adopter();
            adopterReference.adopterName = "Anne";
            adopterReference.availableMoney = 1000;
            adopterReference.age = 22;


        //Animal
        Animal animalReference = new Animal();
            animalReference.animalName = "Jack";
            animalReference.colourOfAnimal = "black";
            animalReference.animalSpecies = "dog";
            animalReference.favouriteFood = "Pedigree";
            animalReference.favouriteActivity = "playing";
            animalReference.animalAge = 3;
            animalReference.healthLevel = 8;
            animalReference.hungerLevel = 7;
            animalReference.spiritLevel = 9;
            animalReference.weightOfAnimal = 4.5;       //kg


        //Clothes
        Clothes clothesReference = new Clothes();
            clothesReference.hoodie = "Red Pucci";
            clothesReference.dogVest = "Good2Go";
            clothesReference.dogTie = "Bow Tie Set";
            clothesReference.hoodiePrice = 40;
            clothesReference.dogVestPrice = 50;
            clothesReference.dogTiePrice = 55;


        //Food
        Food foodReference = new Food();
            foodReference.foodOne = "Pedigree";
            foodReference.foodTwo = "Dog Chow";
            foodReference.foodThree = "Wellness";
            foodReference.foodQuantity = 50;        //kg
            foodReference.foodOnePrice = 50;
            foodReference.foodTwoPrice = 70;
            foodReference.foodThreePrice = 80;
            foodReference.foodAvailability = true;
            foodReference.date = new Date(2022,12,12);


        //Grooming
        Grooming groomingReference = new Grooming();
            groomingReference.bathing = true;
            groomingReference.hairRemoval = false;
            groomingReference.nailTrimming = true;
            groomingReference.earCleaning = true;
            groomingReference.bathPrice = 75;
            groomingReference.hairRemovalPrice = 80;
            groomingReference.nailTrimmingPrice = 55;
            groomingReference.earCleaningPrice = 40;
            groomingReference.availableMoney = 500;


        //Home
        Home homeReference = new Home();
            homeReference.kennel = "Portable kennel";
            homeReference.crate = "Brown crate";
            homeReference.dogBed = "Pedigree dog bed";
            homeReference.kennelPrice = 200.55;
            homeReference.cratePrice = 300.80;
            homeReference.dogBedPrice = 100.50;
            homeReference.cleanedKennel = true;
            homeReference.cleanedCrate = false;
            homeReference.cleanedDogBed = true;


        //Vet
        Vet vetReference = new Vet();
            vetReference.vetName = "Jason";
            vetReference.vetSpetialization = "General vet";
            vetReference.medicines = "Vitamins and other medicines";
            vetReference.medicinePrice = 100;
            vetReference.vaccinationPrice = 150;
            vetReference.chip = true;


        //Weather
        Weather weatherReference = new Weather();
            weatherReference.outsideTemperature = 22.5;     //°C
            weatherReference.sunny = true;
            weatherReference.rainy = false;
            weatherReference.windy = true;
            weatherReference.foggy = false;

    }


}
