package org.sasanga.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/*
performs a deep compare using class fields with Equals and hashcode method
 */
public class ClassOperations {
    public static void demo() {
        ClassCompare objA = new ClassCompare("Sasa", "Sasanga");
        ClassCompare objB = new ClassCompare("Sasa", "Sasanga");
        System.out.println(objA.equals(objB));
    }
}

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
class ClassCompare {
    private String name;
    private String description;
}
