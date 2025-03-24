/*
 * Nama File    : MainBangunDatar.java
 * Deskripsi    : Kelas Main untuk menguji BangunDatar (abstract), Persegi, Lingkaran,
 *                serta interface IResize (Bagian 1 & 2).
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 24 Maret 2025
 */

 public class MainBangunDatar {
    public static void main(String[] args) {
        
        // =============== STEP 3 (BAGIAN 1) ===============
        /*
         * BangunDatar bd1 = new BangunDatar();
         * KODE DI ATAS AKAN ERROR karena BangunDatar adalah abstract class.
         *
         * Penjelasan:
         * - Abstract class berfungsi sebagai kerangka (blueprint)
         *   dan memaksa subclass untuk mengimplementasikan method abstract.
         * - Oleh karena itu, kita hanya bisa membuat objek dari kelas turunan
         *   seperti Persegi atau Lingkaran yang sudah meng-override
         *   method abstract getLuas() dan getKeliling().
         */

        // Membuat objek Persegi dan Lingkaran (Step 3)
        BangunDatar persegi1 = new Persegi(10);
        Persegi persegi2 = new Persegi(5);
        BangunDatar lingkaran1 = new Lingkaran(7);
        Lingkaran lingkaran2 = new Lingkaran(14);

        // Menampilkan info (Step 3)
        System.out.println("=== Persegi 1 (BangunDatar reference) ===");
        System.out.println("Luas      : " + persegi1.getLuas());
        System.out.println("Keliling  : " + persegi1.getKeliling());
        
        System.out.println("\n=== Persegi 2 (Persegi reference) ===");
        System.out.println("Luas      : " + persegi2.getLuas());
        System.out.println("Keliling  : " + persegi2.getKeliling());
        System.out.println("Diagonal  : " + persegi2.getDiagonal());

        System.out.println("\n=== Lingkaran 1 (BangunDatar reference) ===");
        System.out.println("Luas      : " + lingkaran1.getLuas());
        System.out.println("Keliling  : " + lingkaran1.getKeliling());

        System.out.println("\n=== Lingkaran 2 (Lingkaran reference) ===");
        System.out.println("Luas      : " + lingkaran2.getLuas());
        System.out.println("Keliling  : " + lingkaran2.getKeliling());

        // ============ END OF STEP 3 (BAGIAN 1) ============


        // ============ STEP 4–5 (BAGIAN 1) ============
        System.out.println("\n=== STEP 5: Perbandingan Luas & Keliling ===");
        System.out.println("Apakah persegi1 dan persegi2 memiliki luas sama? "
            + persegi1.isEqualLuas(persegi2));
        System.out.println("Apakah persegi1 dan lingkaran1 memiliki luas sama? "
            + persegi1.isEqualLuas(lingkaran1));
        System.out.println("Apakah lingkaran1 dan lingkaran2 memiliki keliling sama? "
            + lingkaran1.isEqualKeliling(lingkaran2));
        // =========== END OF STEP 4–5 (BAGIAN 1) ===========


        // ============ BAGIAN 2 – INTERFACE (BAGIAN 2) ============
        System.out.println("\n=== BAGIAN 2 – INTERFACE: Resize ===");
        System.out.println(">> Sebelum zoomIn() & zoomOut():");
        System.out.println("Persegi1 (sisi=10) => Luas: " + persegi1.getLuas());
        System.out.println("Lingkaran1 (r=7)   => Luas: " + lingkaran1.getLuas());

        // Memanggil method interface (BAGIAN 2)
        ((Persegi) persegi1).zoomIn();      // memperbesar persegi1 10%
        ((Lingkaran) lingkaran1).zoomOut(); // memperkecil lingkaran1 10%

        System.out.println("\n>> Setelah zoomIn(Persegi1) & zoomOut(Lingkaran1):");
        System.out.println("Persegi1 => Luas: " + persegi1.getLuas());
        System.out.println("Lingkaran1 => Luas: " + lingkaran1.getLuas());

        /*
         * Pertanyaan Bagian 2 – Interface:
         * 1. Lakukan hal yang sama pada class Lingkaran.
         *    Jawaban:
         *      - Sudah dilakukan di lingkaran1 & lingkaran2 (keduanya implements IResize).
         * 2. Lakukan eksperimen pemanggilan method yang telah dibuat dari interface IResize
         *    pada main method. Bagaimana hasilnya?
         *    Jawaban:
         *      - Hasilnya, sisi Persegi berubah saat zoomIn() (menjadi lebih besar 10%),
         *        jari-jari Lingkaran berubah saat zoomOut() (menjadi 90% dari nilai semula).
         *      - Dengan casting ke (Persegi) atau (Lingkaran), method zoomIn() & zoomOut()
         *        dapat dipanggil walaupun reference bertipe BangunDatar.
         * 3. Perhatikan bahwa interface tidak hanya dapat diimplementasi oleh class-class
         *    yang sejenis, berbeda dengan hubungan pewarisan class yang umumnya
         *    superclass memiliki sejumlah subclass yang sejenis.
         *    (Sudah ditunjukkan bahwa IResize bisa diterapkan ke Persegi, Lingkaran,
         *     atau bentuk lain yang ingin di-resize).
         * 4. Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas
         *    dalam interface IResize dibanding dijadikan sebagai abstract method dalam
         *    class BangunDatar?
         *    Jawaban:
         *      - Interface dapat diimplementasikan oleh berbagai kelas berbeda yang
         *        mungkin tidak satu hierarki (misal, Bangun3D, Garis, dll.).
         *      - Memisahkan perilaku "dapat di-resize" dari hierarki bangun datar
         *        memudahkan desain yang lebih fleksibel.
         */
    }
}
