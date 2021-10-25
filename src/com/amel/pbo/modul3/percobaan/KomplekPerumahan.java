package com.amel.pbo.modul3.percobaan;

public class KomplekPerumahan {

    public static void main(String[] args) {

        // construct object 'r' dari class 'Rumah'
        Rumah r = new Rumah();

        // memanggil method
        r.setAlamat("Alamat saya di Jalan Pramuka");

        // melihat isi attribute
        System.out.println(r.alamatRumah);
    }
}
