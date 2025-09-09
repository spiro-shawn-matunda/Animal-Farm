package com.spiro.animalfarm;

public class Cow extends Animal {
    public Cow(String name, int age, double weight) {
        super(name, age, weight, "Moo");
    }

    public void milk() {
        System.out.println(getName() + " has been milked.");
    }


    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}










