package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;

public class Eagle extends Animal implements Carnivore {

    public String helloText;
    public String eatText;

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "KI KI RA";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "good!!!!!!";
        System.out.println(eatText);
    }
}
