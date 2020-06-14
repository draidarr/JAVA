package com.company;

import java.io.File;

public class Animal implements Sellable{
    static final Double DEFAULT_DOG_WEIGHT = 12.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.0;
    static final Double DEFAULT_HORSE_WEIGHT = 1000.0;
    static final Double DEFAULT_WEIGHT = 10.0;
    final String species;
    Double weight;
    String name;
    File pic;
    Double price;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
            this.price = 50.0;
        } else if (species == "cat") {
            this.weight = DEFAULT_CAT_WEIGHT;
            this.price = 40.0;
        } else if (species == "horse") {
            this.weight = DEFAULT_HORSE_WEIGHT;
            this.price = 1000.0;
        } else {
            this.weight = DEFAULT_WEIGHT;
            this.price = 1.0;
        }
    }


    public void feed() {
        if (this.weight == 0.0) {
            System.out.println("am dead bro");
        } else {
            this.weight++;
            System.out.println("thx for food bro my weight is: " + this.weight);
        }
    }

    public void takeForAWalk() {
        if (this.weight == 0.0) {
            System.out.println("am dead bro");
        } else {
            this.weight--;
            System.out.println("thx for walk bro my weight is: " + this.weight);
        }
    }

    public String toString() {
        return species + " " + weight;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}

