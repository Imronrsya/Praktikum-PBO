/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasGenerik;

/**
 *
 * @author ASUS
 */
public class TestGenerik {
    public static void main(String[] args) {
        Datum<Kucing> dataKucing = new Datum<>();
        dataKucing.setIsi(new Kucing("Gary"));

        Datum<Anjing> dataAnjing = new Datum<>();
        dataAnjing.setIsi(new Anjing("Doggy"));

        Datum<Burung> dataBurung = new Datum<>();
        dataBurung.setIsi(new Burung("Blu"));

        ContohMetodeGenerik metode = new ContohMetodeGenerik();

        System.out.println("=== Kucing ===");
        metode.tampilkanPerilaku(dataKucing);

        System.out.println("\n=== Anjing ===");
        metode.tampilkanPerilaku(dataAnjing);

        System.out.println("\n=== Burung ===");
        metode.tampilkanPerilaku(dataBurung);
    }
}

