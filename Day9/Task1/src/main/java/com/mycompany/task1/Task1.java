/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task1;

import java.util.Scanner;

/**
 *
 * @author sanji
 */

class InvalidMarksException extends Exception {
    private int marks;

    // Default constructor
    InvalidMarksException() {}

    // Parameterized constructor
    InvalidMarksException(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "InvalidMarksException: " + marks;
    }
}


public class Task1 {
    
    // Method to validate marks
    static void compute(int value) throws InvalidMarksException {
        if (value > 100 || value < 0) {
            // Throw custom exception if marks are invalid
            throw new InvalidMarksException(value);
        } else {
            System.out.println("Valid Marks: " + value);
        }
    }
    
    

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < 5; i++) {
            try {
                int value = inp.nextInt(); // Read user input
                compute(value);           // Validate marks
            } catch (InvalidMarksException e) {
                System.out.println("Exception Caught: " + e);
            }
        }

        inp.close();
    }
}
