/**  
 * Nama File    : Lingkaran.java 
 * Deskripsi    : Implrmentasi Lingkaran sebagai BangunDatar
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }

    public double hitungLuas(){
        return jejari * jejari * 3.14;
    }
}