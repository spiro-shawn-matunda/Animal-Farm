package com.spiro.animalfarm;

import com.spiro.animalfarm.view.*;

public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow("Chales",2,4);
        Chicken chicken = new Chicken("Cynthia", 2, 5);
        Pig pig = new Pig("Shawn", 3, 150);
        Sheep sheep = new Sheep("Brian", 4, 80);
        Horse horse = new Horse("Victor", 7, 400);

        System.out.println();

        cow.makeSound();
        chicken.makeSound();
        pig.makeSound();
        sheep.makeSound();
        horse.makeSound();
        System.out.println();
        cow.milk();
        chicken.layEgg();
        pig.wallow();
        sheep.shear();
        horse.ride();
        System.out.println();

        cow.status();
        chicken.status();
        pig.status();
        sheep.status();
        horse.status();
        System.out.println();

        cow.setWeight(250);
        System.out.println(cow.getName() + "'s new weight is " + cow.getWeight());
    }
}

