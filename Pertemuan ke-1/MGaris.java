/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 19 Februari 2025
 */

 public class MGaris {
    public static void main(String[] args) {
        // Membuat objek garis dengan konstruktor tanpa parameter
        Garis G1 = new Garis();
        System.out.println("Garis G1 dibuat dengan titik awal " + G1.getTitikAwal().getAbsis() + ", " + G1.getTitikAwal().getOrdinat() + " dan titik akhir " + G1.getTitikAkhir().getAbsis() + ", " + G1.getTitikAkhir().getOrdinat());

        // Membuat objek garis dengan konstruktor berparameter
        Titik t1 = new Titik(2, 3);
        Titik t2 = new Titik(6, 7);
        Garis G2 = new Garis(t1, t2);
        System.out.println("Garis G2 dibuat dari titik awal " + t1.getAbsis() + ", " + t1.getOrdinat() + " ke titik akhir " + t2.getAbsis() + ", " + t2.getOrdinat());

        // Menampilkan panjang garis G2
        System.out.println("Panjang G2: " + G2.getPanjang());
        
        // Menampilkan gradien garis G2
        System.out.println("Gradien G2: " + G2.getGradien());
        
        // Menampilkan titik tengah garis G2
        Titik tengah = G2.getTitikTengah();
        System.out.println("Titik tengah G2: (" + tengah.getAbsis() + ", " + tengah.getOrdinat() + ")");
        
        // Mengecek apakah G1 dan G2 sejajar
        System.out.println("Apakah G1 sejajar dengan G2? " + G1.isSejajar(G2));
        
        // Mengecek apakah G1 dan G2 tegak lurus
        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));
        
        // Menampilkan titik awal dan titik akhir garis G2
        G2.printGaris();
        
        // Menampilkan persamaan garis G2
        System.out.println("Persamaan garis G2: " + G2.getPersamaanGaris());

        // Menampilkan jumlah garis yang telah dibuat
        System.out.println("Jumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}