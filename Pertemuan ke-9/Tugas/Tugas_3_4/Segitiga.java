/**  
 * Nama File    : Segitiga.java 
 * Deskripsi    : Implrmentasi Segitiga sebagai BangunDatar
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisiKiri, sisiKanan;

    public Segitiga(double alas, double tinggi, double sisiKiri, double sisiKanan) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return alas + sisiKiri + sisiKanan;
    }
}