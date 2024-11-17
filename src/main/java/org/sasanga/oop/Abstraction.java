package org.sasanga.oop;

import lombok.Data;

public class Abstraction {
    public static void demo() {
        AbstractDemo obj = new AbstractDemoImpl();
        obj.setName("Sasanga");
        obj.doSomething();
    }
}

@Data
abstract class AbstractDemo {
    private String name;
    private String description;

    abstract void doSomething();
}

class AbstractDemoImpl extends AbstractDemo {

    /**
     *
     */
    @Override
    void doSomething() {
        System.out.println("this is an implementation of an abstract method");
    }
}
