package com.amel.pbo.modul9.percobaan;

public class Percobaan3 {
    public static void main(String[] args) {
        int c = 10;
        int[] d = new int[5];

        try {
            System.out.println(c/10);
            System.out.println(d[10]);
        }

        catch (ArithmeticException e){
            System.out.println("Terjadi Kesalahan Aritmatika!");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks array melebihi batas!");
        }

        catch (Exception e){
            System.out.println("Terjadi Error!");
        }
    }
}
