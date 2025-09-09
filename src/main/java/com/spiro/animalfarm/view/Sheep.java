package com.spiro.animalfarm;

public class Sheep extends Animal {
    public Sheep(String name, int age, double weight) {
        super(name, age, weight, "Beeeeeeee");
    }
    public void shear() {
        System.out.println(getName() + " has been sheared.");
    }
}
