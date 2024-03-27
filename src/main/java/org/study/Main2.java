package org.study;

import javax.security.auth.login.LoginContext;

public class Main2 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        double c = 1.2, d = 2.5;

        int result1 = Calculator.add1(a, b);
        double result2 = Calculator.add1(c, d);
        
        print(result1 + "");
        print(result2 + "");
        print(String.valueOf(result1));
        print(String.valueOf(result2));

        Calculator calculator = new Calculator();

        int result3 = calculator.add(a, b);
        print(String.valueOf(result3));

        double result4 = calculator.add(c, d);
        print(String.valueOf(result4));

        // Read Excel file with column A, B
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 3; j++) {
                int result = calculator.add(i, j);
                print(String.valueOf(result));
            }
        }

        /* The code below will print the words Hello World
        to the screen, and it is amazing */

    }

    /**
     * Print result
     *
     * @param result result
     */
    static void print(String result) {
        System.out.println("Result: " + result);
    }
}
