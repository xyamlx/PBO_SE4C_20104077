package com.amel.pbo.modul6.percobaan;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Animal("Leon");
        Animal unknown = new Animal();
        Bird eagle = new Bird("Eagle", 5);
        Cat cat = new Cat("Miyu", 3, "Orange");

        System.out.println("Lion name: " + lion.name);
        System.out.println("Lion age : " + lion.age);
        lion.walk();
        System.out.println();

        System.out.println("Unknown name: " + unknown.name);
        System.out.println("Unknown age : " + unknown.age);
        unknown.walk();
        System.out.println();

        System.out.println("Bird name: " + eagle.name);
        System.out.println("Bird age : " + eagle.age);
        eagle.walk();
        eagle.fly();
        System.out.println();

        System.out.println("Cat name: " + cat.name);
        System.out.println("Cat age : " + cat.age);
        cat.walk();
        System.out.println();
    }
}
