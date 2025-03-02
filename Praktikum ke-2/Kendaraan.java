/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 27 Februari 2025
 */

public class Kendaraan {
    /**************ATRIBUT**************/
    private String noPlat;
    private String jenis;

    /**************METHOD**************/
    //konstruktor tanpa parameter
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    //konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor untuk mengembalikan noPlat
    public String getNoPlat() {
        return noPlat;
    }

    //selektor untuk mengembalikan jenis
    public String getJenis() {
        return jenis;
    }

    //mutator untuk mengembalikan noPlat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    //mutator untuk mengembalikan jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}