package org.fasttrackit;

import java.time.LocalDate ;


/**
 * My first game for my Gucci Puppy!
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
    Activity activity2 = new Activity();
        activity2.name = "walking";



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
    Animal animal2 = new Animal();
        animal2.favouriteFood = "Happy meal";



        //Clothes
    Clothes clothes = new Clothes();
        clothes.name = "hoodie";
        clothes.price = 40;



        //Food
    Food food = new Food();
        food.name = "Pedigree";
        food.price = 52;
        LocalDate newDate = LocalDate.now().minusMonths(2);


        //Home
    Home home = new Home();
        home.name = "Portable kennel";
        home.price = 100;
    Home home2 = new Home();
        home2.name = "Gucci Dog Bed";


        //Salon
    Salon salon = new Salon();
        salon.service = "Hair washing";
        salon.availableMoney = 500;
        salon.priceOfService = 55;



        //Vet
    Vet vet = new Vet();
        vet.name = "Jason";
        vet.specialization = "General vet";
        vet.medicines = "Vitamins and vaccinations";


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
