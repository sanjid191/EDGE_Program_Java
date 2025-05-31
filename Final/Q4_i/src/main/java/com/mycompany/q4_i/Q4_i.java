/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q4_i;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author sanji
 */
public class Q4_i {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 8};

        // Convert to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);

        // Convert to LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(array));
        System.out.println("LinkedList: " + linkedList);
    }
}
