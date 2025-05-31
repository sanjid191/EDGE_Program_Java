/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q5;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author sanji
 */
public class Q5 {

    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Create an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit tasks to the executor service
        for (int i = 0; i < 10; i++) {
            executorService.submit(new MapTask(map, "Task-" + i));
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}

class MapTask implements Runnable {
    private final ConcurrentHashMap<String, Integer> map;
    private final String taskName;

    public MapTask(ConcurrentHashMap<String, Integer> map, String taskName) {
        this.map = map;
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Simulate some processing
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Update the map
            map.put(taskName + "-" + i, i);

            // Print the current state of the map
            System.out.println(taskName + " updated map: " + map);
        }
    }
}