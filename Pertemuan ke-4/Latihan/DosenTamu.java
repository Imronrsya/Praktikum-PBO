/* Nama File    : DosenTamu.java
 * Deskripsi    : Kelas DosenTamu yang mewarisi kelas Dosen dan mengimplementasikan perhitungan sisa kontrak dan tunjangan.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */


import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir,
                     LocalDate tmt, double gajiPokok, String fakultas,
                     String nidk, LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }


    public double hitungTunjangan() {
        return 0.025 * this.gajiPokok;
    }


    public long hitungSisaKontrak(LocalDate currentDate) {
        Period p = Period.between(currentDate, this.tanggalAkhirKontrak);
        return p.toTotalMonths();
    }

    @Override
    public void printInfo(LocalDate currentDate) {
        String separator = "====================================================";

        System.out.println(separator);
        System.out.println("                INFORMASI DOSEN TAMU                ");
        System.out.println(separator);

        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);

        int[] mk = hitungMasaKerja(currentDate);
        System.out.println("Masa Kerja      : " + mk[0] + " tahun " + mk[1] + " bulan");

        long sisaKontrak = hitungSisaKontrak(currentDate);
        System.out.println("Sisa Kontrak    : " + sisaKontrak + " bulan");

        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));

        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan       : 2.5% x " 
                           + formatRupiah(gajiPokok) 
                           + " = " + formatRupiah(tunjangan));

        System.out.println(separator);
        System.out.println();
    }
}
