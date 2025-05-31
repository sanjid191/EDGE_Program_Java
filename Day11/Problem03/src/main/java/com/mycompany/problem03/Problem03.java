/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem03;

import java.util.Scanner;

/**
 *
 * @author sanji
 */
public class Problem03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the score (0-100): ");
            int score = scanner.nextInt();
            double gpa = GpaCalculation.calculateGpa(score);

            // Display the calculated GPA
            System.out.println("Calculated GPA: " + gpa);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
