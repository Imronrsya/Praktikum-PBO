/**  
 * Nama File    : KoleksiAnabul.java 
 * Deskripsi    : Mengelola koleksi objek Anabul
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

import java.util.ArrayList;

public class KoleksiAnabul<T extends Anabul> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T data) {
        list.add(data);
    }

    public T delete() {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        return null;
    }

    public void showAll() {
        for (T a : list) {
            System.out.println("Jenis: " + a.getClass().getSimpleName());
            System.out.println("Nama : " + a.getNama());
            a.bersuara();
            a.gerak();
            System.out.println();
        }
    }

    public int getSize() {
        return list.size();
    }
}