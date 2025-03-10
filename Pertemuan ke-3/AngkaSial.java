/*
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : MOHAMMAD IMRON ROSYADI
 * Tanggal   : 07 Maret 2025
 */

 public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}

/*Jawaban : Ketika eksepsi terjadi pada pemanggilan as.cobaAngka(13), alur eksekusi program akan langsung berpindah ke blok 
catch dan melewati baris-baris berikutnya di dalam blok try. Dengan demikian, baris yang berada setelah pemanggilan as.cobaAngka(13) 
(dalam hal ini baris 12 jika isinya adalah as.cobaAngka(12)) tidak akan dieksekusi. Namun, setelah blok catch selesai 
dieksekusi, baris program yang berada di luar blok try-catch (misalnya baris 21) tetap akan dieksekusi selama tidak ada 
perintah lain yang menghentikan program (seperti System.exit(0) atau eksepsi baru yang tidak tertangani). */