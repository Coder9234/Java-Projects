import java.util.*;
import java.util.LinkedList;

public class PalindromeLinkedList {
    public static boolean isPalindrome(LinkedList<Character>ll){
        Stack<Character>s = new Stack<>();
        String str1 = "";
        for (int i = 0; i < ll.size(); i++){
            s.push(ll.get(i));
            str1 += ll.get(i);
        }
        String str2 = "";
        while(!s.isEmpty()){
            str2 += s.pop();
        }
        if (str1.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        LinkedList<Character>ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        System.out.println(isPalindrome(ll));
    }
}
