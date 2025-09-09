package com.spiro.animalfarm;


public class Chicken extends Animal {

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

    public void fur(){
        System.out.println(name+ "has feathers ");
    }

        public Chicken(String name, int age, double weight) {
            super(name, age, weight, "Cluck");
        }
        public void layEgg() {
            System.out.println(getName() + " laid an egg.");
        }
    }

