/**
 * File     : MapTest.java
 * Deskripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

 import java.util.*;

 public class MapTest {
     public static void main(String[] args) {
         // kunci -> integer, nilai -> string
         Map<Integer, String> map = new HashMap<Integer, String>();
 
         // Menempatkan elemen kunci dan nilai
         map.put(1, "satu");
         map.put(2, "dua");
 
         // Mengambil elemen pertama
         System.out.println(map.get(1));
 
         // Mengambil keseluruhan kunci sebagai objek collection Set
         Set<Integer> key = map.keySet();
 
         // Bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci? Tulis pada laporan anda!
         // Petunjuk: gunakan iterasi seperti program ArrayListTest
         for (Integer k : key) {
             System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
         }
     }
 }