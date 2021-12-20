package com.amel.pbo.modul9.percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int b = 10;

        try {
            System.out.println(b/0);
        }

        catch (ArithmeticException e){
            System.out.println("Error : Tidak  bisa membagi bilangan dengan angka 0!");
        }
    }
}
