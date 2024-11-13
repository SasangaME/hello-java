package org.sasanga.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class ControlFlow {

    static Logger logger = Logger.getLogger(ControlFlow.class.getName());

    public static void demo() {
        final String day = "Thursday";
        final String dayType = switch (day)  {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> null;
        };
        logger.info("Day type: %s".formatted(dayType));

        var num = 10;
        var message = (num < 5) ? "low number" : "high number";
        logger.info(message);

        // for each loop
        var items = new ArrayList<String>(Arrays.asList("Pippa", "Ollie", "Chucky", "Lulu", "Casey",
                "Chuchu", "Girly", "Waira"));
        for (String item : items) {
            logger.info(item);
        }
        // alternative way
        items.forEach(System.out::println);
    }
}
