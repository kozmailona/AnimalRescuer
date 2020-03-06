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
        activityReference.name = "playing";
        activityReference.location = "park";
        activityReference.duration = 1.5;


        //Adopter
    Adopter adopter = new Adopter();
        adopter.age = 22;
        adopter.name = "Anne";
        adopter.availableMoney = 500;



        //Animal
    Animal animal = new Animal();
        animal.name = "Jack";
        animal.colour = "black";
        animal.species = "dog";
        animal.favouriteFood = "Pedigree";
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
        vet.name = "Jason";
        vet.specialization = "General vet";
        vet.medicinesAtVet = "Vitamins and vaccinations";


        //Weather
    Weather weather = new Weather();
        weather.outsideTemperature = "Rainy";
        weather.temperatureInCelsius = 22.5;


        System.out.println("Hey! I`m " + adopter.name + ".");
        System.out.print("My dog is " + animal.name + ". ");
        System.out.println("His favourite activity is " + activityReference.name + " in the " + activityReference.location + ".");
        System.out.println("He used to be afraid of the vet, " + vet.name + ". Now Jack loves him... since he gives " +
                "it " + food.name + " treats every time they meet.");



    }
}
