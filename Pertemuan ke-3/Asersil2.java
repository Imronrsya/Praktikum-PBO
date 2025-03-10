/*
 * File         : Asersil2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : MOHAMMAD IMRON ROSYADI
 * Tanggal      : 07 Maret 2025
 */

// Class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKililing() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// Class Asersil
public class Asersil2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0):"jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKililing();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/*Jawaban : Pada program Asersi2.java terdapat kekurangan konseptual dalam
penggunaan asersi untuk validasi input. Asersi yang diterapkan hanya akan bekerja ketika program dijalankan dengan 
opsi -enableassertions, sehingga jika opsi tersebut tidak diaktifkan, pengecekan terhadap nilai jari-jari tidak akan 
dilakukan dan program akan tetap berjalan meskipun nilai jari-jari adalah nol. Hal ini menyebabkan objek Lingkaran 
diinstansiasi dengan nilai yang tidak valid dan perhitungan keliling lingkaran menjadi tidak bermakna. Dengan demikian, asersi 
sebaiknya digunakan untuk mendeteksi kesalahan pemrograman yang tidak seharusnya terjadi dalam kondisi normal, bukan sebagai 
mekanisme validasi input pada lingkungan produksi. Untuk memastikan validitas data, pendekatan yang lebih tepat adalah dengan 
menggunakan exception handling, seperti melempar IllegalArgumentException ketika nilai jari-jari tidak memenuhi syarat, sehingga 
program dapat memberikan umpan balik yang lebih jelas dan mencegah eksekusi lebih lanjut yang tidak diinginkan. */