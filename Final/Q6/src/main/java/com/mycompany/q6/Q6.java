/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q6;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author sanji
 */

class InvalidSharedCounterException extends Exception {
    public InvalidSharedCounterException(String message) {
        super(message);
    }
}

class SharedCounter {
    private int counter = 0;
    private static final int COUNTER_LIMIT = 100; // Define a limit for the counter

    // Synchronized method to increment the counter
    public synchronized void increment() throws InvalidSharedCounterException {
        if (counter >= COUNTER_LIMIT) {
            throw new InvalidSharedCounterException("Counter limit exceeded! Current value: " + counter);
        }
        counter++;
        System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
    }

    public int getCounter() {
        return counter;
    }
}



class CounterTask implements Runnable {
    private final SharedCounter sharedCounter;

    public CounterTask(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                sharedCounter.increment();
                Thread.sleep(10); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        } catch (InvalidSharedCounterException e) {
            System.out.println(Thread.currentThread().getName() + " encountered an error: " + e.getMessage());
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        // Create multiple threads
        Thread thread1 = new Thread(new CounterTask(sharedCounter), "Thread-1");
        Thread thread2 = new Thread(new CounterTask(sharedCounter), "Thread-2");
        Thread thread3 = new Thread(new CounterTask(sharedCounter), "Thread-3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Print the final value of the counter
        System.out.println("Final counter value: " + sharedCounter.getCounter());
    }
}