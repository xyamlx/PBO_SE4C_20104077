package com.amel.pbo.modul7.percobaan;

public class TV extends Electronics{

    public TV() {
    }

    public TV(String name){
        super(name);
    }

    public void onActivate(){
        System.out.println(this.getName() + " starts displaying image!");
    }

    public void onDeactivate(){
        System.out.println(this.getName() + " stop displaying image!");
    }
}
