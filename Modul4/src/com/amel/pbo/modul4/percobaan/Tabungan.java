package com.amel.pbo.modul4.percobaan;

public class Tabungan {
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    public Tabungan(String nama, int noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = 0;         // Nilai default saldo
        this.pin = 12345;       // Nilai default PIN
    }

    public Tabungan(String nama, int noRekening, int saldo, int pin){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }

    public void tarikUang(int jumlah){
        this.saldo -= jumlah;
    }

    public void setSaldo(int saldoAkhir){
        this.saldo = saldoAkhir;
    }

    public void setPin(int pinBaru){
        this.pin = pinBaru;
    }


    public String getNama(){
        return nama;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }
}
