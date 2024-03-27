package org.study;

public class For {

    public static void main(String[] args) {
        writeAlphabet();
    }

    static void writeAlphabet() {
        char s;
        for (s = 'a'; s <= 'z'; s++) {
            System.out.println(s);
        }
    }
}
