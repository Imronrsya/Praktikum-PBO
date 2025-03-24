/*
 * Nama File    : Persegi.java
 * Deskripsi    : Kelas Persegi yang merupakan turunan dari BangunDatar,
 *                dan mengimplementasikan interface IResize.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 24 Maret 2025
 */

 public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        super();
        this.sisi = 0;
    }

    public Persegi(double sisi) {
        super("Biru");
        this.sisi = sisi;
    }

    // Implementasi method abstract dari BangunDatar
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /*
     * Bagian 2 – Interface (IResize)
     * Implementasi method zoomIn() dan zoomOut()
     */
    @Override
    public void zoomIn() {
        this.sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        this.sisi *= 0.9;
    }
}