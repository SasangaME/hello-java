package org.sasanga.oop;

public class Oop {
    /**
     * this is a demo method to use it in the main class
     */
    public static void demo() {
        var pippa = new Cat();
        pippa.setAge(2);
        pippa.setColor("white");
        pippa.setBreed("white cat");

        pippa.printDetails();
        System.out.println(pippa);
    }
}
