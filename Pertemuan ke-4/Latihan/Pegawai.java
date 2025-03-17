/* Nama File    : Pegawai.java
 * Deskripsi    : Kelas Pegawai yang merupakan superclass untuk seluruh pegawai.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */


import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir,
                   LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int[] hitungMasaKerja(LocalDate currentDate) {
        Period p = Period.between(this.tmt, currentDate);
        return new int[] { p.getYears(), p.getMonths() };
    }

    public String formatTanggal(LocalDate date) {
        int day = date.getDayOfMonth();
        String month = date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID"));
        int year = date.getYear();
        return day + " " + month + " " + year;
    }

    public String formatRupiah(double value) {
        return String.format("Rp %,d", (long) value);
    }

    public void printInfo(LocalDate currentDate) {
        String separator = "====================================================";

        System.out.println(separator);
        System.out.println("                   INFORMASI PEGAWAI                 ");
        System.out.println(separator);

        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));

        System.out.println(separator);
        System.out.println();
    }
}
