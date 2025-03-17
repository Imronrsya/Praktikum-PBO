/* Nama File    : Persegi.java
 * Deskripsi    : Kelas Persegi yang merupakan turunan dari BangunDatar dan merepresentasikan bangun datar persegi.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super();
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Diagonal : " + getDiagonal());
    }
}