package org.sasanga.oop;

public class InterfaceDemo {
    public static void demo() {
        Drawable drawObj = new DrawImpl();
        drawObj.draw();
        drawObj.circle();
        Drawable.line();
    }
}

class DrawImpl implements Drawable {

    @Override
    public void draw() {
        System.out.println("this draws any shape");
    }
}

interface Drawable {
    public void draw();

    public static void line() {
        System.out.println("this draws a line and it's from a static method in interface");
    }

    default void circle() {
        System.out.println("this draws a circle");
        coolStuff();
    }

    private void coolStuff() {
        System.out.println("this is a private method in interface");
    }
}
