public abstract class CivitasAkademika {
    protected String nama;
    protected String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public abstract void printInfo();
}