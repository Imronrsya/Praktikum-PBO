/*
 * Nama File    : Dosen.java
 * Deskripsi    : Class Dosen yang mewarisi Karyawan, menghitung gaji dosen berdasarkan gaji pokok fakultas dan tambahan 1% per tahun masa kerja, serta menampilkan informasi lengkap.
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 28 Maret 2025 
 */

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counterDosen = 0;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    public static int getCounterDosen() {
        return counterDosen;
    }

    @Override
    public double hitungGaji() {
        double gajiPokok = fakultas.getGajiPokok();
        return gajiPokok + (masaKerja * 0.01 * gajiPokok);
    }

    @Override
    public void printInfo() {
        String formattedGaji = String.format("Rp%,.2f", hitungGaji())
                .replace(",", "X").replace(".", ",").replace("X", ".");
        System.out.println("============ Informasi Dosen ============");
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
        System.out.println("NIP        : " + nip);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        System.out.println("Fakultas   : " + fakultas.getNama());
        System.out.println("Gaji       : " + formattedGaji);
        System.out.println("-----------------------------------------------");
    }
}
