/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tasko1;


/**
 *
 * @author sanji
 */
public class Tasko1 {
    

    // Method to perform addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to perform division
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}