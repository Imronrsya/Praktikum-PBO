/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 27 Februari 2025
 */

public class Mahasiswa {
    /************** ATRIBUT **************/
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul; // Array statik berukuran 50
    private int jumlahMatKul; // Menyimpan jumlah mata kuliah yang diambil
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /************** METHOD **************/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new MataKuliah[50]; // Inisialisasi array statik
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Konstruktor dengan parameter nim, nama, dan prodi
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50]; // Inisialisasi array statik
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public String getNama() { 
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method untuk menambahkan mata kuliah ke dalam listMatKul
    public void addMatKul(MataKuliah newMatKul) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = newMatKul;
            jumlahMatKul++;
        } else {
            System.out.println("Maksimum mata kuliah telah tercapai!");
        }
    }

    // Method untuk mendapatkan total jumlah SKS yang diambil mahasiswa
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }

    // Method untuk mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    // Method untuk menampilkan informasi mahasiswa (nim, nama, prodi)
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum memiliki"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getNoPlat() + " (" + kendaraan.getJenis() + ")" : "Tidak ada"));
        System.out.println("Mata Kuliah yang diambil:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNamaMatkul() + " (" + listMatKul[i].getSks() + " SKS)");
        }
    }
}