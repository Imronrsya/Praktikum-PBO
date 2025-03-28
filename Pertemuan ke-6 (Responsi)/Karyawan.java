/*
 * Nama File    : Karyawan.java
 * Deskripsi    : Class abstrak untuk karyawan yang mencakup atribut NIP dan masa kerja serta mendefinisikan method hitungGaji().
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 28 Maret 2025 
 */

public abstract class Karyawan extends CivitasAkademika {
    protected String nip;
    protected int masaKerja;

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();
}