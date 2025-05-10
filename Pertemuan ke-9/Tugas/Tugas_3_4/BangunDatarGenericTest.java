/**  
 * Nama File    : BangunDatarGenericTest.java 
 * Deskripsi    : Main class untuk generic bangun datar
 * Pembuat      : MOHAMMAD IMRON ROSYADI (24060123140204)  
 * Tanggal      : Sabtu, 10 Mei 2025  
 */  

 public class BangunDatarGenericTest {
    public static void main(String[] args) {
        //LINGKARAN
        System.out.println("========== LINGKARAN ==========");
        Lingkaran l = new Lingkaran(3);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<>();
        bdgLingkaran.set(l);
        System.out.println("Luas: " + bdgLingkaran.hitungLuas());
        System.out.println("Keliling: " + bdgLingkaran.hitungKeliling());
        System.out.println("Tipe generic: " + bdgLingkaran.get().getClass().getSimpleName());
        System.out.println();

        //PERSEGI
        System.out.println("========== PERSEGI ==========");
        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
        bdgPersegi.set(p);
        System.out.println("Luas: " + bdgPersegi.hitungLuas());
        System.out.println("Keliling: " + bdgPersegi.hitungKeliling());
        System.out.println("Tipe generic: " + bdgPersegi.get().getClass().getSimpleName());
        System.out.println();

        //PERSEGI PANJANG
        System.out.println("========== PERSEGI PANJANG ==========");
        PersegiPanjang pp = new PersegiPanjang(5, 7);
        BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGeneric<>();
        bdgPersegiPanjang.set(pp);
        System.out.println("Luas: " + bdgPersegiPanjang.hitungLuas());
        System.out.println("Keliling: " + bdgPersegiPanjang.hitungKeliling());
        System.out.println("Tipe generic: " + bdgPersegiPanjang.get().getClass().getSimpleName());
        System.out.println();

        //SEGITIGA
        System.out.println("========== SEGITIGA ==========");
        Segitiga s = new Segitiga(5, 4, 5, 6);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
        bdgSegitiga.set(s);
        System.out.println("Luas: " + bdgSegitiga.hitungLuas());
        System.out.println("Keliling: " + bdgSegitiga.hitungKeliling());
        System.out.println("Tipe generic: " + bdgSegitiga.get().getClass().getSimpleName());
    }
}