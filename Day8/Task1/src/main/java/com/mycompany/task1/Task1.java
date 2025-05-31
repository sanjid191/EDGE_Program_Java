/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task1;

/**
 *
 * @author sanji
 */
public class Task1 {

    public static void main(String[] args) {
         try {
            // Code that might throw an exception
            int number = 10;
            int result = number / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Code that will always execute
            System.out.println("Finally Code_block executed.");
        }

        System.out.println("Program continues...");
        
    }
}
