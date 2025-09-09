package com.spiro.animalfarm.view;

public class Goat extends Animal {
    public Goat(String name, int age, double weight) {
        super(name, age, weight, "Moo");
    }

    public void milk() {
        System.out.println(getName() + " has been milked.");
    }


    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}

