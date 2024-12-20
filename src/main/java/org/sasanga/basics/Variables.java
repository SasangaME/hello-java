package org.sasanga.basics;

public class Variables {
    public static void demo() {
        final var message = "Variables";

        var variableObj = new VariableClass();
        variableObj.setMark(56);
        System.out.println("variableObj = " + variableObj.getMark());
        System.out.println(message);

        var person = new Person(1, "Sasanga");
        System.out.println(person.name());

        // Demonstrate type widening and narrowing
        int integerVal = 2;
        double widenedVal = integerVal; // Widening
        int narrowedVal = (int) widenedVal; // Narrowing

        System.out.println("Original int: " + integerVal);
        System.out.println("Widened to double: " + widenedVal);
        System.out.println("Narrowed back to int: " + narrowedVal);
    }
}

class VariableClass {
    static int count = 0; // static variable
    int mark; //instance variable

    public VariableClass() {
        count++;
    }

    public int getMark() {
        var localVal = 5;// local variable
        mark *= localVal + (int) (Math.random() * localVal);
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}

record Person(int id, String name) {
}
