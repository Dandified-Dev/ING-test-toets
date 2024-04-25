package com.ing.zoo;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello(){
        System.out.println(name + " makes a sound");
    }
}
