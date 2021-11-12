package com.amel.pbo.modul5.percobaan;

public class Student {
    private int nrp;
    private String name;

    public Student() {
        this(0, "null");
    }

    public Student(String name){
        this(0, name);
    }

    public Student(int nrp, String name){
        this.nrp = nrp;
        this.name = name;
    }

    public int getNrp(){
        return nrp;
    }

    public String getName(){
        return name;
    }
}
