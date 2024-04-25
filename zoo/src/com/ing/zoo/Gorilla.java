package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;

public class Gorilla extends Animal implements Herbivore, Performer {
    public String helloText;
    public String eatText;
    public String trick;
    public Gorilla(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "boeka boeka";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "YUM YUM YUM";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        trick = "chest pounding";
        System.out.println(trick);
    }
}
