package com.ing.zoo;

public class Hippo extends Herbivore {
    public String helloText;
    public String eatText;

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
