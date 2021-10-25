package com.amel.pbo.modul3.percobaan;

public class Tabungan {

    // attribute
    public int saldo;

    //constructor method
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    // method
    public void ambilUang (int jumlah) {
        saldo -= jumlah;
    }
}
