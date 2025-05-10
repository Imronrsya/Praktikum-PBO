/**
 * File     : ArrayListTest.java
 * Deskripsi: program penggunaan objek ArratList sebagai collection class
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generic");

        strings.remove("praktikum");
        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}