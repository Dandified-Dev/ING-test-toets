package com.ing.zoo;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Zoo {
    private static final String COMMAND_HELLO = "hello";
    private static final String COMMAND_GIVE_LEAVES = "give leaves";
    private static final String COMMAND_GIVE_MEAT = "give meat";
    private static final String COMMAND_PERFORM_TRICK = "perform trick";
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your command: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" "); // Split input by space
        String command = parts[0];
        Animal animal = null;
        if (parts.length == 3) {
            command = parts[0] + " " + parts[1];
            animal = Arrays.stream(animals)
                    .filter(a -> a.getName().equals(parts[2]))
                    .findFirst()
                    .orElse(null);
        }
        if (parts.length == 2) {
            animal = Arrays.stream(animals)
                    .filter(a -> a.getName().equals(parts[1]))
                    .findFirst()
                    .orElse(null);
        }
        if (animal != null) {
            switch (command) {
                case COMMAND_HELLO:
                    animal.sayHello();
                    break;
                case COMMAND_GIVE_LEAVES:
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    } else if (animal instanceof Omnivore) {
                        ((Omnivore) animal).eatMeat();
                    } else {
                        System.out.println("This animal does not eat leaves.");
                    }
                    break;
                case COMMAND_GIVE_MEAT:
                    if (animal instanceof Carnivore2) {
                        ((Carnivore2) animal).eatMeat();
                    } else if (animal instanceof Omnivore) {
                        ((Omnivore) animal).eatMeat();
                    } else {
                        System.out.println("This animal does not eat meat.");
                    }
                    break;
                case COMMAND_PERFORM_TRICK:
                    if (animal instanceof Performer) {
                        ((Performer) animal).performTrick();
                    } else {
                        System.out.println("This animal cannot perform a trick.");
                    }
                    break;
                default:
                    System.out.println("Unknown command: " + input);
            }
        } else if (Objects.equals(command, "hello")) {
            for (Animal a : animals) {
                a.sayHello();
            }
        } else System.out.println("Unknown command: " + input);
    }
}
