/*
 * Nama File    : BangunDatar.java
 * Deskripsi    : Abstract class BangunDatar sebagai kerangka dasar bagi semua bangun datar.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 24 Maret 2025
 */

 public abstract class BangunDatar {
    protected String warna;

    public BangunDatar() {
        this.warna = "Tidak Berwarna";
    }

    public BangunDatar(String warna) {
        this.warna = warna;
    }

    // STEP 2: Method abstract
    public abstract double getLuas();
    public abstract double getKeliling();

    // STEP 4: Method untuk membandingkan luas dan keliling
    public boolean isEqualLuas(BangunDatar bd) {
        return this.getLuas() == bd.getLuas();
    }
    public boolean isEqualKeliling(BangunDatar bd) {
        return this.getKeliling() == bd.getKeliling();
    }

    public void printWarna() {
        System.out.println("Warna bangun datar: " + warna);
    }

    /*
     * Pertanyaan Bagian 4–5 (Abstract Class):
     * 1. Apakah method isEqualLuas() dan isEqualKeliling() dapat digunakan
     *    untuk membandingkan objek bangun datar yang berbeda?
     *    Jawaban:
     *      Ya, karena setiap subclass (misalnya Persegi, Lingkaran) sudah mengoverride
     *      getLuas() dan getKeliling(). Sehingga, isEqualLuas() dan isEqualKeliling()
     *      membandingkan hasil perhitungan dari subclass masing-masing.
     *
     * 2. Jika BangunDatar tidak dijadikan abstract class, dapatkah Anda membuat
     *    method isEqualLuas() dan isEqualKeliling() pada class BangunDatar? Mengapa?
     *    Jawaban:
     *      - Secara teknis bisa, tetapi kita harus memberi implementasi default
     *        untuk getLuas() dan getKeliling() di BangunDatar. 
     *      - Hal ini tidak ideal karena BangunDatar terlalu generik dan tidak punya
     *        bentuk konkrit. Lebih tepat dijadikan abstract.
     *
     * 3. Apa kelebihan saat BangunDatar dijadikan sebagai abstract class
     *    daripada non-abstract class?
     *    Jawaban:
     *      - Mencegah pembuatan objek BangunDatar secara langsung,
     *        karena setiap bangun datar harus spesifik (Persegi, Lingkaran, dll.).
     *      - Memaksa subclass untuk mengimplementasikan method getLuas() & getKeliling().
     */
}