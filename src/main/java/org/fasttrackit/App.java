package org.fasttrackit;

import java.time.LocalDate ;
import java.util.Date;

/**
 * My first game for my Gucci Puppy!
 *
 */
public class App 
{
    public static void main( String[] args ) {




//        //Activity
    Activity activityReference = new Activity("playing", "park");
        activityReference.name = "playing";
        activityReference.location = "park";
        activityReference.duration = 1.5;
    Activity activity2 = new Activity("walking", "park");
        activity2.name = "walking";
////
//
//
//        //Adopter
        Adopter adopter = new Adopter("Anne", 500);
            adopter.age = 22;
            adopter.name = "Anne";
            adopter.availableMoney = 500;

//        //Animal
    Animal animal = new Animal("Jack", "black","dog", "Pedigree", "playing",
            2, 8, 8, 8);
        animal.name = "Jack";
        animal.colour = "black";
        animal.species = "dog";
        animal.favouriteFood = "Pedigree";
        animal.favouriteActivity = "playing";
    Animal animal2 = new Animal("Jack", "black", "dog", "Happy meal", "playing",
            2, 8, 8, 8);
        animal2.favouriteFood = "Happy meal";

//
        //Clothes

        Clothes clothes = new Clothes("Hoodie", 40);
        clothes.name = "hoodie";
        clothes.price = 40;

//
//
//        //Food
    Food food = new Food("Pedigree", 52, 20, true, new Date(2020-04-04));
        food.name = "Pedigree";
        food.price = 52;
        LocalDate newDate = LocalDate.now().minusMonths(2);


        adopter.feed(animal, food);
        adopter.playing(animal, activityReference);

//        //Home
    Home home = new Home("Portable kennel", 100);
//        home.name = "Portable kennel";
//        home.price = 100;
    Home home2 = new Home("Gucci Dog Bed", 100);
         home2.name = "Gucci Dog Bed";


//        //Salon
    Salon salon = new Salon("Hair washing", 500, 400);
        salon.service = "Hair washing";
        salon.availableMoney = 500;
        salon.priceOfService = 55;
//
//
//
//        //Vet
    Vet vet = new Vet("Jason", 50, 40);
        vet.name = "Jason";
        vet.specialization = "General vet";
        vet.medicines = "Vitamins and vaccinations";
//
//
//        //Weather
    Weather weather = new Weather("Rainy", 22.5);
        weather.outsideTemperature = "Rainy";
        weather.temperatureInCelsius = 22.5;


//        System.out.println("Hey! I`m " + adopter.name + ".");
//        System.out.print("My dog is " + animal.name + ". ");
//        System.out.println("His favourite activity is " + activityReference.name + " in the " + activityReference.location + ".");
//        System.out.println("He used to be afraid of the vet, " + vet.name + ". Now Jack loves him... since he gives " +
//                "it " + food.name + " treats every time they meet.");



    }
}
