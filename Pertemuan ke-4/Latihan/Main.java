/* Nama File    : Main.java
 * Deskripsi    : Kelas utama untuk menguji implementasi inheritance dari kelas Pegawai, DosenTetap, DosenTamu, dan Tendik.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2025, 3, 10);

        DosenTetap dt = new DosenTetap(
            "9545647548",
            "Andi",
            LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1),
            5_000_000,
            "Fakultas Sains dan Matematika", 
            "78647324"
        );
        dt.printInfo(currentDate);
        System.out.println();

        DosenTamu dtu = new DosenTamu(
            "1234567890",
            "Budi",
            LocalDate.of(1980, 6, 15),
            LocalDate.of(2020, 1, 1),
            4_000_000,
            "Fakultas Ilmu Komputer", 
            "999888777",
            LocalDate.of(2026, 12, 31)
        );
        dtu.printInfo(currentDate);
        System.out.println();

        Tendik td = new Tendik(
            "1122334455",
            "Cici",
            LocalDate.of(1985, 3, 10),
            LocalDate.of(2010, 2, 1),
            3_000_000,
            "Kemahasiswaan"
        );
        td.printInfo(currentDate);
    }
}
