/* Nama File    : DosenTetap.java
 * Deskripsi    : Kelas DosenTetap yang mewarisi kelas Dosen dan mengimplementasikan perhitungan BUP dan tunjangan.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */


import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String nidn;
    private final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir,
                      LocalDate tmt, double gajiPokok,
                      String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
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
        return 0.02 * masaKerjaTahun * this.gajiPokok;
    }

    @Override
    public void printInfo(LocalDate currentDate) {
        String separator = "====================================================";

        System.out.println(separator);
        System.out.println("                INFORMASI DOSEN TETAP               ");
        System.out.println(separator);

        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);

        int[] mk = hitungMasaKerja(currentDate);
        System.out.println("Masa Kerja      : " + mk[0] + " tahun " + mk[1] + " bulan");

        LocalDate bupDate = hitungBUP();
        System.out.println("BUP             : " + formatTanggal(bupDate));

        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));

        double tunjangan = hitungTunjangan(currentDate);
        System.out.println("Tunjangan       : 2% x " + mk[0] + " x "
                           + formatRupiah(gajiPokok)
                           + " = " + formatRupiah(tunjangan));

        System.out.println(separator);
        System.out.println();
    }
}
