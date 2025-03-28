/*
 * Nama File    : CivitasAkademika.java
 * Deskripsi    : Class abstrak sebagai induk bagi semua civitas akademika yang memiliki atribut nama dan email.
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 28 Maret 2025 
 */

public abstract class CivitasAkademika {
    protected String nama;
    protected String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public abstract void printInfo();
}