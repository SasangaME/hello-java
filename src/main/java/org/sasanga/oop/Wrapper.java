package org.sasanga.oop;

import java.util.Optional;

public class Wrapper {

    public static void demo() {
        int a = 20;
        Integer objA = a;
        int b = objA.intValue();
        System.out.println(objA);
        objA = null;
        System.out.println(objA);

        Optional<Integer> objB = Optional.of(a);
        System.out.println(objB.get());
        System.out.println(objB.isPresent());
        objB = Optional.ofNullable(null);
        System.out.println(objB.orElseGet(() -> 100));
    }
}
