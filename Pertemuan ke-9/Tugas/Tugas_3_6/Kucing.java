/**  
 * Nama File    : Kucing.java
 * Deskripsi    : Implrmentasi Kucing sebagai Anabul
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}