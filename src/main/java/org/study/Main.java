package org.study;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int a = 1, b = 2;
        double c = 1.2, d = 2.5;

        System.out.println("a + b = c");

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(c + " + " + d + " = " + (c + d));


        System.out.println("Result: " + add(a, b));

        print(add(a, b) + "");

        print(String.valueOf(add(a, b)));
        print(String.valueOf(add(c, d)));

        print(add(c, d) + "");
        print(minus(a, b) + "");
    }

    /**
     * Add method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    static int add(int a, int b) {
        int c = a + b;
        System.out.println("a + b = c");
        System.out.println(a + " + " + b + " = " + c);
        return c;
    }

    static double add(double a, double b) {
        double c = a + b;
        System.out.println("a + b = c");
        System.out.println(a + " + " + b + " = " + c);
        return c;
    }

    /**
     * Minus method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    static int minus(int a, int b) {
        return a - b;
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