/**  
 * Nama File    : MainKoleksi.java
 * Deskripsi    : Main class untuk Koleksi Anabul
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */

public class MainKoleksiAnabul<T extends Anabul> {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksi = new KoleksiAnabul<>();

        String[] nama_kucing = {"Luna", "Simba", "Leo", "Mimi"};
        String[] nama_anjing = {"Bruno", "Buddy", "Oscar", "Duke"};
        String[] nama_burung = {"Ciki", "Rio", "Tiki", "Nino"};

        for (int i = 0; i < 10; i++) {
            switch (i % 3) {
                case 0:
                    koleksi.add(new Kucing(nama_kucing[i % nama_kucing.length]));
                    break;
                case 1:
                    koleksi.add(new Anjing(nama_anjing[i % nama_anjing.length]));
                    break;
                case 2:
                    koleksi.add(new Burung(nama_burung[i % nama_burung.length]));
                    break;
            }
        }

        System.out.println("------------ DAFTAR ANABUL ------------");
        koleksi.showAll();
        System.out.println();

        System.out.println("--------------- DELETE ----------------");
        Anabul dihapus = koleksi.delete();
        if (dihapus != null) {
            System.out.println("Anabul yang dihapus: " + dihapus.getClass().getSimpleName());
            System.out.println("Nama anabul: " + dihapus.getNama());
            System.out.println("Jumlah anabul sekarang: " + koleksi.getSize());
        }
        System.out.println("---------------------------------------\n");

        System.out.println("----- DAFTAR ANABUL SETELAH DELETE ----");
        koleksi.showAll();
    }
}
