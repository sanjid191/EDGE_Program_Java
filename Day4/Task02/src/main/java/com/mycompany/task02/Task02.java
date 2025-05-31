/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task02;

/**
 *
 * @author sanjid
 */

class Time {
    private int hour;
    private int minute;
    private int second;

    // First setTime method: accepts hour, minute, and second as parameters
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Second setTime method: accepts hour and minute only, sets second to 0
    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    // Third setTime method: accepts hour only, sets minute and second to 0
    public void setTime(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    // Method to display the time
    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d%n", hour, minute, second);
    }
}




public class Task02 {

    public static void main(String[] args) {
         Time time1 = new Time();

        time1.setTime(10, 30, 45);
        time1.displayTime(); 

        
        time1.setTime(12, 15);
        time1.displayTime();

        time1.setTime(9);
        time1.displayTime(); 
    }
}
