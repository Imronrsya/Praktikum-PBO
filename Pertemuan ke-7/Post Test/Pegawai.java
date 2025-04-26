public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}