/*
 * Nama File    : PNS.java
 * Deskripsi    : Class yang merepresentasikan PNS
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;
    private final int A = 4; // Digit ke-14 dari NIM : 24060123140204
    
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    @Override
    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate startDate = LocalDate.parse(tgl_mulai_kerja, formatter);
            LocalDate now = LocalDate.now();
            return (int)(ChronoUnit.YEARS.between(startDate, now) + A);
        } catch (Exception e) {
            System.out.println("Error in date format: " + e.getMessage());
            return 0;
        }
    }
    
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.printf("%-20s: %s%n", "NIP", this.nip);
        System.out.printf("%-20s: %d tahun%n", "Masa Kerja", this.hitungMasaKerja());
        System.out.printf("%-20s: Rp %.2f%n", "Pajak", this.hitungPajak());
        System.out.println("============================================");
    }
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
}