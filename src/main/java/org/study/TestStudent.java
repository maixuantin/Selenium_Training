package org.study;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(10);
        s1.setGender("Male");
        s1.setName("Darren");

        Student s2 = new Student();
        s2.setAge(20);
        s2.setGender("Male");
        s2.setName("Shan");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        for (Student s: students) {
            System.out.println(s.toString());
        }


    }
}
