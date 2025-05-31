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

    // Membuat objek mahasiswa (kosong)
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        if (koneksi == null) {
            System.err.println("ADD: Koneksi null, gagal menambahkan data.");
            return;
        }
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            int affectedRows = ps.executeUpdate();
            if (affectedRows <= 0) {
                System.out.println("Gagal melakukan insert untuk: " + mhs);
            }
        } catch (SQLException e) {
            System.err.println("Error saat menambahkan mahasiswa: " + e.getMessage());
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        if (koneksi == null) {
            System.err.println("UPDATE: Koneksi null, gagal mengupdate data.");
            return;
        }
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Berhasil update");
            } else {
                System.out.println("Gagal melakukan update atau data tidak ditemukan untuk: " + mhs);
            }
        } catch (SQLException e) {
            System.err.println("Error saat mengupdate mahasiswa: " + e.getMessage());
        }
    }

    // Delete data mahasiswa
    public void delete(int id) {
        if (koneksi == null) {
            System.err.println("DELETE: Koneksi null, gagal menghapus data.");
            return;
        }
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Berhasil delete");
            } else {
                System.out.println("Gagal melakukan delete atau data tidak ditemukan untuk id: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error saat menghapus mahasiswa: " + e.getMessage());
        }
    }

    // Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        if (koneksi == null) {
            System.err.println("GETBYID: Koneksi null, gagal mengambil data.");
            return null;
        }
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    mhs = new Mahasiswa();
                    mhs.setId(rs.getInt("id"));
                    mhs.setNama(rs.getString("nama"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error saat mengambil mahasiswa by ID: " + e.getMessage());
        }
        return mhs;
    }

    // Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> mhsList = new ArrayList<>();
        if (koneksi == null) {
            System.err.println("GETALL: Koneksi null, gagal mengambil semua data.");
            return mhsList;
        }
        String query = "SELECT * FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mhsList.add(mhs);
            }
        } catch (SQLException e) {
            System.err.println("Error saat mengambil semua data mahasiswa: " + e.getMessage());
        }
        return mhsList;
    }
}