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

        Game game = new Game();
        game.start();

        Animal animal = new Animal();
        animal.increaseSpiritLevel("milk", "walking");

        Animal dog = new Dog();
        dog.increaseSpiritLevel("Pedigree","playing");


        Animal cat = new Cat();
        cat.increaseSpiritLevel("Whiskas","sleeping");


//        //Activity
//    Activity activityReference = new Activity("playing", "park");
//        activityReference.setName("playing");
//        activityReference.setLocation("park");
//        activityReference.setDuration(1.5);
//    Activity activity2 = new Activity("walking", "park");
//        activity2.setName("walking");
//////
////
////
////        //Adopter
//        Adopter adopter = new Adopter("Anne", 500);
//            adopter.setAge(22);
//            adopter.setName("Anne");
//            adopter.setAvailableMoney(500);
//
////        //Animal
//    Animal animal = new Animal("Jack", "black","dog", "Pedigree", "playing",
//            2, 8, 8, 8);
//        animal.setName("Jack");
//        animal.setColour("black");
//        animal.setSpecies("dog");
//        animal.setFavouriteFood("Pedigree");
//        animal.setFavouriteActivity("playing");
//    Animal animal2 = new Animal("Jack", "black", "dog", "Happy meal", "playing",
//            2, 8, 8, 8);
//        animal2.setFavouriteFood("Happy Meal");
//
////
//        //Clothes
//
//        Clothes clothes = new Clothes("Hoodie", 40);
//        clothes.setName("Hoodie");
//        clothes.setPrice(40);
//
////
////
////        //Food
//    Food food = new Food("Pedigree", 52, 20, true, new Date(2020-04-04));
//        food.setName("Pedigree");
//        food.setPrice(52);
//        LocalDate newDate = LocalDate.now().minusMonths(2);
//
//
//        adopter.feed(animal, food);
//        adopter.playing(animal, activityReference);
//
////        //Home
//    Home home = new Home("Portable kennel", 100);
////        home.name = "Portable kennel";
////        home.price = 100;
//    Home home2 = new Home("Gucci Dog Bed", 100);
//         home2.setName("Gucci Dog Bed");
//
//
////        //Salon
//    Salon salon = new Salon("Hair washing", 500, 400);
//        salon.setService("Hair washing");
//        salon.setAvailableMoney(50);
//        salon.setPriceOfService(50);
////
////
////
////        //Vet
//    Vet vet = new Vet("Jason", 50, 40);
//        vet.setName("Jason");
//        vet.setSpecialization("General vet");
//        vet.setMedicines("Vitamins and vaccinations");
////
////
////        //Weather
//    Weather weather = new Weather("Rainy", 22.5);
//        weather.setOutsideTemperature("Rainy");
//        weather.setTemperatureInCelsius(22.5);


//        System.out.println("Hey! I`m " + adopter.name + ".");
//        System.out.print("My dog is " + animal.name + ". ");
//        System.out.println("His favourite activity is " + activityReference.name + " in the " + activityReference.location + ".");
//        System.out.println("He used to be afraid of the vet, " + vet.name + ". Now Jack loves him... since he gives " +
//                "it " + food.name + " treats every time they meet.");



    }
}
