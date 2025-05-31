/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem02;

/**
 *
 * @author sanji
 */

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start(); // Abstract method

    void stop() {
        System.out.println("The vehicle has stopped.");
    }
}

// Subclass inheriting from Vehicle (multilevel inheritance starts here)
class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void start() {
        System.out.println(brand + " car with " + numberOfDoors + " doors is starting.");
    }

    void drive() {
        System.out.println("The car is being driven.");
    }
}

// Subclass of Car (continuation of multilevel inheritance)
class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
        super(brand, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void start() {
        System.out.println(brand + " electric car with " + batteryCapacity + " kWh battery is starting silently.");
    }

    void charge() {
        System.out.println("The electric car is charging.");
    }
}

// Interface 1 for multiple inheritance
interface GPS {
    void showLocation();
}

// Interface 2 for multiple inheritance
interface MusicPlayer {
    void playMusic();
}

// Final class combining multilevel and multiple inheritance
class SmartElectricCar extends ElectricCar implements GPS, MusicPlayer {
    SmartElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
        super(brand, numberOfDoors, batteryCapacity);
    }

    @Override
    public void showLocation() {
        System.out.println("Displaying location on GPS.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on the in-car system.");
    }
}


public class Problem02 {

    public static void main(String[] args) {
        // Create an instance of SmartElectricCar
        SmartElectricCar myCar = new SmartElectricCar("Tesla", 4, 100);

        // Call methods 
        myCar.start();      
        myCar.drive();   
        myCar.charge();   
        myCar.stop();   
        myCar.showLocation();  
        myCar.playMusic();      
    }
}
