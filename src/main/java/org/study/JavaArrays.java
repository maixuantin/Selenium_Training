package org.study;

import java.util.ArrayList;

public class JavaArrays {
    public static void main(String[] args) {
        String car1 = "Volvo";
        String car2 = "BMW";
        String car3 = "Ford";
        String car4 = "Mazda";

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int index = 0; index < cars.length; index++) {
            System.out.println(cars[index]);
        }


        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String car : cars) {
            System.out.println(car);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        for (int[] myNumber : myNumbers) {
            for (int i : myNumber) {
                System.out.println(i);
            }
        }


    }

    static void sumArray(int[] arrNum) {
        int sum = 0;
        int i;

        // Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];
        }

        System.out.println("The sum is: " + sum);
    }
}
