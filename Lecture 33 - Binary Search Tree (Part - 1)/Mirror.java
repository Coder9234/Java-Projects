import java.util.*;

public class Mirror {
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

    public static void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
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

    public static Node createMirror(Node root){
        if (root == null){
            return null;
        }
        Node leftSubTree = createMirror(root.left);
        Node rightSubTree = createMirror(root.right);
        // swap
        root.left = rightSubTree;
        root.right = leftSubTree;
        return root;
    }

    public static void main(String args[]){
        /*
                8
               / \
              5   10
             / \   \
            3   6   11
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        /*
                8
               / \
              10  5
             /   / \
            11  6   3
        */
        createMirror(root);
        preOrder(root);
    }
}
