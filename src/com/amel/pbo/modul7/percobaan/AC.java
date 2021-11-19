package com.amel.pbo.modul7.percobaan;

public class AC extends Electronics {

    public AC(){
    }

    public AC(String name){
        super(name);
    }

    public void onActivate(){
        System.out.println(this.getName() + " starts cooling the room!");
    }

    public void onDeactivate(){
        System.out.println(this.getName() + " stop cooling the room!");
    }
}
