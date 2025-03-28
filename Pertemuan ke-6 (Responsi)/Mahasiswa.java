/*
 * Nama File    : Mahasiswa.java
 * Deskripsi    : Class Mahasiswa yang menyimpan data mahasiswa, menghitung biaya UKT berdasarkan potongan 5% per semester, dan menampilkan informasi.
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 28 Maret 2025 
 */

public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counterMahasiswa = 0;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMahasiswa++;
    }

    public double hitungBiayaUKT() {
        double discount = 0.05 * semester;
        if (discount > 1.0) {
            discount = 1.0;
        }
        return fakultas.getTarifUKT() * (1 - discount);
    }

    public static int getCounterMahasiswa() {
        return counterMahasiswa;
    }

    @Override
    public void printInfo() {
        String formattedBiaya = String.format("Rp%,.2f", hitungBiayaUKT())
                .replace(",", "X").replace(".", ",").replace("X", ".");
        System.out.println("============ Informasi Mahasiswa ============");
        System.out.println("Nama      : " + nama);
        System.out.println("Email     : " + email);
        System.out.println("NIM       : " + nim);
        System.out.println("Semester  : " + semester);
        System.out.println("Fakultas  : " + fakultas.getNama());
        System.out.println("Biaya UKT : " + formattedBiaya);
        System.out.println("-----------------------------------------------");
    }
}