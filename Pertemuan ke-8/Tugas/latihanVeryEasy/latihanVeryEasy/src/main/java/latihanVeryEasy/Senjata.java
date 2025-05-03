/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package latihanVeryEasy;

/**
 *
 * @author ASUS
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;
        } else {
            System.out.println("Peluru habis");
        }
    }
}
