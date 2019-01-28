package hony.god;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String name;
    private String surename;
    private int age;

    public Student(String name, String surename, int age) {
        this.name=name;
        this.surename=surename;
        this.age=age;
    }

    @Override
    public String toString() {
        String out="Student{";
        out+="Name: "+ this.name;
        out+=", Surename: "+ this.surename;
        out+=", Age: "+ this.age;
        out+="}";
        return out;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurename() {
        return this.surename;
    }

    @Override
    public int compareTo(Student o) {
        if  (this.age == o.getAge())
            return 0;
        if (this.age > o.getAge())
            return 1;
        return -1;
    }

    public static Comparator<Student> StudentNameComparator
            = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {

            String studemtName1 = s1.getName().toUpperCase();
            String studentName2 = s2.getName().toUpperCase();

            return studemtName1.compareTo(studentName2);
        }

    };
}
