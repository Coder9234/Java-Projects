import java.util.*;

public class Univalued {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = right;
        }
    }    

    public static boolean isUnivalued(Node root){
        if (root == null){
            return true;
        }
        if (root.left != null && root.data != root.left.data){
            return false;
        }
        if (root.right != null && root.data != root.right.data){
            return false;
        }
        return isUnivalued(root.left) && isUnivalued(root.right);
        
    }

    public static void main(String args[]){
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        if (isUnivalued(root)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
