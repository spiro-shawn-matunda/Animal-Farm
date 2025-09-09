package com.spiro.animalfarm.view;

class Animal {
    String name;
    int age;
    double weight;
    String sound;

    public Animal(String name, int age, double weight, String sound) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    public void move() {
        System.out.println(name + " is moving around.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void status() {
        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight);
    }
}
