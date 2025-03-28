/*
 * Nama File    : Fakultas.java
 * Deskripsi    : Class untuk menyimpan informasi fakultas, termasuk nama, tarif UKT, dan gaji pokok.
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 28 Maret 2025 
 */

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void printInfo() {
        String formattedTarifUKT = String.format("Rp%,.2f", tarifUKT)
                .replace(",", "X").replace(".", ",").replace("X", ".");
        String formattedGaji = String.format("Rp%,.2f", gajiPokok)
                .replace(",", "X").replace(".", ",").replace("X", ".");
        System.out.println("Fakultas            : " + nama);
        System.out.println("Tarif UKT           : " + formattedTarifUKT);
        System.out.println("Gaji Pokok Fakultas : " + formattedGaji);
        System.out.println("-----------------------------------------------");
    }
}