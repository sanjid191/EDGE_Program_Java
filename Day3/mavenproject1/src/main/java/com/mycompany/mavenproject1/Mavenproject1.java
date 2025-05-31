/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author sanjid
 */


class Student {
    // Properties of the Student class
    String name;
    int age;
    String studentId;

    // Constructor to initialize the Student object
    
    
//    Student(String name, int age, String studentId) {
//        name = name;          
//        age = age;            
//        studentId = studentId; 
//    }
    
    
    Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}



public class Mavenproject1 {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "S101");
        Student student2 = new Student("Alice", 20, "S101");
        student1.displayInfo();
    }
}
