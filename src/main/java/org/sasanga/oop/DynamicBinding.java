package org.sasanga.oop;

public class DynamicBinding {
    public static void demo() {
        Pet pet = new Pet(); // Pet reference and object
        pet.move();
        Pet dog = new Dog(); // Pet reference but Dog object
        dog.move();
    }
}

class Pet {
    protected void move() {
        System.out.println("animal is moving");
    }
}

class Dog extends Pet {
    @Override
    protected void move() {
        System.out.println("dog is moving and running ");
    }
}
