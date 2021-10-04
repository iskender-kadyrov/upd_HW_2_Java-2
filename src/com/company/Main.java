package com.company;

import java.util.Arrays;

public class Main {

    public static Dog dog = new Dog("Balto", new String[]{"Sit", "Attack"});
    public static Cat cat = new Cat("Tom", 9);
    public static Snake snake = new Snake("Basilisk", "Basilik's bite is lethal");
    public static Animal[] animals = {dog, cat, snake};

    public static void main(String[] args) {
        for (Animal animal : animals) {
//            Animal cat = createObject("Cat");
            animal.print();
        }
    }

    public static Animal createObject(String className) {
        switch (className) {
            case "Dog" -> {
                System.out.println("Case Dog has been revoked:");
                return dog;
            }
            case "Cat" -> {
                System.out.println("Class Cat has been revoked:");
                return cat;
            }
            case "Snake" -> {
                System.out.println("Class Snake has been revoked:");
                return snake;
            }
            default -> {
                return dog;
            }
        }
    }
}
