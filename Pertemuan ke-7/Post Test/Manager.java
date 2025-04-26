public class Manager extends Pegawai {
    private int tunjangan = 700000;
    
    public Manager(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}