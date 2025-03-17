/* Nama File    : Main.java
 * Deskripsi    : Kelas Main untuk menguji implementasi BangunDatar, Persegi, dan Lingkaran.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */

public class Main {
    public static void main(String[] args) {
        
        Persegi persegi = new Persegi(5, "Biru", "Putih");
        
        System.out.println("\nInformasi Persegi:");
        persegi.printInfo();
        System.out.println("Sisi: " + persegi.getSisi());
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());
        
        Lingkaran lingkaran = new Lingkaran(10, "Hijau", "Kuning");
        
        System.out.println("\nInformasi Lingkaran:");
        lingkaran.printInfo();
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());

        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();
    }
}
