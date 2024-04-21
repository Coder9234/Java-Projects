import java.util.*;

public class LongestWord{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;
        Node(){
            for (int i = 0; i < 26; i++){
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static boolean search(String key){
        Node curr = root;
        for (int level = 0; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if (root == null){
            return;
        }
        for (int i = 0; i < 26; i++){
            if (root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                // backtracking step
                temp.deleteCharAt(temp.length() - 1);
            }   
        }
    }

    public static void main(String args[]){
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}