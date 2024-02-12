package PBO.Collection.Map;
import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "Tari");
        map.put(102, "Syila");
        map.put(101, "Putra");
        map.put(103, "Adi");

        System.out.println(map.containsKey(100)); // Cek apakah key = 100 ada pada Map atau tidak
        System.out.println(map.containsValue("adi")); // Cek apakah value = "adi" ada pada Map atau tidak

        // Nilai return kedua method diatas berupa boolean

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
