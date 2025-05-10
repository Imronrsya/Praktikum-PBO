/**  
 * Nama File    : Anabul.java
 * Deskripsi    : Kelas abstrak untuk Anabul
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

public abstract class Anabul {
    protected String nama;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract void gerak();
    public abstract void bersuara();
}