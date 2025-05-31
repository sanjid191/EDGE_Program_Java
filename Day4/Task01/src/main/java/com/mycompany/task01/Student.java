/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task01;

/**
 *
 * @author sanji
 */
public class Student {
    // Private fields for student information
    private String name;
    private int age;
    private String studentID; 

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentID);
    }
    
    
    // Constructor to initialize Student object
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.displayInfo();
    }

    
}
