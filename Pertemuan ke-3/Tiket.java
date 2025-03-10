public class Tiket {

    public static void pesanJumlahTiket(int jumlahTiket) {
        // Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;
        
        // Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert(jumlahTiket > 0) : "Jumlah tiket harus lebih dari 0!";
        
        // Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert(jumlahTiket <= tiketTersedia) : "Jumlah tiket melebihi ketersediaan tiket (" + tiketTersedia + ")";
        
        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

    public static void isEWallet(int EWallet) {
        // Memeriksa apakah index e-wallet yang dipilih valid
        // Assertion untuk memastikan e-wallet yang dipilih valid
        assert(EWallet >= 1 && EWallet <= 4) : "Index e-wallet tidak valid!";
        
        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1:
                return "OVO";
            case 2:
                return "GoPay";
            case 3:
                return "DANA";
            case 4:
                return "LinkAja";
            default:
                return "";
        }
    }
}
