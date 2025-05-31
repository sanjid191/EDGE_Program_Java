/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task01;

/**
 *
 * @author sanji
 */


// Parent Class
class Parent {
    void parentMethod() {
        System.out.println("This is the Parent class.");
    }
}

// Single Inheritance: Child inherits from Parent
class SingleChild extends Parent {
    void singleChildMethod() {
        System.out.println("This is the SingleChild class.");
    }
}

// Multilevel Inheritance: GrandChild inherits from SingleChild
class GrandChild extends SingleChild {
    void grandChildMethod() {
        System.out.println("This is the GrandChild class.");
    }
}

// Hierarchical Inheritance: Another child of Parent
class AnotherChild extends Parent {
    void anotherChildMethod() {
        System.out.println("This is the AnotherChild class.");
    }
}

// Interface 1
interface InterfaceA {
    void methodA();
}

// Interface 2
interface InterfaceB {
    void methodB();
}

// Class implementing multiple interfaces (Multiple Inheritance)
class MultipleInheritanceClass implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("MethodA from InterfaceA.");
    }

    @Override
    public void methodB() {
        System.out.println("MethodB from InterfaceB.");
    }
}
public class Task01 {

    public static void main(String[] args) {
        // Demonstrate Single Inheritance
        SingleChild singleChild = new SingleChild();
        singleChild.parentMethod();
        singleChild.singleChildMethod();

        // Demonstrate Multilevel Inheritance
        GrandChild grandChild = new GrandChild();
        grandChild.parentMethod();
        grandChild.singleChildMethod();
        grandChild.grandChildMethod();

        // Demonstrate Hierarchical Inheritance
        AnotherChild anotherChild = new AnotherChild();
        anotherChild.parentMethod();
        anotherChild.anotherChildMethod();

        // Demonstrate Multiple Inheritance using Interfaces
        MultipleInheritanceClass multipleInheritanceObj = new MultipleInheritanceClass();
        multipleInheritanceObj.methodA();
        multipleInheritanceObj.methodB();
    }
}
