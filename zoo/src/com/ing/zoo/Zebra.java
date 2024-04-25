package com.ing.zoo;

public class Zebra extends Herbivore {
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
}
