/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasGenerik;

/**
 *
 * @author ASUS
 */
class ContohMetodeGenerik {
    public <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.gerak();
        hewan.bersuara();
    }
}
