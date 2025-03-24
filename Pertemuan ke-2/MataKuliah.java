/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 27 Februari 2025
 */

public class MataKuliah {
    /**************ATRIBUT**************/
    private String idMatkul;
    private String namaMatkul;
    private double sks;

    /**************METHOD**************/
    //konstruktor tanpa parameter
    public MataKuliah() {
        idMatkul = "";
        namaMatkul = "";
        sks = 0;
    }

    //konstruktor dengan parameter
    public MataKuliah(String idMatkul, String namaMatkul, double sks) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    //selektor untuk mengembalikan idMatkul
    public String getIdMatkul() {
        return idMatkul;
    }

    //selektor untuk mengembalikan namaMatkul
    public String getNamaMatkul() {
        return namaMatkul;
    }

    //selektor untuk mengembalikan sks
    public double getSks() {
        return sks;
    }

    //mutator untuk mengembalikan idMatkul
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    //mutator untuk mengembalikan namaMatkul
    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    //mutator untuk mengembalikan sks
    public void setSks(double sks) {
        this.sks = sks;
    }
}
