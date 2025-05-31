/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q4_ii;

import java.util.HashMap;

/**
 *
 * @author sanji
 */
public class Q4_ii {

    public static void main(String[] args) {
        String[] words = {"Bob", "Alice", "Alice", "Bob", "Alice", "Bob", "Bob"};

        // Use HashMap to count occurrences
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print occurrences
        System.out.println("Word Occurrences: " + wordCount);
    }
}
