/*
 * Nama File    : Lingkaran.java
 * Deskripsi    : Kelas Lingkaran yang merupakan turunan dari BangunDatar,
 *                dan mengimplementasikan interface IResize.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 24 Maret 2025
 */

 public class Lingkaran extends BangunDatar implements IResize {
    private double r;

    public Lingkaran() {
        super();
        this.r = 0;
    }

    public Lingkaran(double r) {
        super("Hijau");
        this.r = r;
    }

    // Implementasi method abstract dari BangunDatar
    @Override
    public double getLuas() {
        return Math.PI * r * r;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * r;
    }

    public double getJari() {
        return r;
    }

    public void setJari(double r) {
        this.r = r;
    }

    /*
     * Bagian 2 – Interface (IResize)
     * Implementasi method zoomIn() dan zoomOut()
     */
    @Override
    public void zoomIn() {
        this.r *= 1.1;
    }

    @Override
    public void zoomOut() {
        this.r *= 0.9;
    }
}