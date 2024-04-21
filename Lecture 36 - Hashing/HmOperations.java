import java.util.*;

public class HmOperations{
    public static void main(String args[]){
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert - O(1)
        hm.put("India", 100);
        hm.put("Russia", 150);
        hm.put("USA", 200);

        System.out.println(hm);

        // Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));

        // // ContainsKey - O(1)
        // System.out.println(hm.containsKey("India")); //true
        // System.out.println(hm.containsKey("Indonesia")); // false

        // remove - O(1)
        // System.out.println(hm.remove("Russia"));
        // System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}