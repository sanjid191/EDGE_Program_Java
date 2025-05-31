package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Dev {

    @Autowired //FIELD INJECTION

    private Laptop laptop;

    //constructor injection
    public Dev(Laptop laptop){
        this.laptop = laptop;
    }

    // Setter injection

    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop = laptop;
    }
    
    public void build(){

        laptop.compile();

        System.out.println("Its a new project");
    }
    
}
