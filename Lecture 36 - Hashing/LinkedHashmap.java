import java.util.*;

public class LinkedHashmap {
    public static void main(String args[]){
        TreeMap<String, Integer> lhm = new TreeMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        System.out.println(lhm);
    }
}
