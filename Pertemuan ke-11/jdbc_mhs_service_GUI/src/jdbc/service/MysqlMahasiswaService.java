/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author ASUS
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
        if (koneksi == null) {
            System.err.println("MysqlMahasiswaService: Koneksi ke database GAGAL.");
        }
    }

    // Helper method untuk membuat objek Mahasiswa dari ResultSet
    private Mahasiswa makeMhsObjectFromResultSet(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }
    
    // Membuat objek mahasiswa (kosong)
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    // Menambahkan data mahasiswa (dengan ID dan nama)
    public void add(Mahasiswa mhs) {
        if (koneksi == null) { System.err.println("ADD (Objek): Koneksi null."); return; }
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            if (ps.executeUpdate() <= 0) {
                System.out.println("Gagal insert (Objek): " + mhs);
            }
        } catch (SQLException e) {
            System.err.println("Error add (Objek): " + e.getMessage());
        }
    }

    // Menambahkan data Mahasiswa (hanya nama, ID auto increment)
    public void add(String nama) {
        if (koneksi == null) { System.err.println("ADD (String): Koneksi null."); return; }
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, nama);
            if (ps.executeUpdate() <= 0) {
                System.out.println("Gagal insert (String): " + nama);
            }
        } catch (SQLException e) {
            System.err.println("Error add (String): " + e.getMessage());
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        if (koneksi == null) { System.err.println("UPDATE: Koneksi null."); return; }
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            if (ps.executeUpdate() > 0) {
                System.out.println("Berhasil update");
            } else {
                System.out.println("Gagal update atau data tidak ditemukan: " + mhs);
            }
        } catch (SQLException e) {
            System.err.println("Error update: " + e.getMessage());
        }
    }

    // Delete data mahasiswa
    public void delete(int id) {
        if (koneksi == null) { System.err.println("DELETE: Koneksi null."); return; }
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                System.out.println("Berhasil delete");
            } else {
                System.out.println("Gagal delete atau ID tidak ditemukan: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error delete: " + e.getMessage());
        }
    }

    // Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        if (koneksi == null) { System.err.println("GETBYID: Koneksi null."); return null; }
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    mhs = makeMhsObjectFromResultSet(rs);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error getById: " + e.getMessage());
        }
        return mhs;
    }

    // Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> mhsList = new ArrayList<>();
        if (koneksi == null) { System.err.println("GETALL: Koneksi null."); return mhsList; }
        String query = "SELECT * FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                mhsList.add(makeMhsObjectFromResultSet(rs));
            }
        } catch (SQLException e) {
            System.err.println("Error getAll: " + e.getMessage());
        }
        return mhsList;
    }

    // Mereset auto-increment ID tabel mahasiswa ke 1
    public void indexReset() {
        if (koneksi == null) { System.err.println("INDEXRESET: Koneksi null."); return; }
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try (Statement stmt = koneksi.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Indeks auto-increment tabel mahasiswa direset ke 1.");
        } catch (SQLException e) {
            System.err.println("Error saat mereset auto_increment: " + e.getMessage());
        }
    }

    // Memeriksa apakah tabel kosong
    public boolean isEmpty() {
        if (koneksi == null) { System.err.println("ISEMPTY: Koneksi null."); return true; }
        String query = "SELECT COUNT(*) AS row_count FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                return rs.getInt("row_count") == 0;
            }
        } catch (SQLException e) {
            System.err.println("Error saat mengecek isEmpty: " + e.getMessage());
        }
        return true;
    }

    // Menutup koneksi ke DB [cite: 20]
    public void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                System.out.println("Koneksi database ditutup oleh service.");
            } catch (SQLException e) {
                System.err.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
}