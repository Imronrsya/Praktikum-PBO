/*
 * Nama File    : Manusia.java
 * Deskripsi    : Class Manusia yang merupakan induk dari kelas-kelas lain
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 24 Maret 2025
 */

public abstract class Manusia implements iPajak {
    protected String nama;
    protected String tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;
    
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public Manusia(String nama, String tgl_mulai_kerja, double pendapatan) {
        this(nama, tgl_mulai_kerja, "", pendapatan);
    }
    
    public abstract int hitungMasaKerja();
    
    public void cetakInfo() {
        System.out.println("============================================");
        System.out.printf("%-20s: %s%n", "Nama", this.nama);
        System.out.printf("%-20s: %s%n", "Tanggal Mulai Kerja", this.tgl_mulai_kerja);
        System.out.printf("%-20s: %s%n", "Alamat", this.alamat);
        System.out.printf("%-20s: Rp %s%n", "Pendapatan", String.format("%,.2f", this.pendapatan));
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }
    
    public void setTgl_mulai_kerja(String tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
}
