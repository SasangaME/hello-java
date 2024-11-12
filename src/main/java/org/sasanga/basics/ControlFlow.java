package org.sasanga.basics;

public class ControlFlow {
    public static void demo() {
        final String day = "Thursday";
        final String dayType = switch (day)  {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> null;
        };
        System.out.printf("Day type: %s\n", dayType);
    }
}
