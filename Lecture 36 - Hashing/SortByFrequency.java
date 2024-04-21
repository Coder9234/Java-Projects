import java.util.*;

public class SortByFrequency {
    public static String frequency(String s){
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        String ans = "";
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            while (map.get(key) != 0){
                ans += key;
                map.put(key, map.get(key) - 1);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String s = "tree";
        System.out.println(frequency(s));
    }
}
