public abstract class Karyawan extends CivitasAkademika {
    protected String nip;
    protected int masaKerja;

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();
}