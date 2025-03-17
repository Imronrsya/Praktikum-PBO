/* Nama File    : BangunDatar.java
 * Deskripsi    : Kelas BangunDatar sebagai superclass untuk bangun datar.
 * Pembuat      : Mohammad Imron Rosyadi - 24060123140204
 * Tanggal      : 14 Februari 2025
 */

public class BangunDatar {
    private int jmlsisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;
    
    //protected int jmlsisi;
    //protected String warna;
    //protected String border;


    public BangunDatar () {
        counterBangunDatar++;
    }

    public BangunDatar (int jmlsisi, String warna, String border) {
        this.jmlsisi = jmlsisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlsisi() {
        return jmlsisi;
    }

    public void setJmlsisi(int jmlsisi) {
        this.jmlsisi = jmlsisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    private static void printSeparator() {
        System.out.println("====================================================");
    }

    public void printInfo() {
        printSeparator();
        System.out.println("                  INFORMASI BANGUN DATAR           ");
        printSeparator();
        System.out.println("Jumlah Sisi : " + jmlsisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
        printSeparator();
        System.out.println();
    }

    public static void printCounterBangunDatar() {
        printSeparator();
        System.out.println("Jumlah objek bangun datar yang telah dibuat: " + counterBangunDatar);
        printSeparator();
        System.out.println();
    }
}


/*Pertanyaan : Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
Mengapa?

Jawaban : Konstruktor berparameter pada kelas Persegi tidak dapat direalisasikan persis seperti contoh kedua karena 
ada perbedaan dengan struktur yang sudah diimplementasikan. Dalam cuplikan kode, atribut warna, border, dan jmlSisi 
sebenarnya berada di kelas BangunDatar (superclass), sehingga pengaturannya dilakukan melalui metode 
setter (setWarna(warna), setBorder(border), setJmlSisi(4)) alih-alih langsung menggunakan this.warna, this.border, atau this.jmlSisi. 
Hal ini bertujuan untuk menjaga konsistensi dan memungkinkan adanya validasi atau aturan khusus di dalam metode setter. 
Oleh karena itu, bentuk konstruktor yang tepat tetap mempertahankan pemanggilan metode setter yang telah disediakan, bukan 
dengan langsung mengakses atribut yang dimiliki kelas induk.
*/



/*Pertanyaan : Modifikasilah atribut class BangunDatar dengan access modifier protected. Setelah modifikasi
tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
Mengapa?

Jawaban : Setelah mengubah atribut di kelas BangunDatar dari private menjadi protected, maka atribut-atribut 
tersebut dapat diakses secara langsung oleh kelas turunan (subclass) seperti kelas Persegi. Dengan demikian, konstruktor 
berparameter pada kelas Persegi yang mencoba menginisialisasi atribut-atribut tersebut secara langsung (misalnya, dengan 
pernyataan seperti this.jmlSisi = 4;) akan dapat direalisasikan.
*/



/*Pertanyaan : 
1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
Persegi dan Lingkaran?
2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
kelas Persegi dan Lingkaran?

Jawaban : Pada percobaan pertama, jika keyword final ditambahkan pada kelas BangunDatar, maka kelas 
tersebut menjadi final dan tidak dapat diwariskan. Artinya, kelas-kelas seperti Persegi dan Lingkaran 
tidak bisa lagi meng-extend BangunDatar karena aturan di Java yang melarang pembuatan subclass dari 
kelas yang sudah final, sehingga akan muncul error kompilasi jika dicoba. Sementara itu, pada percobaan 
kedua, setelah menghapus keyword final dari kelas BangunDatar agar kelas tersebut dapat diwariskan, penambahan 
keyword final pada method printInfo() di dalam kelas BangunDatar menyebabkan method tersebut tidak dapat 
di-override oleh subclass. Dengan demikian, meskipun Persegi dan Lingkaran dapat mewarisi BangunDatar, mereka 
tidak diperbolehkan untuk mengubah implementasi dari printInfo(), dan semua objek yang merupakan turunan 
dari BangunDatar harus menggunakan versi printInfo() yang sudah didefinisikan di dalam kelas BangunDatar.
*/
