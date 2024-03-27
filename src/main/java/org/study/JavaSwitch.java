package org.study;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) {
        int day = input();
        calculateWeekday(day);
    }

    static void calculateWeekday(int day) {
        String dayName = "Invalid Weekday";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                break;
        }
        System.out.println("Today is " + dayName);
    }

    static int input() {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a number: ");

        // Read and store the input number
        return in.nextInt();
    }
}
