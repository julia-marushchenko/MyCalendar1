/**
 *  Java program to demonstrate abstract Calendar class.
 */

package com.mycalendar;

import java.util.Calendar;

/**
 *  Main class.
 */
public class Main {

    // Entry point for JVM.
    public static void main(String[] args) {

        // Creating instance of Calendar.
        Calendar calendar = Calendar.getInstance();

        // Printing calendar type to console.
        System.out.println(calendar.getCalendarType()); // Output: gregory

        // Printing maximum days in a week.
        System.out.println(calendar.getMaximum(Calendar.DAY_OF_WEEK)); // Output: 7

        // Printing maximum days in a year.
        System.out.println(calendar.getMaximum(Calendar.DAY_OF_YEAR)); // Output: 366

    }
}