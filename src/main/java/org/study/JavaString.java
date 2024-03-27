package org.study;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaString {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: " + reversedStr);

        String words = "One Two Three Four ";
        System.out.println(words);
        System.out.println(words.length());
        System.out.println(words.toLowerCase());
        System.out.println(words.concat(" Five"));
        System.out.println(words.trim());
        System.out.println(words.replaceAll(" ", "/"));
        System.out.println(Arrays.toString(words.split("\\s")));
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
