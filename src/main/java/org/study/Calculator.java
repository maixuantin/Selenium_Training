package org.study;

public class Calculator {

    /**
     * Add method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    static int add1(int a, int b) {
        int c = a + b;
        System.out.println("a + b = c");
        System.out.println(a + " + " + b + " = " + c);
        return c;
    }

    /**
     * Add method
     *
     * @param a value a
     * @param b value b
     * @return result
     */
    int add(int a, int b) {
        return a + b;
    }

    /**
     * Add method
     * @param a value a
     * @param b value b
     * @return result
     */
    static double add1(double a, double b) {
        double c = a + b;
        System.out.println("a + b = c");
        System.out.println(a + " + " + b + " = " + c);
        return c;
    }

    /**
     * Add method
     * @param a value a
     * @param b value b
     * @return result
     */
    double add(double a, double b) {
        return a + b;
    }
}
