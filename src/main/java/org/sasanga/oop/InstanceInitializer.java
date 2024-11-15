package org.sasanga.oop;

public class InstanceInitializer extends SuperInitializer {
    {
        System.out.println("instance block is running");
    }

    public InstanceInitializer() {
        super();
        System.out.println("constructor is running");
    }
}

class SuperInitializer {
    {
        System.out.println("super initializer is running");
    }
    SuperInitializer() {
        System.out.println("super constructor is running");
    }
}
