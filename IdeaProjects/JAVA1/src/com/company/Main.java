package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human me = new Human("Human");
        me.firstName = "Patryk";
        me.lastName = "Nawojczyk";
        me.cash=10000.0;
        Human you = new Human("Human");
        me.firstName = "Pioter";
        me.lastName = "Kowalski";
        me.cash=10000.0;

        Animal dog = new Animal("dog");
        me.pet = dog;
        me.pet.feed();
        for (int i = 0; i < 13; i++) {
            me.pet.takeForAWalk();
        }
        me.sal();
        me.setSalary(5000.0);

        Car beema = new Car("e46", "bmw");
        Car renault = new Car("laguna", "renault");
        Phone nokia = new Phone("3310", "nokia");
        me.getVehicle();
        me.setVehicle(beema);
        me.setVehicle(renault);
        if (beema.equals(renault) == true) System.out.println("Cars have the same price");
        else System.out.println("Cars don't have the same price");
        System.out.println(dog);
        System.out.println(renault);
        System.out.println(beema);
        System.out.println(me);
        System.out.println(nokia);
        dog.sell(me, you, 2.0);
    }
}
