package com.company;

public class Main {

    public static void main(String[] args) {
	Human me = new Human();
	me.firstName = "Patryk";
	me.lastName = "Nawojczyk";

		Animal dog = new Animal("dog");
	me.pet= dog;
	me.pet.feed();
	for(int i=0;i<15;i++){
		me.pet.takeForAWalk();}

    }
}
