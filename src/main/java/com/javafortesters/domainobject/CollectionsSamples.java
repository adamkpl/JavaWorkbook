package com.javafortesters.domainobject;

import java.util.*;

/**
 * Collections Samples
 * @version 1.0 2020-05-28
 * @author Adam K.
 */

public class CollectionsSamples {

    //todo Add more collections
    public static final int[] ARRAY_WITH_DUPLICATED_ELEMENTS = {0, 0, 1, 1};
    public static List<String> workdays = new ArrayList<>();
    public static Set<String> genericSet = new HashSet<>();

    public static void printArrayElements(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println("index " + index + ": " + array[index]);
        }
    }

    public static void addMultipleElementsToSet(Set<String> set, int amount, String string) {
        int x = 0;
        while (x <= amount) {
            set.add(string);
            x++;
        }
    }

    public static void prepareAnInvalidWeekDaysNamesList() {
        workdays.add("Monday");     // 0
        workdays.add("Tuesday");    // 1
        workdays.add("Wednesday");  // 2
        workdays.add("Wednesday");  // 3, Invalid. Expected: Thursday
        workdays.add("Friday");     // 4
        workdays.add("Saturday");   // 5
        workdays.add("Sunday");     // 6
    }

}