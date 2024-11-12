package org.sasanga.basics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeDemo {
    public static void demo() {
        LocalDate date = LocalDate.now();
        var time = date.atTime(LocalTime.now());
        var year = date.getYear();
        var month = date.getMonth();
        var day = date.getDayOfMonth();

        System.out.println(date);
        System.out.println(time);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
