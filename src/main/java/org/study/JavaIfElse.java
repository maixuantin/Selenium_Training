package org.study;

public class JavaIfElse {
    public static void main(String[] args) {
        int day = 4;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3 || day == 4) {
            System.out.println("Wed");
        } else if (day == 5 && day == 6) {

        } else {
            System.out.println("Invalid day");
        }
    }
}
