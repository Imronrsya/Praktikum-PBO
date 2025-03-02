/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 27 Februari 2025
 */

public class Dosen {
    /**************ATRIBUT**************/
    private String nip;
    private String nama;
    private String prodi;

    /**************METHOD**************/
    //konstruktor tanpa parameter
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    //konstruktor dengan parameter nip
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selektor untuk mengembalikan nip
    public String getNip() {
        return nip;
    }

    //selektor untukmengembalikan nama
    public String getNama() {
        return nama;
    }

    //selektor untuk mengembalikan prodi
    public String getProdi() {
        return prodi;
    }

    //mutator untuk mengembalikan nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    //mutator untuk mengmablikan nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mutotor untuk mengembalikan prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

} //end class Dosen
