import java.util.*;

public class GroupAnagrams {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        List<String> data = new ArrayList<>();
        int freq;
        Node(){
            for (int i = 0; i < 26; i++){
                children[i] = null;
            }
            freq = 1;
        }
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

    public static Node root = new Node();
    static List<List<String>> ans = new ArrayList<>();

    public static List<List<String>> anagram(String strs[]){
        for (String word : strs) {
            build(word);
        }    
        dfs(root);
        return ans;
    }

    public static void build(String s){
        Node temp = root;
        char word[] = s.toCharArray();
        Arrays.sort(word);
        for (char c : word) {
            Node curr = temp.children[c - 'a'];
            if (curr == null){
                curr = new Node();
            }
            temp = curr;
        }
        temp.eow = true;
        temp.data.add(s);
    }

    public static void dfs(Node root){
        if (root.eow){
            ans.add(root.data);
        }
        for (int i = 0; i < 26; i++){
            if (root.children[i] != null){
                dfs(root.children[i]);
            }
        }
    }

    public static void main(String args[]){
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        for (int i = 0; i < strs.length; i++){
            insert(strs[i]);
        }
        System.out.println(anagram(strs));
    }   
}
