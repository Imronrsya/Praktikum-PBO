/**  
 * Nama File    : BangunDatarGeneric.java 
 * Deskripsi    : Kelas konstruksi generic untuk BangunDatar
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */  

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
}
