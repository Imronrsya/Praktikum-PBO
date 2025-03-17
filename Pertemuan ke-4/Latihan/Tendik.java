/* Nama File    : Tendik.java
 * Deskripsi    : Kelas Tendik yang mewarisi kelas Pegawai dan mengimplementasikan perhitungan BUP serta tunjangan.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */


import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    private String bidang;
    private final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public LocalDate hitungBUP() {
        LocalDate temp = tanggalLahir.plusYears(BUP);
        temp = temp.plusMonths(1);
        temp = temp.withDayOfMonth(1);
        return temp;
    }

    public double hitungTunjangan(LocalDate currentDate) {
        Period p = Period.between(this.tmt, currentDate);
        int masaKerjaTahun = p.getYears();
        return 0.01 * masaKerjaTahun * this.gajiPokok;
    }

    @Override
    public void printInfo(LocalDate currentDate) {
        String separator = "====================================================";

        System.out.println(separator);
        System.out.println("           INFORMASI TENAGA KEPENDIDIKAN            ");
        System.out.println(separator);

        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);

        int[] mk = hitungMasaKerja(currentDate);
        System.out.println("Masa Kerja      : " + mk[0] + " tahun " + mk[1] + " bulan");

        LocalDate bupDate = hitungBUP();
        System.out.println("BUP             : " + formatTanggal(bupDate));

        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));

        double tunjangan = hitungTunjangan(currentDate);
        System.out.println("Tunjangan       : 1% x " + mk[0] + " x "
                           + formatRupiah(gajiPokok)
                           + " = " + formatRupiah(tunjangan));

        System.out.println(separator);
        System.out.println();
    }
}
