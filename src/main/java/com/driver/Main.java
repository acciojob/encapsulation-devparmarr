package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly("Dev");
       // Get the value of name using getName method
       String name = obj.getName();
       System.out.println(name); 
       
       // Set the value of name using setName method
       obj.setName("Mary");
       name = obj.getName();
       obj.printName(); 
    }
}