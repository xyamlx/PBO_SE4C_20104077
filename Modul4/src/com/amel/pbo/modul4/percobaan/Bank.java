package com.amel.pbo.modul4.percobaan;

public class Bank {
    public static void main(String[] args) {

        //pembuatan object baru dari class Tabungan
        Tabungan saya = new Tabungan(
                "Barca",
                50410420,
                1_000_000,
                12345
        );

        // demostrasi methid Getter
        System.out.println("Nama        : " + saya.getNama());
        System.out.println("No Rekening : " + saya.getNoRekening());
        System.out.println("Saldo       : " + saya.getSaldo());
        System.out.println("PIN         : " + saya.getPin());
    }
}
