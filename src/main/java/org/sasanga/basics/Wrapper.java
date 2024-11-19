package org.sasanga.basics;

import java.util.Optional;

public class Wrapper {
    public static void demo() {
        int a = 20;
        Integer objA = a;
        System.out.println(objA);
        objA = null;
        System.out.println(objA);
        int b = objA.intValue();

        Optional<Integer> objB = Optional.of(a);
        System.out.println(objB.get());
        System.out.println(objB.isPresent());
        objB = Optional.ofNullable(null);
        System.out.println(objB.orElseGet(() -> 100));
    }
}
