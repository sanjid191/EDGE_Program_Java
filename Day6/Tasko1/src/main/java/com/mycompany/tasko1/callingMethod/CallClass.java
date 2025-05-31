/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasko1.callingMethod;
import com.mycompany.tasko1.Tasko1;
import com.mycompany.tasko1.Sum;


/**
 *
 * @author sanji
 */
public class CallClass {

    public static void main(String[] args) {
        // Create an instance of the Tasko1 class
        Tasko1 calc = new Tasko1();

        // Assign values
        int a = 10;
        int b = 5;

        // Perform operations and display results
        System.out.println("Sum: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
        
        // constructor call
        Sum sumObj = new Sum(a, b);
        System.out.print("constructor SUM:" + sumObj.sum(a, b));
    }
}