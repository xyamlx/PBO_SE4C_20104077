package com.amel.pbo.modul2.latihan;

import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int anak_ayam, a;

        System.out.print("Masukan Jumalah Anak Ayam : ");
        anak_ayam = scan.nextInt();
        for (a = anak_ayam; a > 1; a--){
            System.out.print("Anak Ayam Turun " + anak_ayam+ "\n");
            anak_ayam = a - 1;
            System.out.println("Mati 1 Tinggal " + anak_ayam);
        }
        System.out.println("Anak Ayam Turun 1 \nMati 1 Tinggal Induknya");
    }
}
