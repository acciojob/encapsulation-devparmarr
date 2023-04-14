package com.driver;

public class RWOnly {
    private String name;

    public RWOnly(String name) {
        this.name = name;
    }

     // Getter method for name
     public String getName() {
        return name;
    }
    
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    
    public void printName() {
        System.out.println(name);
    }
}
