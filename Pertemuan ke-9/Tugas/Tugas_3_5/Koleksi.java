/**  
 * Nama File    : Koleksi.java 
 * Deskripsi    : Kelas konstruksi generic untuk Koleksi
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */


package Tugas_3_5;

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        this.wadah = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public ArrayList<T> getWadah() {
        return this.wadah;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        }
        return null;
    }

    public boolean setIsi(int index, T elemen) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, elemen);
            return true;
        }
        return false;
    }

    public int getSize() {
        return this.wadah.size();
    }

    public void setSize(int size) {
        this.nbelm = Math.min(size, wadah.size());

        while (wadah.size() > size) {
            wadah.remove(wadah.size() - 1);
        }
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    public T delete(int index) {
        if (index >= 0 && index < nbelm) {
            T removed = wadah.remove(index);
            nbelm--;
            return removed;
        }
        return null;
    }

    public void showAll() {
        System.out.println("Isi Koleksi (" + nbelm + " elemen):");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Elemen ke-" + (i + 1) + " [" + i + "]: " + wadah.get(i));
        }
    }
}