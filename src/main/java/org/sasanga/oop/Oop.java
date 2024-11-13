package org.sasanga.oop;

import java.util.Arrays;
import java.util.Collections;

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

        variableArguments(2, 4, 53.4, 2.4);
    }

    public static void variableArguments(double... nums) {
       for(double num : nums) {
           System.out.println(num);
       }
    }
}
