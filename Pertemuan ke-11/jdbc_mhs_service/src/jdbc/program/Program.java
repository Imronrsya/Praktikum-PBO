/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author ASUS
 */


import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listMhs = new ArrayList<>();

        if (service.getById(1) == null) {
            service.add(new Mahasiswa(1, "Nina"));
        }
        if (service.getById(2) == null) {
            service.add(new Mahasiswa(2, "Rudi"));
        }
        if (service.getById(3) == null) {
            service.add(new Mahasiswa(3, "Beni"));
        }

        System.out.println("");

        System.out.println("===insert===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd.toString());
        displayAll();

        System.out.println("\n===update===");
        Mahasiswa mhsUpdate = service.getById(5);
        if (mhsUpdate != null) {
            System.out.println("Akan diupdate data lama: " + mhsUpdate.toString());
            mhsUpdate.setNama("Dinaya");
            System.out.println("dengan data baru: " + mhsUpdate.toString());
            service.update(mhsUpdate);
        } else {
            System.out.println("Data dengan ID 5 tidak ditemukan untuk diupdate.");
        }
        displayAll();

        System.out.println("\n===delete===");
        Mahasiswa mhsToDelete = service.getById(5);
        if (mhsToDelete != null) {
             System.out.println("akan di delete: " + mhsToDelete.toString());
        } else {
            System.out.println("Data dengan ID 5 tidak ditemukan untuk dihapus (mungkin sudah terhapus).");
        }
        service.delete(5);
        displayAll();
    }

    public static void displayAll() {
        System.out.println("===displayAll===");
        List<Mahasiswa> listSemuaMhs = service.getAll();
        if (listSemuaMhs.isEmpty()) {
            // Sesuai PDF, tidak ada pesan jika list kosong setelah operasi delete terakhir
        } else {
            for (Mahasiswa mhs : listSemuaMhs) {
                System.out.println(mhs.toString());
            }
        }
    }
}