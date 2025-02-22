/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 19 Februari 2025
 */

 public class Titik {
    /**************ATRIBUT**************/
    private double absis;
    private double ordinat;
    static int counterTitik = 0;

    /**************METHOD**************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengembalikan absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengembalikan ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    //mengembalikan kuadran titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    //mengembalikan jarak pusat titik
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //mengembalikan jarak
    double getJarak(Titik T) {
        return Math.sqrt((T.absis - absis) * (T.absis - absis) + (T.ordinat - ordinat) * (T.ordinat - ordinat));
    }

    //merefleksikan titik terhadap sumbu x
    void refleksiX() {
        ordinat = -ordinat;
    }

    //merefleksikan titik terhadap sumbu y
    void refleksiY() {
        absis = -absis;
    }

    //mengembalikan titik baru yang merupakan refleksi terhadap sumbu x
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    //mengembalikan titik baru yang merupakan refleksi terhadap sumbu y
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }
} //end class Titik