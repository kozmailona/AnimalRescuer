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
        activityReference.name = "hoodie";
        activityReference.location = "park";
        activityReference.duration = 1.5;


        //Adopter
    Adopter adopter = new Adopter()
        adopter.age = 22;
        adopter.name = "Anne";
        adopter.availableMoney = 500;


        //Animal
    Animal animal = new Animal();
        animal.name = "Jack";
        animal.colour = "black";
        animal.species = "dog";
        animal.getFavouriteFood = "Pedigree";
        animal.favouriteActivity = "playing";


        //Clothes
    Clothes clothes = new Clothes();
        clothes.name = "hoodie";
        clothes.price = 40;


        //Food
    Food food = new Food();
        food.name = "Pedigree";
        food.price = 52;
        food.expirationDate = new Date(2022,12,12);


        //Home
    Home home = new Home();
        home.kennels = "Portable kennel";
        home.kennelPrice = 100;


        //Salon
    Salon salon = new Salon();
        salon.service = "Hair washing";
        salon.availableMoney = 500;
        salon.priceOfService = 55;


        //Vet
    Vet vet = new Vet();
        vet.vetName = "Jason";
        vet.vetSpetialization = "General vet";
        vet.medicinesAtVet = "Vitamins and vaccinations";


        //Weather
    Weather weather = new Weather();
        weather.outsideTemperature = "Rainy";
        weather.temperatureInCelsius = 22.5;




    }
}
