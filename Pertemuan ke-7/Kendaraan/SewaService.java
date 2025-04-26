public class SewaService {
    public float hitungSewa(Vehicle v, int jarak, float hargaPerKm) {
        System.out.print("Menghitung biaya sewa: ");
        v.calRent(jarak, hargaPerKm);
        
        if (v instanceof Car) {
            return jarak * hargaPerKm + 100.00f;
        } else if (v instanceof Bus) {
            return jarak * hargaPerKm + 150.00f;
        } else {
            return jarak * hargaPerKm;
        }
    }
}
