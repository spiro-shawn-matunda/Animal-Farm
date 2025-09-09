package com.spiro.animalfarm;

public class Pig extends Animal {

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

        public Pig(String name, int age, double weight) {
            super(name, age, weight, "Oink");
        }
        public void wallow() {
            System.out.println(getName() + " is wallowing in mud.");
        }
    }

