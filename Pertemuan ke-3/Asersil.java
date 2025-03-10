/*
 * File         : Asersil.java
 * Deskripsi    : Program untuk menunjukkan asersil
 * Pembuat      : MOHAMMAD IMRON ROSYADI
 * Tanggal      : 07 Maret 2025
 */

 public class Asersil {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
 }