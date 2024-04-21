// Reverse a String usina a Stack
import java.util.*;
public class ReverseString {
    public static String ReverseString(String str){
        Stack<Character>s = new Stack<>();
        int index = 0;
        while(index < str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]){
        String str = "abc";
        String result = ReverseString(str);
        System.out.println(result);
    }
}
