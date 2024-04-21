import java.util.*;

public class Hashset {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
