/*
 * Nama File    : Petani.java
 * Deskripsi    : Class yang merepresentasikan Petani
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia {
    private String kabupaten;
    private static int counterPetani = 0;
    private final int C = 2; // // Digit ke-12 dari NIM : 24060123140204
    
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String kabupaten) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.kabupaten = kabupaten;
        counterPetani++;
    }
    
    @Override
    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate startDate = LocalDate.parse(tgl_mulai_kerja, formatter);
            LocalDate now = LocalDate.now();
            return (int)(ChronoUnit.YEARS.between(startDate, now) + C);
        } catch (Exception e) {
            System.out.println("Error in date format: " + e.getMessage());
            return 0;
        }
    }
    
    @Override
    public double hitungPajak() {
        return 0;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("%-20s: %s%n", "Kabupaten", this.kabupaten);
        System.out.printf("%-20s: %d tahun%n", "Masa Kerja", this.hitungMasaKerja());
        System.out.printf("%-20s: Rp %.2f%n", "Pajak", this.hitungPajak());
        System.out.println("============================================");
    }    
        
    public String getKabupaten() {
        return kabupaten;
    }
    
    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
}