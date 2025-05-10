/**  
 * Nama File    : Anjing.java
 * Deskripsi    : Implrmentasi Anjing sebagai Anabul
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}