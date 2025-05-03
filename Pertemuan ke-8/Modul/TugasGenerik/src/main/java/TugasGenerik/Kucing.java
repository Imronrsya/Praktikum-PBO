/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasGenerik;

/**
 *
 * @author ASUS
 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}