package org.sasanga.oop;

import lombok.Data;

public class Cat extends Animal {
    public void printDetails() {
        System.out.println("Breed: " + super.getBreed());
        System.out.println("Age: " + super.getAge());
        System.out.println("Color: " + super.getColor());
    }

    @Override
    void eat() {
        System.out.println("cat is eating now");
    }
}

@Data
abstract class Animal {
    private String breed;
    private int age;
    private String color;

    abstract void eat();
}
