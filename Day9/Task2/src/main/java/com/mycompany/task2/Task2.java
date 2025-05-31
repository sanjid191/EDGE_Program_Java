/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task2;
import java.util.Scanner;

/**
 *
 * @author sanji
 */


class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}



public class Task2 {
    
    static int validateInput(String input) throws InvalidInputException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid input: Only numbers are acceptable.");
        }
    }
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Read first number
            System.out.print("Enter the first number:");
            String firstInput = scanner.nextLine();
            int number1 = validateInput(firstInput);

            // Read second number
            System.out.print("Enter the second number:");
            String secondInput = scanner.nextLine();
            int number2 = validateInput(secondInput);

            // Perform addition
            int sum = number1 + number2;
            System.out.println("The sum of the two numbers is: " + sum);

        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
