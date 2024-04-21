import java.util.*;
public class Height {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh, rh) + 1;
        return height;
    }

    // counting the number of nodes
    public static int count(Node root){
        if (root == null){
            return 0;
        }
        int lcount = count(root.left);
        int rcount = count(root.right);
        int count = lcount + rcount + 1;
        return count;
    }

    // sum of nodes
    public static int sum(Node root){
        if (root == null){
            return 0;
        }
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        int sum = lsum + rsum + root.data;
        return sum;
    }

    public static void main(String args[]){
        /*
                     1
                    /  \
                   2    3
                  / \  / \
                 4   5 6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Height is: " + height(root));
        System.out.println("Count of Nodes is: " + count(root));
        System.out.println("Sum of nodes: " + sum(root));
    }
}
