public class TestAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kitty");
        Anabul anjing = new Anjing("Buddy");
        Anabul burung = new Burung("Tweety");
        
        Anabul[] hewanPeliharaan = {kucing, anjing, burung};
        
        for (Anabul hewan : hewanPeliharaan) {
            System.out.println("\nHewan: " + hewan.getNama());
            hewan.gerak();
            hewan.bersuara();
        }
    }
}