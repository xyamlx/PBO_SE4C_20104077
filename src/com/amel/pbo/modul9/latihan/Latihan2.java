package com.amel.pbo.modul9.latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Masukkan Angka : ");
            int angka = scan.nextInt();
            if (angka>10)
                throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        }

        catch (Exception s) {
            System.out.println("Angka lebih dari 10");
        }
        System.out.println("Selesai");
    }
}
