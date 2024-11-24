package org.sasanga.basics;

public class Strings {
    public static void demo() {
        String s1 = "Sasanga";
        String s2 = "Sasanga";
        String s3 = new String("Sasanga");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        // concat
        String s4 = s1.concat(s2);
        System.out.println(s4);
    }
}
