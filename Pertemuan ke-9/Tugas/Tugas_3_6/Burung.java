/**  
 * Nama File    : Burung.java
 * Deskripsi    : Implrmentasi Burung sebagai Anabul
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}