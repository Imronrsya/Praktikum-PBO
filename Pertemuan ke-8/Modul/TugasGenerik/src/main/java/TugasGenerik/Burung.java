/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasGenerik;

/**
 *
 * @author ASUS
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}