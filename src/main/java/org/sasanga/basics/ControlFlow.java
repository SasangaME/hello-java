package org.sasanga.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class ControlFlow {
    public static void demo() {
        final String day = "Thursday";
        final String dayType = switch (day)  {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> null;
        };
        System.out.printf("Day type: %s\n", dayType);

        var num = 10;
        var message = (num < 5) ? "low number" : "high number";
        System.out.println(message);

        // for each loop
        var items = new ArrayList<String>(Arrays.asList("Pippa", "Ollie", "Chucky", "Lulu", "Casey",
                "Chuchu", "Girly", "Waira"));
        for (String item : items) {
            System.out.println(item);
        }
        // alternative way
        items.forEach(System.out::println);
    }
}
