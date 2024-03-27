package org.study;

public class Drbug {
    static int x = 5;
    public static void main(String[] arg) {
        System.out.println(x);

        m1();

        System.out.println(x);


        m2();

        System.out.println(x);
    }

    static void m1() {
        x = 4;
    }
    static void m2() {
        x = 7;
    }
}
