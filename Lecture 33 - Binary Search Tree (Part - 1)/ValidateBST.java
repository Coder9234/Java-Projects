import java.util.*;

public class ValidateBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node insert(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }
        else{
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if (root == null){
            return true;
        }
        if (min != null && root.data <= min.data){
            return false;
        }
        if (max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String args[]){
        int values[] = {1, 1, 1};
        Node root = null;

        for (int  i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        if (isValidBST(root, null, null)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
