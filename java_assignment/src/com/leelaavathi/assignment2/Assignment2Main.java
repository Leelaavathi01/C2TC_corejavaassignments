package com.leelaavathi.assignment2;

public class Assignment2Main {
    public static void main(String[] args) {
        // Part 1: Test default constructor in Student
        Student s1 = new Student();

        // Part 2: Commission calculation
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}