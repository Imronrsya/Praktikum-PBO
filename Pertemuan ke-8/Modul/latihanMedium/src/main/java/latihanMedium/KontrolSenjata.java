/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author ASUS
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    // Constructor
    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    
    // Methods
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public int isiPeluru(int jumlahPeluru) {
        senjata.setPeluru(jumlahPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
        return jumlahPeluru;
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }
        
        int tembakan = 0;
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
                tembakan++;
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
                System.out.println("Gagal tembak, Peluru Habis");
                break;
            }
        }
        
        if (tembakan > 0 && !isAdaPeluru()) {
            System.out.println(">> Peluru sisa: 0");
        }
    }
    
    public String merusak() {
        return "DOR";
    }
    
    public void pasangBayonet() {
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
}