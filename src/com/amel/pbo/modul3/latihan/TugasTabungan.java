package com.amel.pbo.modul3.latihan;

public class TugasTabungan {

    public int saldo;

    public TugasTabungan(int saldo){
        this.saldo = saldo;
    }

    public  int getSaldo(){
        return this.saldo;
    }

    public void simpanUang(int jml){
        saldo += jml;
    }

    public boolean ambilUang(int jml){
        if (jml <= getSaldo()){
            saldo -= jml;
            return true;
        }
        else {
            return false;
        }
    }
}
