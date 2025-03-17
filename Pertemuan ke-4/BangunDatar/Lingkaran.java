/* Nama File    : Lingkaran.java
 * Deskripsi    : Kelas Lingkaran yang merupakan turunan dari BangunDatar dan merepresentasikan bangun datar lingkaran.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */

public class Lingkaran extends BangunDatar{
    private double r;

    public Lingkaran() {
        super();        
    }
    
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        r = diameter / 2;
    }

    public double getJari() {
        return r;
    }

    public void setJari(double r) {
        this.r = r;
    }

    public double getLuas() {
        return Math.PI * r * r;
    }

    public double getKeliling() {
        return 2 * Math.PI * r;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari : " + r);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}