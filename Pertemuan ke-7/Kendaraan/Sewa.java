public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
        
        System.out.println("\n--- Menggunakan method hitungSewa ---");
        
        SewaService sewaService = new SewaService();
        
        float biayaKendaraan = sewaService.hitungSewa(kendaraan, 50, 1000);
        float biayaMobil = sewaService.hitungSewa(mobil, 50, 1000);
        float biayaBis = sewaService.hitungSewa(bis, 50, 1000);
        
        System.out.println("\nTotal biaya sewa kendaraan: " + biayaKendaraan);
        System.out.println("Total biaya sewa mobil: " + biayaMobil);
        System.out.println("Total biaya sewa bis: " + biayaBis);
    }
}