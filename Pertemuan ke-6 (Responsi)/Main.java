/*
 * Nama File    : Main.java
 * Deskripsi    : Kelas utama untuk mendemonstrasikan pembuatan dan penggunaan objek Fakultas, Mahasiswa, Dosen, dan Tendik.
 * Nama - NIM   : MOHAMMAD IMRON ROSYADI - 24060123140204
 * Tanggal      : 28 Maret 2025 
 */

public class Main {
    public static void main(String[] args) {
        Fakultas FSM = new Fakultas("FSM", 8000000, 9000000);
        Fakultas FEB = new Fakultas("FEB", 8500000, 9500000);

        System.out.println("============= Informasi Fakultas =============");
        FSM.printInfo();
        System.out.println();
        FEB.printInfo();
        System.out.println();

        Mahasiswa mhs1 = new Mahasiswa("Mohammad Imron", "imron@mail.com", "24060123140204", 4, FSM);
        Mahasiswa mhs2 = new Mahasiswa("Muhamad Sahal", "sahal@mail.com", "24060123130088", 4, FEB);

        Dosen dosen1 = new Dosen("Prof. Dr. Andi Wijaya, M.Sc.", "andi@mail.com", "197512041993021001", 10, FSM);
        Dosen dosen2 = new Dosen("Prof. Dr. Siti Rahayu, S.E., M.Ec.", "siti@mail.com", "19800815200011002", 10, FEB);

        Tendik tendik1 = new Tendik("Pak Budi", "budi@mail.com", "19900101010101", 5);
        Tendik tendik2 = new Tendik("Pak Beni", "beni@mail.com", "19910515123456", 5);


        System.out.println("============ Data Civitas Akademika ============");
        mhs1.printInfo();
        mhs2.printInfo();
        dosen1.printInfo();
        dosen2.printInfo();
        tendik1.printInfo();
        tendik2.printInfo();

        System.out.println("=============== Rekap Data ===============");
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.getCounterMahasiswa());
        System.out.println("Jumlah Dosen     : " + Dosen.getCounterDosen());
        System.out.println("Jumlah Tendik    : " + Tendik.getCounterTendik());
    }
}