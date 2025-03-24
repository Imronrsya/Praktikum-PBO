/*
 * Nama File    : Pengusaha.java
 * Deskripsi    : Class yang merepresentasikan Pengusaha
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;
    private final int B = 0; // // Digit ke-13 dari NIM : 24060123140204
    
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    @Override
    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate startDate = LocalDate.parse(tgl_mulai_kerja, formatter);
            LocalDate now = LocalDate.now();
            return (int)(ChronoUnit.YEARS.between(startDate, now) + B);
        } catch (Exception e) {
            System.out.println("Error in date format: " + e.getMessage());
            return 0;
        }
    }
    
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("%-20s: %s%n", "NPWP", this.npwp);
        System.out.printf("%-20s: %d tahun%n", "Masa Kerja", this.hitungMasaKerja());
        System.out.printf("%-20s: Rp %.2f%n", "Pajak", this.hitungPajak());
        System.out.println("============================================");
    }    
        
    public String getNpwp() {
        return npwp;
    }
    
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}