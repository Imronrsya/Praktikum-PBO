/**  
 * Nama File    : MainKoleksi.java 
 * Deskripsi    : Main class untuk Koleksi
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

package Tugas_3_5;

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        char[] daftarKarakter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for (char ch : daftarKarakter) {
            koleksiKarakter.add(ch);
        }

        System.out.println("======= Koleksi Awal =======");
        koleksiKarakter.showAll();

        boolean berhasilEdit = koleksiKarakter.setIsi(4, 'Z');
        if (berhasilEdit) {
            System.out.println("\n======= Setelah Edit Elemen ke-5 Menjadi 'Z' =======");
            koleksiKarakter.showAll();
        } else {
            System.out.println("\nEdit gagal: indeks tidak valid.");
        }

        Character dihapus = koleksiKarakter.delete(2);
        if (dihapus != null) {
            System.out.println("\n======= Setelah Hapus Elemen ke-3 ('" + dihapus + "') =======");
            koleksiKarakter.showAll();
        } else {
            System.out.println("\nHapus gagal: indeks tidak valid.");
        }

        System.out.println("\nJumlah elemen dalam koleksi sekarang: " + koleksiKarakter.getSize());
    }
}