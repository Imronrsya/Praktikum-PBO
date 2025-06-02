import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Menampilkan NIM dan nama mahasiswa menggunakan ekspresi lambda.
 */

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060123140001", "Adi");
        mahasiswaMap.put("24060123140002", "Bambang");
        mahasiswaMap.put("24060123140003", "Cici");
        mahasiswaMap.put("24060123140004", "Didi");

        mahasiswaMap.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}
