/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem04;

/**
 *
 * @author sanji
 */
public class Problem04 {
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to display prime numbers and compute their sum
    public static void displayPrimes() {
        int count = 0; // Counter to print three primes per line
        int sum = 0; // To store the sum of prime numbers
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + "  "); // Print prime number with two spaces
                sum += i; // Add the prime number to the sum
                count++;
                if (count == 3) {
                    System.out.println(); // Move to the next line after 3 numbers
                    count = 0;
                }
            }
        }
        // Print the sum of prime numbers after displaying them
        System.out.println("\nThe sum of the displayed prime numbers is: " + sum);
    }

    public static void main(String[] args) {
        displayPrimes(); 
    }
}
