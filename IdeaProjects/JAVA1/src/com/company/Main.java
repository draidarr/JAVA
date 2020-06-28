package com.company;

import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human me = new Human("Human");
        me.firstName = "Patryk";
        me.lastName = "Nawojczyk";
        me.cash=10000.0;
        Human you = new Human("Human");
        you.firstName = "Pioter";
        you.lastName = "Kowalski";
        you.cash=10000.0;

        Pet dog = new Pet("dog");
        me.pet = dog;
        me.pet.feed();
        for (int i = 0; i < 13; i++) {
            me.pet.takeForAWalk();
        }
        me.sal();
        me.setSalary(4999.0);

        Car beema = new Car("e46", "bmw");
        Car renault = new Car("laguna", "renault");
        Phone nokia = new Phone("3310", "nokia");
        me.getVehicle();
        me.setVehicle(beema);
        me.setVehicle(renault);
        if (beema.equals(renault)) System.out.println("Cars have the same price");
        else System.out.println("Cars don't have the same price");
        System.out.println(dog);
        System.out.println(renault);
        System.out.println(beema);
        System.out.println(me);
        System.out.println(nokia);
        try {
            renault.sell(me, you, 2.0);
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
        try {
            beema.sell(me, you, 2.0);
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
        dog.beEaten();
    }
}
