/* Nama File    : Dosen.java
 * Deskripsi    : Kelas abstrak Dosen yang mewarisi kelas Pegawai.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */


import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // Kelas ini bisa bersifat abstract karena tidak langsung di-instansiasi.
    // DosenTetap dan DosenTamu akan menjadi turunan konkretnya.
}
