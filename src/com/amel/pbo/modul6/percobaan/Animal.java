package com.amel.pbo.modul6.percobaan;

public class Animal {
    public String name;
    public int age;

    public Animal(){
    }

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println(this.name + " walks!");
        System.out.println();
    }
}
