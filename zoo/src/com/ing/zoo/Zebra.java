package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;

/**
 * Represents a Zebra
 */
public class Zebra extends Animal implements Herbivore, Performer {
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        trick = "be pedestrian crossing";
        System.out.println(trick);
    }
}
