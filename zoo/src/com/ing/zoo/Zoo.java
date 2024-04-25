package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;

import java.util.Scanner;

/**
 * Zoo command application
 *
 * @author dannièl Herlaar
 */

public class Zoo {
    private static final String COMMAND_HELLO = "hello";
    private static final String COMMAND_HELLO_ANIMAL = "hello ";
    private static final String COMMAND_GIVE_LEAVES = "give leaves";
    private static final String COMMAND_GIVE_MEAT = "give meat";
    private static final String COMMAND_PERFORM_TRICK = "perform trick";

    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty"),
                new Gorilla("Jan"),
                new Eagle("Joleen")
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your command: ");

            String input = scanner.nextLine();

            // Handle the "hello" command
            if (input.equals(COMMAND_HELLO)) {
                for (Animal a : animals) {
                    a.sayHello();
                }
            }
            // Handle the "hello [name]" command
            else if (input.startsWith(COMMAND_HELLO_ANIMAL)) {
                String name = input.split(" ")[1];
                boolean animalFound = false;
                for (Animal animal : animals) {
                    if (animal.getName().equalsIgnoreCase(name)) {
                        animal.sayHello();
                        animalFound = true;
                        break;
                    }
                }
                if (!animalFound) {
                    System.out.println("There is no animal called " + name);
                }
            // Handle the "give leaves" command
            } else if (input.equals(COMMAND_GIVE_LEAVES)) {
                for (Animal a : animals) {
                    if (a instanceof Herbivore) {
                        ((Herbivore) a).eatLeaves();
                    }
                }
            // Handle the "give meat" command
            } else if (input.equals(COMMAND_GIVE_MEAT)) {
                for (Animal a : animals) {
                    if (a instanceof Carnivore) {
                        ((Carnivore) a).eatMeat();
                    }
                }
            // Handle the "perform trick" command
            } else if (input.equals(COMMAND_PERFORM_TRICK)) {
                for (Animal a : animals) {
                    if (a instanceof Performer) {
                        ((Performer) a).performTrick();
                    }
                }
            // Handle unknown command
            } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}