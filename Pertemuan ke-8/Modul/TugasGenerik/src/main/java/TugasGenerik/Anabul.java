/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TugasGenerik;

/**
 *
 * @author ASUS
 */
abstract class Anabul {
    protected String nama;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract void gerak();
    public abstract void bersuara();
}
