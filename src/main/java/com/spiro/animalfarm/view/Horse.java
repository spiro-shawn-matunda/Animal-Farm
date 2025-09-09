package com.spiro.animalfarm;

public class Horse extends Animal {

    String name;
    int age;
    double weight;
    String sound;

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    public void move() {
        System.out.println(name + " is moving around.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }


    public void ride() {
        System.out.println(getName() + " can be ridden.");
    }

    public Horse(String name, int age, double weight) {
        super(name, age, weight, "Neigh");
    }


}
