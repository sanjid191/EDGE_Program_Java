/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st_task;


/**
 *
 * @author sanjid
 */
public class App {
   
    public static class Time {
        int h = 5;
        int m = 10;
        int s = 5;
    }

    public static void main(String[] args) {
        Time time1 = new Time();

        System.out.println(time1.h + ":" + time1.m + ":" + time1.s);
    }
}