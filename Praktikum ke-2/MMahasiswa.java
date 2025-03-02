/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi main dalam class MMahasiswa
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 27 Februari 2025
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // Membuat objek Dosen
        Dosen D1 = new Dosen("123", "Andi", "Informatika");

        // Membuat objek Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");

        // Membuat objek Mahasiswa tanpa Dosen dan Kendaraan
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");

        // Mengatur Dosen Wali dan Kendaraan menggunakan setter
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);

        // Menambahkan mata kuliah ke mahasiswa
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        // Menampilkan detail mahasiswa
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan jumlah SKS
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

        // Menampilkan informasi kendaraan mahasiswa
        System.out.println("Kendaraan Mahasiswa: " + M1.getKendaraan().getNoPlat() + " - " + M1.getKendaraan().getJenis());
    }
}
