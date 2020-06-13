package com.company;

public class Main {

    public static void main(String[] args) {
	Human me = new Human();
	me.firstName = "Patryk";
	me.lastName = "Nawojczyk";

		Animal dog = new Animal("dog");
	me.pet= dog;
	me.pet.feed();
	for(int i=0;i<14;i++){
		me.pet.takeForAWalk();}
Car bmwe46 = new Car("e46", "bmw");
	me.vehicle= bmwe46;
    }
}
