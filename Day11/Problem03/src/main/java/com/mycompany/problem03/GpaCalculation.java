/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem03;

/**
 *
 * @author sanji
 */
class GpaCalculation {
    public static double calculateGpa(int score) throws IllegalArgumentException {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid input: Score must be between 0 and 100.");
        }

        double gpa = 0.0;
        if (score >= 80) {
            gpa = 4.0; 
        } else if (score >= 75) {
            gpa = 3.75; 
        } else if (score >= 70) {
            gpa = 3.50; 
        } else if (score >= 65) {
            gpa = 3.25; 
        } else if (score >= 60) {
            gpa = 3.00; 
        } else if (score >= 55) {
            gpa = 2.75; 
        } else if (score >= 50) {
            gpa = 2.50; 
        } else if (score >= 45) {
            gpa = 2.25; 
        } else if (score >= 40) {
            gpa = 2.00;
        }
        return gpa;
    }
}
