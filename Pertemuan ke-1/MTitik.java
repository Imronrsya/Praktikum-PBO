/* Nama File    : MTitik.java
 * Deskripsi    : Program utama untuk menguji class Titik
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 19 Februari 2025
 */

 public class MTitik {
    public static void main(String[] args) {
        // Membuat objek Titik t1 (0,0)
        Titik t1 = new Titik();  
        t1.setAbsis(3);  // Mengubah nilai absis t1 menjadi 3
        t1.setOrdinat(4);  // Mengubah nilai ordinat t1 menjadi 4
        t1.printTitik();  // Mencetak koordinat t1

        // Menggeser titik t1 sejauh (3, 4)
        t1.geser(3, 4);
        t1.printTitik();  

        // Membuat salinan titik t1 dengan objek baru
        Titik t2 = new Titik(t1.getAbsis(), t1.getOrdinat());
        t2.printTitik();  

        // Mengubah t1, t2 tetap tidak berubah
        t1.setAbsis(10);
        t1.setOrdinat(10);
        t1.printTitik();  // t1 berubah
        t2.printTitik();  // t2 tetap sama

        // Membuat titik baru t3 (0,0) dan t4 (3,4)
        Titik t3 = new Titik();  
        Titik t4 = new Titik(3, 4);  

        t3.printTitik();
        t4.printTitik();

        // Menampilkan kuadran dari t4
        System.out.println("t4 berada di kuadran: " + t4.getKuadran());

        // Menampilkan jarak t4 ke pusat koordinat
        System.out.println("Jarak t4 ke pusat: " + t4.getJarakPusat());

        // Menampilkan jarak antara t4 dan t3
        System.out.println("Jarak antara t4 dan t3: " + t4.getJarak(t3));

        // Merefleksikan t4 terhadap sumbu X
        Titik refleksiX = t4.getRefleksiX();
        System.out.print("Refleksi t4 terhadap sumbu X: ");
        refleksiX.printTitik();

        // Merefleksikan t4 terhadap sumbu Y
        Titik refleksiY = t4.getRefleksiY();
        System.out.print("Refleksi t4 terhadap sumbu Y: ");
        refleksiY.printTitik();

        // Menampilkan jumlah titik yang telah dibuat
        System.out.println("Jumlah titik: " + Titik.getCounterTitik());
    }
}