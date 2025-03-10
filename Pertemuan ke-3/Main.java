import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi menu
        Menu menu1 = new Menu("Nasi Goreng", 25000, 10);
        Menu menu2 = new Menu("Mie Ayam", 20000, 15);

        Scanner scanner = new Scanner(System.in);

        try {
            // Interaksi dengan pengguna
            System.out.println("Menu:");
            System.out.println("1. Nasi Goreng - Rp25000");
            System.out.println("2. Mie Ayam - Rp20000");

            // Meminta input dari pengguna
            System.out.print("Pilih menu (1/2): ");
            int pilihanMenu = scanner.nextInt();

            System.out.print("Jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();

            // Menentukan menu yang dipilih
            Menu menu;
            if (pilihanMenu == 1) {
                menu = menu1;
            } else if (pilihanMenu == 2) {
                menu = menu2;
            } else {
                // Lempar eksepsi jika menu tidak valid
                throw new MenuTidakTersediaException("Menu tidak valid!");
            }

            // Pastikan jumlah pesanan lebih dari 0
            if (jumlahPesanan <= 0) {
                throw new IllegalArgumentException("Jumlah pesanan harus lebih dari 0!");
            }

            // Memeriksa apakah stok mencukupi
            if (jumlahPesanan > menu.getStok()) {
                throw new JumlahPesananMelebihiStokException(
                    "Jumlah pesanan melebihi stok yang tersedia! (Stok: " + menu.getStok() + ")"
                );
            }

            // Melakukan pemesanan
            Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
            menu.kurangiStok(jumlahPesanan);

            System.out.println("Pesanan berhasil dilakukan.");
            System.out.println("Total harga: Rp" + pesanan.getTotal());

        } catch (MenuTidakTersediaException | JumlahPesananMelebihiStokException e) {
            // Menangani eksepsi custom
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Menangani eksepsi umum (mis. jumlah pesanan <= 0)
            System.out.println("Input tidak valid: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}