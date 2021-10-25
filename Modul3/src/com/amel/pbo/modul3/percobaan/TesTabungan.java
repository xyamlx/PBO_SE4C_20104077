package com.amel.pbo.modul3.percobaan;

public class TesTabungan {
    public static void main(String[] args) {

        Tabungan t = new Tabungan(5000);

        //output nilai saldo awal
        System.out.println("Saldo awal Tabungan Anda : " + t.saldo);

        int jml = 1500;
        t.ambilUang(jml);

        System.out.println("Jumlah uang yang diambil : " + jml);

        System.out.println("Saldo Tabungan Anda sekarang adalah : " + t.saldo);
    }
}
