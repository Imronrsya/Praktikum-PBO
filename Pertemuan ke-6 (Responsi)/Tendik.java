/*
 * Nama File    : Tendik.java
 * Deskripsi    : Class Tendik yang mewarisi Karyawan, menghitung gaji tendik dengan gaji pokok tetap dan tambahan 1% per tahun masa kerja, serta menampilkan informasi lengkap.
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 28 Maret 2025 
 */

public class Tendik extends Karyawan {
    private static int counterTendik = 0;

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counterTendik++;
    }

    public static int getCounterTendik() {
        return counterTendik;
    }

    @Override
    public double hitungGaji() {
        double gajiPokok = 4000000;
        return gajiPokok + (masaKerja * 0.01 * gajiPokok);
    }

    @Override
    public void printInfo() {
        String formattedGaji = String.format("Rp%,.2f", hitungGaji())
                .replace(",", "X").replace(".", ",").replace("X", ".");
        System.out.println("============ Informasi Tendik ============");
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
        System.out.println("NIP        : " + nip);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        System.out.println("Gaji       : " + formattedGaji);
        System.out.println("-----------------------------------------------");
    }
}