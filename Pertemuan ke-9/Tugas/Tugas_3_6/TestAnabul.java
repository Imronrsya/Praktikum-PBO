/**  
 * Nama File    : TestAnabul.java
 * Deskripsi    : Main class untuk Anabul
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

public class TestAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kitty");
        Anabul anjing = new Anjing("Buddy");
        Anabul burung = new Burung("Tweety");
        
        Anabul[] hewanPeliharaan = {kucing, anjing, burung};
        
        for (Anabul hewan : hewanPeliharaan) {
            System.out.println("\nHewan: " + hewan.getNama());
            hewan.gerak();
            hewan.bersuara();
        }
    }
}